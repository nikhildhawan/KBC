package Question;

import java.util.Scanner;
import Answer.*;

public class TrueFalseQuestion extends QuizQuestion {
    private boolean correctAnswer;
    
    public static TrueFalseQuestion readQuestion(Scanner in){
        
        TrueFalseQuestion objTFQ = new TrueFalseQuestion();
        objTFQ.setType('T');
        objTFQ.setQuestion(in.next());
        String ans = in.next();
        if(ans.charAt(0)=='+'){ // not required for Truefalse question but just in case we decide to give warnings.
            if(ans.substring(1).equals("true")){
                objTFQ.correctAnswer = true;
            }
            else{
                objTFQ.correctAnswer = false;
            }
        }
        in.next();  // ignore. Should return '.' or new line, marking the end of this question. To satisfy note 5 of design.
        return objTFQ;
    }
    
    public TrueFalseAnswer administer(){
        
        TrueFalseAnswer objTFA = new TrueFalseAnswer();
        boolean userAnswer;
        String strUserAnswer;
        
        System.out.println(this.getQuestion());
        System.out.println("True or false?");
        System.out.print("Type true or false in lower case:");
        Scanner scan = new Scanner(System.in);
        strUserAnswer = scan.next();
        
        if(strUserAnswer.equals("true")){
            userAnswer = true;
        }
        else{
            userAnswer = false;
        }
        
        
        if(userAnswer == correctAnswer){
            objTFA.init(this,userAnswer,'C');
        }
        else{
            objTFA.init(this,userAnswer,'I');
        }
        return objTFA;
        
    }
}