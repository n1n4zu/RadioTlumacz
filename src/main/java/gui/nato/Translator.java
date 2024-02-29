package gui.nato;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class Translator implements Initializable {

    @FXML
    private ChoiceBox<String> languageChoiceBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        languageChoiceBox.getItems().addAll("Język polski", "Alfabet radiowy");
        languageChoiceBox.setValue("Alfabet radiowy");
    }

    @FXML
    private TextArea textInput = new TextArea();

    @FXML
    private TextArea textOutput = new TextArea();

    @FXML
    public void showTranslation() {

        String choice = languageChoiceBox.getValue();

        switch (choice) {

            case "Alfabet radiowy": {
                textOutput.setText(translateToRadio(textInput.getText()));
                break;
            }

            case "Język polski": {
                textOutput.setText(translateToAlphabet(textInput.getText()));
                break;
            }
        }
    }

    private String translateToRadio (String text) {
        text = text.toUpperCase();
        text = text.replaceAll("Ą", "A");
        text = text.replaceAll("Ę", "E");
        text = text.replaceAll("Ć", "C");
        text = text.replaceAll("Ź", "Z");
        text = text.replaceAll("Ż", "Z");
        text = text.replaceAll("Ł", "L");
        text = text.replaceAll("Ó", "O");
        text = text.replaceAll("Ś", "S");
        text = text.replaceAll("Ń", "N");

        HashMap<String, String> radioAlphabet = new HashMap<String, String>();
        radioAlphabet.put("A", "Alpha");
        radioAlphabet.put("B", "Bravo");
        radioAlphabet.put("C", "Charlie");
        radioAlphabet.put("D", "Delta");
        radioAlphabet.put("E", "Echo");
        radioAlphabet.put("F", "Foxtrot");
        radioAlphabet.put("G", "Golf");
        radioAlphabet.put("H", "Hotel");
        radioAlphabet.put("I", "India");
        radioAlphabet.put("J", "Juliett");
        radioAlphabet.put("K", "Kilo");
        radioAlphabet.put("L", "Lima");
        radioAlphabet.put("M", "Mike");
        radioAlphabet.put("N", "November");
        radioAlphabet.put("O", "Oscar");
        radioAlphabet.put("P", "Papa");
        radioAlphabet.put("Q", "Quebec");
        radioAlphabet.put("R", "Romeo");
        radioAlphabet.put("S", "Sierra");
        radioAlphabet.put("T", "Tango");
        radioAlphabet.put("U", "Uniform");
        radioAlphabet.put("V", "Victor");
        radioAlphabet.put("W", "Whiskey");
        radioAlphabet.put("X", "Xray");
        radioAlphabet.put("Y", "Yankee");
        radioAlphabet.put("Z", "Zulu");
        radioAlphabet.put("0", "Zero");
        radioAlphabet.put("1", "One");
        radioAlphabet.put("2", "Two");
        radioAlphabet.put("3", "Three");
        radioAlphabet.put("4", "Four");
        radioAlphabet.put("5", "Five");
        radioAlphabet.put("6", "Six");
        radioAlphabet.put("7", "Seven");
        radioAlphabet.put("8", "Eight");
        radioAlphabet.put("9", "Nine");
        radioAlphabet.put(" ", "Space");
        radioAlphabet.put("-", "-");
        radioAlphabet.put("!", "!");
        radioAlphabet.put("&", "&");
        radioAlphabet.put(".", ".");
        radioAlphabet.put(",", ",");
        radioAlphabet.put(":", ":");
        radioAlphabet.put(";", ";");
        radioAlphabet.put("\"", "\"");
        radioAlphabet.put("'", "'");
        radioAlphabet.put("(", "(");
        radioAlphabet.put(")", ")");
        radioAlphabet.put("[", "[");
        radioAlphabet.put("]", "]");
        radioAlphabet.put("{", "{");
        radioAlphabet.put("}", "}");
        radioAlphabet.put("|", "|");
        radioAlphabet.put("\\", "\\");
        radioAlphabet.put("+", "+");
        radioAlphabet.put("=", "=");
        radioAlphabet.put("_", "_");
        radioAlphabet.put("*", "*");
        radioAlphabet.put("^", "^");
        radioAlphabet.put("%", "%");
        radioAlphabet.put("$", "$");
        radioAlphabet.put("#", "#");
        radioAlphabet.put("@", "@");
        radioAlphabet.put("`", "`");
        radioAlphabet.put("~", "~");
        radioAlphabet.put("<", "<");
        radioAlphabet.put(">", ">");
        radioAlphabet.put("/", "/");
        radioAlphabet.put("?", "?");

        String[] inputList = text.split("");

        String translated = "";

        for (String i: inputList) {
            translated += radioAlphabet.get(i) + " ";
        }

        return translated.substring(0, translated.length() - 1);
    }

    private String translateToAlphabet (String text) {

        HashMap<String, String> englishAlphabet = new HashMap<String, String>();
        englishAlphabet.put("Alpha", "A");
        englishAlphabet.put("Bravo", "B");
        englishAlphabet.put("Charlie", "C");
        englishAlphabet.put("Delta", "D");
        englishAlphabet.put("Echo", "E");
        englishAlphabet.put("Foxtrot", "E");
        englishAlphabet.put("Golf", "G");
        englishAlphabet.put("Hotel", "H");
        englishAlphabet.put("India", "I");
        englishAlphabet.put("Juliett", "J");
        englishAlphabet.put("Kilo", "K");
        englishAlphabet.put("Lima", "L");
        englishAlphabet.put("Mike", "M");
        englishAlphabet.put("November", "N");
        englishAlphabet.put("Oscar", "O");
        englishAlphabet.put("Papa", "P");
        englishAlphabet.put("Quebec", "Q");
        englishAlphabet.put("Romeo", "R");
        englishAlphabet.put("Sierra", "S");
        englishAlphabet.put("Tango", "T");
        englishAlphabet.put("Uniform", "U");
        englishAlphabet.put("Victor", "V");
        englishAlphabet.put("Whiskey", "W");
        englishAlphabet.put("Xray", "X");
        englishAlphabet.put("Yankee", "Y");
        englishAlphabet.put("Zulu", "Z");
        englishAlphabet.put("Zero", "0");
        englishAlphabet.put("One", "1");
        englishAlphabet.put("Two", "2");
        englishAlphabet.put("Three", "3");
        englishAlphabet.put("Four", "4");
        englishAlphabet.put("Five", "5");
        englishAlphabet.put("Six", "6");
        englishAlphabet.put("Seven", "7");
        englishAlphabet.put("Eight", "8");
        englishAlphabet.put("Nine", "9");
        englishAlphabet.put("Space", " ");
        englishAlphabet.put("-", "-");
        englishAlphabet.put("!", "!");
        englishAlphabet.put("&", "&");
        englishAlphabet.put(".", ".");
        englishAlphabet.put(",", ",");
        englishAlphabet.put(":", ":");
        englishAlphabet.put(";", ";");
        englishAlphabet.put("\"", "\"");
        englishAlphabet.put("'", "'");
        englishAlphabet.put("(", "(");
        englishAlphabet.put(")", ")");
        englishAlphabet.put("[", "[");
        englishAlphabet.put("]", "]");
        englishAlphabet.put("{", "{");
        englishAlphabet.put("}", "}");
        englishAlphabet.put("|", "|");
        englishAlphabet.put("\\", "\\");
        englishAlphabet.put("+", "+");
        englishAlphabet.put("=", "=");
        englishAlphabet.put("_", "_");
        englishAlphabet.put("*", "*");
        englishAlphabet.put("^", "^");
        englishAlphabet.put("%", "%");
        englishAlphabet.put("$", "$");
        englishAlphabet.put("#", "#");
        englishAlphabet.put("@", "@");
        englishAlphabet.put("`", "`");
        englishAlphabet.put("~", "~");
        englishAlphabet.put("<", "<");
        englishAlphabet.put(">", ">");
        englishAlphabet.put("/", "/");
        englishAlphabet.put("?", "?");

        String[] inputList = text.split(" ");

        String translated = "";

        for (String i: inputList) {
            translated += englishAlphabet.get(i);
        }

        return translated.toLowerCase();
    }
}
