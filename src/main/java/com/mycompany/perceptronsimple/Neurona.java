/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perceptronsimple;

/**
 *
 * @author Yiro
 */
public class Neurona {
    
    String[] consonantes;
    String[] vocales;
    char[] array_nombre;
    String NET;
    
    public Neurona(String[] consonantes, String[] vocales){
        this.consonantes = consonantes;
        this.vocales = vocales;
        this.NET = "";
        this.array_nombre = new char[50];
    }
    
    public void entrenamiento(String nombre){
        int intentos = 0;
        while (true) {
            StringBuilder palabra = new StringBuilder();
            for (int i = 0; i < 2; i++) {
                palabra.append(consonantes[(int)(Math.random() * consonantes.length)]);
                palabra.append(vocales[(int)(Math.random() * vocales.length)]);
            }
            String palabraGenerada = palabra.toString();
            System.out.println("Intento: " + intentos + " - Palabra generada: " + palabraGenerada);
            
            if (palabraGenerada.equals(nombre)) {
                System.out.println("\n¡Encontrado '" + nombre + "'!\n");
                break;
            }
            
            intentos++;
        }
        System.out.println("\nNúmero de intentos: " + intentos);
        System.out.println("----------------------------------------");
    }
}
