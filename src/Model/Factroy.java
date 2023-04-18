package Model;

import structure.BinarySearchTree;
import structure.RedBlackSearchTree;
import structure.SplayTree;
import structure.Structure;

import java.util.HashMap;

public class Factroy {
    public static  Structure<WordAssociation> factory(String s){
        switch (s){
            case "Splay Tree":
                return new SplayTree<WordAssociation>();
            case "Red Black Tree":
                return new RedBlackSearchTree<WordAssociation>();
            case "Arbol AVL":
                return new BinarySearchTree<WordAssociation>();
            default:
                return null;
        }
    }
}
