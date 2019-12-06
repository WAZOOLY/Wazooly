package net.androidbootcamp.wazooly2;

import android.os.AsyncTask;
import android.os.Build;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import androidx.annotation.RequiresApi;

public class connectToOpenALPR extends AsyncTask<Void, Void, Void> {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            String mCurrentPhotoPath = Scan_Vehicle_Activity.mCurrentPhotoPath;
            String secret_key = "sk_b4a8069129855db0191df9b2";

            // Read image file to byte array
            Path path = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                path = Paths.get(mCurrentPhotoPath);
            }

            byte[] data = new byte[0];
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                data = Files.readAllBytes(path);
            }

            // Encode file bytes to base64
            byte[] encoded = new byte[0];
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                encoded = Base64.getEncoder().encode(data);
            }

            //Setup the HTTPS connection to api.openalpr.com
            URL url = new URL("https://api.openalpr.com/v2/recognize_bytes?recognize_vehicle=1&country=us&secret_key=" + secret_key);
            URLConnection con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection) con;
            http.setRequestMethod("POST"); // PUT is another valid option
            http.setFixedLengthStreamingMode(encoded.length);
            http.setDoOutput(true);

            //Send our Base64 content over the stream
            try (OutputStream os = http.getOutputStream()) {
                os.write(encoded);
            }

            int status_code = http.getResponseCode();
            if (status_code == 200) {
                // Read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        http.getInputStream()));
                String json_content = "";
                String inputLine;
                while ((inputLine = in.readLine()) != null)
                    json_content += inputLine;
                in.close();

                System.out.println(json_content);
            } else {
                System.out.println("Got non-200 response: " + status_code);
            }
        } catch (MalformedURLException e) {
            System.out.println("Bad URL");
        } catch (IOException e) {
            System.out.println("Failed to open connection");
        }
        return null;
    }
}
