import java.util.Arrays;

public class StampProblem {
    public static void main(String[] args) {
        int[] stamps = {1500, 1225, 350, 100, 70, 34, 21, 10, 1};
        int target = 140;

        int totalStamps = 0;
        for (int stamp : stamps) {
            while (target >= stamp) {
                target -= stamp;
                totalStamps++;
                System.out.println("Selected stamp: " + stamp);
            }
        }

        System.out.println("Total number of stamps used: " + totalStamps);
    }
}
//Selected stamp: 100
//Selected stamp: 34
//Selected stamp: 1
//Selected stamp: 1
//Selected stamp: 1
//Selected stamp: 1
//Selected stamp: 1
//Selected stamp: 1
//Total number of stamps used: 8
