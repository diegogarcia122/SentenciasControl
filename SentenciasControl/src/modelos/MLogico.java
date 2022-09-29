/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author labc205
 */
public class MLogico {
    
    /**
     * Verifica si dos numeros enteros son iguales
     * @param num1
     * @param num2
     * @return 
     */
    
    public boolean sonIguales(int num1, int num2){
        return num1 == num2;
    }
    
    public boolean sonIguales(double num1, double num2){
        return num1 == num2;
    }
    
    public boolean esMayor(double num1, double num2){
        return num1 < num2;
    }
    
    public boolean esMenor(double num1, double num2){
        return num1 > num2;
    }
    
    public boolean SsonIguales(String car1, String car2){
        return car1.equals(car2);
    }
    
    public boolean CsonIguales(String cad1, String cad2){
        return cad1.length()==cad2.length();
    }
    
    public boolean CesMayor(String cad1, String cad2){
        return cad1.length()<cad2.length();
    }
    
    public boolean esNegativo(double num1){
        return num1<0;
    }
    
}
