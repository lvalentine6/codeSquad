package masters.cs07;

public class Application {
    public static void main(String[] args) {
        String str = "<!DOCTYPE html><HTML lang=\"ko\"><BODY><P>BOOST<IMG SRC=\"codesquad.kr\"></IMG><BR/></P></BODY></HTML>";

        DOM dom = new DOM(str);
        OutputView outputView = new OutputView();

        String s = dom.analyzeString();

        System.out.println(dom);

    }
}
