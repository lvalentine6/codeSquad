package masters.cs07;

import java.util.Arrays;

public class DOM {
    String XML;

    public DOM(String XML) {
        this.XML = XML;
    }

    public String analyzeString() {
        String[] temp = XML.split("<,>");
        System.out.println(Arrays.toString(temp));
        return null;
    }

    @Override
    public String toString() {
        return "DOM{" +
                "XML='" + XML + '\'' +
                '}';
    }
}
