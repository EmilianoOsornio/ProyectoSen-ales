package paquete;

import java.util.Random;
import java.util.Scanner;

public class ConvolucionFinita {
    public static int origenFinal =0;
    public static double[] getArray(){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("<--------------------------->");
        System.out.println("<----Ingrese los valores---->");
        System.out.println("<--------------------------->");
        System.out.println("Tamaño del arreglo:");
        int tam = scan.nextInt();
        int origen = rand.nextInt(tam);
        origenFinal += origen;
        double[] arreglo = new double[tam];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Valor["+(i+1)+"]: ");
            arreglo[i] = scan.nextDouble();
        }System.out.println("El origen: Valor["+(origen+1)+"]="+arreglo[origen]);
        return arreglo;
    }
    public static void llenaMatrizGeneral(double[] valores, double[][] matriz, int tam){
        for (int i=0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = 0;
            }
        }
        for (int i=0; i < valores.length; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[(i+j)%tam][j] = valores[i];
            }
        }
        imprimirMatriz(matriz, "Matriz Cuadrada");
    }
    public static void imprimirMatriz(double [][]a, String titulo){
        System.out.println("<------------------->");
        System.out.println("<--"+titulo+"-->");
        System.out.println("<------------------->");
        for (int i=0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+",");
            }System.out.println("");
        }
    }
    public static void llenaMatrizUnitaria(double[] valores, double[][] matriz, int tam){
        for (int i=0; i < tam; i++) {
            matriz[i][0] = 0; 
        }
        for (int i=0; i < valores.length; i++) {
            matriz[(i+0)%tam][0] = valores[i];
        }
        imprimirMatriz(matriz, "Matriz Unitaria");
        
    }
    public static void multiplicarMatrices(double [][]a, double [][]b){
        double [][] aux = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                aux[i][j] =0;
                for (int k = 0; k < b.length; k++) {                    
                    aux[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        imprimirMatriz(aux, "Resultado Final");
        System.out.println("El origen final: Valor["+(origenFinal+1)+"]="+aux[origenFinal][0]);
        
    }
    public static void main(String[]args){
        double[] arreglo1 = getArray();
        double[] arreglo2 = getArray();
        int tam = arreglo1.length + arreglo2.length -1;
        double[][] matrizGeneral = new double[tam][tam];
        double[][] matrizUnitaria = new double[tam][1];
        llenaMatrizGeneral(arreglo1,matrizGeneral,tam);
        llenaMatrizUnitaria(arreglo2,matrizUnitaria,tam);
        multiplicarMatrices(matrizGeneral,matrizUnitaria);          
    }
}
