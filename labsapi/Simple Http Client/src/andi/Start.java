package andi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.Gson;

import andi.models.Search;
import andi.models.SuchModel;

public class Start {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Suche: ");
		String suche=sc.next();
		String uri="http://www.omdbapi.com/?apikey=477bca08&s="+suche;

		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
								.uri(URI.create(uri))
								.build();
		
		
		HttpResponse<String> response=client.send(request, BodyHandlers.ofString());
		
		String json =response.body();
		
		Gson g=new Gson();
		SuchModel data=g.fromJson(json, SuchModel.class);
		
		for (Search	film : data.getSearch()) {
			System.out.println(film.getTitle());
		}
		
		
	}

}
