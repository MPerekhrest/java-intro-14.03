package com.hillel.homework.lesson12;

public class MenuController {
    public static void main(String[] args) {
      int count = 0;
      Menu[] menus = new Menu[50];
        for (int i = 0; i < menus.length; i++) {
            menus[i] = new Menu();
            System.out.println(menus[i]);
            count ++;
        }
        System.out.println(count);

    }
}
