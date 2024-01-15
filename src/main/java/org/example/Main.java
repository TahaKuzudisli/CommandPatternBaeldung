package org.example;

/**
 * CLIENT
 */
public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        System.out.println(textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt"))));
        System.out.println(textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt"))));

    }
}

/**
 * Command tasarım deseni, bir nesnenin bir isteği taşıyan ve bu isteği çağıran bir nesne arasındaki ilişkiyi tanımlayan
 * bir davranışsal desenidir. Bu desen, istekleri bir nesneden ayırarak nesneler arasındaki bağlantıları zayıflatan ve
 * genişletilmiş bir komut kümesi oluşturan bir arabirim sağlar.
 *
 * Anahtar Kelimeler:
 *
 * Command (Komut): Bir işlemi temsil eden bir interface'dir. Bu interface, execute() adında bir method içerir.
 * ConcreteCommand (Somut Komut): Command interface'ini uygular ve bir receiver'ı belirler.
 * Invoker (Çağıran): Bir command'ın çağrılmasından sorumlu olan nesnedir.
 * Client (İstemci): Command nesnelerini ve Invoker'ı kullanır.
 * Receiver (Alıcı): Command'ın gerçek işlemini gerçekleştiren nesnedir.
 */

/**
 * Dependency Decoupling: Reducing the dependencies between clients, commands, and receivers, allowing them to vary independently.
 *
 * Passing Requests as Objects: Encapsulating a request as an object, which allows for parameterization of clients with different requests, queuing of requests, and logging of the requests.
 *
 * Undo Mechanism: Providing the ability to undo operations by implementing an undo() method in command objects.
 * Bu örnekte yazılmadı. PDF de var 26-28
 *
 * Asynchronous Operations: Supporting asynchronous or delayed execution of commands.
 */