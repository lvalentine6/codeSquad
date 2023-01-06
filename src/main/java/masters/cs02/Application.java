package masters.cs02;

import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        VideoData[] videoDataArray = new VideoData[13];
        Random random = new Random();

        for (int i = 0; i < videoDataArray.length; i++) {
            if(i < 9) {
                videoDataArray[i] = new VideoData("제목0" + (i+1), random.nextInt(15) + 1);
                continue;
            }
            videoDataArray[i] = new VideoData("제목"+(i+1), random.nextInt(15) + 1);
        }

        for (VideoData vi : videoDataArray) {
            vi.print();
        }
    }
}
