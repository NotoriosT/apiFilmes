import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpRequest httpRequest= HttpRequest.newBuilder().GET().
                uri(URI.create("https://imdb-api.com/en/API/Top250Movies/adcionaAquiAchave"))
                .timeout(Duration.ofSeconds(60))
                .build();

        HttpClient httpClient=HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(60))
                .build();
        HttpResponse<String>filmesTop250=httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        String filmes= filmesTop250.body();

List<Filme> filmeList=AdcionaFilme.adciona(filmes);

        System.out.println(filmeList.size());


    }

}
