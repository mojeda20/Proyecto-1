/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

/**
 *
 * @author moise
 */
public class helpers {
    public boolean validarletras(String letra){
        return letra.matches("[a-zA-Zñ]*");
    }
    
    private boolean validarnumeros(String num){
        return num.matches("[0-9]*");
    }
    
    private boolean validarnumerosletras(String palabra){
        return palabra.matches("[a-zA-Z0-9]*");
    }
    
    private boolean esDecimal(String cad) {
        try {
            Double.parseDouble(cad);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    public double ValidarNumerosDecimales(String numero){
        if(esDecimal(numero)){
            double num = Double.parseDouble(numero);
            if(num >= 0){
                return num;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
    
    public int ValidarNumeros(String numero){
        if(validarnumeros(numero)== true){
            int num = Integer.parseInt(numero);
            return num;
        }else{
            return -1;
        }
    }
    
    public String ValidarLetras(String letras){
        if(validarletras(letras)== true){
            return letras;
        }else{
            return null;
        }
    }
    
    public String ValidarNombre(String nombre){
        String [] valid_name = nombre.split(" ");
        int count = 0;
        for (int i = 0; i < valid_name.length; i++) {
            if(validarletras(valid_name[i]) != true){
                count++;
            }
        }
        
        if (count == 0 || count < 2) {
            return nombre;
        }else{
            return null;
        }
    }
    
    public String ValidarNombre2(String name){
        boolean flag = false;
        do{
            for(int i=0;i<name.length();i++){
                flag = Character.isLetter(name.charAt(i)) || name.charAt(i) == ' ';
                if( flag == false ){
                   return null;
                }
            }
        }while(flag == false);
        
        return name;
    }
    
    
    
    public String ValidarLetrasNumeros(String palabra){
        if(validarnumerosletras(palabra)){
            return palabra;
        }else{
            return null;
        }
    }
}
