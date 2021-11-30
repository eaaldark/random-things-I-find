import java.util.Calendar;

public class lo {
    public static void main(String[] args) {
        
        Calendar today = Calendar.getInstance();
        
        System.out.println( 
            "Fecha: " + 
            today.get(Calendar.DAY_OF_MONTH)+"/"+
            today.get(Calendar.MONTH)+"/"+
            today.get(Calendar.YEAR)
            );
    }
}