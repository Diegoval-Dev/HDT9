package Model;

import UI.Ui;
import structure.Structure;

import java.util.ArrayList;

public class Dictionary {
    private static final txtReader txtreader = new txtReader();
    public static void translate(){
        String sentence = Ui.ReadInputText();

    }
    public static void fillTree(){
        String treeText = Ui.selectTree();
        assert treeText != null;
        ArrayList<Word> words = txtreader.returnArrWords();
        Structure<WordAssociation> tree = Factroy.factory(treeText);
    }
}
