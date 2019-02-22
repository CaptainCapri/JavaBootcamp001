package com.michaelhoffmann;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        String line = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader("targetFiles\\HERVIS\\Products.csv"));
            FileWriter fw = new FileWriter("targetFiles\\HERVIS\\stockupdate_Impex.txt");

            ArrayList<String> lines = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
                String[] product = lines.toArray(new String[0]);


                fw.write("INSERT_UPDATE StockLevel;productCode[unique=true];warehouse(code)[unique=true];available;reserved\n");
            for (String s : product) {
                String productCode = s.split(",")[0];
                System.out.println("Country [code= " + productCode + " ]");
                fw.write(";" + productCode + ";default;100000;0;\n");
            }

            fw.close();




        } catch (IOException e) {
            e.printStackTrace();
        }

        }

        }






