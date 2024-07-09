import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float radius  = sc.nextFloat();

        float area = (22/7)*(radius*radius);
        System.out.println("The area of the circle is: "+area);
    }
}
