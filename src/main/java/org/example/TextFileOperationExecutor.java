package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * INVOKER class
 * knows how to execute a given command but doesn’t know how the command has been implemented.
 * It only knows the command’s interface.
 */
public class TextFileOperationExecutor {

    // objeleri depolamak için bunun gibi arraylistler de kullanılabiliyor
    private final List<TextFileOperation> textFileOperationsList
            = new ArrayList<>();

    public String executeOperation(TextFileOperation myTextFileOperation) {
        textFileOperationsList.add(myTextFileOperation);
        return myTextFileOperation.execute();
    }
}