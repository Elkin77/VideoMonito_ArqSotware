package co.edu.uniminuto.arqSw.Modelo;
// Generated 20-sep-2017 0:59:45 by Hibernate Tools 4.3.1



/**
 * VideoPorIdioma generated by hbm2java
 */
public class VideoPorIdioma  implements java.io.Serializable {


     private VideoPorIdiomaId id;
     private Idioma idioma;
     private Video video;

    public VideoPorIdioma() {
    }

    public VideoPorIdioma(VideoPorIdiomaId id, Idioma idioma, Video video) {
       this.id = id;
       this.idioma = idioma;
       this.video = video;
    }
   
    public VideoPorIdiomaId getId() {
        return this.id;
    }
    
    public void setId(VideoPorIdiomaId id) {
        this.id = id;
    }
    public Idioma getIdioma() {
        return this.idioma;
    }
    
    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
    public Video getVideo() {
        return this.video;
    }
    
    public void setVideo(Video video) {
        this.video = video;
    }




}


