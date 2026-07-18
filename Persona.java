/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2026_1_act1;

import javax.swing.JOptionPane;

/**
 *
 * @author grecr
 */
public class Persona {
    
    private float peso;
    private float altura;
    private float imc;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        
        imc = peso / (altura * altura);
        
        
        return imc;
    }

    public void mostarCategoria(){
        
       if(imc < 18.5) { 
          JOptionPane.showMessageDialog(null, "Bajo Peso");
     } else if(imc >= 18.5 && imc <= 24.9) {
          JOptionPane.showMessageDialog(null, "Normal");
     } else if (imc >= 25 && imc <= 29.9) {
          JOptionPane.showMessageDialog(null, "Sobrepeso");
     } else if (imc >= 30 && imc <=34.9) {
         JOptionPane.showMessageDialog(null, "Obesidad I");
     } else if (imc >= 35 && imc <=39.9) {
         JOptionPane.showMessageDialog(null, "Obesidad II");
     } else {
         JOptionPane.showMessageDialog(null, "Obesidad III");
     }
    }
    
    
    
}
