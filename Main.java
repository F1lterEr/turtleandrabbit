package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println("Старт!");

        AnimalThread rabbit = new AnimalThread("Заяц", 5);
        rabbit.start();

        AnimalThread turtle = new AnimalThread("Черепаха", 5);
        turtle.start();
    }
}

class AnimalThread extends Thread{
    String animalName;

    AnimalThread(String name, int priority){
        animalName = name;
        this.setPriority(priority);
    }

    public void run(){
        for(int i = 0; i <= 1000; i += 100){
            if(animalName.equals("Заяц") && i == 400){
                this.setPriority(1);
            }
            System.out.println(animalName + " " + i);
        }
    }
}
