public class SwitchCase2 {


    public static void main(String[] args) {

        char grade = 'B';

        switch(grade){
            case 'A': 
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Decent job.");
                break;
            case 'D':
            case 'F':
                System.out.println("Needs some work.");
                break;
            default: 
                System.out.println("Invalid grade");
                break;
        }
        

    }
    


}
