import java.util.Scanner;
public class CompareTo {
    public static void compareStrings(String a,String b){
        int n = a.length()-1;
        int m = b.length()-1;
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
             
            }
        }
           System.out.println(b.compareTo(a));
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String :");
        String a = sc.nextLine();
        System.out.println("Enter the second string :");
        String b = sc.nextLine();
        compareStrings(a,b);
    }
}