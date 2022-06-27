package data.api.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiJson {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			String urlStr = "";
			URL url = new URL(urlStr);
			HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
			urlConn.setRequestMethod("GET");
			urlConn.setRequestProperty("Content-type", "application/json");
			System.out.println(urlConn.getResponseCode());
			
			br = new BufferedReader(new InputStreamReader(urlConn.getInputStream(), "UTF-8"));
			String rst = "";
			String line;
			
			while ((line=br.readLine()) != null) {
				rst += line + "\n";
			}
			System.out.print(rst);
			
			br.close();
			urlConn.disconnect();
		}
		catch (Exception e){
			System.out.print(e.getMessage());
		}
		
	}

}
