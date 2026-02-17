class day5task2 
{
int reverseNumber(int num) 
{
    int reversed = 0;
    while (num != 0)
    {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }
    return reversed;
}
public static void main(String[] args) 
{
    day5task2 obj = new day5task2();
    int number = 12345; // Example number
    int reversedNumber = obj.reverseNumber(number);
    System.out.println("Reversed Number: " + reversedNumber);
}
}