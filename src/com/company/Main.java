package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your first name?");
        String first = kb.nextLine();
        System.out.println("What is your last name?");
        String last = kb.nextLine();
        System.out.println("Your full name is " + first + " " + last);



    }
}
