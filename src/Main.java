import testClass.Methods.reflections;
import testClass.Methods.Str_Buf;


public class Main {
    public static void main(String[] args){
        Str_Buf strBuf = new Str_Buf(new StringBuffer("Hello"));
        strBuf.methods("World", 2);
    }
}