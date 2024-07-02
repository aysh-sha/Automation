package stringpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsernameTest {
    @Test
    @Order(1)
    public void testFetchUserNameValidEmail() {
        String email = "admin@xyz.com";
        String expectedUsername = "admin";
        String actualUsername = UsernameTest.fetchUsername(email);
        System.out.println(actualUsername);
        assertEquals(expectedUsername, actualUsername, "Username should be extracted correctly.");
    }
    @Test
    @Order(2)
    public void testFetchUserNameMissingAtSymbol() {
        String email = "admin.xyz.com";
        String expectedUsername = "";
        String actualUsername = UsernameTest.fetchUserName(email);
        System.out.println(actualUsername);
        assertEquals(expectedUsername, actualUsername, "Missing '@' symbol should return empty string.");
    }
    @Test
    @Order(3)
    public void testFetchUserNameEmptyEmail() {
        String email = "";
        String expectedUsername = "";
        String actualUsername = UsernameTest.fetchUserName(email);
        System.out.println(actualUsername);
        assertEquals(expectedUsername, actualUsername, "Empty email should return empty string.");
    }
    @Test
    @Order(4)
    public void testFetchUserNameNullEmail() {
        String email = null;
        String expectedUsername = "";
        String actualUsername = UsernameTest.fetchUserName(email);
        System.out.println(actualUsername);
        assertEquals(expectedUsername, actualUsername, "Null email should return empty string.");
    }
}