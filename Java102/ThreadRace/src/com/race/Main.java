package com.race;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int capacity = 100;

        List<Integer> arrayList = new ArrayList<>(capacity);
        for(int i = 0; i < capacity; i++){
            arrayList.add(i);
        }

        List<Integer> subList1 = arrayList.subList(0, capacity/4);
        List<Integer> subList2 = arrayList.subList(capacity/4, capacity/2);
        List<Integer> subList3 = arrayList.subList(capacity/2, capacity/4 * 3);
        List<Integer> subList4 = arrayList.subList(capacity/4 * 3, capacity);

        ThreadRace threadRace1 = new ThreadRace(subList1);
        threadRace1.start();

        ThreadRace threadRace2 = new ThreadRace(subList2);
        threadRace2.start();

        ThreadRace threadRace3 = new ThreadRace(subList3);
        threadRace3.start();

        ThreadRace threadRace4 = new ThreadRace(subList4);
        threadRace4.start();
    }
}
