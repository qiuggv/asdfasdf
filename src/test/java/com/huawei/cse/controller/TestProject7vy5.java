package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject7vy5 {

        Project7vy5Delegate project7vy5Delegate = new Project7vy5Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project7vy5Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}