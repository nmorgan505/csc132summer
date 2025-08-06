public class advancedfor {
    

    public static void main(String[] args) {
        System.out.println("Before Loop");
        for (int i = 0, j = 10; i < 100 && j >= 0; i += 2, j -=2){
            System.out.println("In loop; i=" + i + ", j="+j);
        }
        System.out.println("After Loop");
    }

}
