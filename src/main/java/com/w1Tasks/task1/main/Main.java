package com.w1Tasks.task1.main;

import com.w1Tasks.task1.Impl.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.scan("com.w1Tasks.task1.Impl");
        ac.refresh();

        Calculator calculator = ac.getBean(Calculator.class);
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.divide(6, 2));
        System.out.println(calculator.multiply(2, 3));
        System.out.println(calculator.subtract(3, 2));
    }
}
