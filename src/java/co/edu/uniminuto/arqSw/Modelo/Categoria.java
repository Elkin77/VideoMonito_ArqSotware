package co.edu.uniminuto.arqSw.Modelo;
// Generated 20-sep-2017 0:59:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Integer idCategoria;
     private String nombre;
     private String descripcion;
     private Set videoPorCategorias = new HashSet(0);

    public Categoria() {
    }

	
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Categoria(String nombre, String descripcion, Set videoPorCategorias) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.videoPorCategorias = videoPorCategorias;
    }
   
    public Integer getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getVideoPorCategorias() {
        return this.videoPorCategorias;
    }
    
    public void setVideoPorCategorias(Set videoPorCategorias) {
        this.videoPorCategorias = videoPorCategorias;
    }




}


