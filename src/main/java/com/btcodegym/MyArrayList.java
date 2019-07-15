package com.btcodegym;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
    }

    public MyArrayList(int capacity) {
        this.size = capacity;
    }

    private void ensureCapa() {
        int newSize = this.elements.length * 2;
        this.elements = Arrays.copyOf(this.elements, newSize);
    }

    public void add(int index, E element) {
        if (this.size == this.DEFAULT_CAPACITY) {
            this.ensureCapa();
        }
        this.elements[this.size++] = element;
    }

    public E remove(int index) {
        E temp = (E) this.elements[index];
        for (int i = index; i < size; i++) {
            this.elements[i - 1] = this.elements[i];
        }
        this.size--;
        return temp;
    }

    public int size() {
        return this.size;
    }

    public Object clone() {
        MyArrayList myArrayList = new MyArrayList<E>();
        myArrayList.elements = this.elements;
        myArrayList.size = this.size;
        return myArrayList;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if ((E) this.elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if ((E) this.elements[i] == o) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(E e) {
        if (this.size == this.DEFAULT_CAPACITY) {
            this.ensureCapa();
        }
        if (e == null) {
            return false;
        }
        return true;
    }

    public E get(int i) {
        return (E) this.elements[i];
    }

    public void clear() {
        this.size = 0;
        this.elements = null;
    }
}
