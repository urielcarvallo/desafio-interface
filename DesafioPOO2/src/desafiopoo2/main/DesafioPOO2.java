package desafiopoo2.main;
import desafiopoo2.Series;
import desafiopoo2.VideoJuegos;

public class DesafioPOO2 {

    public static void main(String[] args) {
        // Ejerexicio de POO en donde "alquilo" y "devuelvo" series o videojuegos
        Series seriesVec [] = new Series[5];
        VideoJuegos videoJuegosVec [] = new VideoJuegos[5];
        int contSeries=0, contVideoJuegos=0;
        
        seriesVec [0] = new Series ("GoT", "G.R.R Martin", 8, "Aventura-Guerra");
        seriesVec [1] = new Series ("Dragon Ball Z", "Akira Toriyama",4,"Anime-Acción");
        seriesVec [2] = new Series ("Gotham", "DC Comics");
        seriesVec [3] = new Series ("Breaking Bad","VInce Gilligan",6,"Drama-Policial");
        seriesVec [4] = new Series ();
        
        videoJuegosVec[0] = new VideoJuegos("The Witcher 3 - the wild hunt",65, "Mundo Abierto", "CD Projekt");
        videoJuegosVec[1] = new VideoJuegos("Batman - Arkham Asylum", 20);
        videoJuegosVec[2] = new VideoJuegos("The Witcher 2",30, "Aventura", "CD Projekt");
        videoJuegosVec[3] = new VideoJuegos("Counter Strike",0);
        videoJuegosVec[4] = new VideoJuegos("Fornite",0);

        seriesVec[0].entregar();
        seriesVec[3].entregar();
        videoJuegosVec[2].entregar();
        videoJuegosVec[1].entregar();

         for (int i = 0 ; i<seriesVec.length ; i++){
             if (seriesVec[i].isEntregado()){
                 contSeries++;
             }else if (videoJuegosVec[i].isEntregado()){
                 contVideoJuegos++;
             }
         }
        
        System.out.println("Series entregadas: "+contSeries);
        System.out.println("Juegos entregados: "+contVideoJuegos);
        System.out.println("Series y juegos devueltos.");
        videoJuegosVec[2].devolver();
        videoJuegosVec[1].devolver();
        seriesVec[0].devolver();
        seriesVec[3].devolver();
        
        //Asigno en estas variables la primer comparacion para poder comparar luego con los otros
        //sin perder la informacion
        int maxHorasJuegos = videoJuegosVec[0].compareTo(videoJuegosVec[0]) ;
        int maxTempSeries = seriesVec[0].compareTo(seriesVec[0]) ;
        
        for (int i = 1 ; i < seriesVec.length-1 ; i++){
            if (maxHorasJuegos < videoJuegosVec[i].compareTo(videoJuegosVec[i+1])){
                maxHorasJuegos = videoJuegosVec[i].compareTo(videoJuegosVec[i+1]);
            }
            if (maxTempSeries < seriesVec[i].compareTo(seriesVec[i+1])){
                maxTempSeries = seriesVec[i].compareTo(seriesVec[i+1]);
            }
        }
        System.out.println("Horas de juego max: "+maxHorasJuegos);
        System.out.println("Temp max: "+maxTempSeries);
        System.out.println("Los juegos y Series con mas tiempo son: ");
        for (int i=0 ; i< seriesVec.length ; i++){
            if (maxHorasJuegos == videoJuegosVec[i].getHorasEstimadas()){
                System.out.println(videoJuegosVec[i]);
                System.out.println("");
            }
            if (maxTempSeries == seriesVec[i].getNumeroDeTemporadas()){
                System.out.println(seriesVec[i]);
                System.out.println("");
            }
        }
    }

}