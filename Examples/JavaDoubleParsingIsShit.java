import java.util.*;
import java.text.DecimalFormat;
public class Solution {
    public static double calculateSimpleInterest(int p, int r, int t) {
     

        
        long p1 = p;
        long r1 = r;
        long t1 = t;

        long SI = (p1*r1*t1);
        double time = 100;
        double res = SI/time;
        DecimalFormat df2 = new DecimalFormat( "#.00" );
        String s = df2.format(res);
        
        return Double.parseDouble(s);
        
    }
}
