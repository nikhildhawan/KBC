
public class myUtils {
    static boolean flag = true;
    public static void debug(String message){
        if(flag){
            System.out.println(message);
        }
    }
}