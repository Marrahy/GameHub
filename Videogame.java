//Albert Lozano y Sergi Marrahy 
//1 DAM - Programación

import java.util.Arrays;

//Class done by Albert
public class Videogame {

    //Enums

    //Enum Platform: Each possible platform for a videogame
    public enum Platform {
        PLAYSTATION, XBOX, NINTENDO, PC, SMARTPHONE
    }

    //Enum Genre: Various possible genres for a videogame
    public enum Genre {
        ACTION, ADVENTURE, ROLEPLAYING, STRATEGY, SIMULATION, PUZZLE, SHOOTER, OTHER 
    }
    
    //Class attributes
    private int maxPlatforms = 5;
    private int maxGenres = 8;
    private String name;
    private Platform[] platforms = new Platform[maxPlatforms];
    private Genre[] genres = new Genre[maxGenres];
    private String releaseDate;

    //----------------------------------------------------------------------

    //Constructors

    //Empty constructor
    public Videogame() {

    }

    //Full constructor
    public Videogame(String name, Platform[] platforms, Genre[] genres, String releaseDate) {
        setName(name);
        setPlatforms(platforms);
        setGenres(genres);
        setReleaseDate(releaseDate);
    }

    //----------------------------------------------------------------------

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPlatforms(Platform[] platforms) {
        this.platforms = platforms;
    }
    public void setGenres(Genre[] genres) {
        this.genres = genres;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    //Getters
    public String getName() {
        return name;
    }
    public Platform[] getPlatforms() {
        return platforms;
    }
    public Genre[] getGenres() {
        return genres;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    
    //----------------------------------------------------------------------

    //Functions

    //Function to show videogame data
    public void showVideogame() {
        System.out.println();
        System.out.println("Nombre: " + getName());
        System.out.println("Plataforma(s): " + Arrays.toString(getPlatforms()));
        System.out.println("Género: " + Arrays.toString(getGenres()));
        System.out.println("Fecha de lanzamiento: " + getReleaseDate());
    }

    //Booleans to do simple checks on the object (help other methods and more legible)

    //Returns true if a String is contained in the videogame's name (ignoring case)
    public boolean isName(String name) {
        return getName().equalsIgnoreCase(name);
    }

    //Returns true if a Genre is the same as (at least one of) the videogame's genres
    public boolean isGenre(Genre genre) {
        for (int i = 0; i < genres.length; i++) {
            if (genre == genres[i]) {
                return true;
            }
        }
        return false;
    }

    //Returns true if a Platform is the same as (at least one of) the videogame's platforms
    public boolean isPlatform(Platform platform) {
        for (int i = 0; i < platforms.length; i++) {
            if (platform == platforms[i]) {
                return true;
            }
        }
        return false;
    }

    //Returns true if a String is contained within the videogame's release date
    public boolean isReleaseDate(String releaseDate) {
        return this.releaseDate.contains(releaseDate);
    }

}
