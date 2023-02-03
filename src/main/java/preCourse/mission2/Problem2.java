package preCourse.mission2;

public class Problem2 {
    public static void main(String[] args) {
        Human human = new Human("제인", 30, "여성", "기혼자", 1);

        String sb = "이름은 "
                + human.getName()
                + "이고 나이는 "
                + human.getAge()
                + "살 입니다. 성별은 "
                + human.getMale()
                + "이며, "
                + human.getMarried()
                + "입니다. 자녀는 "
                + human.getNumberOfChildren()
                + "명이 있습니다.";

        System.out.println(sb);
    }
}

class Human {
    private final String name;
    private int age;
    private String male;
    private String married;
    private int numberOfChildren;
    private int money;

    public Human(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public Human(String name, int age, String male, String married, int numberOfChildren) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.married = married;
        this.numberOfChildren = numberOfChildren;
    }

    public String getName() {
        return name;
    }

    public String getMale() {
        return male;
    }

    public int getAge() {
        return age;
    }

    public String getMarried() {
        return married;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
