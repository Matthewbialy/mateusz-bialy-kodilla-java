package com.kodilla.patterns.singleton.social;

import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import com.kodilla.patterns.strategy.social.portals.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User alex = new Millenials("Alex Green");
        User matthew = new YGeneration("Matthew White");
        User beatrice = new ZGeneration("Beatrice Dark");

        //When
        String alexShare = alex.sharePost();
        System.out.println("Alexs post:" + alexShare);
        String matthewShare = matthew.sharePost();
        System.out.println("Matthews post:" + matthewShare);
        String beatriceShare = beatrice.sharePost();
        System.out.println("Beatrices post:" + beatriceShare);

        //Then
        Assert.assertEquals("Facebook", alexShare);
        Assert.assertEquals("Twitter", matthewShare);
        Assert.assertEquals("Snapchat", beatriceShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User alex = new Millenials("Alex Green");

        //When
        String alexShare = alex.sharePost();
        System.out.println("Alex post:" + alexShare);
        alex.setSocialPublisher(new SnapchatPublisher());
        alexShare = alex.sharePost();
        System.out.println("Alex now post:" + alexShare);

        //Then
        Assert.assertEquals("Snapchat", alexShare);

    }
}
