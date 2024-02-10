public class RatingSystem {
    
    
   public static void main(String[] args) {
    int [] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,2,5,3,4,5,3,1};
    
    String [] frequency = new String[responses.length];
    for(int i=0; i<responses.length; i++){
        switch(responses[i]){
            case 1:
                frequency[i] = "Awful";
                break;
            case 2:
                frequency[i] = "Not Bad";
                break;
            case 3:
                frequency[i] = "Good";
                break;
            case 4:
                frequency[i] = "Very Good";
                break;
            default:
                frequency[i] = "Excellent";
                break;

        }
        System.out.println(responses[i] + "---" + frequency[i]);
    }
   }


    
}
