public class subString {
    public static void main(String []args){
        String s = "kishan";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                System.out.println(s.substring(i, j+1)+" ");
            }
            System.out.println();
        }
    }
}
