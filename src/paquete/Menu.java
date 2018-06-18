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
    public static double[] data,datan;
    public static int segundos;
    
    public static void main(String [] args){
        int opc=1;
        int segundos;
        Scanner sc=new Scanner(System.in);
        RecordSound rcs=new RecordSound();
        ReadSound rds=new ReadSound();
        //tiempoGrabacion = rcs.
        OperacionesBasicas ob= new OperacionesBasicas();
        //Grabacion original
        System.out.println("Cuanto tiempo deseas grabar?(segundos)");
        segundos=sc.nextInt();
        setSeg(segundos);
        double[] data=rcs.mainRecord(segundos);
        setData(data);
        
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
            System.out.println("6.Interpolacion a cero");
            System.out.println("7.Interpolacion a escalon");
            System.out.println("8.Interpolacion lineal");
            System.out.println("9.Reproducir Entrada");
            System.out.println("10.Reproducir Salida");
            System.out.println("11.Graficar");
            System.out.println("12.Convolución");
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
                            setDatan(datan);
                break;
                case 2:     System.out.println("Ingresa el factor k");
                            k=sc.nextInt();
                            datan=ob.atenuacion(data,k);
                            setDatan(datan);
                break;
                case 3:     System.out.println("Ingresa los segundos a desplazar");
                            k=sc.nextInt();
                            datan=ob.desplazamiento(data,k,segundos);
                            setDatan(datan);
                break;
                case 4:     datan=ob.reflejo(data);
                            setDatan(datan);
                break;
                case 5:     System.out.println("Ingresa el factor k");
                            k=sc.nextInt();
                            datan=ob.diezmacion(data,k);
                            setDatan(datan);
                break;
                case 6:     System.out.println("Ingresa el factor k");
                            k=sc.nextInt();
                            datan=ob.interpolacionCero(data, k);
                            setDatan(datan);
                break;
                case 7:     System.out.println("Ingresa el factor k");
                            //k=sc.nextInt();
                            datan=ob.interpolacionEscalon(data, k);
                            setDatan(datan);
                break;
                case 8:     System.out.println("Ingresa el factor k");
                            k=sc.nextInt();
                            datan=ob.interpolacionLineal(data, k);
                            setDatan(datan);
                break;
                case 9:     rds.play("Grabacion.wav");
                break;
                case 10:     if(datan == null){
                                System.out.println("PARA REPRODUCIR TIENES QUE REALIZAR UNA OPERACION");
                            }else{
                            rds.play("NuevaGrabacion.wav");
                            }
                break;
                case 11:    JFrameVentana newv=new JFrameVentana();
                            newv.setVisible(true);
                break;
                case 12:
                            ConvolucionFinita.main(args);
                break;
                default:    System.out.println("Teclea una opcion valida");
                break;
            }
        }
    }
    
    public static void setData(double[] data){
            Menu.data=data;
    }
    
    public static double[] getData(){
            return Menu.data;
    }
    
    public static void setDatan(double[] datan){
            Menu.datan=datan;
    }
    
    public static double[] getDatan(){
            return Menu.datan;
    }
    
    public static void setSeg(int segundos){
            Menu.segundos=segundos;
    }
    
    public static int getSeg(){
            return Menu.segundos;
    }
}
