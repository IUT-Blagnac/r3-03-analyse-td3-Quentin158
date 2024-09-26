package com.iutblagnac.r303trace;

/**
 * La classe App fournit des methodes pour imprimer et retourner "Hello World".
 */
public class App {

    /**
     * La méthode imprime le résultat de la methode hello() dans la console.
     *
     * @param args Arguments de la ligne de commande
     */
    public static void main(String[] args) {
        System.out.println(hello());
    }

    /**
     * Retourne le message "Hello World!".
     *
     * @return Le message "Hello World!"
     */
    public static String hello() {
        return "Hello World!";
    }

    /**
     * Retourne le paramètre d'entree comme message.
     *
     * @param param Le paramètre d'entree
     * @return Le paramètre d'entree comme message
     */
    public static String hello(String param) {
        return param;
    }

}
