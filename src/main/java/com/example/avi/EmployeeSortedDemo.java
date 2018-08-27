package com.example.avi;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSortedDemo {

    public static void main(String[] args){
        Employee e1 = new Employee(5,"f1","l1","f1l1@gmail.com");
        Employee e2 = new Employee(2,"f2","l2","f2l2@gmail.com");
        Employee e3 = new Employee(3,"f3","l3","f3l3@gmail.com");
        Employee e4 = new Employee(4,"f4","l4","f4l4@gmail.com");

        Employee[] employees = new Employee[4];
        employees[0]=e1;
        employees[1]=e2;
        employees[2]=e3;
        employees[3]=e4;

        for(Employee e : employees){
            System.out.println(e.toString());
        }

        EmployeeSorter employeeSorter = new EmployeeSorter();
        employeeSorter.sort(employees);

        for(Employee e : employees){
            System.out.println(e.toString());
        }

        System.out.println(isAnagram("anaconda", "aaanncod"));
    }


    public static boolean hasDuplicateChars(String s){
        if(s==null || s.isEmpty()){return false;}
        Map<Character, Integer> counts = new HashMap<>();

        for(char c: s.toCharArray()){
            if(counts.containsKey(c)){
                return true;
            }else{
                counts.put(c,1);
            }
        }
        return false;
    }


    public static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(count1.containsKey(c1)){
                count1.put(c1,count1.get(c1)+1);
            }else{
                count1.put(c1,1);
            }
            if(count2.containsKey(c2)){
                count2.put(c2,count2.get(c2)+1);
            }else{
                count2.put(c2,1);
            }
        }

        return checkBothMaps(count1, count2);
    }

    private static boolean checkBothMaps(Map<Character, Integer> count1, Map<Character, Integer> count2) {
        for(Map.Entry<Character, Integer> e : count1.entrySet()){
            if(!count2.containsKey(e.getKey()) || count2.get(e.getKey())!=e.getValue()){
                return false;
            }
        }

        return true;
    }
}
