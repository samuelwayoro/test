/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sbs.algodojo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author SamuelWAYORO
 */
public class MyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Personne> liste = new ArrayList<>();
        
        liste.add(new Personne(33,"Samuel"));
        liste.add(new Personne(31, "Isaac"));
        liste.add(new Personne(35, "Arnold"));
        
        Stream<Personne> listestreamee = liste.stream();
        List<Personne> listeFiltree = listestreamee.filter(p->p.getAge() > 30).collect(Collectors.toList());
        listeFiltree.stream().forEach(System.out::println);
        
        //recuperation de l'age moyen 
        double ageMoyen = liste.stream().collect(Collectors.averagingInt(p->p.getAge()));
        System.out.println("lage moyen est  "+ageMoyen);
        
        //utilisation de reduce pour effectuer la somme total des ages des personnes 
        int ageTotal = liste.stream().reduce(0,(somme,p)->somme+=p.getAge(),(s1,s2)->s1+s2);
        System.out.println("age total "+ageTotal);
    }
    
}
