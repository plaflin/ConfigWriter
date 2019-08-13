package com.patricklaflin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConfigWriter {
    String newline = System.getProperty("line.separator");

    public ConfigWriter() {
        try {
            File file = new File("program.properties");
            FileOutputStream fileStream = new FileOutputStream(file);
            write(fileStream, "username=max");
            write(fileStream, "score=12550");
            write(fileStream, "level=5");
            fileStream.close();
        } catch (IOException e) {
            System.out.println("Could not write file.");
        }
    }

    void write(FileOutputStream stream, String output) throws IOException {
        output = output + newline;
        byte[] data = output.getBytes();
        stream.write(data, 0, data.length);
    }

    public static void main(String[] args) {
        ConfigWriter cw = new ConfigWriter();
    }
}
