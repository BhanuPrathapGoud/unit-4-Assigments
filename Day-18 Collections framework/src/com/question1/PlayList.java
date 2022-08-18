package com.question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PlayList {
    public List<Song>songs=new ArrayList<>();
    public HashSet<Song> songs1=new HashSet<>();

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
