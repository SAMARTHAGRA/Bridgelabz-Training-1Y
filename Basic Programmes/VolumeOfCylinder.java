import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of cylinder:");
        double radius = sc.nextDouble();

        
        System.out.println("Enter height of cylinder:");
        double height = sc.nextDouble();

        
        double volume = Math.PI * radius * radius * height;

        
        System.out.printf("Volume of Cylinder is: %.2f%n", volume);

        sc.close();
    }
}
