package day25_practices;

import java.time.LocalDate;

public class TestMovieObjects {
    public static void main(String[] args) {

        String gene = "Adventure, Comedy, Thriller";
        String title = "Java Developer: Zero to Hero";
        String[] casts = {"Ozzy", "Ali", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie movie1 = new Movie("USA", title, gene, LocalDate.of(2022, 4, 18), "Kuzzat Altay");
        movie1.addCasts(casts);

        System.out.println(movie1);



    }
}
