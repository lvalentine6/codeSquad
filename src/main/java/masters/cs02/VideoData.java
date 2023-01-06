package masters.cs02;

import java.util.Random;
import java.util.UUID;

public class VideoData {
    private String id;
    private String title;
    private int playtime;
    private String connectionAddress;

    public VideoData(String title, int playtime) {
        this.id = makeId();
        this.title = title;
        this.playtime = playtime;
    }

    public String makeId() {
        Random random = new Random();
        int size = random.nextInt(4) + 4;
        return String.valueOf(UUID.randomUUID()).substring(0, size);
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title)
                .append("(")
                .append(id)
                .append(")")
                .append(":")
                .append(playtime)
                .append("초");
        System.out.println(stringBuilder);
    }

}
