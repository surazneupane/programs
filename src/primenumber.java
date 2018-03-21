import java.util.Scanner; //


public class primenumber {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)

    {



        int n, i, num;


        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        scan.close();
        for (i = 1; i <= n; i++) {
            int count = 0;
            for (num = i; num >= 1; --num) {
                if (i % num == 0) {
                    count++;
                }


            }
            if (count == 2) {
                System.out.println(i);


            }


        }
    }



}