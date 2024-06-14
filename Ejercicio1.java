package com.ejemplo.miproyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,promedio;
        System.out.println("Digite una la primera calificacion:");
        nota1 = entrada.nextFloat();
        System.out.println("Digite una la segunda calificacion:");
        nota2 = entrada.nextFloat();
        System.out.println("Digite una la tercera calificacion:");
        nota3 = entrada.nextFloat();
        promedio = (nota1 + nota2 + nota2 )/3;
        if (promedio>=70){
            System.out.println("Aprobo el curso");
        }else{
            System.out.println("Reprobo el curso");
        }
    }
}
