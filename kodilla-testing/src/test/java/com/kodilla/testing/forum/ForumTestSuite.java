package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseUnsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("TheForumUser","John Smith");
        //When"
        String result = simpleUser.getUsername();
        System.out.println("Testing" + result);
        //Then
        Assert.assertEquals("TheForumUser",result);
    }
    @Test
    public void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("TheForumUser", "John Smith");
        //When
        String result2 = simpleUser.getRealName();
        System.out.println("Testing" + result2);
        //Then
        Assert.assertEquals("John Smith",result2);
    }
}




