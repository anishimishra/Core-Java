package com.httpclient.async.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientAsyncDemoDelete {

	public static void main(String[] args)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities/0"))
				.DELETE().build();
		CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, BodyHandlers.ofString());
		String body = response.thenApply(HttpResponse::body).get();
		Integer integer = response.thenApply(HttpResponse::statusCode).get();
		System.out.println(integer);
		System.out.println(body);
	}

}
