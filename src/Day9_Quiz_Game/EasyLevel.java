package Day9_Quiz_Game;

class EasyLevel extends Level {
    public EasyLevel() {
        super("Easy");
    }

    @Override
    protected void loadQuestions() {
        questions.add(new Question
                ("What is 2 + 2?", new String[]
                        {"3", "4", "5", "6"}, 2));
        questions.add(new Question
                ("Which is the capital of India?", new String[]
                        {"Mumbai", "Delhi", "Chennai", "Kolkata"}, 2));
        questions.add(new Question
                ("Which keyword is used to inherit in Java?", new String[]
                        {"super", "extends", "implements", "inherit"}, 2));
    }
}

