import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] sandra) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] grades = new double[N];

        for (int i = 0; i < N; i++) {
            grades[i] = sc.nextDouble();
        }

        double sum = 0;
        double highest = grades[0];
        double lowest = grades[0];

        for (double g : grades) {
            sum += g;

            if (g > highest) {
                highest = g;
            } else {
                if (g < lowest) {
                    lowest = g;
                }
            }
        }

        double avg = sum / N;

        if (avg >= 90) {
            System.out.println("Excellent");
        } else {
            if (avg >= 75) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }

        System.out.println(avg);
        System.out.println(highest);
        System.out.println(lowest);
    }
}
