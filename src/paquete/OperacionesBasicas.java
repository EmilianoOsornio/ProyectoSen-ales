
package paquete;

import javax.swing.JOptionPane;
import paquete.ReadSound;

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
        System.out.println("SE AMPLIFICÓ EL SONIDO");
        JOptionPane.showMessageDialog(null, "Se amplificó el sonido");
        nuevaGrabacion(data2);
        return data2;
    }
    
    public double[] atenuacion(double[] data, int k){
        double[] data2 = new double[data.length];
        for(int i=0; i<data.length; i++){
            data2[i]=data[i]/k;
        }
        System.out.println("SE ATENUÓ EL SONIDO");
        JOptionPane.showMessageDialog(null, "Se atenuó el sonido");
        nuevaGrabacion(data2);
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
            nuevaGrabacion(copyData);
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
        System.out.println("SE REFLEJÓ EL SONIDO");
        JOptionPane.showMessageDialog(null, "Se reflejó el sonido");
        nuevaGrabacion(data2);
        return data2;
    }
    
    public double[] diezmacion(double[] data, int k){
        int nuevoTam = (data.length%k==0)?data.length/k:(data.length/k)+k;
        double copyData [] = new double[nuevoTam];
        System.out.println("ORIGINAL TAM "+data.length);
        System.out.println("NUEVO TAM "+nuevoTam);
        int j =  0;
        
        for (int i = 0; i < data.length; i++) {
            if(i%k==0){
               
                copyData[j] = data[i];
                 j++;
            }
        }
        System.out.println("Recorrido "+j);
        nuevaGrabacion(copyData);
        return copyData;
    }
    
    public double[] interpolacionCero(double[] data, int k){
        double[] data2 = new double[data.length*k];
        for(int i=0,j=0; i<data.length*k; i=i+k,j++){
            data2[i]=data[j];
        }
        System.out.println("SE APLICÓ INTERPOLACIÓN A CERO");
        JOptionPane.showMessageDialog(null, "Se amplificó interpolación a cero");
        System.out.println("Tamaño original:" + data.length);
        System.out.println("Tamaño nuevo:" + data2.length);
        nuevaGrabacion(data2);
        return data2;
    }
    
    public double[] interpolacionEscalon(double[] data, int k){
        int cont=0;
        double[] data2 = new double[data.length*k];
        for(int i=0,j=0; i<data.length*k; i=i+k,j++){
            data2[i]=data[j];
            while(cont<k){
                data2[i+cont]=data[j];
                cont++;
            }
            cont=0;
        }
        System.out.println("SE APLICÓ INTERPOLACIÓN A ESCALÓN");
        JOptionPane.showMessageDialog(null, "Se amplificó interpolación a escalón");
        System.out.println("Tamaño original:" + data.length);
        System.out.println("Tamaño nuevo:" + data2.length);
        nuevaGrabacion(data2);
        return data2;
    }
    
    public double[] interpolacionLineal(double[] data, int k){
        int cont=1;
        double vi;
        double vf;
        double factor = 0;
        double[] data2 = new double[data.length*k];
        for(int i=0,j=0; i<data.length*k; i=i+k,j++){
            data2[i]=data[j];
            vi=data[j];
            if(j+1<data.length-1){
                vf = data[j+1];
                 factor = calcularFactor(vi, vf, k);
            }
            
            while(cont<k){
                
                data2[i+cont]=data[j]+factor;
                factor *=k;
                cont++;
            }
            cont=1;
        }
        System.out.println("SE APLICÓ INTERPOLACIÓN LINEAL ");
        System.out.println("Tamaño original:" + data.length);
        System.out.println("Tamaño nuevo:" + data2.length);
        nuevaGrabacion(data2);
        return data2;
    }
    
    private double calcularFactor(double i, double f, int k){
        double r = 0;
        if(f>=i){
            r = Math.abs(i-f)/(double)k;
        }else{
            r = (double)-1*Math.abs(i-f)/(double)k;
        }
        return r;
    }
    
    public void nuevaGrabacion(double[] grabacion){
        //Creamos una grabación con el nuevo arreglo
        rs.save("NuevaGrabacion.wav", grabacion);
    }
}
