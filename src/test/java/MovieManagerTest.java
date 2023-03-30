import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void testAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film X1");
        manager.addMovie("Film X2");
        manager.addMovie("Film X3");

        String[] expected = { "Film X1", "Film X2", "Film X3" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testNoAddMovie() {
        MovieManager manager = new MovieManager();


        String[] expected = { };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testminAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film X1");


        String[] expected = { "Film X1" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNextAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film X1");
        manager.addMovie("Film X2");
        manager.addMovie("Film X3");

        String[] expected = { "Film X3", "Film X2", "Film X1" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film X1");


        String[] expected = { "Film X1" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoFindLast() {
        MovieManager manager = new MovieManager();


        String[] expected = { };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testEqualLimitFindLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film X1");
        manager.addMovie("Film X2");
        manager.addMovie("Film X3");
        manager.addMovie("Film X4");
        manager.addMovie("Film X5");

        String[] expected = { "Film X5", "Film X4","Film X3", "Film X2", "Film X1" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoEqualLimitFindLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film X1");
        manager.addMovie("Film X2");
        manager.addMovie("Film X3");
        manager.addMovie("Film X4");
        manager.addMovie("Film X5");
        manager.addMovie("Film X6");

        String[] expected = { "Film X6", "Film X5","Film X4", "Film X3", "Film X2" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testEqualLimit() {
        MovieManager manager = new MovieManager(2);

        manager.addMovie("Film X1");
        manager.addMovie("Film X2");
        manager.addMovie("Film X3");

        String[] expected = { "Film X3", "Film X2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}