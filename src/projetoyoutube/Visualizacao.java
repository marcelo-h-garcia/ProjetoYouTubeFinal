package projetoyoutube;
public class Visualizacao {
    private Gafanhoto escpectador;
    private Video filme;

    public Visualizacao(Gafanhoto escpectador, Video filme) {
        this.escpectador = escpectador;
        this.filme = filme;
        this.escpectador.setTotAssistido(this.escpectador.getTotAssistido() +1);
        this.filme.setViews(this.filme.getViews() +1);
    }
    
    public void avaliar(){
       this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int tot =0;
        if (porc <=20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        }else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhoto getEscpectador() {
        return escpectador;
    }

    public void setEscpectador(Gafanhoto escpectador) {
        this.escpectador = escpectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualisacao{" + "escpectador=" + escpectador + ", filme=" + filme + '}';
    }
    
    
}
