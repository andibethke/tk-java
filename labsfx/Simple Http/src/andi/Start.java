package andi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Suche: ");
		String suche = scanner.next();
		URL url = new URL("https://www.omdbapi.com/?apikey=477bca08&s=" + suche);
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
	}

}
