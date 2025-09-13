import java.util.Scanner;

class Circle{
    private double radius;
    Circle(double r){
        radius = r;
    }

    double  computeCircumference(){
        double circ = 2*Math.PI*radius;
        return circ;
    }
    double computeArea(){
        double area = Math.PI*radius*radius ;
        return area;
    }
}


public class Q5 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Inner Circle Radius:");
        double ri = r.nextDouble();
        System.out.print("Enter Outer Circle Radius:");
        double ro = r.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();
        System.out.print("Area of Shaded circular region: "+shadedArea);



    }
}


