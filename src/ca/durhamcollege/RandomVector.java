package ca.durhamcollege;


import java.util.Random;

public class RandomVector
{
    private Random m_rand;
    // Singleton
    // Step 1.private static instance
    private static RandomVector m_instance = null;

    // Step 2. make the default constructor private
    private RandomVector()
    {
         m_rand = new Random(); // instance of random class
    }

    // Step3. make a public instance method that acts as a door to the class
    public static RandomVector Instance()
    {
        if(m_instance == null)
        {
            m_instance = new RandomVector();
        }
        return m_instance;
    }

    public final Vector2D createVector2D(final Vector2D start, final Vector2D end)
    {
        Random rand = new Random(); // random class instance

        // generate random x value
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());

        float randomX = (rand.nextFloat() * (maxX - minX)) + minX;

        // generate random y value
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());

        float randomY = (rand.nextFloat() * (maxY -minY)) + minY;

        return new Vector2D(randomX, randomY);
    }
}
