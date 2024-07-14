package exception;

public class incorrectInputException extends Exception{
    public incorrectInputException(){
        super("Некорректный ввод");
    }
}
