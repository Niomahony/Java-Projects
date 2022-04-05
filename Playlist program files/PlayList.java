import java.util.ArrayList;
import java.util.Arrays;

//21353123 Nicholas O'Mahony

public class PlayList {

    String name;
    ArrayList<Track> tracks;

    public PlayList(){
        this.name = "My PlayList";
        this.tracks = new ArrayList<>();
    }

    public PlayList(String playListName){
        this.name = playListName;
        this.tracks = new ArrayList<>();
    }

    public String toString(){
        ArrayList<String> result = new ArrayList<>();

        for (Track track : this.tracks){
            result.add(track.toString());
        }
        return result.toString();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void add(String title, String artist){
        this.tracks.add(new Track(title, artist));
    }

    public void add(String title, String artist, int year, int duration){
        this.tracks.add(new Track(title, artist,year, duration));
    }

    public void add(Track t){
        this.tracks.add(t);
    }

    public boolean remove(String title){
        boolean result = false;

        for(int i=this.tracks.size()-1; i>= 0; i--){
            Track track = this.tracks.get(i);

            if(track.getTitle().equalsIgnoreCase(title)){
                tracks.remove(i);
                result = true;
            }
        }
        return result;
    }


    public void showList(){
        if(this.tracks.size() == 0){
            System.out.println("The list is empty");
        }

        for(Track track : this.tracks){
            System.out.println(track);
        }
    }

    public void playAll(boolean random){
        int size = this.tracks.size();

        int[] order = new int[size];

        if(!random){
            for(int i=0;i < size;i++){
                order[i] = i;
            }
        } else{
            
            int[] temp = new int[size];

            int full = 0;
            while (full < size){
                int position = (int)(Math.random() * size);

                if(temp[position] == 0){
                    
                    order[full] = position;

                    temp[position] = 1;

                    full += 1;
                }
            }
        }

        playTracks(order);
    }

    public void playOnly(String artist){
        int size = this.tracks.size();
        int[] order = new int[size];

        int full = 0;
        for(int i=0;i < size;i++){
            Track track = this.tracks.get(i);

            if(track.getArtist().toLowerCase().contains(artist.toLowerCase())){
                order[full] = i;
                full += 1;
            }
        }

        if(full < size){
            order = Arrays.copyOf(order, full);
        }

        playTracks(order);
    }
    public void playOnly(int year){
        int size = this.tracks.size();
        int[] order = new int[size];

        int full = 0;
        for(int i=0;i < size;i++){
            Track track = this.tracks.get(i);

            if(track.getYear() == year){
                order[full] = i;
                full += 1;
            }
        }

        if(full < size){
            order = Arrays.copyOf(order, full);
        }

        playTracks(order);
    }

    private void playTracks (int[] order){
        for(int index: order){
            System.out.println(this.tracks.get(index));
        }
    }
}
