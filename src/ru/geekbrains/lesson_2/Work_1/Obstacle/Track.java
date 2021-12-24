package ru.geekbrains.lesson_2.Work_1.Obstacle;

import ru.geekbrains.lesson_2.Work_1.Creature.Creature;
import ru.geekbrains.lesson_2.Work_1.Obstacle.Obstacle;

public class Track implements Obstacle {


    public boolean passObstacle(Creature creature){
        if(creature.getRunLength()>=LENGTH)
        creature.run();
        return true;
    }
}
