import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import Question.*;

public class ReadAdministerQuestion {
    static ArrayList<QuizQuestion> questions = new ArrayList<QuizQuestion>();
    
    public static void main(String[] args)throws FileNotFoundException{
        readQuestions();
        administerQuestions();
        
    }
    
    private static void readQuestions() throws FileNotFoundException {
        
        System.out.println("Starting to read questions");
        File file = new File("Questions.txt");
        Scanner sc = new Scanner(file).useDelimiter("\\n");
        
        while (sc.hasNext()){
            char type = sc.next().charAt(0);
            if(type=='T'){
                TrueFalseQuestion tfq = TrueFalseQuestion.readQuestion(sc);
                questions.add(tfq);
                System.out.println(questions.size());
            }
            else if(type=='M'){
                
            }
            else if(type=='W'){
                
            }
        }
        System.out.println("Done reading questions");   
    }
    
    private static void administerQuestions(){
        
    }
}