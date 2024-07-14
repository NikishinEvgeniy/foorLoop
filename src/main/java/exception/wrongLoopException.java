package exception;

public class wrongLoopException extends Exception{
    public  wrongLoopException(){
        super("Не правильный цикл ( переменная не создана )");
    }
}
