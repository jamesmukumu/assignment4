package array;
import java.util.Scanner;

public class Multidimensionalarray {

    public static void main(String[] args) {
        int mark[][] = new int[4][3];
        int rollNo[] = new int[4];
        String names[] = new String[4];
        String result[] = new String[4];
        String grade[] = new String[4];
        int total[] = new int[4];
        float average[] = new float[4];

        int x, y;
        for (x = 0; x < 4; x++) {

            System.out.println("Enter the Student Roll Number :");
            Scanner scanner = new Scanner(System.in);
            rollNo[x] = scanner.nextInt();

            System.out.println("Enter the Student Name :");
            Scanner scaner = new Scanner(System.in);
            names[x] = scanner.next();

            System.out.println("Enter the Three Marks separated by commas (e.g., 85,75,90):");
            Scanner scan = new Scanner(System.in);
            String markInput = scanner.next();
            String[] markValues = markInput.split(",");
            for (y = 0; y < 3; y++) {
                mark[x][y] = Integer.parseInt(markValues[y]);
            }

            total[x] = mark[x][0] + mark[x][1] + mark[x][2];
            System.out.println("The Total is: " + total[x]);
            average[x] = total[x] / 3;

            if (average[x] > 50) {
                result[x] = "P";
            } else {
                result[x] = "F";
            }
            if (average[x] > 69) {
                grade[x] = "A";
            } else if (average[x] > 49) {
                grade[x] = "B";
            } else if (average[x] < 50) {
                grade[x] = "C";
            }

        }

        System.out.println("*****************************************************************************************************************************************************");
        System.out.println("                                                  STUDENT MARKLIST                                                            ");
        System.out.println("*****************************************************************************************************************************************************");
        System.out.println("ROLL\t\tNAME\t\tMARK1\t\tMARK2\t\tMARK3\t\tTOTAL\t\tRESULT\t\tAverage\t\tGRADE\t\t");
        for (x = 0; x < 4; x++) {
            System.out.println(rollNo[x] + "\t\t" + names[x] + "\t\t  " + mark[x][0] + "\t\t" + mark[x][1] + "\t\t" + mark[x][2] + "\t\t" + total[x] + "\t\t" + result[x] + "\t\t" + average[x] + "\t\t" + grade[x]);
        }
    }
}
