import java.io.*;

public class NoteSaver {
    public static void main(String[] args) {
        System.out.println("NoteSaver - enter lines. Submit an empty line to finish and save.");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt", true))) {

            String line;
            while (true) {
                System.out.print("> ");
                line = br.readLine();
                if (line == null || line.trim().isEmpty()) break;
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Notes saved to notes.txt (appended).");
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
