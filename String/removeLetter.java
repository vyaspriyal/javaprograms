import java.util.Scanner;

public class removeLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String letter = s.nextLine();
        String ans = "";
        for(int i = 0; i < s1.length();i++){
            if((s1.charAt(i)+"").equals(letter)){
                continue;
            }
            else{
                ans = ans + s1.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
