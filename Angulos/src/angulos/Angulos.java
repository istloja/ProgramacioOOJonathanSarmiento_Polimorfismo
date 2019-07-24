package angulos;

import java.util.Scanner;

public class Angulos {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner dato1 = new Scanner(System.in);
        System.out.println("Ingrese el valor correcto de lo que desea calcular");
        System.out.println("1- si desea calcular el Seno");
        System.out.println("2- si desea calcular el Coseno");
        System.out.println("3- si desea calcular la Tangente");
        int numero=0;
        try {
            numero = dato.nextInt();
        }catch(Exception e){
            System.out.println("Se ah generado la excepcion "+e);
        }
//        finally{
//            System.out.println("Ingrese nuevamente su opcion"); 
//            numero = dato1.nextInt();
//        }
        if (numero <= 0) {
            System.out.println("Ingrese un numero mayor a 0");
        } else {
            switch (numero) {
                case 1:
                    Seno calcular = new Seno();
                    System.out.println("Ingrese el angulo a calcular");
                    double angulo = dato.nextDouble();
                    System.out.println("Elige tu opcion" + "\n1. Metodo 1" + "\n2. Metodo 2" + "\n3. Metodo 3");
                    int metodo = dato.nextInt();
                    switch (metodo) {
                        case 1:
                            calcular.metodo3(angulo);
                            break;
                        case 2:
                            calcular.metodo2(angulo);
                            break;
                        case 3:
                            calcular.metodo1(angulo);
                            break;
                        default:
                            System.out.println(metodo + " no es una opcion valida");
                    }
                    break;

                case 2:
                    Coseno calcular1 = new Coseno();
                    System.out.println("Ingrese el angulo a calcular");
                    double angulo1 = dato.nextDouble();
                    System.out.println("Elige tu opcion" + "\n1. Metodo 1" + "\n2. Metodo 2" + "\n3. Metodo 3");
                    int metodo1 = dato.nextInt();
                    switch (metodo1) {
                        case 1:
                            calcular1.metodo3(angulo1);
                            break;
                        case 2:
                            calcular1.metodo2(angulo1);
                            break;
                        case 3:
                            calcular1.metodo1(angulo1);
                            break;
                        default:
                            System.out.println(metodo1 + " no es una opcion valida");
                    }
                    break;
                case 3:
                    Tangente calcular2 = new Tangente();
                    System.out.println("Ingrese el angulo a calcular");
                    double angulo2 = dato.nextDouble();
                    System.out.println("Elige tu opcion" + "\n1. Metodo 1" + "\n2. Metodo 2" + "\n3. Metodo 3");
                    int metodo2 = dato.nextInt();
                    switch (metodo2) {
                        case 1:
                            calcular2.metodo3(angulo2);
                            break;
                        case 2:
                            calcular2.metodo2(angulo2);
                            break;
                        case 3:
                            calcular2.metodo1(angulo2);
                            break;
                        default:
                            System.out.println(metodo2 + " no es una opcion valida");
                    }
                    break;
                default:
                    System.out.println(numero + " no es una opcion valida");
            }
        }
    }
}
