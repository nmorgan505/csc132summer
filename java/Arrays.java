public class Arrays {
    public static void main(String[] args) {
        
        //int x;
        //int[] y;

        // int x = 10;
        //int[] y = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //System.out.println(y[3]);

        //y[4] = 12;

        int[] test1 = {67, 23, 98, 45, 99, 45};
        int[] test2 = {88, 44, 94, 78, 64, 44};
        int i = 0;

        while (i < 6){
            if (test1[i] > 80 && test2[i] > 80){
                System.out.println("Student " + i + " doesn't need to take the final");
            }
            else if(test1[i] > 80 || test2[i] > 80){
                System.out.println("Student " + i + " can decide to take the final");
            }
            else if (!(test1[i] > 60) && !(test2[i] > 60)){
                System.out.println("Student " + i + " definitely needs to take the final");
            }
            else{
                System.out.println("Student " + i + "-- no decision");
            }
            i++;
        }

    }
}
