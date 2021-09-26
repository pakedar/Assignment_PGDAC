import java.util.*;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        {
            System.out.print("enter a : ");
            int a = sc.nextInt();


            {
                System.out.print("enter b : ");
                int b = sc.nextInt();

                {
                    System.out.print("enter c : ");
                    int c = sc.nextInt();


                    int s = a + b + c;
                    int avg = s / 3;
                    System.out.print("Average is:" + avg);

                }
            }
        }
    }
}

