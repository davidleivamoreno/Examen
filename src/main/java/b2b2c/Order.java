package b2b2c;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {
    final double General=21;
    final double Reduce =10;
    final double Superreduced=4;
    private Date date;
    private Status status;
    private BigDecimal NetTotal;
    private BigDecimal GrossTotal;

    private Set<OrderDetail> orderDetailset =new HashSet<>();
    BigDecimal calcNetTotal(){
        BigDecimal NetTotales=null;
        BigDecimal NetTotal=null;
        for(OrderDetail orderdtl:orderDetailset){
          NetTotal= orderdtl.calcsubTotal();

            }
            NetTotales.add(NetTotal);


        return NetTotales;
    }
    BigDecimal calcGrossTotal(){
        BigDecimal GrossTotal=null;
        BigDecimal GrossTotales=null;
        BigDecimal VAT;
        for (OrderDetail orderdtl :orderDetailset){
            BigDecimal cantidad=BigDecimal.valueOf(orderdtl.getQuantity());
            for (Item item:orderdtl.getItemSet()){
                if (orderdtl.getTaxType().equals(TaxType.General)) {
                    VAT = BigDecimal.valueOf(General / 100);
                } else if(orderdtl.getTaxType().equals(TaxType.Reduced)){
                    VAT=BigDecimal.valueOf(Reduce/100);
                }else{
                    VAT=BigDecimal.valueOf(Superreduced/100);
                }
                BigDecimal precio=item.getPrice();

                GrossTotal=cantidad.multiply(precio).multiply(VAT);

            }
       GrossTotales.add(GrossTotal);

        }
        return GrossTotal;
    }
    BigDecimal calcVAT() {
        BigDecimal VAT = null;

        for (OrderDetail orderdtl : orderDetailset) {
            if (orderdtl.getTaxType().equals(TaxType.General)) {
                VAT = BigDecimal.valueOf(General / 100);
            } else if(orderdtl.getTaxType().equals(TaxType.Reduced)){
                VAT=BigDecimal.valueOf(Reduce/100);
            }else{
                VAT=BigDecimal.valueOf(Superreduced/100);
            }

        }
    return  VAT;
    }
    //Getters y Setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BigDecimal getNetTotal() {
        return NetTotal;
    }

    public void setNetTotal(BigDecimal netTotal) {
        NetTotal = netTotal;
    }

    public BigDecimal getGrossTotal() {
        return GrossTotal;
    }

    public void setGrossTotal(BigDecimal grossTotal) {
        GrossTotal = grossTotal;
    }



    public Set<OrderDetail> getOrderDetailset() {
        return orderDetailset;
    }

    public void setOrderDetailset(Set<OrderDetail> orderDetailset) {
        this.orderDetailset = orderDetailset;
    }
}
