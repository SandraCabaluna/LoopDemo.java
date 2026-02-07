import java.util.*;
public class ArrayDemo {
  public static void main(String[] sandra) {
    int N [], a, b;
    int[] x, y;

  N = new int[5];
  N[0] = 5;
  N[1] = 10;
  N[2] = 15;
  N[3] = 20;
  N[4] = 25;

  for(a = 0; a < N.length; a++)
  System.out.println(N[a]);

  x = new int[5];
  for(a = 0; a < x.length; a++);
    x[a] = a + 1;
  for(a = 0; a < x.length; a++);
    System.out.println("x[a]);

  y = new int[10];
  int ctr = 4;
  for(b = 0; b < y.length; ++b) {
    y[b] = ctr;
    ctr += 4;
  }

  for(a = 0; a < y.length; a++)
    System.ot.println(y[a]);
  }
}
