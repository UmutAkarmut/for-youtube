package org.yzl3415.film;

public class Driver {
    public static void main(String[] args) {
        MovieLibrary filmKutuphanesi = new MovieLibrary("umut","015umut",10);

        Movie film = new Movie("Presion Break");
        filmKutuphanesi.filmEkle(film);
        filmKutuphanesi.favoriAdd(film);
        Movie film1 = new Movie("Friends");
        Movie film2 = new Movie("The walking Dead");
        Movie film3 = new Movie("Narcos");
        Movie film4 = new Movie("La casa De Papel");
        filmKutuphanesi.favoriAdd(film4);
        filmKutuphanesi.favoriAdd(film3);











    }

}
