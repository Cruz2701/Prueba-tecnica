package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    
public static void main(String[] args) {
    palindromo p1 = new palindromo();
    cuenta c1 = new cuenta();

    int opc;
    Scanner menu = new Scanner(System.in);

    System.out.println("Seleccione el programa que quiere utilizar:\n1.- Palindromo\n2.- Contador");
    opc = menu.nextInt();

    switch (opc){
        case 1:
            p1.pal();
            break;
        case 2:
            c1.cuenta();
            break;
        case 3:
            System.exit(0);
        default:
            System.out.println("Opcion incorrecta");
    }

}


}