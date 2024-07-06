package string_programs;

public class ReverseOfString {
    public static void main(String[] args) {
        String s= "Vinay Pilla";
        char[] a =s.toCharArray();
        int sizeOfString=s.length();
        StringBuilder str01 = new StringBuilder();
        String rev="";
        for(int i=sizeOfString-1;i>=0;i--){
            str01.append(a[i]);
            rev+=Character.toString(a[i]);
          //  rev.concat(Character.toString(a[i]));
        }
        System.out.println(rev);
        System.out.println("Using String Builder :"+str01);

    }
}
