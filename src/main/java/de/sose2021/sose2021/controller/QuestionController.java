package de.sose2021.sose2021.controller;

import de.sose2021.sose2021.entity.Question;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuestionController {
@RequestMapping(
        method = RequestMethod.GET,
        path = "/question",
        produces = MediaType.APPLICATION_JSON_VALUE
)
    public Question getQuestion(){
        List answers = new ArrayList<String>();
        answers.add("Test1");
        answers.add("Test2");
        String questionText = "Welcher Test?";

        Question question = new Question(questionText, answers);
        return question;
    }
}
