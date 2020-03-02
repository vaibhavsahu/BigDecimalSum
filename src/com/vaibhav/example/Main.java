package com.vaibhav.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<BigDecimal> list = new ArrayList<>();

        list.add(BigDecimal.valueOf(9.99));
        list.add(BigDecimal.valueOf(1.24));
        list.add(BigDecimal.valueOf(3.56));
        list.add(BigDecimal.valueOf(7.89));
        list.add(BigDecimal.valueOf(2.11));
        list.add(BigDecimal.valueOf(0.04));

        BigDecimal total = list.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("total: "+ total);
    }
}
