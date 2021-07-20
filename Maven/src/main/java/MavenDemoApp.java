import com.google.gson.Gson;

public class MavenDemoApp {

    public static void main(String[] args) {
//        System.out.println("Baby's first Maven App");

        Computer computer = new Computer("EVGA", "RaptorXPro", true);

        String computerJson = new Gson().toJson(computer);

        System.out.println(computerJson);

    }

}
