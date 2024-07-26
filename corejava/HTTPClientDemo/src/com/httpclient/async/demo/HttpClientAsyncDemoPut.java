package com.httpclient.async.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientAsyncDemoPut {

	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException, ExecutionException {
		// TODO Auto-generated method stub
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities/0"))
				.PUT(BodyPublishers.ofString("{\r\n"
						+ "  \"id\": 0,\r\n"
						+ "  \"title\": \"strng\",\r\n"
						+ "  \"dueDate\": \"2024-07-20T14:03:09.28Z\",\r\n"
						+ "  \"completed\": true\r\n"
						+ "}"))
				.header("Content-Type", "application/json")
				.build();
		CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, BodyHandlers.ofString());
		String body = response.thenApply(HttpResponse::body).get();
		System.out.println(body);
	}

}
