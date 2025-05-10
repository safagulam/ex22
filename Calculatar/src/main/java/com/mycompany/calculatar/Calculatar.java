/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatar;

/**
 *
 * @author SAFA
 */
public class Calculatar {

    public int add(int a, int b) { 
        return a + b; 
    } 
 
    public int subtract(int a, int b) { 
        return a - b; 
    } 
 
    public int multiply(int a, int b) { 
        return a * b; 
    } 
 
    public int divide(int a, int b) { 
        if (b == 0) throw new ArithmeticException("Cannot divide by zero"); 
        return a / b; 
    } 
} 