package com.example;
import org.junit.Test;
import org.junit.Assert.*;

class AppTest{
    @Test
    public void testMul(){
        AssetEquals(6,app.mul(2,3));
    }
}
