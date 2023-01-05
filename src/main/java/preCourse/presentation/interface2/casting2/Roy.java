package preCourse.presentation.interface2.casting2;

public class Roy {
    private static int energy;

    // 초기화 블록
    static {
        energy = 100;
    }

    // 매개변수의 다형성을 적용하지 않는다면?
//    void consume(Java java) {
//        energy -= java.consumption;
//    }

    // 매배변수의 다형성 적용
    void consume(Action action) {
        energy -= action.consumption;
    }

    public static String getEnergy() {
        if (energy > 0) {
            return "에너지가 남아 있습니다. : " + energy;
        }
        return "탈진! 더 이상 아무것도 못해...";
    }
}
