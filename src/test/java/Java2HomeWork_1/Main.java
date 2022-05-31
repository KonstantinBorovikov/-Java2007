package Java2HomeWork_1;

import Obstacle.Course;
import Obstacle.Cross;
import Obstacle.Wall;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Rocket", new Human("Bob"), new Cat("Vaska"), new Robot("R2d2"));
        Course course = new Course(
                new Cross(80),
                new Wall(2),
                new Wall(1),
                new Cross(120));
        course.doIt(team);
        team.showResults();

    }
}
