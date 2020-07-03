/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vista.VentanaPrincipal;
import java.io.File;

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
