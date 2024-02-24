public class ForLoops_Array {
    public static void main(String[] args) {
        int total = 0;
        int [] [] b = {{1,2, 4, 7}, {3,4,5,9}};

        for(int i = 0; i<b.length; i++){
            for (int j = 0; j < b[i].length; j++) {
                total += b[i][j];
            }
            System.out.println("The sum of the row " + i + " is " + total);
            total = 0;
        }
        System.out.println(b[0].length);   
    }
}
