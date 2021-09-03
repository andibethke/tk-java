package andi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Start {

	public static void main(String[] args) throws Exception {
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create("http://www.omdbapi.com/?s=terminator&apikey=477bca08"))
	          .build();

	    HttpResponse<String> response =
	          client.send(request, BodyHandlers.ofString());

	    System.out.println(response.body());

	}

}
