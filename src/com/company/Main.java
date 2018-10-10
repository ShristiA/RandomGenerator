package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Random r = new Random();
	for (int i=0; i<=9;i++){
	    int x = 1+r.nextInt(6);
	    System.out.println(" Your random number is \b "+x);
    }
    }
}
