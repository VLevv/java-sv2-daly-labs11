package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testNormalUser(){
        NormalUser user = new NormalUser("email","password");
        assertEquals("email",user.getUserEmail());
        assertEquals("password",user.getPassword());
    }

    @Test
    void testAdminUser(){
        AdminUser user = new AdminUser("email","password");
        assertEquals("email",user.getUserEmail());
        assertEquals("********",user.getPassword());
    }
}