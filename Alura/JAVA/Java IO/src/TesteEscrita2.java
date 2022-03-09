import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {
        /**
         * OutputStream fos = new FileOutputStream("lorem2.txt");
         * Writer osw = new OutputStreamWriter(fos);
         * BufferedWriter bw = new BufferedWriter(osw);
         */
        FileWriter fw = new FileWriter("lorem2.txt");

        fw.write("adasdasdasdasdfsdfs");
        fw.write(System.lineSeparator());
        fw.write("asdfsdasd");
        fw.close();

    }
}
