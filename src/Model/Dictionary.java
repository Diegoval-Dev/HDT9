package Model;

import UI.Ui;
import structure5.Structure;

import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    private static final txtReader txtreader = new txtReader();
    static Structure<WordAssociation> tree;

    /**
     * Traduce la oracion ingresada
     * @return
     */
    public static String translate(String sentence, String treeText){
        fillTree(treeText);
        String[] wordsOfSentence = sentence.split(" ");
        StringBuilder sentenceSpanish = new StringBuilder();
        for (String word: wordsOfSentence) {
            if(tree.contains(new WordAssociation(word,null))){
                WordAssociation wr = tree.get(new WordAssociation(word,null));
                sentenceSpanish.append(wr.getValue());
            }if(!tree.contains(new WordAssociation(word,null))){
                sentenceSpanish.append("*").append(word).append("*");
            }
        }

        return sentenceSpanish.toString();
    }

    /**
     * Rellena el arbol con la informacion del documento
     * @param treeText cual arbol usar
     */
    public static void fillTree(String treeText){
        assert treeText != null;
        ArrayList<Word> words = txtreader.returnArrWords();
        tree = Factroy.factory(treeText);
        for (Word word:words) {
            assert tree != null;
            tree.add(new WordAssociation(word.getEnglishWord(), word.getSpanishWord()));
        }
    }
}
