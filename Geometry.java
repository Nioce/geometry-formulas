
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
    
    public static double volime0right0cone(double radius, double height)
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
