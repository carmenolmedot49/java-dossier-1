package com.calculadora;

import java.util.Scanner; // Importación necesaria para Scanner

public class Calculadora {

    public static void main(String[] args) {

        float operador1;			// "Referencia" a los operadores que se van a usar, en este caso, serán 2
        float operador2;
        int operacion;

        
        Scanner entradaTeclado = new Scanner(System.in);
        
        
        // Introducir los operadores
        
        System.out.println("Introduce el primer número: ");
        operador1 = Float.parseFloat(entradaTeclado.nextLine());

        System.out.println("Introduce el segundo número: ");
        operador2 = Float.parseFloat(entradaTeclado.nextLine());
        
        
        // 1 Suma, 2 Resta, 3 System.out.println("Resultado de la suma: ");Multiplicación, 4 División

        System.out.println("Indica la operación a realizar: 1 Suma, 2 Resta, 3 Multiplicación, 4 División, 0 Salir");
        String contenido = entradaTeclado.nextLine();
        operacion = Integer.parseInt(contenido); 

        while (operacion != 0) {

            switch (operacion) {
                case 1:
                    
                    System.out.println(operador1 + operador2);
                    break;

                case 2:
                    System.out.println("Resultado de la resta: ");
                    System.out.println(operador1 - operador2);
                    break;

                case 3:
                    System.out.println("Resultado de la multiplicación: ");
                    System.out.println(operador1 * operador2);
                    break;

                case 4:
                    if (operador2 == 0) {
                        System.out.println("División por 0 no permitida.");
                    } else {
                        System.out.println("Resultado de la división: ");
                        System.out.println(operador1 / operador2);
                    }
                    break;

                default:
                    System.out.println("Operación no reconocida.");
                    break;
            }

            // SOLICITAR UNA NUEVA OPERACIÓN DENTRO DEL BUCLE
            System.out.println("Indica la operación a realizar: 1 Suma, 2 Resta, 3 Multiplicación, 4 División, 0 Salir");
            contenido = entradaTeclado.nextLine();
            operacion = Integer.parseInt(contenido);
        }

        entradaTeclado.close(); // Se cierra el Scanner

        System.out.println("Fin del programa.");
    }
