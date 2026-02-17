public class day5task1 
{
    int findLargest(int a, int b, int c) 
    {
        if (a >= b && a >= c)
        {
        return a;
        }
        else if (b >= a && b >= c) 
        {
        return b;
        }
        else return c;
    }

    public static void main(String[] args) 
    {
        day5task1 obj = new day5task1();
        System.out.println("Largest: " + obj.findLargest(10, 25, 15));
    }
}