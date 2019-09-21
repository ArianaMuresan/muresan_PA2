package muresan_p3;
 
import java.util.Scanner;
 
public class Polling {
 
    public static void main(String args[]) {
 
        double avg1 = 0;
        double avg2 = 0;
        double avg3 = 0;
        double avg4 = 0;
        double avg5 = 0;
 
        double[] avg = new double[5];
 
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;
        double sum5 = 0;
 
        double respondants = 0;
 
        double max = 0;
        double min = 0;
 
        Scanner scanner = new Scanner(System.in);
        int rating;
        String question;
        String MaxTopic;
        String MinTopic;
 
        String[] topics = { "Climate Change", "Politics", "Corporations", "Wall Street", "Space Travel" };
 
        int[][] ratings = new int[5][10];
 
        do {
 
            for (int x = 0; x < topics.length; x++) {
                System.out.println(
                        "How important " + topics[x] + " is to you? (1 = least important, 10 = most important)");
                rating = scanner.nextInt();
                scanner.nextLine();
                ratings[x][rating - 1]++;
 
            }
                // case sensitive
            System.out.println("Are there are any more respondants? Enter Yes or No.");
            question = scanner.nextLine();
            respondants++;
 
        } while (question.equals("Yes"));
 
        for (int b = 0; b < 10; b++) {
            sum1 += ratings[0][b] * (b + 1);
        }
        max = sum1;
        min = sum1;
        MaxTopic = topics[0];
        MinTopic = topics[0];
        avg1 = sum1 / respondants;
 
        for (int b = 0; b < 10; b++) {
            sum2 += ratings[1][b] * (b + 1);
        }
 
        if (max < sum2) {
            max = sum2;
            MaxTopic = topics[1];
        }
 
        if (min > sum2) {
            min = sum2;
            MinTopic = topics[1];
        }
        avg2 = sum2 / respondants;
 
        for (int b = 0; b < 10; b++) {
            sum3 += ratings[2][b] * (b + 1);
        }
        if (max < sum3) {
            max = sum3;
            MaxTopic = topics[2];
 
        }
 
        if (min > sum3) {
            min = sum3;
            MinTopic = topics[2];
 
        }
        avg3 = sum3 / respondants;
 
        for (int b = 0; b < 10; b++) {
            sum4 += ratings[3][b] * (b + 1);
        }
        if (max < sum4) {
            max = sum4;
            MaxTopic = topics[3];
 
        }
 
        if (min > sum4) {
            min = sum4;
            MinTopic = topics[3];
 
        }
        avg4 = sum4 / respondants;
 
        for (int b = 0; b < 10; b++) {
            sum5 += ratings[4][b] * (b + 1);
        }
        if (max < sum5) {
            max = sum5;
            MaxTopic = topics[4];
 
        }
 
        if (min > sum5) {
            min = sum5;
            MinTopic = topics[4];
 
        }
        avg5 = sum5 / respondants;
 
        avg[0] = avg1;
        avg[1] = avg2;
        avg[2] = avg3;
        avg[3] = avg4;
        avg[4] = avg5;
 
        System.out.println("1|2|3|4|5|6|7|8|9|10|Avg");
        System.out.println("-------------------------");
       
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.printf("%d ", ratings[a][b]);
            }
            System.out.print(avg[a]);
            System.out.println();
 
        }
 
        System.out.println("Max Topic: " + MaxTopic + " Sum:" + max);
        System.out.println("Min Topic: " + MinTopic + " Sum:" + min);
    }
}