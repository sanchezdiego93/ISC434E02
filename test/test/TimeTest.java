/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import test.MyTime;

/**
 *
 * @author Diego
 */
public class TimeTest {
   
    /**
     *
     */
    @Test
    public void earlierTest(){
        MyTime testTime = new MyTime();
        if(testTime.earlier(new ArrayList<Integer>(), new ArrayList<Integer>())){
            assertEquals("Esta prueba debe resultar exitosa", true, 
                testTime.earlier(new ArrayList<Integer>(), new ArrayList<Integer>()));
        }
        else{
            assertEquals("Esta prueba debe resultar erronea", false, 
                testTime.earlier(new ArrayList<Integer>(), new ArrayList<Integer>()));
        }
    }
    
    @Test
    public void perimiterExceptionIsThrown(){
        Math testMath = new Math();
        testMath.perimeterOfSquare(50);
    }
    
    @Test
    public void perimeterOfSqareTest(int n){
        Math testMath = new Math();
        if(testMath.perimeterOfSquare(n) == n*n){
            assertEquals("Este metodo resulta exitoso", true, 
                testMath.perimeterOfSquare(n));
        }else{
            assertEquals("Este metodo resulta erroneo", false, 
                testMath.perimeterOfSquare(n));
        }
    }
    
    @Test
    public void twoSumOfNTest(int n, int l, int r){
        Math testMath = new Math();
        if(l < r){
            assertEquals("Este metodo resulta exitoso", true,
                    testMath.twoSumOfN(n, l, r));
        }
    }
    
    public void nextSecondTest(ArrayList<Integer> currentTime){
        MyTime testTime = new MyTime();
        if(testTime.nextSecond(currentTime).equals(currentTime.get(0)+1)){
            assertEquals("Metodo correcto", true,
                    testTime.nextSecond(currentTime));
        }else{
            assertEquals("Metodo incorrecto", false,
                    testTime.nextSecond(currentTime));
        }
    }
    
    @Test
    public void evenDivideTest(int n){
        Math timeMath = new Math();
        
        if(timeMath.evenDivide(n) == (n%2 == 0)){
            assertEquals("Metodo correcto", true, timeMath.evenDivide(n));
        }
        else{
            assertEquals("Metodo incorrecto", false, timeMath.evenDivide(n));
        }
        
    }
}
