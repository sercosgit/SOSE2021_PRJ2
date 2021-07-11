package de.sose2021.sose2021.entity;

import java.util.List;

public class Question {
    private String questiontext;
    private List<String> answer;

    public Question(String questiontext, List<String> answer) {
        this.questiontext = questiontext;
        this.answer = answer;
    }

    public String getQuestiontext() {
        return questiontext;
    }

    public void setQuestiontext(String questiontext) {
        this.questiontext = questiontext;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }
}
