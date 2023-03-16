package lessons.lesson5.nio;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

//        Path userFolder = Paths.get(System.getProperty("user.home"));
//        try {
//            Stream<Path> list = Files.list(userFolder);
//            list.forEach(System.out::println);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        Path txt = Paths.get(System.getProperty("user.home") + File.separator + "test.txt");

        List<String> lines = Files.readAllLines(txt);
        lines.forEach(System.out::println);

//        Files.write(txt, "thast all folks".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
    }
}
