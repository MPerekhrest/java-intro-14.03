package com.hillel.classwork.lesson12;

class Cat {

    private final int weight;
    private final int strength;
    private final int age;

    public Cat(int weight, int strength, int age) {
        this.weight = weight;
        this.strength = strength;
        this.age = age;

    }

    public boolean fight(Cat cat) {

//        if((this.age > cat.age) && (this.strength > cat.strength) && (this.weight > cat.weight)) {
//
//            System.out.println("cat is win");
//            return true;
//        } else {
//            System.out.println("cat is lose");
//        }
//        return false;
//    }
        return this.age > cat.age && this.strength > cat.strength && this.weight > cat.weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", strength=" + strength +
                ", age=" + age +
                '}';
    }

}
