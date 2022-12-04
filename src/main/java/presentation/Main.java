package presentation;

public class Main {
    public static void main(String[] args) {
        Team4 team4_1 = new Team4("gather", "강남불백", "신촌");
        team4_1.print();

        Team4 team4_2 = new Team4("gather", "강남불백", "신촌");
        System.out.println(team4_2.onlineMeetingPlace + " " + team4_2.dinnerMenu + " " + team4_2.offlineMeetingPlace);

    }
}
