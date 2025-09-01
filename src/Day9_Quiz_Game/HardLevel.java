package Day9_Quiz_Game;

class HardLevel extends Level {
    public HardLevel() {
        super("Hard");
    }

    @Override
    protected void loadQuestions() {
        questions.add(new Question
                ("Which design pattern is used in Java Singleton?", new String[]
                        {"Factory", "Builder", "Creational", "Structural"}, 3));
        questions.add(new Question
                ("Time complexity of binary search?", new String[]
                        {"O(n)", "O(log n)", "O(n^2)", "O(1)"}, 2));
        questions.add(new Question
                ("Which concept allows multiple methods with the same name?", new String[]
                        {"Inheritance", "Encapsulation", "Polymorphism", "Abstraction"}, 3));
    }
}