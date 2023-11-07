package com.hillel.homework.lesson12;

class Human {

    public String name;
    public Human father;
    public Human mother;
    public Human(String name){
        this.name = name;
    }

    public Human(String name, Human father, Human mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", father=" + father +
                ", mother=" + mother +
                '}';
    }

}

