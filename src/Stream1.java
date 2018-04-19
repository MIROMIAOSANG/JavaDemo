import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            String con = new String(Files.readAllBytes(Paths.get("test.txt")), StandardCharsets.UTF_8);
            List<String> words = Arrays.asList(con.split("\\PL+"));
            //Stream.of
            Stream<String> stream = Stream.of(con.split("\\PL+"));

            //Collection.stream方法创建一个流，再转换成其他流，最后得到结果
            long count = words.stream()
                    .filter(w -> w.length() > 12)
                    .count();
            System.out.println(count);

            //获得用户工作目录
            System.out.println(System.getProperty("user.dir"));


        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream("test.txt"), "UTF-8"), true
        );

        String name="DK";
        int aa=1;
        writer.print(name);
        writer.println(aa);

    }
}
