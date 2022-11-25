package modelo.dto;

public class SelecoesDTO {

    private int id_selecoes;
    private String selecoes;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override()
    public String toString() {
        return this.selecoes;
    }
    

    public int getId_selecoes() {
        return id_selecoes;
    }

    public void setId_selecoes(int id_selecoes) {
        this.id_selecoes = id_selecoes;
    }
   
    public String getSelecoes() {
        return selecoes;
    }

    public void setSelecoes(String selecoes) {
        this.selecoes = selecoes;
    }
    
    
}
