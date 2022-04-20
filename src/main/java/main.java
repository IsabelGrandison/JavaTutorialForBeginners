import java.text.NumberFormat;
public class main {
        public static void main(String[] args) {
       NumberFormat percent = NumberFormat.getPercentInstance();
       String result = percent.format(0.1);
                System.out.println(result);

        }



}
