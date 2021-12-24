package ru.geekbrains.lesson_2.Work_1.Obstacle;

import ru.geekbrains.lesson_2.Work_1.Creature.Creature;

public interface Obstacle {
    boolean passObstacle(Creature creature);

    int LENGTH = 300;
    int HEIGHT = 3;

}
