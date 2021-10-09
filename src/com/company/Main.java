package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String>listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя № "+i+ " для списка Листа А");
            listA.add(i, scanner.next());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Введите имя №"+i+ " для списка Листа Б");
            listB.add(i, scanner.next());
        }
//        ArrayList<String> listA = new ArrayList<>();
//        listA.add("Атай");
//        listA.add("Абай");
//        listA.add("Мурат");
//        listA.add("Асан");
//        listA.add("Хасан");
//        System.out.println("Это список А: "+ listA);
//        ArrayList<String>listB = new ArrayList<>();
//        listB.add("Айгуль");
//        listB.add("Гульнур");
//        listB.add("Айнур");
//        listB.add("Айгерим");
//        listB.add("Акмарал");

        System.out.println("Это список Б: "+ listB);
        Collections.reverse(listB);
        System.out.println("__________");
        System.out.println("Это перевенутый список Б: " +listB);

        ArrayList<String> listC = new ArrayList<>();
        listC.addAll(listA);

        //        System.out.println("Это список С до добавления списка Б: "+listC);
//        for (int i = 0; i < listB.size(); i=i+2) {
//            listC.add(i+1,listB.get(i));
//        } не смог его выполнить помогите как ниже в ручную

        listC.add(1,listB.get(4));
        System.out.println(listC);
        listC.add(3,listB.get(3));
        System.out.println(listC);
        listC.add(5,listB.get(2));
        System.out.println(listC);
        listC.add(7,listB.get(1));
        System.out.println(listC);
        listC.add(9,listB.get(0));
        System.out.println(listC);

        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);

    }

}
