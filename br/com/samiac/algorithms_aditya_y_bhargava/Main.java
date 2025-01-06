package br.com.samiac.algorithms_aditya_y_bhargava;

import br.com.samiac.algorithms_aditya_y_bhargava.binary_search.BinarySearch;
import br.com.samiac.algorithms_aditya_y_bhargava.utils.Data;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 1000000; i++){
            list.add(i);
        }

        int myNumberIndex = BinarySearch.searchNumber(list, 125000);

        System.out.println();
        System.out.println(myNumberIndex);
    }
}
