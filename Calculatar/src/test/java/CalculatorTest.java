/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.calculatar.Calculatar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAFA
 */
public class CalculatorTest {
    
    Calculatar calc = new Calculatar(); 
 
    @Test 
    public void testAdd() { 
        assertEquals(5, calc.add(2, 3)); 
    } 
 
    @Test 
    public void testSubtract() { 
        assertEquals(1, calc.subtract(4, 3)); 
    } 
 
    @Test 
    public void testMultiply() { 
        assertEquals(6, calc.multiply(2, 3)); 
    } 
 
    @Test 
    public void testDivide() { 
        assertEquals(2, calc.divide(6, 3)); 
    } 
    @Test(expected = ArithmeticException.class) 
    public void testDivideByZero() { 
        calc.divide(10, 0); 
    } 
} 
