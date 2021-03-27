package com.company;

//1.	Să se implementeze o clasă PasswordMaker ce generează, folosind RandomStringGenerator, o parolă pornind de la datele unei persoane. Această clasă o să conțină următoarele:
//        	o constantă MAGIC_NUMBER având orice valoare doriți
//        	un String constant MAGIC_STRING, lung de minim 20 de caractere, generat random
//        	un constructor care primește: un String numit name
//        	o metodă getPassword() care va returna parola
//        	parola se construiește concatenand următoarele șiruri:
//        	un șir random de lungime MAGIC_NUMBER, generat cu RandomStringGenerator și cu un alfabet obținut din 10 caractere obținute random din MAGIC_STRING
//        	și șirul format prin conversia la String a lungimii lui name + un numar intreg generat random din intervalul [0,100]


import java.util.Random;

public class Main {

    public static void main(String[] args) {

        PasswordMaker p = new PasswordMaker("dragos");
        System.out.println(p.getPassword());

    }

}

