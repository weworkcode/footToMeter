public class footToMeter {
    static double Conversion_feet_to_meter(double feet)   
    {   
        double meter;  
        meter = feet / 3.281;    
        System.out.printf("Value in meter is: %.3f \n", meter);   
        return 0;   
    }    
    public static void main(String args [])   
    {   
        double feet = 2;   
        Conversion_feet_to_meter(feet);   
    }  
}  

