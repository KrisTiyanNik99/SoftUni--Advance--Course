package Inheritance.stackofstrings;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String s) {
        data.add(s);
    }

    public String pop() {
        return data.removeLast();
    }

    public String peek() {
        return data.getLast();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
