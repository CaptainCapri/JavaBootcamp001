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
        List<File> filesInFolder = Files.walk(Paths.get("C:\\Spar-Projekte\\JavaBootcamp001\\Document_ReadReplacer\\targetFiles\\TRIF Experiment_1.-3. Versuch"))
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

                content = content.replaceAll("#7.25","7d WT 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#7.26","7d WT 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#7.27","7d WT 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#7.28","7d WT 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#7.29","7d WT 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#7.30","7d WT 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#7.31","7d JAX 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#7.32","7d JAX 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#7.33","7d JAX 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#7.34","7d JAX 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#7.35","7d JAX 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#7.36","7d JAX 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#7.37","7d WT 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#7.38","7d WT 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#7.39","7d WT 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#7.40","7d WT 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#7.41","7d WT 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#7.42","7d WT 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#7.43","7d JAX 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#7.44","7d JAX 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#7.45","7d JAX 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#7.46","7d JAX 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#7.47","7d JAX 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#7.48","7d JAX 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#25","7d WT 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#26","7d WT 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#27","7d WT 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#28","7d WT 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#29","7d WT 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#30","7d WT 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#31","7d JAX 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#32","7d JAX 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#33","7d JAX 1µM Pepinh-Trif + 3µg/ml polyIC");
                content = content.replaceAll("#34","7d JAX 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#35","7d JAX 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#36","7d JAX 1µM control peptide + 3µg/ml poly IC");
                content = content.replaceAll("#37","7d WT 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#38","7d WT 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#39","7d WT 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#40","7d WT 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#41","7d WT 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#42","7d WT 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#43","7d JAX 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#44","7d JAX 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#45","7d JAX 1µM Pepinh-Trif + 100ng/ml poly IC Lyovec");
                content = content.replaceAll("#46","7d JAX 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#47","7d JAX 1µM control peptide + 100ng/ml polyIC Lyovec");
                content = content.replaceAll("#48","7d JAX 1µM control peptide + 100ng/ml polyIC Lyovec");




                Files.write(path, content.getBytes(charset));
            } catch (IOException exeption001) {
                System.out.println("there went sth wrong: " + exeption001);
            }

        }
    }






}

