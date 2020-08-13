package com.company;

import java.util.*;

public class Main {

    public static ArrayList <String> A = new ArrayList<>();
    public static ArrayList <String> B = new ArrayList<>();
    public static ArrayList <String> C = new ArrayList<>();

    public static void main(String[] args) {

        addString(A,"Введите строку: ");

        addString(B,"Введите строку2: ");

        Collections.reverse(B);
        ListIterator<String> listIterator = B.listIterator();
        ListIterator<String> stringListIterator = A.listIterator();
        while (stringListIterator.hasNext()){
            String s1 = stringListIterator.next();
            C.add(s1);
            if (listIterator.hasNext()){
                String s2 = listIterator.next();
                C.add(s2);
            }
        }
        System.out.println(C);

        Comparator<String> stringComparator = new StringLenghtSort();
        C.sort(stringComparator);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("AAAAAAAAAAAAAAA");
        strings.add("AA");
        strings.add("A");
        strings.add("AAAA");
        strings.sort(stringComparator);
        System.out.println(strings);

        ArrayList<String> stringArrayList = new ArrayList<>(3);
        stringArrayList.add("White");
        stringArrayList.add("Blue");
        stringArrayList.add("Brown");
        stringArrayList.ensureCapacity(6);
        stringArrayList.add("Yellow");
        stringArrayList.add("Gray");
        Collections.sort(stringArrayList);
        Collections.reverse(stringArrayList);
        System.out.println(stringArrayList);
        Collections.shuffle(stringArrayList);
        System.out.println(stringArrayList);
    }

    public static void addString(ArrayList<String> strings,String hint){
        while (strings.size() < 5){
            System.out.println(hint);
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            strings.add(s);
        }
        System.out.println(strings);
    }

}
