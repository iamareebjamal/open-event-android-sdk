package openevent.utils;

import openevent.Application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOUtils {

    public static InputStream getInputStream(String fileName) {
        return Application.class.getResourceAsStream("/" + fileName);
    }

    public static String getFile(String fileName) {
        InputStream is = getInputStream(fileName);

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String read;

        try {
            while ((read = br.readLine()) != null) {
                sb.append(read).append("\n");
            }

            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return sb.toString();
    }
}
