/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
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
public class StringUtilityTest {
    
    StringUtility string = new StringUtility();
    
    public void concatTest(){
        ArrayList<String> bag = new ArrayList<>();
        bag.add("1");
        String sep = "ojo";
        Assert.assertEquals("1ojo~ojo", string.concat(bag, sep));

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
