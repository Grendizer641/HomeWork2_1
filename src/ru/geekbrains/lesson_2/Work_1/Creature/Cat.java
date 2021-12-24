package ru.geekbrains.lesson_2.Work_1.Creature;

import ru.geekbrains.lesson_2.Work_1.Creature.Creature;

public class Cat implements Creature {
    private final int jumpHeight;
    private final int runLength;

    public Cat() {
        this.runLength = 200;
        this.jumpHeight = 3;
    }

    @Override
    public void run() {
        System.out.println("Кот пробежал дистанцию");
    }

    @Override
    public void jump() {
        System.out.println("Кот перепрыгнул препятствие");

    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }
}
