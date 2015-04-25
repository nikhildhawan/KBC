package Answer;


public abstract class QuizAnswer {
    private char type;
    private char result;
    
    protected void setType(char type){
        this.type = type;
    }
    
    protected char getType(){
        return this.type;
    }
    
    protected void setResult(char result){
        this.result = result;
    }
    
    protected char getResult(){
        return this.result;
    }
}