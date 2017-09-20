package co.edu.uniminuto.arqSw.Modelo;
// Generated 20-sep-2017 0:59:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * MedioPago generated by hbm2java
 */
public class MedioPago  implements java.io.Serializable {


     private Integer idMedioPago;
     private String nombre;
     private String tipo;
     private int numCuenta;
     private String password;
     private String cvr;
     private String yearVencimiento;
     private Set transaccions = new HashSet(0);

    public MedioPago() {
    }

	
    public MedioPago(String nombre, String tipo, int numCuenta, String password, String cvr, String yearVencimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numCuenta = numCuenta;
        this.password = password;
        this.cvr = cvr;
        this.yearVencimiento = yearVencimiento;
    }
    public MedioPago(String nombre, String tipo, int numCuenta, String password, String cvr, String yearVencimiento, Set transaccions) {
       this.nombre = nombre;
       this.tipo = tipo;
       this.numCuenta = numCuenta;
       this.password = password;
       this.cvr = cvr;
       this.yearVencimiento = yearVencimiento;
       this.transaccions = transaccions;
    }
   
    public Integer getIdMedioPago() {
        return this.idMedioPago;
    }
    
    public void setIdMedioPago(Integer idMedioPago) {
        this.idMedioPago = idMedioPago;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getNumCuenta() {
        return this.numCuenta;
    }
    
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCvr() {
        return this.cvr;
    }
    
    public void setCvr(String cvr) {
        this.cvr = cvr;
    }
    public String getYearVencimiento() {
        return this.yearVencimiento;
    }
    
    public void setYearVencimiento(String yearVencimiento) {
        this.yearVencimiento = yearVencimiento;
    }
    public Set getTransaccions() {
        return this.transaccions;
    }
    
    public void setTransaccions(Set transaccions) {
        this.transaccions = transaccions;
    }




}

