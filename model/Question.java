package model;

public class Question 
{
    private String text; // question text
    private String answer;
    
    public Question(String text, String answer){
        this.text = text;
        this.answer = answer;
    }

    public boolean checkAnswer(String response)
    {
        return response.equalsIgnoreCase(answer);
    }

    public void display()
    {
        System.out.println(text);
    }

}
