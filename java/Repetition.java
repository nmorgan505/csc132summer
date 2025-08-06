public class Repetition {
    

    public static void main(String[] args){

        int x = 0;
        while (x < 10){
            System.out.println(x++);
        }

        // a do while loop will always execute at least once, and then check conditions.
        x = 0;
        do{
            System.out.println(x++);

        } while(x < 10);

        // for (initialization; condition; change){}
        for (int i = 0; i < 11; i++){
            System.out.println(i);
        }

        int i = 10;

        for(;;){
            i--;
            if (i == 0){
                break;
            }
        }

    }

    
}
