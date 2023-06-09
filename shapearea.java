import java.util.Scanner;
public class shapearea
{
    void calculatearea(float a)
    {
        System.out.println("Area of sqare is="+a*a);
    }
    void calculatearea(int l,int b)
    {
        System.out.println("Area of square is="+l*b);
    }
    void calculatearea(double r)
    {
        double Area=3.14*r*r;
        System.out.println("Area of the circle="+Area);
    }
    public static void main(String[]args)
    {
        shapearea obj=new shapearea();
        System.out.println("Enter side of square");
        Scanner sc=new Scanner(System.in);
        float side=sc.nextFloat();
        obj.calculatearea(side);
        System.out.println("Enter the side of radious");
        Scanner sc1=new Scanner(System.in);
        double rad=sc.nextDouble();
        obj.calculatearea(rad);
        System.out.println("Enter side of rectangle");
        Scanner sc2=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        obj.calculatearea(side1,side2);
    }
}