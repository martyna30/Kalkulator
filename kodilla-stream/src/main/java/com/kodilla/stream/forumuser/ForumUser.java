package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char useSex;
    private final LocalDate dateOfbirth;
    private final int quantityReleasedPosts;


    public ForumUser(final int userID, final String userName, final char useSex, final LocalDate dateOfbirth, final int quantityReleasedPosts) {
        this.userID = userID;
        this.userName = userName;
        this.useSex = useSex;
        this.dateOfbirth = dateOfbirth;
        this.quantityReleasedPosts = quantityReleasedPosts;
    }

    public char getUseSex() {
        return useSex;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public int getQuantityReleasedPosts() {
        return quantityReleasedPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", useSex=" + useSex +
                ", dateOfbirth=" + dateOfbirth +
                ", quantityReleasedPosts=" + quantityReleasedPosts +
                '}';
    }
}
