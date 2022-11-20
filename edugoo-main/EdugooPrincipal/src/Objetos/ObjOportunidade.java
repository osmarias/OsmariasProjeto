package Objetos;

public class ObjOportunidade {
    private int oportunidadeId;
    private String oportunidadeTitulo;
    private String oportunidadeAreaAtuacao;
    private String oportunidadeInfo;
    private String oportunidadeTipo;
    private int oportunidadeUsuarioId;

    public String getOportunidadeTipo() {
        return oportunidadeTipo;
    }

    public void setOportunidadeTipo(String oportunidadeTipo) {
        this.oportunidadeTipo = oportunidadeTipo;
    }
    
    public int getOportunidadeId() {
        return oportunidadeId;
    }

    public void setOportunidadeId(int oportunidadeId) {
        this.oportunidadeId = oportunidadeId;
    }

    public String getOportunidadeTitulo() {
        return oportunidadeTitulo;
    }

    public void setOportunidadeTitulo(String oportunidadeTitulo) {
        this.oportunidadeTitulo = oportunidadeTitulo;
    }

    public String getOportunidadeAreaAtuacao() {
        return oportunidadeAreaAtuacao;
    }

    public void setOportunidadeAreaAtuacao(String oportunidadeAreaAtuacao) {
        this.oportunidadeAreaAtuacao = oportunidadeAreaAtuacao;
    }

    public String getOportunidadeInfo() {
        return oportunidadeInfo;
    }

    public void setOportunidadeInfo(String oportunidadeInfo) {
        this.oportunidadeInfo = oportunidadeInfo;
    }

    public int getOportunidadeUsuarioId() {
        return oportunidadeUsuarioId;
    }

    public void setOportunidadeUsuarioId(int oportunidadeUsuarioId) {
        this.oportunidadeUsuarioId = oportunidadeUsuarioId;
    }

}
