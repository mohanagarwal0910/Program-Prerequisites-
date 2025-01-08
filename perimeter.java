import java.util.*;
class perimeter
{
    public static void main(String []args)
    {
     Scanner scanner = new Scanner(System.in);
     double length = scanner.nextDouble();
     double width = scanner.nextDouble();
     double perimeter = 2 * (length + width);
     System.out.println("The perimeter of the rectangle is: " + perimeter);
     }
}

