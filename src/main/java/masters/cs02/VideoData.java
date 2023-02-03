package masters.cs02;

import java.util.Random;
import java.util.UUID;

public class VideoData {
    private final String id;
    private final String title;
    private final int playtime;
    private final String connectionAddress;

    public VideoData(String title, int playtime) {
        this.id = makeId();
        this.title = title;
        this.playtime = playtime;
        this.connectionAddress = null;
    }

    public String makeId() {
        Random random = new Random();
        int size = random.nextInt(4) + 4;
        return String.valueOf(UUID.randomUUID()).substring(0, size);
    }

    public void print() {
        String stringBuilder = title
                + "("
                + id
                + ")"
                + ":"
                + playtime
                + "초";
        System.out.println(stringBuilder);
    }
}