package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User martina = new Millenials("Martina");
        User jakub = new YGeneration("Jakub");
        User antoni = new ZGeneration("Antoni");

        //When
        String martinaSharePost = martina.sharePost();
        System.out.println("Martina share post on " + martinaSharePost);
        String jakubSharePost = jakub.sharePost();
        System.out.println("Jakub share post on " + jakubSharePost);
        String antoniSharePost = antoni.sharePost();
        System.out.println("Antoni share post on " + antoniSharePost);

        //Then
        Assert.assertEquals("Facebook", martinaSharePost);
        Assert.assertEquals("Twitter", jakubSharePost);
        Assert.assertEquals("Snapchat", antoniSharePost);
    }

    @Test
    public void IndividualSharingStrategy(){
        //Given
        User martina = new Millenials("Martina");

        //When
        String martinaSharePost = martina.sharePost();
        System.out.println("Martyna share post on " + martinaSharePost);
        martina.setSocialPublisher(new SnapchatPublisher());
        martinaSharePost = martina.sharePost();
        System.out.println("Martyna now share post on " + martinaSharePost);

        //Then
        Assert.assertEquals("Snapchat", martinaSharePost);
    }
}
