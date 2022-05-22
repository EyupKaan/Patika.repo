package com.race;

import java.util.ArrayList;
import java.util.List;

public class ThreadRace extends Thread{

    private List<Integer> evenS = new ArrayList<>();
    private List<Integer> oddS = new ArrayList<>();

    List<Integer> subArray;
    int number;

    public ThreadRace(List<Integer> subArray){
        this.subArray = subArray;
    }

    @Override
    public void run(){
        Even_Or_Odd(this.subArray);
        print();
    }


    public synchronized void Even_Or_Odd(List<Integer> subArray){
        int capacity = subArray.size();

        for(int i = 0; i < capacity; i++){
            number = subArray.get(i);
            if(number % 2 == 0){
                evenS.add(number);
            }else{
                oddS.add(number);
            }
        }
    }

    public void print(){
        System.out.println(Thread.currentThread().getName()+" even numbers -> "+evenS);
        System.out.println(Thread.currentThread().getName()+" odd number -> "+oddS);
    }

}
