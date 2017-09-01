
/**
 * Write a description of class Geometry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Finds are of a trinagle 
     * 
     * @parm height - Height of triangle 
     * @parm base -  Base of triangle 
     * 
     * @return area of the traignle  
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
     /**
     * Finds area of a parallegoram  
     * 
     * @parm height - Height of arallelorgram 
     * @parm base -  Base of arallelorgram 
     * 
     * @return area of the arallelorgram  
     */
    public static double areaparallelorgram(double base, double height)
    {
        double area = base * height;
        return area;
    }
    /**
     * Finds area of a trapezoid  
     * 
     * @parm height - Height of trapezoid 
     * @parm base1 -  Base of trapezoid 
     * @parm base2 -  Base of trapezoid
     * 
     * @return area of the trapezoid  
     */
    public static double areatrapezoid(double base1, double base2, double height)
    {
        double area = base1 + base2;
        double bee = area / 2.0;
        double ekk = bee * height;
        return ekk;
    }
     /**
     * Finds volume of a Cone  
     * 
     * @parm height - Height of Cone 
     * @parm readius -  Radius of Cone 
     * 
     * @return volume of the arallelorgram  
     */
    public static double volume0cone(double radius, double height)
    {
        double volume1 = height / 3.0;
        double volume2 = Math.PI * Math.pow(radius, 3);
        double volume = volume1 * volume2;
        return volume;
    }
    /**
     * Finds volume of a Rectangular Prism  
     * 
     * @parm height - Height of Rectangular Prism 
     * @parm length -  Base of Rectangular Prism 
     * @parm width -  Base of Rectangular Prism
     * 
     * @return volume of the trapezoid  
     */
    public static double volumerectprism(double width, double height, double length)
    {
        double volumne = width * height * length;
        return volumne;
    }
    /**
     * Finds area rectangle   
     * 
     * @parm length - length of rectangle
     * @parm base -  Base of rectangle
     * 
     * @return area of the rectnagle   
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    /**
     * Finds area rectangler prism 
     * 
     * @parm length - length of rectangler prism 
     * @parm width -  width of rectangler prism 
     * 
     * @return area of the rectnagle   
     */    
    public static double area0right0rectangular0prism(double width, double length, double height)
    {
        double area = 2 * ((width * length) + (height * length) + (height * width));
        return area;
    }
    /**
     * Finds volume sphere
     * 
     * @parm length - radius of sphere
     * 
     * @return volume of the sphere   
     */      
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    /**
     * Finds hypotenuse right triangle 
     * 
     * @parm leg1 - lenth of leg1
     * @parm leg2 - length of leg2
     * 
     * @return volume of the sphere   
     */       
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
