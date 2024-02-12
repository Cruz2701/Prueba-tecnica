package org.example;

import java.util.Scanner;

public class palindromo {

    public void pal(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la palabra:");
        String cadena = leer.nextLine().replace(" ", "");
        cadena = cadena.toLowerCase();

        String reversa = "";

        char auxiliar;

        for (int i = cadena.length()-1; i >= 0; i--){
            auxiliar = cadena.charAt(i);
            reversa = reversa+auxiliar;
        }
        if (cadena.equals(reversa)){
            System.out.println("Es palindromo");
        }else {
            System.out.println("No es palindromo");
        }
    }
}
