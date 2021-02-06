
    import java.util.ArrayList;
import java.util.LinkedList;

    public class Album {
        private String name;
        private String artist;
        private ArrayList<Song> songs;

        public Album(String name, String artist) {
            this.name = name;
            this.artist = artist;
            songs = new ArrayList<Song>();
        }
        public boolean addSong(String title, double duration){
            if(findSong(title) == null){
                this.songs.add(new Song(title,duration));
                return true;
            }

            return false;
        }

        private Song findSong(String title) {
            for(Song eachSong : this.songs){
                if(eachSong.getTitle().equals(title)){
                    return eachSong;
                }
            }
            return null;
        }

        public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
            int index = trackNumber-1;
            if((index >= 0) && (index <= this.songs.size())){
                playList.add(this.songs.get(index));
                return  true;
            }
            System.out.println("This album does not have a track "+ trackNumber);
            return false;
        }
        public boolean addToPlayList(String title,LinkedList<Song> playList){
            Song searchedSong = findSong(title);
            if(searchedSong != null){
                playList.add(searchedSong);
                return true;
            }
            System.out.println("Song "+title +" is not in this album");
            return false;
        }






    }

