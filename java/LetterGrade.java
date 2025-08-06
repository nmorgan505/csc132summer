public class LetterGrade {
    
    public static void main(String[] args) {
        double score = 77.0;
        char letter_grade;

        letter_grade = calcGrade(score);

        System.out.println("Your grade is a(n) " + letter_grade);
    }

    public static char calcGrade(double score){

        if (score >= 89.5){
            System.out.println("Great Job!");    
            return 'A';
        }
        else if (score >= 79.5)
            return 'B';
        else if (score >= 69.5)
            return 'C';
        else if (score >= 59.5)
            return 'D';
        else
            return 'F';

    }
}
