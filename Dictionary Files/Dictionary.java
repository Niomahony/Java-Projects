import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dictionary {

    private ArrayList<String> words;
    private final int shortest;
    private final int longest;
  
    public Dictionary(String filepath, int shortest, int longest) {
        // This method reads words from the specified file
        // and adds them to the ‘words’ list. See details below.
        this.words = new ArrayList<>();
        this.shortest = shortest;
        this.longest = longest;

        try{
            File file = new File(filepath);
            Scanner finder = new Scanner(file);
            
            while(finder.hasNextLine()){
                String line = finder.nextLine();
                String[] lineSplit = line.split(",");
                
                for(String word: lineSplit){
                    // trimming words
                    String wordTrim = word.trim();
                    // making sure they're uppercase
                    String wordUppercase = wordTrim.toUpperCase();
                    
                    if(wordTrim.length() >= this.shortest && wordTrim.length() <= this.longest){
                        if(!this.words.contains(wordUppercase)){
                            this.words.add(wordUppercase);
                    }      
                }
            }
        }

        Collections.sort(this.words);

        } catch(IOException e){
            System.out.println("File not found");
    }
} 
  
// You will also need to include the other methods specified below.
  
public boolean add(String word){
    // trimming words
    String wordTrim = word.trim();
    // making sure they're uppercase
    String wordUppercase = wordTrim.toUpperCase();

    if(wordTrim.length() >= this.shortest && wordTrim.length() <= this.longest){
        if(!this.words.contains(wordUppercase)){
            this.words.add(wordUppercase);
                Collections.sort(this.words);
                    return true;
            }
        }
    return false;
}

public String nextWord(){
    if (this.words.size() == 0){
        return "";
    } 
    int random = (int)(Math.random()*this.words.size());
    return this.words.get(random);

}
public boolean inDictionary(String word){
    // trimming words
    String wordTrim = word.trim();
    // making sure they're uppercase
    String wordUppercase = wordTrim.toUpperCase();
    //this will return true if it contains our word
    return this.words.contains(wordUppercase);
    }   
}