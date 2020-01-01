package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsCollector {
    double averageCountPostsPerUser;//gettery
    double averageCountCommentsPerUser;
    double averageCountCommentsPerPost;
    List<String> quantityUsers;
    double quantityPosts;
    double quantityComments;

    public void calculateAdvStatistics(Statistics statistics) {//if 0 else if?
        quantityUsers = statistics.usersNames();
        quantityPosts = statistics.postsCount();
        quantityComments = statistics.commentsCount();
        if (quantityUsers.isEmpty()|| quantityPosts == 0) {
            System.out.println("Quantity of posts total zero");
            quantityUsers = Collections.emptyList();
        } else {
            averageCountPostsPerUser = quantityPosts/quantityUsers.size();
        }
        if (quantityComments == 0) {
            System.out.println("Quantity of comments total zero");
        } else {
            averageCountCommentsPerUser = quantityComments / quantityUsers.size();
            averageCountCommentsPerPost = quantityComments/ quantityPosts;
        }
    }

}



