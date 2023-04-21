import Model.Dictionary;
import UI.Ui;

public class Main {
    public static void main(String[] args) {
        String treeText = Ui.selectTree();
        String sentence = Ui.ReadInputText();
        Ui.print(Dictionary.translate(sentence,treeText));
    }
}