package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import static java.lang.System.*;

public class Main {
    private static int randomGenerator() throws IOException {
        int x;
        ArrayList<Integer> items = new ArrayList<Integer>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String in = new String();
        Random randomItem = new Random();

        out.print("Podaj ilość elementów, spośród których ma zostać wylosowany dokładnie jeden: ");
        in = input.readLine();
        x = Integer.parseInt(in);
        out.println("Wybrano: " + x + " elementów.\n\nWygenerowane elementy:");

        for (int i = 0; i < x; i++) {
            items.add(i + 1);
            out.print(items.get(i) + " ");
        }
        out.println("\n");
        int index = randomItem.nextInt(items.size());

        return items.get(index);
    }

    public static void main(String[] args) throws IOException {
        int item = randomGenerator();
        out.println("----------------------------------------------------------------------------------");
        out.println("Wylosowano element nr: " + item);
        out.println("----------------------------------------------------------------------------------");

    }
}
