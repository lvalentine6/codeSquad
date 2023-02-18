package masters.cs13;

public class Application {
    public static void main(String[] args) {
        String domain = "https://www.naver.com";

        DNS dns = new DNS(domain);
        String location = dns.lookup();


    }
}
