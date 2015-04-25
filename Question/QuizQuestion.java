package Question;

import Answer.*;

public abstract class QuizQuestion {
    private char type;
    private String question;
    
    public abstract QuizAnswer administer();
    
    protected void setType(char type){
        this.type = type;
    }
    
    protected char getType(){
        return this.type;
    }
    
    protected void setQuestion(String question){
        this.question = question;
    }
    
    protected String getQuestion(){
        return this.question;
    }
}