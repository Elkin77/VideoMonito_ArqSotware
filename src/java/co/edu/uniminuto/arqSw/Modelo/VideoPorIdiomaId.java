package co.edu.uniminuto.arqSw.Modelo;
// Generated 20-sep-2017 0:59:45 by Hibernate Tools 4.3.1



/**
 * VideoPorIdiomaId generated by hbm2java
 */
public class VideoPorIdiomaId  implements java.io.Serializable {


     private int idVideo;
     private int idIdioma;

    public VideoPorIdiomaId() {
    }

    public VideoPorIdiomaId(int idVideo, int idIdioma) {
       this.idVideo = idVideo;
       this.idIdioma = idIdioma;
    }
   
    public int getIdVideo() {
        return this.idVideo;
    }
    
    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }
    public int getIdIdioma() {
        return this.idIdioma;
    }
    
    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VideoPorIdiomaId) ) return false;
		 VideoPorIdiomaId castOther = ( VideoPorIdiomaId ) other; 
         
		 return (this.getIdVideo()==castOther.getIdVideo())
 && (this.getIdIdioma()==castOther.getIdIdioma());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdVideo();
         result = 37 * result + this.getIdIdioma();
         return result;
   }   


}

