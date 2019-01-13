package com.kodilla;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class EuklidesAlgorythm {

    public static void main (String[] args) throws java.lang.Exception{

        System.out.println("Program do obliczania NWD dwóch liczb");

        System.out.println("Podaj pierwszą liczbę");
        int firstNumber;
        Scanner a = new Scanner(System.in);
        firstNumber = a.nextInt();

        System.out.println("Podaj drugą liczbę");
        int secondNumber;
        Scanner b = new Scanner(System.in);
        secondNumber = b.nextInt();

        int rest = 1;
        int biggerNumber = 0;
        int smallerNumber = 0;

        if (firstNumber>secondNumber){
            biggerNumber = firstNumber;
            smallerNumber = secondNumber;
        }
        else {
            biggerNumber = secondNumber;
            smallerNumber = firstNumber;
        }

        while (rest != 0){
            rest = biggerNumber % smallerNumber;
            if (rest ==0 ){
                System.out.println("Dla liczb " + firstNumber + " i "+ secondNumber + " NWD przy metodzie z dzieleniem wynosi: "+ smallerNumber);
            }
            else{
                biggerNumber = smallerNumber;
                smallerNumber = rest;
            }
        }

        while (biggerNumber != smallerNumber)
            if(biggerNumber>smallerNumber){
                biggerNumber -= smallerNumber;
            }
            else {
                smallerNumber -= biggerNumber;
            }

        System.out.println("Dla liczb " + firstNumber + " i "+ secondNumber + " NWD przy metodzie z odejmowaniem wynosi: "+ smallerNumber);
    }
}
