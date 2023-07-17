package org.yzl3415.film;

public class MovieLibrary {
    private Movie[] movieList;
    private int capacity;
    private int movieCount;
    private String userName;
    private String password;
    private Movie[] favoriteMovies ;
    private Movie[] horrorMovies;
    private int horrorCount = 0;
    private Movie[] comedyMovies;
    private int comedyCount ;
    private Movie[] actionMovies;
    private int actionCount ;
    private Movie[] romanticMovies;
    private int romanticCount ;

    private int favoriteFilmCount;
     MovieLibrary(String userName, String password, int capacity) {
        this.userName = userName;
        this.password = password;
        this.capacity = capacity;
        movieList = new Movie[capacity];
        favoriteMovies = new Movie[capacity];
        movieCount = 0;
        favoriteFilmCount = 0;
        romanticMovies = new Movie[capacity];
        horrorMovies = new Movie[capacity];
        actionMovies = new Movie[capacity];
        comedyMovies = new Movie[capacity];
        horrorCount = 0;
        actionCount = 0;
        romanticCount = 0;
        comedyCount = 0;
    }


     void filmEkle(Movie movie) {
        if (movieCount < capacity) {
            movieList[movieCount] = movie;
            movieCount++;
            System.out.println(movie.getMovieName() + " has been added to the library.");
        } else {
            System.err.println("The capacity of library is full. The movie couldn't add movie.");
        }

    }

     void filmSil(String movieName) {
        for (int i = 0; i < movieCount; i++) {
            if (movieList[i].getMovieName() == movieName) {
                for (int j = i; j < movieCount - 1; j++) {
                    movieList[j] = movieList[j + 1];
                }
                movieList[movieCount - 1] = null;
                movieCount--;
                System.out.println(movieName + " was deleted from library.");
                return;
            }
        }
        System.out.println(movieName + " was not found in the library.");
    }

     void filmAra(String movieName) {
        for (int i = 0; i < movieCount; i++) {
            if (movieList[i].getMovieName().equals(movieName)) {
                System.out.println(movieName + " was found in the library.");
                return;
            }
        }
        System.out.println(movieName + " was not found in the library.");
    }
    void filmTypeAra(Movie movie) {
        boolean found = false;

        for (int i = 0; i < movieCount; i++) {
            if (romanticMovies[i] != null && romanticMovies[i].getMovieName().equals(movie.getMovieName())) {
                System.out.println(movie.getMovieName() + " was found in the romantic library.");
                found = true;

            } else if (horrorMovies[i] != null && horrorMovies[i].getMovieName().equals(movie.getMovieName())) {
                System.out.println(movie.getMovieName() + " was found in the horror library.");
                found = true;

            } else if (actionMovies[i] != null && actionMovies[i].getMovieName().equals(movie.getMovieName())) {
                System.out.println(movie.getMovieName() + " was found in the action library.");
                found = true;

            } else if (comedyMovies[i] != null && comedyMovies[i].getMovieName().equals(movie.getMovieName())) {
                System.out.println(movie.getMovieNameChar() + " was found in the comedy library.");
                found = true;

            }
        }

        if (!found) {
            System.out.println(movie.getMovieName() + " was found in the films library.");
        }
    }
     void filmAra(char movieFirstChar) {
        for (int i = 0; i < movieCount; i++) {
            if (movieList[i].getMovieNameChar() == movieFirstChar) {
                System.out.println(movieFirstChar + " was found in the library."); return;
            }
        }
        System.out.println(movieFirstChar + " was not found in the library.");
    }
     void favoriAdd(Movie movie){
        if(favoriteFilmCount < capacity){
            favoriteMovies[favoriteFilmCount] = movie;
            favoriteFilmCount++;
            System.out.println(movie.getMovieName() + " was added in the favorite");
        }else{
            System.out.println(" The favorite capacity is full..");
        }

    }

     Movie[] getActionMovies() {
        return actionMovies;
    }

     Movie[] getComedyMovies() {
        return comedyMovies;
    }

     Movie[] getHorrorMovies() {
        return horrorMovies;
    }

     Movie[] getFavoriteMovies() {
        return favoriteMovies;
    }

     Movie[] getMovieList() {
        return movieList;
    }

     Movie[] getRomanticMovies() {
        return romanticMovies;
    }



     void getList(Movie[] movieType) {
        System.out.print("[");
        for (int i = 0; i < capacity; i++){
            if(movieType[i] == null)break;
            else System.out.print(" " + movieType[i].getMovieName());
        }
        System.out.println(" ]");
    }


    void addHorrorFilms(Movie movie){

        if (horrorCount < capacity){
            horrorMovies[horrorCount] = movie;
            horrorCount++;
            System.out.println(movie.getMovieName()+ " has been added to the horror movie library");
        }else System.err.println("Sorry.The capacity is full");

    }
    void addRomanticFilms(Movie movie){
        if(romanticCount < capacity){
            romanticMovies[romanticCount] = movie;
            romanticCount++;
            System.out.println(movie.getMovieName() + " has been added to the romantic movie library" );
        }else System.err.println("Sorry.The capacity is full");

    }void addComedyFilms(Movie movie){
        if(comedyCount < capacity){
            comedyMovies[comedyCount] = movie;
            comedyCount++;
            System.out.println(movie.getMovieName() + " has been added to the comedy library");
        }else System.err.println("Sorry.The capacity is full");

    }void addActionFilms(Movie movie){
        if(actionCount < capacity){
            actionMovies[actionCount] = movie;
            actionCount++;
            System.out.println(movie.getMovieName() + " has been added to the library");
        }else System.err.println("Sorry.The capacity is full");

    }


}
