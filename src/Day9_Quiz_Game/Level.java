package Day9_Quiz_Game;

import java.util.ArrayList;
import java.util.List;

abstract class Level {
    protected List<Question> questions = new ArrayList<>();
    protected String levelName;

    public Level(String levelName) {
        this.levelName = levelName;
        loadQuestions();
    }

    protected abstract void loadQuestions();

    public String getLevelName() {
        return levelName;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
