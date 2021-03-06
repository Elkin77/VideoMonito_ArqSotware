package co.edu.uniminuto.arqSw.Modelo;
// Generated 20-sep-2017 0:59:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private Integer idPersona;
     private String nombre;
     private String apellido;
     private String papelVideo;
     private String descripcion;
     private int edad;
     private String pais;
     private String premios;
     private Set videoPorPersonas = new HashSet(0);

    public Persona() {
    }

	
    public Persona(String nombre, String apellido, String papelVideo, String descripcion, int edad, String pais, String premios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.papelVideo = papelVideo;
        this.descripcion = descripcion;
        this.edad = edad;
        this.pais = pais;
        this.premios = premios;
    }
    public Persona(String nombre, String apellido, String papelVideo, String descripcion, int edad, String pais, String premios, Set videoPorPersonas) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.papelVideo = papelVideo;
       this.descripcion = descripcion;
       this.edad = edad;
       this.pais = pais;
       this.premios = premios;
       this.videoPorPersonas = videoPorPersonas;
    }
   
    public Integer getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getPapelVideo() {
        return this.papelVideo;
    }
    
    public void setPapelVideo(String papelVideo) {
        this.papelVideo = papelVideo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getPremios() {
        return this.premios;
    }
    
    public void setPremios(String premios) {
        this.premios = premios;
    }
    public Set getVideoPorPersonas() {
        return this.videoPorPersonas;
    }
    
    public void setVideoPorPersonas(Set videoPorPersonas) {
        this.videoPorPersonas = videoPorPersonas;
    }




}


