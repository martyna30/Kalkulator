package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
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
    }
}





