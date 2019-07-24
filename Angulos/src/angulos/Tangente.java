package angulos;

public class Tangente extends Angulos {

    public double metodo1(double angulo) {
        double tangente = 1 / (Math.cos(angulo) / Math.sin(angulo));
        System.out.println("Tangente de " + angulo + " = " + tangente);
        return tangente;
    }

    public double metodo2(double angulo) {
        double tangente = (Math.cos(angulo) / Math.sin(angulo)) * (Math.PI / 2) - angulo;
        System.out.println("Tangente de " + angulo + " = " + tangente);
        return tangente;
    }

    public double metodo3(double angulo) {
        double tangente = (1 / (1 / Math.cos(angulo))) / (1 / (1 / Math.cos(angulo)));
        System.out.println("Tangente de " + angulo + " = " + tangente);
        return tangente;
    }
}
