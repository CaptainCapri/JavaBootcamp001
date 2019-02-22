package com.michaelhoffmann;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class userImpexCreator {

    public static void main(String[] args) {

        String line = "";
        FileWriter filewrite = null;


        try {

            BufferedReader bufread = new BufferedReader(new FileReader("targetFiles\\FOS-AT\\userData.csv"));
            filewrite = new FileWriter("targetFiles\\FOS-AT\\userData_Impex.txt");

            ArrayList<String> lines = new ArrayList<String>();
            while ((line = bufread.readLine()) != null) {
                lines.add(line);
            }
            String[] users = lines.toArray(new String[0]);

            filewrite.write("INSERT_UPDATE Customer;originalUid[unique=true];uid[unique=true];title(code);name;description;sessionLanguage(isocode);sessionCurrency(isocode);groups(uid);password[default=haus1234];&userId;defaultPaymentAddress(&addId);defaultShipmentAddress(&addId);phoneNumber;");

            for (String s : users) {
                final String[] split = s.split(",");
                String titleCode = split[0];
                String salutation = split[1];
                String firstName = split[2];
                String lastName = split[3];
                String streetName = split[4];
                String streetNumber = split[5];
                String stiegeNumber = split[6];
                String doorNumber = split[7];
                String city = split[8];
                String countryIso = split[9];
                String zipCode = split[10];
                String countryCode = split[11];
                String email = split[12];
                String password = split[13];
                String phoneNumber = split[14];
                //String birthday = split[15];

                //System.out.println("INSERT_UPDATE\nCustomer;originalUid[unique=true];uid[unique=true];title(code);name;description;sessionLanguage(isocode);sessionCurrency(isocode);groups(uid);password[default=haus1234];&userId;defaultPaymentAddress(&addId);defaultShipmentAddress(&addId);phoneNumber;\n;" + email + ";" + email + ";;" + firstName + ";JMeter-Testuser;en;EUR;customergroup;;" + email + "\nINSERT_UPDATE\nAddress;&addId;owner(&userId)[unique=true];streetname[unique=true];streetnumber[unique=true];postalcode[unique=true];duplicate[unique=true];town;country(isocode);billingAddress;contactAddress;shippingAddress;unloadingAddress;salutation;firstname;lastname;email;gender(code);middlename;phone1;title(code);url;company;fax;department\n" + ";testUserID-0001;" + email + ";" + streetName + ";" + streetNumber + ";" + zipCode + ";false;" + city + ";" + countryCode + ";true;true;true;true;Mr.;" + firstName + ";" + lastName + ";" + email + ";MALE;;" + phoneNumber + ";;Hybris;;");
                filewrite.write(";" + email + ";" + email + ";" + salutation + ";" + firstName + ";" JMeter_Testuser;en;EUR;customergroup;;jmFOSAT02_AAC@perftest.at;);

                //System.out.println("Country [code= " + productCode + " ]");
                //filewrite.write(";" + productCode + ";default;100000;0;\n");
            }

            filewrite.write("INSERT_UPDATE Address;&addId;owner(&userId)[unique=true];streetname[unique=true];streetnumber[unique=true];postalcode[unique=true];duplicate[unique=true];town;country(isocode);billingAddress;contactAddress;shippingAddress;unloadingAddress;firstname;lastname;email;gender(code);middlename;phone1;title(code);url;company;fax;department;");

            for (String s : users) {
                final String[] split = s.split(",");
                String titleCode = split[0];
                String salutation = split[1];
                String firstName = split[2];
                String lastName = split[3];
                String streetName = split[4];
                String streetNumber = split[5];
                String stiegeNumber = split[6];
                String doorNumber = split[7];
                String city = split[8];
                String countryIso = split[9];
                String zipCode = split[10];
                String countryCode = split[11];
                String email = split[12];
                String password = split[13];
                String phoneNumber = split[14];
                //String birthday = split[15];

                filewrite.write(;testUserID_0001;jmFOSAT02_AAC@perftest.at;Blindengasse;13;1080;false;Wien;AT;true;true;true;true;Vorname_AAC;Nachname_AAC;jmFOSAT02_AAC@perftest.at;MALE;;066412345678;mr;Hybris;);


            }

            filewrite.close();




        } catch (IOException  | ArrayIndexOutOfBoundsException e ) {
            e.printStackTrace();

        }finally {try{filewrite.close();}catch(IOException e ){}
                }

    }

}






