package ru.geekbrains.lesson_2.Work_1.Creature;

import ru.geekbrains.lesson_2.Work_1.Creature.Creature;

public class Robot implements Creature {

    private final int jumpHeight;
    private final int runLength;

    public Robot() {
        this.runLength = 2000;
        this.jumpHeight = 10;
    }

    @Override
    public void run() {
        System.out.println("Робот пробежал дистанцию");
    }

    @Override
    public void jump() {
        System.out.println("Робот перепрыгнул препятствие");
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
