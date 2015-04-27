import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import Question.*;
import Answer.*;

public class ReadAdministerQuestion {
    static ArrayList<QuizQuestion> questions = new ArrayList<QuizQuestion>();
    static ArrayList<QuizAnswer> answers = new ArrayList<QuizAnswer>();
    
    public static void main(String[] args)throws FileNotFoundException{
        //Write a wrapper to Call each function based on user input.
        readQuestions();
        administerQuestions();
        displayResult();
        saveResult();
        
    }
    
    private static void readQuestions() throws FileNotFoundException {
        
        System.out.println("Starting to read questions");
        File file = new File("Questions.txt"); // make it configurable?
        Scanner sc = new Scanner(file).useDelimiter("\\n"); //read a line at a time.
        
        while (sc.hasNext()){
            char type = sc.next().charAt(0);
            if(type=='T'){
                TrueFalseQuestion tfq = TrueFalseQuestion.readQuestion(sc);
                questions.add(tfq);
                System.out.println("Read question :" + questions.size()); // remove debug statements.
            }
            else if(type=='M'){
                
            }
            else if(type=='W'){
                
            }
        }
        System.out.println("Done reading questions");
        System.out.println("Total Questions read is " + questions.size());   
    }
    
    private static void administerQuestions(){
        
        for(Object i : questions){
            if(i instanceof TrueFalseQuestion){
                answers.add(((TrueFalseQuestion)i).administer());
            }
            else if(i instanceof MultipleChoiceQuestion){
                answers.add(((MultipleChoiceQuestion)i).administer());
            }
            else if(i instanceof WordQuestion){
                answers.add(((WordQuestion)i).administer());
            }
            System.out.println("Size of Answers array after this is " + answers.size());
        }
    }
    
    private static void  displayResult(){
        
    }
    
    private static void saveResult(){
        
    }
}