import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner scrn = new Scanner(System.in);
        ReviewEntry newList[] = new ReviewEntry[8645];
        for(int i = 0; i <8645; i ++){
            newList[i] = new ReviewEntry();
        }
        int currentindex;
        try { // try catch to see if the file can be found
            FileInputStream in = new FileInputStream("movieReviews.tsv"); //input streams to import file
            InputStreamReader input = new InputStreamReader(in);
            BufferedReader buffer = new BufferedReader(input);

            String line;
            int skip= 0;

            while ( ( line = buffer.readLine())!= null) { //reads in each input
                for (String liner : line.split(";")){ //splits each variable by line
                    if(skip == 0){
                        skip++;
                    }else {
                        currentindex = setValues(line);  //setValues for finding length
                        newList[currentindex].setValuespt2(line); //creates object ith specified parameters
                    }
                }
            }
        } catch (IOException e) { // if file can not be found
            System.out.println("File not Found");
        }
        try {
            System.out.print("Enter which entry you would like to look at: "); // input for specific entry
            int inputnumber = scrn.nextInt();
            newList[inputnumber].print(inputnumber);
        }catch(Exception e){ //if entry is out of bounds
            System.out.println("Entry is not within scope");
        }

    }
    public static int setValues(String a){ //method to
        int counter = 0;
        String line[] = new String[4];
        for (String c : a.split("\\t")) {
            line[counter] = c;
            counter++;
        }
        return Integer.parseInt(line[1]);
    }
    }