package angulos;

public class Seno extends Angulos {

    public double metodo1(double angulo) {
        double seno = 1 / (1 / Math.cos(angulo));
        System.out.println("Seno de " + angulo + " = " + seno);
        return seno;
    }

    public double metodo2(double angulo) {
        double seno = (1 / Math.cos(angulo)) * (Math.PI / 2) - angulo;
        System.out.println("Seno de " + angulo + " = " + seno);
        return seno;
    }

    public double metodo3(double angulo) {
        double seno = (1 / Math.cos(angulo)) / (Math.cos(angulo) / Math.sin(angulo));
        System.out.println("Seno de " + angulo + " = " + seno);
        return seno;
    }

}
