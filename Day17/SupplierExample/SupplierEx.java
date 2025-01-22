package Day17.SupplierExample;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        
        Supplier<Date> currentdate = () -> new Date();

        Date date = currentdate.get();

        System.out.println(date);
    }
}
