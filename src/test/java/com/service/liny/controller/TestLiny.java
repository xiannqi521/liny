package com.service.liny.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLiny {

        LinyDelegate linyDelegate = new LinyDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = linyDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}