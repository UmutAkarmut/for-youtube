package org.yzl3415.film;

public class Movie {

        private String movieName;

        public Movie(String filmAdi)
        {
            this.movieName = filmAdi;
        }

        public String getMovieName() {
            return movieName;
        }
    public char getMovieNameChar() {
        return movieName.charAt(0);
    }

}
