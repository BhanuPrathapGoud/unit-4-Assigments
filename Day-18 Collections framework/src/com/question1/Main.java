package com.question1;

public class Main {
        public static void main(String[] args) {
            Song s1=new Song("KGF","amma");
            Song s2=new Song("KGF","amma");
            Song s3=new Song("RRR","Komma");
            Song s4=new Song("pushpa","uuantava");
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
