package com.bridgelabz.javaJunit;

import java.util.LinkedList;
import  java.util.Scanner;

public class LinkedListFunctions {
    public static boolean addElement(LinkedList<Integer> li, int element){
        boolean isAdd = true;
        li.add(element);
        return isAdd;
    }

    public static boolean removeElement(LinkedList<Integer> li, int element){
        boolean isRemove = true;
        if(!li.contains(element)){
            isRemove = false;
        }

        li.remove();
        return isRemove;
    }

    public static int getSize(LinkedList<Integer> li){
        return li.size();
    }

    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elements to add: ");
        int ele = scanner.nextInt();
        addElement(linkedList,ele);

        System.out.println("Elements to add: ");
        int ele2 = scanner.nextInt();

        addElement(linkedList,ele2);
        removeElement(linkedList,ele);

        System.out.println("Size of linkedlist: " +getSize(linkedList));

    }
}

//Elements to add:
//        23
//Elements to add:
//        12
//Size of linkedlist: 1