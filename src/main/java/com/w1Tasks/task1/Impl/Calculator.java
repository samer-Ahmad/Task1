package com.w1Tasks.task1.Impl;

import com.w1Tasks.task1.DAO.addition;
import com.w1Tasks.task1.DAO.division;
import com.w1Tasks.task1.DAO.multiplication;
import com.w1Tasks.task1.DAO.subtraction;
import org.springframework.stereotype.Component;

@Component
public class Calculator implements addition, division, multiplication, subtraction {

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double divide(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Can not divide by zero ");
        }

        return n1 / n2;

    }

    public double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public double subtract(double n1, double n2) {
        return n1 - n2;
    }
}
