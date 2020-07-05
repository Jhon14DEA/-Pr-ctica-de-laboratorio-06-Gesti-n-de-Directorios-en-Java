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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JHON FAREZ
 */
public class ControladorDirectorio {

    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio() {

    }

    public void inicializarRuta(String ruta) {
        archivo = new File(ruta);
    }

    

    public String[] getArchivos() {
        return archivo.list();
    }   

    public List<String> listarArchivos(String ruta) {
        List<String> lista = new ArrayList<>();
        lista.clear();
        archivo = new File(ruta);
        archivos = archivo.listFiles();

        for (File elemento : archivos) {
            if (!elemento.isHidden()) {
                lista.add(elemento.getName());
            }

        }

        return lista;
    }

    public List<String> listarArchivosOcultos(String ruta) {
        List<String> lista = new ArrayList<>();
        lista.clear();
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        for (File elemento : archivos) {
            if (elemento.isHidden() && !elemento.isDirectory()) {
                lista.add(elemento.getName());
            }
        }
        return lista;
    }

    public List<String> listarDirectoriosOcultos(String ruta) {
        List<String> lista = new ArrayList<>();
        lista.clear();
        archivo = new File(ruta);
        archivos = archivo.listFiles();

        for (File elemento : archivos) {
            if (elemento.isHidden() && elemento.isDirectory()) {
                lista.add(elemento.getName());
            }
        }

        return lista;
    }
    
    public void crearDirectorio(String nombre){
        archivo = new File(ruta);
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de su directorio ");

        File file = new File(nombre);
        if (!file.exists()) {
            try {
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "Directorio creado con exito");
                JOptionPane.showMessageDialog(null,"Datos del directorio creado"+
                        "\nNombre: "+file.getName()+"\nRuta aboluta:  "+file.getAbsolutePath()+
                        "\nTamanio: "+file.length());
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,"Directorio "+file+" ya existe");
            }
        }
    }
    public void eliminarDirectorio(String nombre){
    
    }
    
    public void renombrarDirectorio(String actual, String nuevo){
    
    }
    public  String mostrarIformacion (String nombre, String ruta){
    archivo = new File(ruta);
    archivos = archivo.listFiles();
    String contenido = "contenido";
    
        for (File elemento : archivos) {
            if(elemento.getName().equals(nombre)){
            String total = "Path: ";
            total = total.concat(elemento.getAbsolutePath());
            contenido =contenido.concat(total);
            
            String length = "length";
            
            }
        }
    return  contenido;
    }
}
    


