package Section_9.Exercises.Ex48_Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkSong = this.songs.findSong(trackNumber);
        if (checkSong != null){
            playList.add(checkSong);
            return true;
        }
            return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song songToAdd = songs.findSong(title);
        if (songToAdd == null) {
            return false;
        }
        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if (playListIterator.next().getTitle().compareTo(songToAdd.getTitle()) == 0) {
                return false;
            }
        }
        playList.add(songToAdd);
        return true;
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            if (!songs.isEmpty()) {
                for (Song s : songs) {
                    if (s.getTitle().equals(title)) {
                        return s;
                    }
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index > 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}

