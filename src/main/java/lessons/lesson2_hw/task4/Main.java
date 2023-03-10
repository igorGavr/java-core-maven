package lessons.lesson2_hw.task4;

import lessons.lesson2_hw.task4.models.Comment;
import lessons.lesson2_hw.task4.models.Post;

import java.util.ArrayList;


// Запакувати всі пости в список,всі коментарі в свій окремий список
// Проітерувати списки, і додати коментар з відповідним ід до відповідного поста
// В постах додатково потрібно додати поле яке характеризує список комментарів.

public class Main {
    public static void main(String[] args) {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(12, 1, "post1", "sdfa"));
        posts.add(new Post(12, 2, "post2", "sdfa"));
        posts.add(new Post(12, 3, "post3", "sdfa"));

        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1, "comment1", "adsfa", "sadfa"));
        comments.add(new Comment(2, 2, "comment2", "adsfa", "sadfa"));
        comments.add(new Comment(2, 3, "comment3", "adsfa", "sadfa"));
        comments.add(new Comment(3, 4, "comment4", "adsfa", "sadfa"));

        for (Post post : posts) {
            for (Comment comment : comments) {
                if (post.getId() == comment.getPostId()) {
                    post.getComments().add(comment);
                }
            }
        }
        for (Post post : posts) {
            System.out.println(post);
        };
    }
}
