package co.edu.uniminuto.arqSw.Modelo;
// Generated 20-sep-2017 0:59:45 by Hibernate Tools 4.3.1



/**
 * ClientePorValoracionId generated by hbm2java
 */
public class ClientePorValoracionId  implements java.io.Serializable {


     private int idCliente;
     private int idValoracion;

    public ClientePorValoracionId() {
    }

    public ClientePorValoracionId(int idCliente, int idValoracion) {
       this.idCliente = idCliente;
       this.idValoracion = idValoracion;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getIdValoracion() {
        return this.idValoracion;
    }
    
    public void setIdValoracion(int idValoracion) {
        this.idValoracion = idValoracion;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ClientePorValoracionId) ) return false;
		 ClientePorValoracionId castOther = ( ClientePorValoracionId ) other; 
         
		 return (this.getIdCliente()==castOther.getIdCliente())
 && (this.getIdValoracion()==castOther.getIdValoracion());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdCliente();
         result = 37 * result + this.getIdValoracion();
         return result;
   }   


}

