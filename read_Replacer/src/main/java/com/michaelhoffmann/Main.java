package com.michaelhoffmann;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        List<File> filesInFolder = Files.walk(Paths.get("C:\\Spar-Projekte\\JavaBootcamp001\\read_Replacer\\targetFiles"))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());

        System.out.println(filesInFolder + "\n");
        for(int i = 0; i < filesInFolder.size(); i++   ) {
            System.out.println(filesInFolder.get(i) + "\n");
            Path path = Paths.get("" + filesInFolder.get(i));
            Charset charset = StandardCharsets.UTF_8;

            try {
                String content = new String(Files.readAllBytes(path), charset);
                content = content.replaceAll("bar", "foo");
                content = content.replaceAll("rip", "ra");

                Files.write(path, content.getBytes(charset));
            } catch (IOException exeption001) {
                System.out.println("there went sth wrong: " + exeption001);
            }

        }
        }






    }

