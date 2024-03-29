package org.example;

/**
 * RECEIVER
 * performs a set of cohesive actions
 */
public class TextFile {

    private String name;

    // constructor
    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }

    // additional text file methods (editing, writing, copying, pasting)
}
