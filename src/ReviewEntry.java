import java.util.Scanner;
public class ReviewEntry {
    private int sentenceID = 0; //initialized variables
    private int totalScore = 0;
    private int numberOfPhrases = 0;

    Scanner scrn = new Scanner(System.in);

     void setValuespt2(String a){

        int counter = 0;
        String line[] = new String[4];
        Scanner scrn = new Scanner(System.in);
        for (String c : a.split("\t")){ //splits the sentence by tabs
            line[counter] = c;
            counter++;
        }
        totalScore += Integer.parseInt(line[3]); //adds the score if sentence ID is the same
        numberOfPhrases++; //adds total phrases
        sentenceID = Integer.parseInt(line[1]); //sentence ID set the same

    }
    void print(int number) {


         if(sentenceID != 0){
             if((double)totalScore/(double) numberOfPhrases >0 && (double)totalScore/(double) numberOfPhrases < 2) { //if entry is a negative sentiment
                 System.out.print("Sentence ID " + sentenceID + " has " + numberOfPhrases + " phrases with an average " + (double) totalScore / (double) numberOfPhrases);
                 System.out.println(". The overall sentiment is negative");
             } else if ((double)totalScore/(double) numberOfPhrases >= 2 && (double)totalScore/(double) numberOfPhrases < 3) { // if entry is a neutral sentiment
                 System.out.print("Sentence ID " + sentenceID + " has " + numberOfPhrases + " phrases with an average " + (double) totalScore / (double) numberOfPhrases);
                 System.out.println(". The overall sentiment is neutral");
             } else if ((double)totalScore/(double) numberOfPhrases >= 3 && (double)totalScore/(double) numberOfPhrases <= 4) { // if entry is a positive sentiment
                 System.out.print("Sentence ID " + sentenceID + " has " + numberOfPhrases + " phrases with an average " + (double) totalScore / (double) numberOfPhrases);
                 System.out.println(". The overall sentiment is positive");
             }
         }else{ // if entry does not exist
             System.out.println("Sentence ID " + number + " has 0 phrases thus no average can be computed");

         }



    }


}
