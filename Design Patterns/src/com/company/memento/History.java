package com.company.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState undo() {
        EditorState editorState = states.get(states.size() - 1);
        states.remove(states.size() -1);
        return editorState;
    }

}
