package org.example;

/**
 * ConcreteCommand object
 * performs the concrete (somut) actions (yani interface değil)
 */
public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    // constructors
    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}