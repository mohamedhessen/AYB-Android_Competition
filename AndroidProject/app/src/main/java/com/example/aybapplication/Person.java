package com.example.aybapplication;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {

    public static long ID = 0;
    public Service service;


    Person()
    {
        ID++;
        service = new Service();
    }
}
