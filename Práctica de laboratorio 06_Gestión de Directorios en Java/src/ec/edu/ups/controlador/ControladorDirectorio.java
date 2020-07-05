/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vista.VentanaPrincipal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author JHON FAREZ
 */
public class ControladorDirectorio {
   
    
    private String ruta;
    File archivo;
    File [] archivos;

    
    public ControladorDirectorio(){
    
    }
  public void inicializarRuta(String ruta) {
        archivo = new File(ruta);
    }

    public void abrirCarpeta(String ruta, String nombre) {

    }

    public String[] getArchivos() {
        return archivo.list();
    }

    public void guardarTexto(String nombre, String texto) {
        try {
            FileWriter arch = new FileWriter(archivo.getAbsolutePath() + "\\" + nombre, false);
            BufferedWriter contenido = new BufferedWriter(arch);
            contenido.append(texto);
            contenido.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String leerArchivo(String nombre) {
        String resultado = "";
        try {
            FileReader arch = new FileReader(archivo.getAbsolutePath() + "/" + nombre);
            BufferedReader contenido = new BufferedReader(arch);
            String linea = "";
            while (linea != null) {
                resultado = resultado + linea + "\n";
                linea = contenido.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return resultado;
    }
}
