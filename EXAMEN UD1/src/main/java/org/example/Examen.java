package org.example;

import java.util.Scanner;

public class Examen {
    public void ejercicio1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = input.nextInt();
        if (num < 0) {
            num = num * (-1);
        }
        System.out.println("El valor absoluto es: " + num);
    }
    public void ejercicio2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el ancho de la pared:");
        int an_pa = input.nextInt();
        System.out.println("Introduce el largo de la pared:");
        int la_pa = input.nextInt();
        System.out.println("Introduce el ancho del azulejo:");
        int an_az = input.nextInt();
        System.out.println("Introduce el largo del azulejo:");
        int la_az = input.nextInt();

        int area_pa = an_pa * la_pa;
        int area_az = an_az * la_az;
        int total = area_pa / area_az;
        if(an_az == la_az){
            System.out.println("El azulejo no puede ser cuadrado");
        }else if( area_az > area_pa ){
            System.out.println("El azulejo no puede ser más grande que la pared");
        }else{
            System.out.println("Se necesitan " + total + " azulejos");
        }
    }
}
