import java.util.Scanner;
 class Swap {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        System.out.print("enter b : ");
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping : ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
