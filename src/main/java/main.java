import java.util.Scanner;
public class main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String input = "";
                while (!input.equals("quit")) {
                        System.out.println("Input: ");
                        input = scanner.next().toLowerCase();
                        if (!input.equals("quit"))
                                System.out.println(input);
                }
        }}
