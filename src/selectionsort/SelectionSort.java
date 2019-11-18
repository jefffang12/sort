/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.ArrayList;

/**
 *
 * @author Nathan Cheung
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Jack");
        str.add("Nate");
        str.add("Bob");
        str.add("Zack");
        str.add("Jeff");
        str.add("Jaden");
        System.out.println(bubble(str, false));
    }

    public static ArrayList<String> bubble(ArrayList<String> str, boolean mode) {
        boolean sorted = false;
        String temp;
        while (!sorted) {
            sorted = true;
            for (int j = 0; j < str.size(); j++) {
                for (int i = j + 1; i < str.size(); i++) {
                    if (str.get(i).compareTo(str.get(j)) < 0 && mode) {
                        sorted = false;
                        temp = str.get(i);
                        str.set(i, str.get(j));
                        str.set(j, temp);
                    } else if (str.get(i).compareTo(str.get(j)) > 0 && !mode) {
                        sorted = false;
                        temp = str.get(i);
                        str.set(i, str.get(j));
                        str.set(j, temp);
                    }
                }
            }
        }
        return str;
    }

}
