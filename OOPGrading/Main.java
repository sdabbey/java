package OOPGrading;

public class Main {
    public static void main(String[] args) {
        InputClass inputObj = new InputClass();
        OutputClass outputObj = new OutputClass();
        GradingClass gradingObj = new GradingClass();

        inputObj.myInput();
        char gradeArr [] = new char[inputObj.classSize];
        for (int a = 0; a < inputObj.classSize; a++){
            char grade = gradingObj.studentGrade(inputObj.studentScore[a]);
            gradeArr[a] = grade;
            
        }
        
        outputObj.myOutput(inputObj.classSize, inputObj.studentName,  inputObj.studentIndexNumber, gradeArr);
        
        
    }
}
