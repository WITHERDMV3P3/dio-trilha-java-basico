package edu.cristian.vinteequatro;
public class NomeConcatenado {
    public static void main (String[] args){
        String primeiroNome = "Cristian";
        String segundoNome = "Guedes";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome , String segundoNome){
        
        return primeiroNome.concat(" ").concat(segundoNome);
    }
} 
