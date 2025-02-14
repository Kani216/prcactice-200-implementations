import java.io.*;
public class File_op {
    public static void main (String[]args) throws IOException {
        FileWriter writer= new FileWriter("output.txt");
        FileReader reader= new FileReader("output.txt");
        writer.write("HElloWord");

        writer.close();
        System.out.print(reader.read());
        System.out.print("Sucess fully edited");

    }

}
