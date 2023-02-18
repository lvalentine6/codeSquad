package masters.cs13;

import java.net.InetAddress;
import java.net.URL;

public class DNS {
    private final String domain;

    public DNS(String domain) {
        this.domain = domain;
    }

    public String lookup() {
        StringBuilder stringBuilder = new StringBuilder();
        InetAddress[] inetAddresses = null;

        try {
            URL url = new URL(domain);
            inetAddresses = InetAddress.getAllByName(url.getHost());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("DNS 서버 통신중");
        System.out.println();
        for (InetAddress ia : inetAddresses) {
            System.out.println("호스트 이름 : " + ia.getHostName());
            System.out.println("호스트 주소 : " + ia.getHostAddress());
            System.out.println("전체 : " + ia);
            System.out.println();

            stringBuilder.append(ia.getHostAddress()).append("\n");
        }
        System.out.println("DNS 조회 완료");
        return stringBuilder.substring(0, stringBuilder.indexOf("\n"));
    }
}
