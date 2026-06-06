import java.util.*;
class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of the array:");
        int sum=0;
        for(int i = 0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
       System.out.println(sum);
    }
}