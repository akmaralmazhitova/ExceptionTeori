package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Car cr = new Car("BMV")) {
            cr.drive();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

