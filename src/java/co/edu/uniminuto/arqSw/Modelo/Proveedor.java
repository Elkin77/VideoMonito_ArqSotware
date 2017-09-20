package co.edu.uniminuto.arqSw.Modelo;
// Generated 20-sep-2017 0:59:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer idProveedor;
     private String sede;
     private String nombre;
     private String apellido;
     private String password;
     private Set contenidos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(String sede, String nombre, String apellido, String password) {
        this.sede = sede;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }
    public Proveedor(String sede, String nombre, String apellido, String password, Set contenidos) {
       this.sede = sede;
       this.nombre = nombre;
       this.apellido = apellido;
       this.password = password;
       this.contenidos = contenidos;
    }
   
    public Integer getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getSede() {
        return this.sede;
    }
    
    public void setSede(String sede) {
        this.sede = sede;
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
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getContenidos() {
        return this.contenidos;
    }
    
    public void setContenidos(Set contenidos) {
        this.contenidos = contenidos;
    }




}

