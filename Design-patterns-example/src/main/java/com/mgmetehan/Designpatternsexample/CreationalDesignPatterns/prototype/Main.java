package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Beyza");

        Employees empsNew2 = (Employees) emps.clone();
        List<String> list2 = empsNew2.getEmpList();
        list2.remove("Ahmet");

        System.out.println("emps List:     "+emps.getEmpList());
        System.out.println("empsNew List:  "+list);
        System.out.println("empsNew2 List: "+list2);
    }
}
