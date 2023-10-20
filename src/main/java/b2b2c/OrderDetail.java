package b2b2c;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

public class OrderDetail {
    private int quantity;
    private TaxType taxType;
    private Order order;
    private Set<Item> itemSet=new HashSet<>();
    private String VAT;

    BigDecimal calcsubTotal(){
     BigDecimal subTotal=null;
     for (Item item:itemSet){
         BigDecimal cantidad=BigDecimal.valueOf(quantity);
         subTotal=cantidad.multiply(item.getPrice());
     }
     return subTotal.setScale(2, RoundingMode.HALF_UP);
    }

    BigDecimal calcWeight(){
       BigDecimal Weight=null;
       for (Item item :itemSet){
          Weight.add(item.getWeigth());
       }
    return Weight.setScale(3,RoundingMode.HALF_UP);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TaxType getTaxType() {
        return taxType;
    }

    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Set<Item> getItemSet() {
        return itemSet;
    }

    public void setItemSet(Set<Item> itemSet) {
        this.itemSet = itemSet;
    }
}
