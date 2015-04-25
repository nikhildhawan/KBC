
import Question.*;
import Answer.*;

import java.util.Scanner;

public class QuizQuestionTester {
    public static void main(String[] args){
        System.out.println("Tester Starting up.");
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");;
        TrueFalseQuestion tfq = TrueFalseQuestion.readQuestion(sc);
        tfq.administer();
        
    }
}