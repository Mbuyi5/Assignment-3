package org.example;

public class Dog extends Animal{

    public Dog() {
        String sound = "Dog";
    }

    public static void main(String args[]){
        Animal obj = new Dog();
        obj.animalSound();
    }
}
