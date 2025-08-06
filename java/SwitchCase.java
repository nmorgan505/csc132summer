public class SwitchCase {

    public static void main(String[] args) {

        char grade = 'B';

        switch(grade){
            case 'A': 
                System.out.println("Excellent Job!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Decent job.");
                break;
            case 'D':
                System.out.println("Ehhhh");
                break;
            case 'F':
                System.out.println("Needs some work.");
                break;
            default: 
                System.out.println("Invalid grade");
                break;
        }
        

    }
    


}
