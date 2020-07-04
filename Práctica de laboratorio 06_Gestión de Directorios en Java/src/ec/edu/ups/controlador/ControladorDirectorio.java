/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vista.VentanaPrincipal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author JHON FAREZ
 */
public class ControladorDirectorio {
   
    private VentanaPrincipal ventanaPrincipal;
    private String ruta;
    File archivo;
    File [] archivos;

    public ControladorDirectorio(VentanaPrincipal ventanaPrincipal, String ruta) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.ruta = ruta;
    }
private File directorio;

    public ControladorDirectorio() {
    }

    public void inicializarRuta(String ruta) {
        directorio = new File(ruta);
    }

    public void abrirCarpeta(String ruta, String nombre) {

    }

    public String[] getArchivos() {
        return directorio.list();
    }

    public void guardarTexto(String nombre, String texto) {
        try {
            FileWriter archivo = new FileWriter(directorio.getAbsolutePath() + "\\" + nombre, false);
            BufferedWriter contenido = new BufferedWriter(archivo);
            contenido.append(texto);
            contenido.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String leerArchivo(String nombre) {
        String resultado = "";
        try {
            FileReader archivo = new FileReader(directorio.getAbsolutePath() + "/" + nombre);
            BufferedReader contenido = new BufferedReader(archivo);
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

    
    
    
    public void controladorDirectorio(String ruta){
    
    }
    public void listarArchivos(){
    
    }
    public void listarDirectorios(){
    
    }
    public void listarArchivosOcultos(){
    
    }
    public void directoriosOcultos(){
    
    }
    public void directorio(String nombre){
    
    }
    public void eliminarDirectorio(String nombre){
    
    }
    public void renombrarDirectorio(String actual, String nuevo){
    
    }
    public void mostrarInformacion(String nombre){
    
    }
}
