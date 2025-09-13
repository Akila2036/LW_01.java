import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.print("Enter your First Name:");
        String first = name.next();
        System.out.print("Enter your Middle Name:");
        String middle = name.next();
        System.out.print("Enter your Last Name:");
        String last = name.next();
        System.out.println(last+", "+first+" "+middle.substring(0,1));
    }
}
