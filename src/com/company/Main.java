package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<Character,Integer> dictionary = new HashMap<Character, Integer>();
        System.out.print("Введите две строки:\n");
        Scanner in=new Scanner(System.in);
        int p = 0;
        boolean flag = false;
        String str1 = in.next();
        String str2 = in.next();

        for(int i=0;i<str1.length();i++){
            if(!dictionary.containsKey(str1.charAt(i))){
                dictionary.put(str1.charAt(i),1);
            }
            else dictionary.put(str1.charAt(i),(dictionary.get(str1.charAt(i)))+1);
        }

        for(int i=0;i<str2.length();i++){
            if(!dictionary.containsKey(str2.charAt(i))){
                System.out.print("NO");
                flag = true;
                break;
                }
            else if(dictionary.get(str2.charAt(i)) == 0) {
                System.out.print("NO");
                flag = true;
                break;}
            else {dictionary.put(str2.charAt(i),(dictionary.get(str2.charAt(i)))-1);
                if(dictionary.get(str2.charAt(i)) == 0) {dictionary.remove(str2.charAt(i));}
            }

        }
        if(dictionary.size() == 0) {System.out.print("YES");}
        else if(!flag) System.out.print("NO");
    }
}
