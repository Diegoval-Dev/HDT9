package UI;

import java.util.Scanner;

public class Ui {
    private final static Scanner sc = new Scanner(System.in);
    public static String selectTree(){
        System.out.println("Seleccione su tipo de arbol: ");
        System.out.println("1. Red Black Tree");
        System.out.println("2. Splay Tree");
        System.out.println("3.  Árbol AVL");
        switch (sc.nextInt()) {
            case 1:
                return "Red Black Tree";
            case 2:
                return "Splay Tree";
            case 3:
                return "Arbol AVL";
            default:
                return null;
        }
    }
    public static String ReadInputText(){
        String a = sc.nextLine();
        return a;
    }
    public static void print(String m){
        System.out.println(m);
    }
}
