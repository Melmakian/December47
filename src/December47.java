import java.io.*;

public class December47 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nameOne = br.readLine();
        String nameTwo = br.readLine();

        FileReader reader = new FileReader(nameOne);
        FileWriter writer = new FileWriter(nameTwo);

        int count = 0;
        while (reader.ready()) {
            int tmp = reader.read();
            if (count % 2 != 0) {
                writer.write(tmp);
            }
            count++;
        }
        reader.close();
        writer.close();
        br.close();
    }
}
