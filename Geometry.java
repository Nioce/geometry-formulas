
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double areaparallelorgram(double base, double height)
    {
        double area = base * height;
        return area;
    }
    
    public static double areatrapezoid(double base1, double base2, double height)
    {
        double area = base1 + base2;
        double bee = area / 2.0;
        double ekk = bee * height;
        return ekk;
    }
    
    public static double volume0cone(double radius, double height)
    {
        double volume1 = height / 3.0;
        double volume2 = Math.PI * Math.pow(radius, 3);
        double volume = volume1 * volume2;
        return volume;
    }
    
    public static double volumerectprism(double width, double height, double length)
    {
        double volumne = width * height * length;
        return volumne;
    }

    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    public static double area0right0rectangular0prism(double width, double length, double height)
    {
        double area = 2 * ((width * length) + (height * length) + (height * width));
        return area;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double hypotenuse0of0a0right0triangle(double leg1, double leg2)
    {
        double hypot = Math.pow(leg1, 3) + Math.pow(leg2, 3);
        return hypot;
    }
    
    public static double distanc0Points(double x1, double x2, double y1, double y2)
    {
        double root1 = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
        return root1;
    }
    
    public static double slope0Between0Two0Points(double x1, double x2, double y1, double y2)
    {
        double distance = ((y2 - y1) / (x2 - x1));
        return distance;
    }
    
    public static double AreaOfATriangle(double a, double b, double c)
    {
        double area1 = 2.0 * (Math.pow((a * b), 2.0)) - (Math.pow(a, 4.0));
        double area2 = 2.0 *(Math.pow((a*c),2.0)) - (Math.pow(b,4.0));
        double area3 = 2.0 * (Math.pow((b*c),2.0)) - (Math.pow(c,4.0));
        double area = (1.0/4.0) * Math.sqrt(area1 + area2 + area3);
        return area;
    }
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
