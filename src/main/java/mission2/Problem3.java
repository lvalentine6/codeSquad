package mission2;

// Human class 재사용 해보자
// 왜 #객체간의 협력 키워드가 들어있지?
// 별다방 객체를 생성하고 맴버변수로 아메리카노를 넣어야 하나?
// cafe class를 구현하고 상속해야 할까

public class Problem3 {
    public static void main(String[] args) {
        Human human1 = new Human("James", 5000);
        Human human2 = new Human("Tomas", 10000);
        StarCafe starCafe = new StarCafe();
        BeanCafe beanCafe = new BeanCafe();

        StringBuilder sb = new StringBuilder();

        human1.setMoney(human1.getMoney() - starCafe.getPrice());
        human2.setMoney(human2.getMoney() - beanCafe.getPrice());

        sb.append(human1.getName())
                .append("님의 남은 돈은 ")
                .append(human1.getMoney())
                .append("원 입니다. ")
                .append(starCafe.getCafeName())
                .append("에서 ")
                .append(starCafe.getMenu())
                .append("를 마셨습니다.")
                .append("\n")
                .append(human2.getName())
                .append("님의 남은 돈은 ")
                .append(human2.getMoney())
                .append("원 입니다. ")
                .append(beanCafe.getCafeName())
                .append("에서 ")
                .append(beanCafe.getMenu())
                .append("를 마셨습니다.");

        System.out.println(sb);
    }
}

class Cafe {
}

class StarCafe extends Cafe {
    private String cafeName = "별 다방";
    private String menu = "아메리카노";
    private int Price = 4000;

    public String getCafeName() {
        return cafeName;
    }

    public String getMenu() {
        return menu;
    }

    public int getPrice() {
        return Price;
    }
}

class BeanCafe extends Cafe {
    private String cafeName = "콩 다방";
    private String menu = "라떼";
    private int Price = 5000;

    public String getCafeName() {
        return cafeName;
    }

    public String getMenu() {
        return menu;
    }

    public int getPrice() {
        return Price;
    }
}
