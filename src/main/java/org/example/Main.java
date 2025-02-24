package org.example;

import org.example.modell.Garazs;
import org.example.modell.Jarmu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Járművek: ");
        Garazs garazs = new Garazs();
        for(Jarmu jarmu:garazs){
            System.out.println(jarmu);
        }
    }
}