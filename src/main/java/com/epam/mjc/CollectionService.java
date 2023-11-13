package com.epam.mjc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(hehe -> hehe % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        Optional<Integer> hehe = list.stream().max(Comparator.naturalOrder());
        return hehe;
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {

        Optional<Integer> hehe = list.stream().flatMap(num -> num.stream()).min(Comparator.naturalOrder());

        return hehe;
    }

    public Integer sum(List<Integer> list) {
        int i = 0;
        Integer hehe = list.stream().mapToInt(num -> num).sum();
        return hehe;
    }
}
