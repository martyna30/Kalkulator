package com.kodilla.patterns2.observer.forum;

public class ForumUser implements ObserverI {
    private final String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + ": New messages in topic " + forumTopic.getName()+ "\n" +
              "(total: " + forumTopic.getMessages().size() + "messeges)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
