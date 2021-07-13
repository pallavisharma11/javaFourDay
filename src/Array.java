import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        System.out.println("enter a value");
        int  b = sc.nextInt();
        System.out.println("enter array element");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == b)
            {
                System.out.println("array contain that element");
                
            }
            
        }
    }
    
}
