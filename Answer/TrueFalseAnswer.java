package Answer;

import Question.*;

public class TrueFalseAnswer extends QuizAnswer {
    
    private TrueFalseQuestion quizQuestion;
    private boolean answer;
    
    public void init( TrueFalseQuestion usertfq,boolean userAns,char result){
        this.quizQuestion = usertfq;
        this.answer = userAns;
        this.setResult(result);
        this.setType('T');
    }
    
    
}