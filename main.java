import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

class AnalizadorDeNotas{
    double[][] notas;
    String[] evaluaciones;
    int[] rut;
    int cantEstudiantes;
    int cantEvaluaciones;

    public AnalizadorDeNotas(int estudiantes, int evaluaciones){
        this.notas = new double[estudiantes][evaluaciones];
        this.cantEstudiantes = estudiantes;
        this.cantEvaluaciones = evaluaciones;
        this.evaluaciones = new String[evaluaciones];

        for(int  i = 0; i < estudiantes; i++){
            for(int j = 0; j < evaluaciones; j++){
                Random random = new Random();
                double randomValue = random.nextDouble();
                notas[i][j] = randomValue;
            }
        }

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < evaluaciones; i++){
            System.out.print("Ingrese nombre de evaluacion: ");
            String evaluacion = entrada.nextLine();
            this.evaluaciones[i]=evaluacion;
        }
    }

    public AnalizadorDeNotas(int estudiantes, int evaluaciones, String[] nombresEvaluaciones){
        notas = new double[estudiantes][evaluaciones];
        this.cantEstudiantes = estudiantes;
        this.cantEvaluaciones = evaluaciones;
        this.evaluaciones = nombresEvaluaciones;

        for(int  i = 0; i < estudiantes; i++){
            for(int j = 0; j < evaluaciones; j++){
                Random random = new Random();
                double randomValue = random.nextDouble();
                notas[i][j] = randomValue;
            }
        }
    }

    public double calcularPromedioEstudiante(int numEstudiante){
        double total = 0;

        for(int j = 0; j < cantEvaluaciones; j++){
            total += notas[numEstudiante][j];
        }
        return total / cantEvaluaciones;
    }

    public double calcularPromedioEvaluacion(int index){
        double total = 0;

        for(int i = 0; i < cantEstudiantes; i++){
            total += notas[i][index];
        }
        return total / cantEstudiantes;
    }

    public double calcularVarianzaEvaluacion(int index){
        double promedio = calcularPromedioEvaluacion(index);
        double total = 0;

        for(int i = 0; i < cantEstudiantes; i++){
            total += (notas[i][index]-promedio)*(notas[i][index]-promedio);
        }
        return total/cantEstudiantes;
    }

    public double[] calcularPromediosEstudiantes(){
        double[] promedios = new double[cantEstudiantes];
        for(int i = 0; i < cantEstudiantes; i++){
            promedios[i] = calcularPromedioEstudiante(i);
        }
        return promedios;
    }

    public double[] calcularVarianzasEstudiantes(){
        double[] varianzas = new double[cantEstudiantes];
        for(int i = 0; i < cantEstudiantes; i++){
            varianzas[i] = calcularPromedioEvaluacion(i);
        }
        return varianzas;
    }

    public double[] calcularPromedioEvaluaciones(String[] evaluaciones){
        double[] promedios = new double[cantEstudiantes];
        double total = 0;
        for(int i = 0; i < cantEvaluaciones; i++){

        }
    }

    public String encontrarMaximo(int index){

    }
}








public class Main {
    public static void main(String[] args) {

    }
}
