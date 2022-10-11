import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File Test = new File("txt");
        File fileTXT=new File(Test, "txt");

        String s = "";
        try {
            readSmallFile();
        }  catch (IOException exx) {
        }
        System.out.println(s);


    }

    public static void readSmallFile() throws IOException {
        Path path = Paths.get("txt");
        BufferedWriter valid=new BufferedWriter(new FileWriter("Test txt"));
        BufferedWriter no_valid=new BufferedWriter(new FileWriter("NoValid"));
        List<String> strings = Files.readAllLines(path);
        for (String s : strings) {
            try {
                Util.process(s);

                System.out.println("OK");

//                valid.write(s);
//                valid.append(s+"\n");
//                valid.close();

            } catch (ExceptionStart e) {

                System.out.println("false");
//                no_valid.write(s);
//                no_valid.append(s+"\n");
//                no_valid.close();
                System.out.println(e.getMessage());
            }
            try {
                Util.process1(s);
                System.out.println("OK");

//                valid.write(s);
//                valid.append(s+"\n");
//                valid.close();

            }catch (ExceptionLength e) {

                System.out.println("false");
                System.out.println(e.getMessage());
//                no_valid.write(s+"\n");
//                no_valid.append(s);
//                no_valid.close();

            }

//            try {
//                    Util.process1(s);
//                    System.out.println("OK");
//                    valid.write(s+"\n");
//                    valid.append(s);
//                    valid.close();
//                } catch ( ExceptionLength ex) {
//                    System.out.println("false");
//                    no_valid.write(s+"\n");
//                    no_valid.append(s);
//                    no_valid.close();
//                    System.out.println(ex.getMessage());
//                }



        }
    }
}



//    public static void whenBufferedWriter() throws IOException{
//        String str="Hello";
//        BufferedWriter writer=new BufferedWriter(new FileWriter("Test txt"));
//        writer.write(str);
//        writer.append(" c");
//        writer.close();
//    }