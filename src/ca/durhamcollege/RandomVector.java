package ca.durhamcollege;
import java.util.Random;

public class RandomVector
{
    public static Vector2D createVector2D(Vector2D start, Vector2D end)
    {
        Random rand = new Random(); // random class instance

        // generate random x value
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());

        float randomX = (rand.nextFloat() * maxX) + minX;

        // generate random y value
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());

        float randomY = (rand.nextFloat() * maxY) + minY;
    }
}
