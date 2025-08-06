public class newops {
    public static void main(String[] args) {
        
        int p = 3;

        // p is printed, then incremented
        System.out.println(p++); // should see 4 (3?)
        
        // p is printed
        System.out.println(p);   // should see 4
        
        // p is incremented, and then printed
        System.out.println(++p); // should see 5

    }
}
