import java.sql.SQLOutput;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so 20:");
        int count20 = sc.nextInt();
        int count =0;
        int number =2;
        while ( count <count20){
            int i = 2;
            boolean check = true;
            while (i<= Math.sqrt(number)){
                if (number % i == 0){
                    check   = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number +"is a prime");
                count++;
            }
            number++;
        }
    }
}
