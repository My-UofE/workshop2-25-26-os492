// VariablesTest application
public class VariablesTest {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("x: " + x);
        long s_per_min = 60;
        byte s_per_day = (byte) (s_per_min * 60 * 24);
        float area = 20.3F;
        char a = '\u5468', b = '\\';
        int nHours = 022;
        double ratio = 7/5;
        System.out.println("Seconds per minute: " + s_per_min );
        System.out.println("Seconds per day: " + s_per_day);
        System.out.println("Area: " + area);
        System.out.println("A: " + a);
        System.out.println("Number of Hours: " + nHours);
        System.out.println("Ratio: " + ratio); 
    }
}