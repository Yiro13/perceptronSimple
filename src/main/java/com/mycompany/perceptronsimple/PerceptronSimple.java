/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perceptronsimple;

/**
 *
 * @author Yiro
 */
public class PerceptronSimple {
    
    Neurona neurona;
    String[] consonantes = {"b","c","d","f","g","h","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String[] vocales = {"a","e","i","o","u"};
    
    public PerceptronSimple(){
        neurona = new Neurona(consonantes, vocales);
        neurona.entrenamiento("coco");
    }

    public static void main(String[] args) {
        new PerceptronSimple();
    }
}
