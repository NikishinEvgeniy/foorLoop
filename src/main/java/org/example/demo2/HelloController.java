package org.example.demo2;

import exception.overflowOfNumberException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import org.example.demo2.semantic.ConstantStorage;
import org.example.demo2.semantic.StorageID;
import org.example.demo2.semantic.counterConstant;
import tool.CustomGraph;
import tool.Node;

public class HelloController {

    @FXML
    private Label exceptionLabel;

    @FXML
    private Label textOutput;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField userText;


    private Node head = CustomGraph.createGraph();
    private StringBuilder stringBuilder = new StringBuilder();
    private Analizator analizator = new Analizator(stringBuilder);


    @FXML
    void checkingTheUserInput(KeyEvent event) {
        Node tailNode = analizator.analyzeTheEntireString(head,userText.getText(),exceptionLabel);
        if(tailNode.getLinks().length == 0){
            try {
                if(Cheacker.integerHasGoneOutOfBounds()) throw new overflowOfNumberException();
                Viewer.viewUserInputs(stringBuilder,resultLabel);
                textOutput.setText("Успешно");
                exceptionLabel.setText("ID: + \n" + StorageID.getStorageId() + "\n" + "Constant: " + ConstantStorage.getLinkedList());
                counterConstant.setCounterHasGone(false);
                counterConstant.setNumberOfCharacters(0);
            }
            catch (overflowOfNumberException e){
                exceptionLabel.setText(
                        "Выход за границы числа: int в границах [-32768;32767]"
                                + "\n"
                );
                counterConstant.setNumberOfCharacters(0);
            }
        }
        else {
            textOutput.setText("");
            Viewer.viewUserInputs(stringBuilder,resultLabel);
        }
        stringBuilder.setLength(0);
        counterConstant.setNumberOfCharacters(0);
        StorageID.getStorageId().clear();
        ConstantStorage.getLinkedList().clear();
    }
}
