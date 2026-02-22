package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
    @Test
    public void testMul(){
        App app =new App();
        assertEquals(6,app.mul(2,3));
    }
}
