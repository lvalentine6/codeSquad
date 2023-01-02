package preCourse.presentation.interface2.casting2;

public class Main {
    public static void main(String[] args) {
        Roy roy = new Roy();
        Java java = new Java();
        Spring spring = new Spring();

        roy.consume(java);
        System.out.println(Roy.getEnergy());
        roy.consume(spring);
        System.out.println(Roy.getEnergy());
        roy.consume(java);
        System.out.println(Roy.getEnergy());
    }
}
