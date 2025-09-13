import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner word =new Scanner(System.in);
        System.out.print("Enter Your Word:");
        String s = word.next();
        int x = (s.length())/2;
        System.out.println("The Middle Character is: "+ s.substring(x,x+1));
    }
}
