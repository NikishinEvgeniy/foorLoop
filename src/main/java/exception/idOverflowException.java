package exception;

public class idOverflowException extends Exception{
    public idOverflowException(){
        super("Переполнение id (больше 12 символов)");
    }
}
