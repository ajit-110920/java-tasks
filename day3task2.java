import java.util.Scanner;

class day3task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.print("Enter marks (0 - 100): ");
        marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 75) {
            System.out.println("Grade: B");
        }
        else if (marks >= 60) {
            System.out.println("Grade: C");
        }
        else if (marks >= 40) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: Fail");
        }
    }
}
