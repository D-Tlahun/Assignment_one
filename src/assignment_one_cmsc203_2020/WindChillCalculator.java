/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_one_cmsc203_2020;

/**
 *
 * @author derejetlahun
 */

import java.util.Scanner;

public class WindChillCalculator{
    public static void main(String[] args){
        double t;
        double v;
        final double num1 = 35.74;
        final double num2 = 0.625;
        final double num3 = 0.4275;
        final double num4 = 35.75;
        
        double windChillTemperature;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wind Chill Calculator");
        
        System.out.print("Please enter the temperature in Fahr: ");
        
        t = scan.nextDouble();
        System.out.print("Please enter the wind speed ");
        
        v = scan.nextDouble();
        if(t >= -45 && t<=40 && v <=5 && v>= 60){
            windChillTemperature = (num2 * t) + (num1) - (num4* Math.pow(v, 0.16)) + 
               ((num3 * t) *(Math.pow(v, 0.16)));
            System.out.println("The wind chill temprature is "+windChillTemperature +"\n");
            
        }
        else 
            System.out.println("You enter invalid number");
        
        System.out.println("Programer: Dereje Tlahun");
        
    }
}
