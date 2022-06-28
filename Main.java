/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sbs.algodojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author SamuelWAYORO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Personne moi = new Personne(100);
//        Personne lui = new Personne(46);
//        
//        Personne[] lesGens = new Personne[2];
//        lesGens[0] = moi;
//        lesGens[1] = lui ;
//        
//        //trie les elements du tableau par ordre croissant grace a comparateur , et le met dans le tableau lesGens
//        Arrays.sort(lesGens,Personne::compare);
//        
//        for (Personne p : lesGens) {
//            System.out.println(p.getAge());
//        }
//        
//        Integer[] tabInt = {10,95,5,1000,1,-52,0,-56,2,6};
//        
//        Arrays.sort(tabInt, (Integer e1,Integer e2)->{return e1-e2;});
//        
//        for (Integer integer : tabInt) {
//            System.out.println(integer);
//        }
        
        List<String> data = new ArrayList<>();
        data.add("lundi");
        data.add("mardi");
        data.add("mercredi");
        data.add("jeudi");
        data.add("vendredi");
        data.add("samedi");
        data.add("dimanche");
        
        data.stream()
                .filter(s->{System.out.println("filtrage   "+s);return s.startsWith("m");})
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        
        //travail sur un flux d'entier avec Intstream
        IntStream.range(1, 10).forEach(System.out::println);
        
        Stream.of("cp1","cp2","ce1","ce2","cm1","cm2").forEach(System.out::println);
        //exemple d'opération terminale sur un flux
        Object[] toArray = Stream.of("Wayoro","badobré","Blaise","Samuel").toArray();
        
        Stream<Personne> s = Stream.of(new Personne(34),new Personne(67),new Personne(4)).sorted((p1,p2)->{return p1.compareA(p2);});
        s.forEach((p)->{System.out.println("affichage de l'age   "+p.getAge());});
    }
    
}
