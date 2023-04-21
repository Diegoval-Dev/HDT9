package Model;

import UI.Ui;
import structure5.Structure;

import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    private static final txtReader txtreader = new txtReader();
    static Structure<WordAssociation> tree;
    public static void translate(){
        fillTree();
        Scanner sc = new Scanner(System.in);
        String sentence = Ui.ReadInputText();
        String[] wordsOfSentence = sentence.split(" ");
        String sentenceSpanish = "";
        for (String word: wordsOfSentence) {
            if(tree.contains(new WordAssociation(word,null))){
                sentenceSpanish = sentence + tree.get(new WordAssociation(word,null)).getValue();
            }else {
                sentenceSpanish = sentence + "*"+word+"*";
            }
        }
        Ui.print(sentenceSpanish);
    }
    public static void fillTree(){
        String treeText = Ui.selectTree();
        assert treeText != null;
        ArrayList<Word> words = txtreader.returnArrWords();
        tree = Factroy.factory(treeText);
        for (Word word:words) {
            assert tree != null;
            tree.add(new WordAssociation(word.getEnglishWord(), word.getSpanishWord()));
        }
    }
}
