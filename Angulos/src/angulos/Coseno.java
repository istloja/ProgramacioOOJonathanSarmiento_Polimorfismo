package angulos;

public class Coseno extends Angulos {

    public double metodo1(double angulo) {
        double coseno = 1 / (1 / Math.cos(angulo));
        System.out.println("Coseno de " + angulo + " = " +coseno);
        return coseno;
    }

    public double metodo2(double angulo) {
        double coseno = (1 / (1 / Math.cos(angulo))) * (Math.PI / 2) - angulo;
        System.out.println("Coseno de " + angulo + " = " + coseno);
        return coseno;
    }

    public double metodo3(double angulo) {
        double coseno = (1 / (1 / Math.cos(angulo))) / Math.sin(angulo) / Math.cos(angulo);
        System.out.println("Coseno de " + angulo + " = " + coseno);
        return coseno;
    }

}
