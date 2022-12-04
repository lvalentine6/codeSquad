package presentation;

public class Team4 extends CodeSquad{
    private String no1 = "Roy";
    private String no2 = "GoGone";
    protected String offlineMeetingPlace;

    public Team4(String onlineMeetingPlace, String dinnerMenu, String offlineMeetingPlace) {
        super(onlineMeetingPlace, dinnerMenu);
        this.offlineMeetingPlace = offlineMeetingPlace;
    }

    public void print() {
        System.out.println("Team4 no1 : " + no1);
        System.out.println("CodeSquad no1 : " + super.no1);
        System.out.println("Team4 no2 : " + this.no2);
        System.out.println("CodeSquad no2 : " + super.no2);
        System.out.println("CodeSquad no3 : " + no3);
    }
}
