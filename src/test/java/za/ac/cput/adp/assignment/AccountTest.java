/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author Julian
 */
public class AccountTest {
    

    private Account account1;
    private Account account2;
    private Account account3;
    
    public AccountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    @Timeout(5)
    public void setUp() {
        account1 = new Account();
        account2 = new Account();
        account3 = account1;
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    void testIdentity () {
        assertSame(account1, account3);
    }
   
    @Test
    void testEquality () {
        assertEquals(account1, account3);
    }
    
    @Test
    void testFail () {
        fail(" This test failed");
        assertEquals(account1, account3);
    }
    
    @Test
    @Disabled
    void testDisable () {
        assertEquals(account1, account3);
    }
    
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testTimeout () {
        assertEquals(account1, account3);
    }

}

