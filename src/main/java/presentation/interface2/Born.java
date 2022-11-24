package presentation.interface2;

public class Born implements Roy {

    @Override
    public void bornRoy() {
        System.out.println("로이가 태어남");
    }

    @Override
    public void buyCar(Car car) {
        System.out.println("로이가 차를 샀다!");
    }
}
