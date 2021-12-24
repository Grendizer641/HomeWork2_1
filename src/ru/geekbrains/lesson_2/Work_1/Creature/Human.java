package ru.geekbrains.lesson_2.Work_1.Creature;

import ru.geekbrains.lesson_2.Work_1.Creature.Creature;

public class Human implements Creature {

    private final int jumpHeight;
    private final int runLength;

    public Human() {
        this.jumpHeight = 2;
        this.runLength = 300;
    }

    @Override
    public void run() {
        System.out.println("Человек пробежал дистанцию");

    }

    @Override
    public void jump() {
        System.out.println("Человек перепрыгнул препятствие");

    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public int getRunLength() {
        return runLength;
    }
}
