import java.util.Scanner;
public class FindIndex
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter element");
        int n = sc.nextInt();
        System.out.println("enter array element");
        for (int i = 0;i<10 ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<10 ; i++)
        {
            if(arr[i] == n)
            {
                System.out.println(i);
            }
        }
    }
    
}
