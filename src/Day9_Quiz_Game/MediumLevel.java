package Day9_Quiz_Game;

class MediumLevel extends Level {
    public MediumLevel() {
        super("Medium");
    }

    @Override
    protected void loadQuestions() {
        questions.add(new Question
                ("Who developed Java?", new String[]
                        {"James Gosling", "Bill Gates", "Dennis Ritchie", "Guido van Rossum"}, 1));
        questions.add(new Question
                ("Which data structure uses FIFO?", new String[]
                        {"Stack", "Queue", "Array", "Tree"}, 2));
        questions.add(new Question
                ("What is the default value of boolean in Java?", new String[]
                        {"true", "false", "null", "0"}, 2));
    }
}
