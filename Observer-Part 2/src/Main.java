import com.example.newsbroker.NewsAgency;
import com.example.newsbroker.NewsChannel;

public class Main {
    public static void main(String[] args) throws Exception{
        //instantiate the news Agencys
        var apa = new NewsAgency("APA");
        var reuters = new NewsAgency("Reuters");

        //instantiate the news channels
        var orf = new NewsChannel("orf.at");
        var nzz = new NewsChannel("nzz.ch");
        var nytimes = new NewsChannel("nytimes.com");

        //subscribe to APA
        apa.subscribe(orf);
        apa.subscribe(nzz);

        //subscribe to Reuters
        reuters.subscribe(nytimes);
        reuters.subscribe(nzz);

        //broadcast news
        apa.broadcast("Auf der Suche nach der nächsten Registrierung");
        reuters.broadcast("Harrus campaign raises $55 mln over two weekend eventsy, campaign official says");
    }

}