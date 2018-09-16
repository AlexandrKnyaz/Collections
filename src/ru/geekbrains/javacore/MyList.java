package ru.geekbrains.javacore;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList {
    private int[] arr;

    public MyList() {
        arr = new int[0];
    }

    public void add(int val) {
        increaseSize();
        arr[arr.length-1] = val;
    }

    public int get(int index){
        return arr[index];
    }

    public int size(){
        return arr.length;
    }

    public int[] toArray(){
        return arr;
    }

    private void increaseSize() {
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    private void print(){
        System.out.println(Arrays.toString(arr));
    }
}
