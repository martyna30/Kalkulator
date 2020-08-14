package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("My text", text -> System.out.println(text.toUpperCase()));
        poemBeautifier.beautify("My song", text -> System.out.println(text.join(text, "ABC", "ABC")));
        poemBeautifier.beautify("My book", text -> System.out.println(new StringBuilder(text).append(" is the best", 0, 12)));
        poemBeautifier.beautify("My poem", text -> System.out.println(text.concat(" has a academic title")));
        poemBeautifier.beautify("  My boy", text -> System.out.println(text.trim()));
        poemBeautifier.beautify("My mother", text -> System.out.println(new StringBuilder(text).reverse()));
        poemBeautifier.beautify("My day", text -> System.out.println(new StringBuilder(text).replace(3, 3, "beautifull ")));

        Forum forum = new Forum();

        Map<Integer, ForumUser> theUserMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUseSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfbirth().isBefore(LocalDate.of(2000, 1, 5)))
                .filter(forumUser -> forumUser.getQuantityReleasedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println(theUserMap);
        theUserMap.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}














