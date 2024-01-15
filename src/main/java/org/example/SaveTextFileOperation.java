package org.example;

/**
 * ConcreteCommand object
 * performs the concrete (somut) actions (yani interface değil)
 */
public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
