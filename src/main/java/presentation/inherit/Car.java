package presentation.inherit;

public class Car {
    // 맴버변수로 인터페이스를 가지고 있기 때문에 객체 의존성이 낮음
    private Engine engine;

    // 인스턴스에 의존하고 있기 때문에 의존성이 높음
    private NormalEngine normalEngine = new NormalEngine();

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void print() {
        engine.getEngine();
        System.out.println();
    }

}
