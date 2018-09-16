package ru.geekbrains.javacore;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        MyList list = new MyList();
//	    list.add(10);
//        list.add(20);
//        list.add(-1);
//        list.add(30);

//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

        //System.out.println(Arrays.toString(list.toArray()));

        //System.out.println();
        ArrayList list2 = new ArrayList();
        list2.add(10);
        list2.add(20);
        list2.add(-1);
        list2.add(30);

        for(int i=0; i<list2.size(); i++){
            System.out.println(i+" "+list2.get(i));
        }
        System.out.println();
        list2.add(1, 100);
        for(int i=0; i<list2.size(); i++){
            System.out.println(i+" "+list2.get(i));
        }
        System.out.println();

        list2.remove(1);

        for(int i=0; i<list2.size(); i++){
            System.out.println(i+" "+list2.get(i));
        }
        System.out.println();


        System.out.println(list2.contains(10)); //проверка на содержание элемента в коллекции
        list2.set(0, 5); //замена
        System.out.println(Arrays.toString(list2.toArray()));


        list2.clear(); //очистка коллекции
        /*НОВОЕ
        //int[] arr = {1,2,3};
        //int[] arr2 = Arrays.copyOf(arr, 4); //копирование массива
         */
    }
}
