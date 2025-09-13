import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Enter the measurmeant in Centimeters: ");
        double n=number.nextDouble();
        double inches = n/2.54;
        double feet = inches/12;
        System.out.println("Feet: "+feet);
        System.out.println("Inches: "+inches);
    }
}
