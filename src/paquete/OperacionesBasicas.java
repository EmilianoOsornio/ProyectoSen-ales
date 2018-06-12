/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Emiliano
 */
public class OperacionesBasicas {
    ReadSound rs=new ReadSound();
    
        
    public double[] amplificacion(double[] data, int k){
        double[] data2 = new double[data.length];
        for(int i=0; i<data.length; i++){
            data2[i]=data[i]*k;
        }
        System.out.println("SE AMPLIFICO EL SONIDO");
        return data2;
    }
    
    public double[] atenuacion(double[] data, int k){
        double[] data2 = new double[data.length];
        for(int i=0; i<data.length; i++){
            data2[i]=data[i]/k;
        }
        System.out.println("SE ATENUO EL SONIDO");
        return data2;
    }
    
    public double[] desplazamiento(double[] data, int s, int tiempoGrabacion){
        double copyData[];
        System.out.println("TIEMPO G "+tiempoGrabacion);
        System.out.println("S "+s);
        if(tiempoGrabacion>= s){
            int muestrasporSeg = data.length/tiempoGrabacion;
            int tamMuestras = muestrasporSeg*Math.abs(s);
            System.out.println("TAM MUESTRAS "+data.length);
            System.out.println("MUESTRAS POR SEGUNDO "+muestrasporSeg);
            System.out.println("TAM NUEVA MUESTRA "+tamMuestras);
            if(s>0){
                copyData = new double[tamMuestras];
                for (int i = 0; i < tamMuestras; i++) {
                    copyData[i] = data[i];
                }
            }else{
                copyData = new double[data.length];
                for (int i = 0; i < data.length; i++) {
                    if(i<tamMuestras){
                        copyData[i] = 0;
                    }else{
                        copyData[i] = data[i];
                    }
                }
            }
            return copyData;
        }else{
            System.out.println("No es posible ");
            return data;
        }
   
    }
    
    public double[] reflejo(double[] data){
        double[] data2 = new double[data.length];
        for(int i=0; i<data.length; i++){
            data2[(data.length-1)-i]=data[i];
        }        
        System.out.println("SE REFLEJO EL SONIDO");
        return data2;
    }
    
    public void nuevaGrabacion(double[] grabacion){
        //Creamos una grabación con el nuevo arreglo
        rs.save("NuevaGrabacion.wav", grabacion);
    }
}
