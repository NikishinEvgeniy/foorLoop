package org.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class
HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 968, 562);
        stage.setTitle("Application");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    /*
     Тестирование :
     1 Тест +
     2 Тест +
     3 Тест +

     Задания
     Семантика:

     1. Вывести на печать по завершении анализа таблицу констант
     4. Сообщать об ошибках при анализе, указывая курсором место ошибки
     2.3 int-numb от  -32768 до 32767

     Ошибки
     2. Сделать семантику

     Сделал:
     2.1 ID <= 12 ( Сделал )
     2.2 Зарезервированные слова ( Сделал )
     1. Сделать без пробела корректную строку ( Сделал )
     3. Почистить код ( Сделал )
     4. Убрать пробел в конце ( Сделал )
     5. Таблица ID ( сделана )
     3. Проверять совпадение имени переменных цикла в cound-expr и loop-expr с переменной цикла init-exper ( Сделал )
     4. Сообщать об ошибках при анализе ( выводя их содержание )
     1. Вывести на печать по завершении анализа таблицы индентификаторов ( сделал )

     */
}