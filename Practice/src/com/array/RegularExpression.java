package com.array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class RegularExpression {
//    public static void main(String[] args) {
////        int count = 0;
////        Pattern p = Pattern.compile("a");
////        Matcher m = p.matcher("abbbabbaba");
////        while (m.find()) {
////            count++;
////            System.out.println(m.start() + "------" + m.end() + "------" + m.group());
////        }
////        System.out.println("The no of occurences:" + count);
////        System.out.println(Pattern.matches("[A-Za-z]{3,8}", "bkkjkjkjkju"));//true
//
//    }
//}



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

class Song{
    private String movieName;
    private String songName;

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;
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

class PlayList{

    public List<Song>songs=new ArrayList<>();
    public HashSet<Song>songs1=new HashSet<>();

    public void addSong(Song song){
        if(songs1.contains(song)){
            System.out.println("Song is already added in the playlist");

        }else{
            songs1.add(song);
            songs.add(song);
            System.out.println("Song added to the playlist successfully.");
        }

    }
}
public class  RegularExpression{
    public static void main(String[] args) {
        Song s1=new Song("a","a");
        Song s2=new Song("a","a");
        Song s3=new Song("b","b");
        Song s4=new Song("c","c");
        PlayList p=new PlayList();
        p.addSong(s1);
        p.addSong(s2);
        p.addSong(s3);
        p.addSong(s4);

        for(Song song: p.songs){
            song.play();
        }

    }
}
