package gestioneventos_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionEventos_4 {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);

        Validador validador = new Validador() {
            @Override
            public boolean validar(int num) {
                return num % 2 == 0;
            }
        };

        int num;

        do {
            try {
                System.out.print("Ingrese un numero, o 0 para salir\n");
                num = sc.nextInt();

                if (num != 0) {
                    if (validador.validar(num)) {
                        System.out.println("El numero ingresado es par.");
                    } else {
                        System.out.println("El numero ingresado es impar.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                sc.nextLine();
                num = -1; 
            }
        } while (num != 0);

        System.out.println("Cerrando programa...");
        sc.close();
    }
   
}