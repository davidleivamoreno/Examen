import b2b2c.Item;
import b2b2c.TaxType;
import org.junit.Test;

import java.math.BigDecimal;

public class Testb2b2c {
    @Test
    public void TestItem(){
/*Descripción: Apple MacBook Pro M1 Pro
Precio: 1,758.95
Peso: 1.300
Cantidad: 2
VAT: Reduced

* */
        Item item1=new Item("Western Digital Unidad interna de estado sólido SSD WD SN580 NVMe azul de 1 TB\n", BigDecimal.valueOf(52.99),BigDecimal.valueOf(0.395),3, TaxType.General);
        Item item2=new Item("Apple MacBook Pro M1 Pro",BigDecimal.valueOf(1758.95),BigDecimal.valueOf(1300),2,TaxType.Reduced);
    }
}
