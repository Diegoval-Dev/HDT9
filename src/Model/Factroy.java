package Model;

import structure5.BinarySearchTree;
import structure5.RedBlackSearchTree;
import structure5.SplayTree;
import structure5.Structure;

public class Factroy {
    /**
     * Regresa el arbol a utilizar
     * @param s nombre del arbol
     * @return el arbol en si
     */
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
