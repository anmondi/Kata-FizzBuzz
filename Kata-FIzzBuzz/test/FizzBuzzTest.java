/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam122
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    @Test
    public void testFizzBuzzDeUnoDevuelveUno() {
        FizzBuzz fb = new FizzBuzz();
        int result = fb.getFizzBuzz(1);
        assertEquals(1, result);
    }
    @Test
    public void testFizzBuzzDeDosDevuelveDos() {
        FizzBuzz fb = new FizzBuzz();
        int result = fb.getFizzBuzz(2);
        assertEquals(2, result);
    }
    
    
    
}
