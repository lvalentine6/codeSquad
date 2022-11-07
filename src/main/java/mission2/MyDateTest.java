package mission2;

// SimpleDateFormat으로 검사가 어려움

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(29, 2, 2000);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(29, 2, 2006);
        System.out.println(date2.isValid());

    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    String isValid() {
        isLeapYear(getYear());
        if ((day >= 1 && day <= 29) && (month >= 1 && month <= 12) && year >= 1) {
            return getYear() + "년 " + getMonth() + "월 " + getDay() + "일은 유효한 날짜입니다.";
        }
        return getYear() + "년 " + getMonth() + "월 " + getDay() + "일은 유효하지 않은 날짜입니다.";
    }

    boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
            return true;
        }
        return false;
    }
}

