package com.codewars.kata_7kyu;

import java.util.stream.IntStream;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {

      return IntStream.of(args).min().orElse(Integer.MIN_VALUE);
    }
}