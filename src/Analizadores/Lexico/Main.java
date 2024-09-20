package Analizadores.Lexico;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String fileName = "entrada.txt";
        if(args.length == 1) fileName = args[0];
        try{
            System.out.println("Ejecutando analizador léxico con archivo " + fileName);
            new AnalizadorLexico().leerArchivo(new File("factorial.txt"));
        }catch (Exception e){
            System.out.println("Ocurrio un error" + e.getMessage());
        }
    }
}
