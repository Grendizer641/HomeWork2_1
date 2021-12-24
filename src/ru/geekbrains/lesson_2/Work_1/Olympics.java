package ru.geekbrains.lesson_2.Work_1;

import ru.geekbrains.lesson_2.Work_1.Creature.Cat;
import ru.geekbrains.lesson_2.Work_1.Creature.Creature;
import ru.geekbrains.lesson_2.Work_1.Creature.Human;
import ru.geekbrains.lesson_2.Work_1.Creature.Robot;
import ru.geekbrains.lesson_2.Work_1.Obstacle.Obstacle;
import ru.geekbrains.lesson_2.Work_1.Obstacle.Track;
import ru.geekbrains.lesson_2.Work_1.Obstacle.Wall;

public class Olympics{
    public static void main(String[] args) {

        Creature[] creatures = {
            new Human(),
            new Robot(),
            new Cat()
        };

        Obstacle[]  obstacles = {
            new Track(),
            new Wall()
        };

        gamesBegin(creatures, obstacles);

    }

    private static void gamesBegin(Creature[] creatures, Obstacle[] obstacles) {
        for (Obstacle obstacle : obstacles) {
            for (Creature creature : creatures){
                obstacle.passObstacle(creature);
            }

        }
    }

}
