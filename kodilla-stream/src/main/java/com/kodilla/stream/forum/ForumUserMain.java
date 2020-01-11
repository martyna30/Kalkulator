package com.kodilla.stream.forum;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ForumUserMain {

        public static Set<String> getLocationsOfFriendsOfFriends(List<ForumUser> forumUserList) {
            return forumUserList.stream() //ok
                    .flatMap(user -> user.getFriends().stream())//ok dla każdego uzytkownika pobieramy liste przyjació i nowy strumien czyli powstaje lista przyjaciół przyjaciół
                    // .filter(user -> user != this)//?
                    .map(ForumUser::getLocation)
                    .collect(Collectors.toSet());//lista lokalizacji przyjacił przyjaciół

        }
    public static void main(String[] args) {

            List<ForumUser>lisUser = new ArrayList<>();


        ForumUser user1 = new ForumUser("alan01", "Alan Kosovsky", "Washington");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "Miami");
        ForumUser user3 = new ForumUser("eRiK", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "Washington");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Robert Macdonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);

        //user2.addFriend(user5);

        //lisUser.add(user2);
        //lisUser.add(user1);

        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);

        user7.addFriend(user1);
        user7.addFriend(user3);

        user10.addFriend(user1);

        user2.addFriend(user3);

        user9.addFriend(user3);

        System.out.println(getLocationsOfFriendsOfFriends(lisUser));

        //System.out.println(user1.getLocationsOfFriendsOfFriends());



    }

}
