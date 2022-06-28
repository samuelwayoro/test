/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbs.algodojo;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int x ;
//        x = tab[tab.length-1];
//        System.out.println("la valeur de x "+x);
//        
//        for (int i = 0; i < 11; i++) {
//            System.out.println("->" + tab[i]);
//        }
//        //System.out.println("la taille de la table est  " + tab.length);
//        //remplacement des valeures
//        System.out.println("----------------------------------");
//        tab[tab.length-1] = tab[0] ;
//        tab[0] = x ;
//        for (int i = 0; i < 11; i++) {
//            System.out.println("=>"+tab[i]);
//        }

        //rechercher une valeure dans un tableau 
        int[] tab;
        int taille;
        int i;
        int val, indiceVal;
        //objet de saisie 
        Scanner sc = new Scanner(System.in);

        //demande de saisie de la taille a alouer au tableau 
        System.out.println("veuillez entrer la taille du tableau");
        taille = sc.nextInt();
        tab = new int[taille];
        System.out.println("vous avez initialisé une tableau de taille " + tab.length);

        //remplissage du tableau avec les données 
        i = 0;
        while (i < tab.length) {
            System.out.println("entrer la valeur dans la cellule numero " + i + " du tableau ");
            tab[i] = sc.nextInt();
            i++;
        }

//        System.out.println("AFFICHAGE DES DONNEES SAISIE DANS LE TABLEAU ");
//        for (int j = 0; j < tab.length; j++) {
//            System.out.println("---->"+tab[j]);
//        }
        //fouille dans le tableau : on demande au user de saisir la valeur dans le tableau tant que la valeur rechercher n'est pas dans le tab 
        System.out.println("debut de la recherche d'une valeur dans le tableau");
        System.out.println("saisi la valeur que tu recherche ");
        val = sc.nextInt();
        indiceVal = -1;

        int x = 0;
        while ((x < tab.length) && (indiceVal == -1)) {
            if (val == tab[x]) {
                  System.out.println("BRAVO la valeur :" + val + "  se trouve a la celulle n° " + x + " du tableau ");
                  indiceVal = x;
            }
            x++;
            System.out.println("désolé la valeur : " + val + "   n'est pas à la celulle n° "+ x +"du tableau  !");
        }

    }

}
