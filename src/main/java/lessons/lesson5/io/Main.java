package lessons.lesson5.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
//        Properties properties = System.getProperties();
//
//        for (Object s : properties.keySet()) {
//            System.out.println(s);
//        }

        String userFolderPath = System.getProperty("user.home") + File.separator + "test.txt";

        File file = new File(userFolderPath);
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//
//        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
//        String s = "hello okten";
//        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
//        fileOutputStream.write(bytes);
//
//        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytesRead = new byte[fileInputStream.available()];
        fileInputStream.read(bytesRead);
        String msg = new String(bytesRead);
        System.out.println(msg);


    }
}
