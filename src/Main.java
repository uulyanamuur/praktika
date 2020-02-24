import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите количество купюр: \n");
        Scanner in = new Scanner(System.in);
        int n3 = in.nextInt();
        int n1 = in.nextInt();
        int n5 = in.nextInt();
        int n10 = in.nextInt();
        int i = 0, j = 0, a = 0, b = 0;
        int N3 = 0, N1 = 0, N5 = 0, N10 = 0;
        int sum = 30 * n3 + 100 * n1 + 500 * n5 * 1000 * n10 ;

        System.out.print("Введите сумму: \n");
        int SUM = in.nextInt();
        if (SUM < 10 || SUM > sum || SUM % 10 > 0) {
            System.out.print("Невозможно выдать сумму.\n");
        } else {

            for(i = 0; i < n3 + 1; i++) {
                for(j = 0; j < n1 + 1; j++) {
                    for(a = 0; a < n5 + 1; a++) {
                        for(b = 0; b < n10 + 1; b++) {
                            if(i * 30 + j * 100 + a * 500 + b * 1000 == SUM) {
                                N3 = i;
                                N1 = j;
                                N5 = a;
                                N10 = b;
                                i = n3 + 1;
                                j = n1 + 1;
                                a = n5 + 1;
                                b = n10 +1 ;
                                SUM = 0;
                            }
                        }
                    }
                }
            }
            if (SUM == 0) {
                System.out.print(N10 +" купюр 1000, "+ N5 +" купюр 500, \n" + N1 +" купюр 100, "+ N3+" купюр 30." );
            }
            else   System.out.print("Невозможно выдать сумму.\n");
        }

    }
}