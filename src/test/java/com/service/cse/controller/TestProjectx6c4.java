package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectx6c4 {

        Projectx6c4Delegate projectx6c4Delegate = new Projectx6c4Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectx6c4Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}