package com.androidsx.quizzes.data;

import com.androidsx.quizzes.model.Quiz;

import java.util.Arrays;
import java.util.List;

public class QuizProvider {

    /** For now, sample list from http://guesstheemoji-movies-answers.com/level-1/ */
    public List<Quiz> readQuizzes() {
        return Arrays.asList(
                new Quiz("spider, boy walking"),
                new Quiz("spider, boy walking"),
                new Quiz("star, gun, bomb"),
                new Quiz("half moon, boy and girl in love, wolf"),
                new Quiz("drumstick, rib, game controller"),
                new Quiz("bride, boy, pow, pow"),
                new Quiz("cat, boot")
        );
    }
}
