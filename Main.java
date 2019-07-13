import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("c7osure", "True say, i want");
        trackList.put("Old Town Road", "Take my horse to the old town road");
        trackList.put("Old Town Road Remix", "Take my horse to the old town road, im gonna ride");
        trackList.put("Hotel California", "Welcome to the hotel");

        Set<String> keys = trackList.keySet();
        System.out.println(trackList.get("Hotel California"));
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}