import java.util.*;
public class HelloDOS {
  public static void main(String[] sandra) {
    Scanner input = new Scanner(System.in);
    int N1=0;, N2=0, N3=0;
    System.out.println("Hello World in DOS");
    System.out.print("Enter 1st No.");
    N1 = input.nextInt();
    System.out.print("Enter 2nd No.");
    N2 = input.nextInt();
    System.out.print("Enter 3rd No.");
    N3 = input.nextInt();
    System.out.println("Answer=" + Sum(N1, N2, N3));
    }
    static int Sum(int x, int y, int z) {
    int ans  = x + y + z;
    return ans;
