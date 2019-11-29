package Main;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class Main {

    public static void main(String[] args)
    {
        HttpResponse<String> response = Unirest.get("http://localhost:4567/rest/estudiantes/")
                .header("accept", "application/json")
                .queryString("apiKey", "123")
                .asString();
        System.out.println("Respuesta: "+response.getStatus());
        System.out.println("Salida: "+response.getBody());






    }

}
