package com.question1;

import java.util.Objects;

public class Song {
    private String movieName;
    private String songName;

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;
    }

    public Song() {

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(movieName, song.movieName) && Objects.equals(songName, song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, songName);
    }

    public void play(){
        System.out.println(this.songName+" of "+this.movieName+" is playing. . .!");
    }

}
