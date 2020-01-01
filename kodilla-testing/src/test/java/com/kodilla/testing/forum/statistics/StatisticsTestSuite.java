package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCollector statisticsCollector;
        List<String> statisticsList = new ArrayList<>();
        for(int i = 0;i < 100 ;i++) {
            String name = "";
            statisticsList.add(name + i);

        }
        List<String> statisticsListEmpty = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(100);
        statisticsCollector = new StatisticsCollector();
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals("Average quantity posts for user amount to: ", 1, statisticsCollector.averageCountPostsPerUser, 0.000001);
        Assert.assertEquals("Average quantity comments for user amount to: ",2, statisticsCollector.averageCountCommentsPerUser, 0.000001);
        Assert.assertEquals("Average quantity comments for post amount to:", 2, statisticsCollector.averageCountCommentsPerPost, 0.000001);

        when(statisticsMock.usersNames()).thenReturn(statisticsListEmpty);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        statisticsCollector = new StatisticsCollector();
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals("Average quantity posts for user amount to: ", 0, statisticsCollector.averageCountPostsPerUser, 0.000001);
        Assert.assertEquals("Average quantity comments for user amount to: ",0, statisticsCollector.averageCountCommentsPerUser, 0.000001);
        Assert.assertEquals("Average quantity comments for post amount to:", 0, statisticsCollector.averageCountCommentsPerPost, 0.000001);

        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(1000);
        statisticsCollector = new StatisticsCollector();
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals("Average quantity posts for user amount to: ", 10, statisticsCollector.averageCountPostsPerUser, 0.000001);
        Assert.assertEquals("Average quantity comments for user amount to: ",0.1, statisticsCollector.averageCountCommentsPerUser, 0.000001);
        Assert.assertEquals("Average quantity comments for post amount to:", 0.01, statisticsCollector.averageCountCommentsPerPost, 0.000001);

    }
}


