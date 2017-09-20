package co.edu.uniminuto.arqSw.Modelo;
// Generated 20-sep-2017 0:59:45 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private String nombre;
     private String apellido;
     private String password;
     private String documento;
     private Date fechaIngreso;
     private String correo;
     private String referido;
     private int puntos;
     private Set clientePorContenidos = new HashSet(0);
     private Set clientePorValoracions = new HashSet(0);
     private Set transaccions = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String nombre, String apellido, String password, String documento, Date fechaIngreso, String correo, String referido, int puntos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.documento = documento;
        this.fechaIngreso = fechaIngreso;
        this.correo = correo;
        this.referido = referido;
        this.puntos = puntos;
    }
    public Cliente(String nombre, String apellido, String password, String documento, Date fechaIngreso, String correo, String referido, int puntos, Set clientePorContenidos, Set clientePorValoracions, Set transaccions) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.password = password;
       this.documento = documento;
       this.fechaIngreso = fechaIngreso;
       this.correo = correo;
       this.referido = referido;
       this.puntos = puntos;
       this.clientePorContenidos = clientePorContenidos;
       this.clientePorValoracions = clientePorValoracions;
       this.transaccions = transaccions;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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
    public String getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getReferido() {
        return this.referido;
    }
    
    public void setReferido(String referido) {
        this.referido = referido;
    }
    public int getPuntos() {
        return this.puntos;
    }
    
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public Set getClientePorContenidos() {
        return this.clientePorContenidos;
    }
    
    public void setClientePorContenidos(Set clientePorContenidos) {
        this.clientePorContenidos = clientePorContenidos;
    }
    public Set getClientePorValoracions() {
        return this.clientePorValoracions;
    }
    
    public void setClientePorValoracions(Set clientePorValoracions) {
        this.clientePorValoracions = clientePorValoracions;
    }
    public Set getTransaccions() {
        return this.transaccions;
    }
    
    public void setTransaccions(Set transaccions) {
        this.transaccions = transaccions;
    }




}

