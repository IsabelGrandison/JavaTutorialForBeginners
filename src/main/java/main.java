import java.text.NumberFormat;
import java.time.Month;
import java.util.Scanner;
public class main {
        public static void main(String[] args) {
                final byte Months_IN_YEAR = 12;
                final byte PERCENT = 100;

                Scanner scanner = new Scanner(System.in);

                System.out.print("Principal: ");
                int principal = scanner.nextInt();

                System.out.println("Annual Interest Rate: ");
                float annualInterest = scanner.nextFloat();
                float monthlyInterest = annualInterest / PERCENT / Months_IN_YEAR;

                        System.out.print("Period (Years): ");
                        byte years = scanner.nextByte();
                        int numberOfPayments = years * Months_IN_YEAR;

                        double mortgage = principal
                                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) -1)
                                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

                        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
                        System.out.print("Mortgage: " + mortgageFormatted);







        }



}
