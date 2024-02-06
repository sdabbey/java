package OOPGrading;

public class OutputClass {
    public void myOutput(int size, String name[], int index_number[], char student_grade[]){
        for(int j = 0; j< size; j++){
            System.out.println(name[j] + " with index number " + index_number[j] + " got grade " + student_grade[j]);
        }
    }
}
