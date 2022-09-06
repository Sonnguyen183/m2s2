import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hinh chu nhat");
        System.out.println("2. Hinh tam giac xuoi");
        System.out.println("3. Hinh tam giac nguoc");
        System.out.println("4. Hinh tam giac can");
        System.out.println("0. thoat");
        System.out.println("Nhap vao lua chon");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hinh chu nhat");
                for (int i=0; i<3; i++){
                    System.out.println("******");
                }
                break;
            case 2:
                System.out.println("Hinh tam giac xuoi");
                for (int i=0; i<6; i++){
                    for (int j=0; j<i; j++){
                        System.out.println("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Hinh tam giac nguoc");
                for (int i=0; i<6; i++){
                    for (int j=6; j>i; j--){
                        System.out.println("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Hinh tam giac can");
                for (int i=0; i<6; i++){
                    for (int j=6; j>i; j--){
                        System.out.println("");
                    }
                    for (int h=-1; h<2*i; h++){
                        System.out.println("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
