package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Object[] res = Stream.of(1, 2, 3, 4, 5, 6, 7, 8).filter( i -> (i % 2) == 0).filter(i -> i >3).toArray();

    }
}