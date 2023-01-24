package it.develhope.io;

public class Start {
    public static void main(String[] args) {

        System.out.println("---------Starting operations-----------------");

        System.out.println("(55 != 55) && (false ^ true): " + ((55 != 55) && (false ^ true)));

        System.out.println("------------------------------------");

        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = '2';
        System.out.println("(!a || !b) || c == d: " + ((!a || !b) || c == d));

        System.out.println("------------------------------------");

        System.out.println("false && true || false && !false: " + (false && true || false && !false));

        System.out.println("------------------------------------");

        System.out.println("(false && true) || (false || true)): " + ((false && true) || (false || true)));

        System.out.println("-------------------------------------");

    }
}
