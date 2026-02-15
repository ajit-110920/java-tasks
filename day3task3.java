import java.util.Scanner;
public class day3task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = input.nextInt();
        double totalBill = 0;
        if (units <= 100) {
            totalBill = units * 5; 
        } 
        else if (units <= 200) {
            totalBill = (100 * 5) + (units - 100) * 7;
        } 
        else {
            totalBill = (100 * 5) + (100 * 7) + (units - 200) * 10;
        }
        System.out.println("Total Bill Amount: ₹" + totalBill);
    
        input.close();
    }
}