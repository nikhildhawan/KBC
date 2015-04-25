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
        if(ans.charAt(0)=='+'){
            if(ans.substring(1).equals("true")){
                objTFQ.correctAnswer = true;
            }
            else{
                objTFQ.correctAnswer = false;
            }
        }
        in.next();  // Should return '.' or new line marking the end of this question.
        return objTFQ;
    }
    
    public TrueFalseAnswer administer(){
        System.out.println(this.getQuestion());
        
        return null;
    }
}