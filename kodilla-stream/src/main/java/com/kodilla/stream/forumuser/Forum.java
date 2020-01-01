package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theListForumUser = new ArrayList<>();

    public Forum() {
        theListForumUser.add(0,new ForumUser(1,"Jan",'M', LocalDate.of(2000,1,4),1));
        theListForumUser.add(1,new ForumUser(2,"Jolanta",'F', LocalDate.of(1988,6,22),2));
        theListForumUser.add(2,new ForumUser(3,"Karolina",'F', LocalDate.of(1982,5,6),14));
        theListForumUser.add(3,new ForumUser(4,"Tomasz",'M', LocalDate.of(1991,5,12),0));
        theListForumUser.add(4,new ForumUser(5,"Anna",'F', LocalDate.of(1992,4,2),1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theListForumUser);
    }
}
