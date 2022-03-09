import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("lorem2.txt");
        PrintStream ps = new PrintStream("lorem2.txt");

        ps.println("asdadfghhh");
        ps.println();
        ps.println("asdfg");

        fw.write("adasdasdasdasdfsdfs");
        fw.write(System.lineSeparator());
        fw.write("asdfsdasd");
        fw.close();
        ps.close();
    }
}
