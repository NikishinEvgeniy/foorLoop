package exception;

public class reservedWordsException extends Exception{
    public reservedWordsException(){
        super("Ошибка, введено зарезервированное слово");
    }
}
