public class ForEach {
    public static void main(String[] args) {
        double[] cool_constants = new double[5];

        cool_constants[0] = 3.141592; // pi
        cool_constants[1] = 2.71828; // e
        cool_constants[2] = 1.414;  // sqrt(2) 
        cool_constants[3] = 1.73;   // sqrt(3)
        cool_constants[4] = 1.618; // phi

        for (double i : cool_constants){
            System.out.println(i);
        }

        // for (int i = 0; I < cool_constants.length; i++)

    }
}
