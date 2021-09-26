import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
            int a = sc.nextInt();
            System.out.print("enter b : ");
                int b = sc.nextInt();


                System.out.println("Addition:="+(a + b));
                System.out.println("Subtraction:="+(a - b));
                System.out.println("Multiplication:="+a * b);
                System.out.println("Product:="+a / b);
                System.out.println("Modulo:="+a % b);
            }
        }
