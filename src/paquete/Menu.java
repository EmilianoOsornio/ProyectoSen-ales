/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class Menu {
    public static void main(String [] args){
        int opc=1;
        int tiempoGrabacion;
        Scanner sc=new Scanner(System.in);
        RecordSound rcs=new RecordSound();
        ReadSound rds=new ReadSound();
        //tiempoGrabacion = rcs.
        OperacionesBasicas ob= new OperacionesBasicas();
        //Grabacion original
        double[] data=rcs.mainRecord();
        //Nueva grabacion
        double[] datan=null;
        int k=1;
        while(opc!=0){
            System.out.println("********************************");
            System.out.println("**********   MENU   ************");
            System.out.println("Selecciona la opción a realizar");
            System.out.println("1.Amplificacion");
            System.out.println("2.Atenuacion");
            System.out.println("3.Desplazamiento");
            System.out.println("4.Reflejo");
            System.out.println("5.Diezmacion");
            System.out.println("6.Interpolacion");
            System.out.println("7.Reproducir Resultado");
            System.out.println("0.Salir");
            System.out.println("********************************");
            System.out.println("********************************");

            opc=sc.nextInt();
            switch(opc){
                case 0:     System.out.println("Adios!");
                break;
                case 1:     System.out.println("Ingresa el factor k (NO MAS DE 10)");
                            k=sc.nextInt();
                            datan=ob.amplificacion(data,k);
                break;
                case 2:     System.out.println("Ingresa el factor k");
                            k=sc.nextInt();
                            datan=ob.atenuacion(data,k);
                break;
                case 3:     System.out.println("Ingresa los segundos a desplazar");
                            k=sc.nextInt();
                            System.out.println("Ingresa el total de segundos de la grabacion");
                            int t=sc.nextInt();
                            datan=ob.desplazamiento(data,k,t);
                break;
                case 4:     datan=ob.reflejo(data);
                break;
                case 5: 
                break;
                case 6: 
                break;
                case 7:     if(datan == null){
                                System.out.println("PARA REPRODUCIR TIENES QUE REALIZAR UNA OPERACION");
                            }else{
                            ob.nuevaGrabacion(datan);
                            rds.play("NuevaGrabacion.wav");
                            }
                break;

                default:    System.out.println("Teclea una opcion valida");
                break;
            }
        }
    }
}
