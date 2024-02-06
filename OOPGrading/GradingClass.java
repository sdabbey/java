package OOPGrading;

public class GradingClass {
    public char studentGrade(int score){
        char grade;
        switch (score / 10) {
            case 10:
            case 9:
            case 8:
            case 7: 
                grade = 'A';
                break;
            case 6:
                grade = 'B';
                break;
            case 5:
                grade = 'C';
                break;
            case 4:
                grade = 'D';
                break;
            
            default:
                grade = 'F';
                break;
        }

        return grade;
    }
}
