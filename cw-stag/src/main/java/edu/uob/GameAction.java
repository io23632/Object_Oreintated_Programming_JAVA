package edu.uob;

import java.util.HashSet;

public class GameAction {

    HashSet<String> produced = new HashSet<>();
    HashSet<String> subjects = new HashSet<>();
    HashSet<String> consumed = new HashSet<>();
    String narration;

    public GameAction(HashSet<String> produced, HashSet<String> subjects, HashSet<String> consumed, String narration) {
        this.produced = produced;
        this.subjects = subjects;
        this.consumed = consumed;
        this.narration = narration;
    }
}
