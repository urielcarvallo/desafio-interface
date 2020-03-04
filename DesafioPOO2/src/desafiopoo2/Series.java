package desafiopoo2;

public class Series implements Entregable{
    private String titulo;
    private int numeroDeTemporadas = 3;
    private boolean entregado = false;
    private  String genero, creador;
    
    //Constructores
    public Series(){
        
    }
    public Series(String titulo, String creador){
        this.titulo = titulo; this.creador = creador;
    }
    public Series(String titulo, String creador, int numeroDeTemporadas, String genero){
        this.titulo = titulo;
        this.creador = creador;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
    }
    
    //Getters
    public String getTitulo() {
        return titulo;
    }
    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }
    public String getGenero() {
        return genero;
    }
    public String getCreador() {
        return creador;
    }
    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    
    //Metodo to string
    @Override
    public String toString(){
        return "Titulo: "+titulo+"\nNumero de Temporadas: "+numeroDeTemporadas+"\nGenero: "+genero+"\nCreador: "+creador;
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
        if (a instanceof Series){
            if (this.numeroDeTemporadas > ((Series) a).getNumeroDeTemporadas()){
                return this.numeroDeTemporadas;
            }
            else{
                return ((Series) a).getNumeroDeTemporadas();
            }
        }
        return -1;
    }
}