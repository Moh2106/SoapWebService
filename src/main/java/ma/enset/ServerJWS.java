package ma.enset;

import ma.enset.webService.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:1234/", new BanqueService());
        System.out.println("Web Service déployé avec l'adresse http://0.0.0.0:1234");
    }
}
