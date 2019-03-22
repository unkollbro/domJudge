/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class EjercicioD {
    public static void leerDatos(){
        Scanner leer = new Scanner(System.in);
        ArrayList<String> Concurso = new ArrayList<>();
        String entrada = leer.nextLine();
        String introducido;
        int equipos, ejercicios;
        String vEntrada[] = entrada.split(" ");
        equipos = Integer.parseInt(vEntrada[1]);
        ejercicios = Integer.parseInt(vEntrada[0]);
        String nombreEquipo;
        int resultado = 0;
        int completados=0;
        //Empieza el juego
        for (int i = 0; i < equipos; i++) {
            introducido = leer.nextLine();
            String vFinal[] = introducido.split(" ");
            if(vFinal.length>ejercicios+1){
                System.out.println("Introduccion erronea");
                break;
            }
            nombreEquipo = vFinal[0];
            for (int j = 1; j < vFinal.length; j++) {
                if(!(vFinal[j].equals("-"))){
                    completados++;
                    resultado += Integer.parseInt(vFinal[j]);
                }
               
            }
            Concurso.add(nombreEquipo+" "+completados+" "+resultado);
            resultado=0;
            completados=0;
        }
        
        for (String participante : Concurso) {
            System.out.println(participante);
        }
    }
}
