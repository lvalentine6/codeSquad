package masters.cs02;

import java.util.Random;
import java.util.UUID;

public class VideoData {
    private String id;
    private String title;
    private int playtime;
    private String connectionAddress;

    public VideoData() {
        this.id = makeId();
        this.title = title;
        this.playtime = playtime;
        this.connectionAddress = connectionAddress;
    }

    public String makeId() {
        Random random = new Random();
        int size = random.nextInt(4) + 4;
        return String.valueOf(UUID.randomUUID()).substring(0, size);
    }

    public void print() {
        System.out.println(id);
    }
}
