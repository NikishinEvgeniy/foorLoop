package org.example.demo2;


import exception.*;
import javafx.scene.control.Label;
import org.example.demo2.semantic.ConstantStorage;
import org.example.demo2.semantic.StorageID;
import org.example.demo2.semantic.counterConstant;
import tool.Node;



public class Analizator {
    private StringBuilder stringBuilder;

    public Analizator(StringBuilder stringBuilder){
        this.stringBuilder = stringBuilder;
    }

    public Node analyzeTheEntireString(Node node, String str, Label exceptionLabel) {
        int characterIndex = 0;
        Node prefNode = null; // Семантика ( Проверка не зарезервированное слово )
        try {
            while (node.getLinks().length != 0) {
                if (characterIndex < str.length()) {
                    char value = str.charAt(characterIndex);

                    if (Cheacker.isNodeValue(node, value)) {
                        stringBuilder.append(value);
                        Viewer.consoleViewUserInputs(stringBuilder);
                    } else if (Cheacker.isLinkValue(node, value)) {
                        prefNode = node; // Для reversedWords
                        stringBuilder.append(value);
                        Viewer.consoleViewUserInputs(stringBuilder);
                        node = Switcher.switcherNextNode(node, Cheacker.getLinkIndex());
                    } else throw new incorrectInputException();
                    characterIndex++;

                    if (Cheacker.isReversedWord(prefNode, stringBuilder)) throw new reservedWordsException();
                    if (Cheacker.canAddId(prefNode)) StorageID.addID(stringBuilder);
                    Cheacker.nextNodeIsForLoopID(value);
                    if (!counterConstant.isCounterHasGone()) {
                        Cheacker.isConstNode(prefNode, value);
                    }
                    if (counterConstant.isCounterHasGone()) {
                        if (Cheacker.canCount(value, stringBuilder)) {
                            counterConstant.setNumberOfCharacters(counterConstant.getNumberOfCharacters() + 1);
                        } else {
                            if (counterConstant.getNumberOfCharacters() > 0) {
                                ConstantStorage.addConstant(stringBuilder);
                                if (Cheacker.integerHasGoneOutOfBounds()) throw new overflowOfNumberException();
                            }
                            counterConstant.setCounterHasGone(false);
                            counterConstant.setNumberOfCharacters(0);
                        }
                    }
                    if (!Cheacker.forLoopIsRight(prefNode, stringBuilder)) throw new wrongLoopException();
                    if (!Cheacker.canWriteIDSymbol(node)) throw new idOverflowException();
                } else throw new incorrectInputException();
            }
        }
        catch (incorrectInputException o) {
            exceptionLabel.setText(
                    "Ожидается символ, введите:"
                            + "\n"
                            + Viewer.viewLinkValue(node)
                            + "\n"
                            + Viewer.viewNodeValue(node)
            );
        }
        catch (overflowOfNumberException e){
            exceptionLabel.setText(
                    "Выход за границы числа: int в границах [-32768;32767]"
                            + "\n"
            );
            counterConstant.setNumberOfCharacters(0);
        }
        catch (idOverflowException e){
            exceptionLabel.setText(
                    "Выход ID > 12"
                            + "\n"
            );
        }
        catch (reservedWordsException e){
            exceptionLabel.setText(
                    "Зарезервированное слово"
                            + "\n"
            );
        }
        catch (wrongLoopException e){
            exceptionLabel.setText(
                    "Неправильный цикл FOR"
                            + "\n"
            );
        }
        return node;
    }
}
