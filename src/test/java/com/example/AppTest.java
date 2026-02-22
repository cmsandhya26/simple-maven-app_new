package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

class AppTest{
    @Test
    public void testMul(){
        App app =new App();
        AssertEquals(6,app.mul(2,3));
    }
}
