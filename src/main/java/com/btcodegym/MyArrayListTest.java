package com.btcodegym;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<Integer>();
        myList.add(0, 5);
        myList.add(1, 2);
        MyArrayList<Integer> myList1 = (MyArrayList<Integer>) myList.clone();
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.contains(2));
        System.out.println(myList.indexOf(5));
    }
}
