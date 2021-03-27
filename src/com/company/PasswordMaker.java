package com.company;

import java.util.Random;

public class PasswordMaker {

    String name;
    private String password;
    final static int MAGIC_NUMBER = 5;

    final String MAGIC_STRING = RandomStringGenerator(15);

    public PasswordMaker(String name) {
        this.name = name;
        generatePassword();
    }

    private void generatePassword() {
        String sir1 = RandomStringGenerator(MAGIC_NUMBER);

        String sir11 = GetTenRandomChar(MAGIC_STRING);

        String sir2 = String.valueOf(name.length());

        Random rnd = new Random();
        int nr = rnd.nextInt(101);

        sir2 = sir2 + nr;

        password = sir1 +sir11+ sir2;

    }

    private String GetTenRandomChar(String magic_string) {

        Random rnd = new Random();
        String word="";

        for(int i=0; i<10;i++){
            word=word+magic_string.charAt(rnd.nextInt(magic_string.length()));
        }

        System.out.println(word+"   Lungime"+word.length());
        return word;


    }

    private String RandomStringGenerator(int n) {
        Random rnd = new Random();

        int low = 33;
        int high = 126;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int result = rnd.nextInt(high - low) + low;
            sb.append((char) (result));
        }

        System.out.println(sb.toString()+"   Lungime"+sb.toString().length());

        return sb.toString();
    }

    public String getPassword() {
        return password;
    }

}
