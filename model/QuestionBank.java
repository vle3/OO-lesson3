package model;

import java.util.ArrayList;

public class QuestionBank 
{
    public static final ArrayList<Question> database = new ArrayList<>();
    
    static{
        database.add(new Question(
            "Who is the inventor of Java language?", 
            "James Gosling"
        ));
        database.add(new Question(
            "In what chity is UCO located ? ", 
            "Edmond"
        ));
    }
}
