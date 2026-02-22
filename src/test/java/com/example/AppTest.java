package com.example;
import org.junit.Test;
import org.junut.Asset.*;

class AppTest{
    @Test
    public void testMul(){
        AssetEquals(6,app.mul(2,3));
    }
}