package masters.cs07;

public class DOM {
    String XML;

    public DOM(String XML) {
        this.XML = XML;
    }

    @Override
    public String toString() {
        return "DOM{" +
                "XML='" + XML + '\'' +
                '}';
    }
}