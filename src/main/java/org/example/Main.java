package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.example.models.Dados;
import org.example.models.Musica;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
Gson gson =  new GsonBuilder().setPrettyPrinting().create();

OkHttpClient client = new OkHttpClient();

System.out.print("Digite o nome da cantora: ");
String artista = scanner.nextLine();

System.out.print("Digite o nome do álbum: ");
String album = scanner.nextLine();

// Substitui espaços por + para a URL
String artistaFormatado = artista.replace(" ", "+");
String albumFormatado = album.replace(" ", "+");

String url = "https://ws.audioscrobbler.com/2.0/?method=album.getInfo" +
    "&api_key=04ebeff30478760fcba031153ed86e77" +
    "&artist=" + artistaFormatado +
    "&album=" + albumFormatado +
    "&format=json";


    }
}

