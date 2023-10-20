package b2b2c;

import java.math.BigDecimal;

public class Item {
    public Item(String description, BigDecimal weigth, BigDecimal price,int quantity,TaxType VAT) {
        this.description = description;
        this.weigth = weigth;
        this.price = price;
    }
    private int quantity;
    private TaxType VAT;
    private String description;
    private BigDecimal weigth;
    private BigDecimal price;
    BigDecimal getPrice(){
        return null;
    }
    BigDecimal getWeigth(){
        return null;
    }
}
