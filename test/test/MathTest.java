/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class MathTest {
    
    Math m = new Math();
    
    @Test
    public void perimeterTest1() {
        int n = 4;
        Assert.assertEquals(n * 4, m.perimeterOfSquare(n));
    }
    
    @Test
    public void TwoSumsTest1() {
        int n = 4;
        Assert.assertEquals(n * 4, m.perimeterOfSquare(n));
    }
    
    @Test
    public void EvenDivideTest1() {
        int n = 4;
        Assert.assertEquals(true, m.evenDivide(n));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
