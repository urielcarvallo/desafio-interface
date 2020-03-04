package desafiopoo2;

public class VideoJuegos implements Entregable{
    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado;
    private String genero, compania;
    
    //Constructores
    public VideoJuegos(){
        
    }
    public VideoJuegos(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }
    public VideoJuegos(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo = titulo; this.horasEstimadas = horasEstimadas;
        this.genero = genero; this.compania = compania;
    }
    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }
    //Getters
    public String getTitulo() {
        return titulo;
    }
    public int getHorasEstimadas() {
        return horasEstimadas;
    }
    public String getGenero() {
        return genero;
    }
    public String getCompania() {
        return compania;
    }
    
    @Override
    public String toString(){
        return "Titulo: "+titulo+"\nHoras Estimadas: "+horasEstimadas+"\nGenero: "+genero+"\nCompania: "+compania;
    }
    //Metodos de Entregable
    @Override
    public void entregar() {
        entregado = true;
    }
    @Override
    public void devolver() {
        entregado = false;
    }
    @Override
    public boolean isEntregado() {
        return entregado;
    }
    @Override
    public int compareTo(Object a) {
        if (a instanceof VideoJuegos){
            if (this.horasEstimadas > ((VideoJuegos) a).getHorasEstimadas()){
                return this.horasEstimadas;
            }
            else{
                return ((VideoJuegos) a).getHorasEstimadas();
            }
        }
        return -1;
    }
}
