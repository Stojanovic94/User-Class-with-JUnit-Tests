package user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class UserTest {

    @Test
    public void testFullName() {
        User user = new User("John", "Doe", 25);
        assertEquals("John Doe", user.getFullName());
    }

    @Test
    public void testIsAdultTrue() {
        User user = new User("Jane", "Doe", 20);
        assertTrue(user.isAdult());
    }

    @Test
    public void testIsAdultFalse() {
        User user = new User("Tom", "Smith", 16);
        assertFalse(user.isAdult());
    }

    @Test
    public void testFavoriteActivitiesNotNull() {
        User user = new User("Alice", "Johnson", 30);
        user.addFavoriteActivity("Reading");
        assertNotNull(user.getFavoriteActivities());
    }

    @Test
    public void testFavoriteActivities() {
        User user = new User("Bob", "Brown", 35);
        user.addFavoriteActivity("Swimming");
        user.addFavoriteActivity("Cycling");

        // Pretpostavljamo da su aktivnosti dodane u istom redosledu
        assertArrayEquals(new String[]{"Swimming", "Cycling"}, user.getFavoriteActivities().toArray());
    }

    @Test
    public void testUninitializedUser() {
        User user = null;
        assertNull(user);
    }

    // Dodatni testovi
    @Test
    public void testUserAge() {
        User user = new User("Charles", "Green", 40);
        assertEquals(40, user.getAge());
    }

    @Test
    public void testAddActivity() {
        User user = new User("Eva", "White", 28);
        user.addFavoriteActivity("Jogging");
        assertTrue(user.getFavoriteActivities().contains("Jogging"));
    }

    @Test
    public void testGetFirstName() {
        User user = new User("Lily", "Black", 22);
        assertEquals("Lily", user.getFirstName());
    }

    @Test
    public void testGetLastName() {
        User user = new User("James", "Miller", 45);
        assertEquals("Miller", user.getLastName());
    }
}
