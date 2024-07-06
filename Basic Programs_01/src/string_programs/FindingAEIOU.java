package string_programs;

public class FindingAEIOU {
    public static void main(String[] args) {
        String input ="Vny";
       boolean b = input.toLowerCase().matches(".*[aeiou].*");
       System.out.println(b);
    }
}
