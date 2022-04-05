//21353123 Nicholas O'Mahony
public class playlistDriver{
    
    public static void main(String[] args) {
    
        PlayList list = new PlayList();

        System.out.println(list.getName());

        list = new PlayList("CS4141");

        System.out.println(list.getName());

        list.setName("bangers");

        list.add("Sultans of Swing", "Dire Straits");
        list.add("Dean Town", "Vulfpeck");
        list.add("Hématome", "L'Impératrice");
        list.showList();

        if(list.remove("Sultans of Swing")){
            System.out.println("Track does not contain duration, removed");
        }
        if(list.remove("Dean Town")){
            System.out.println("Track does not contain duration, removed");
        }
        if(list.remove("Hématome")){
            System.out.println("Track does not contain duration, removed");
        }

        list.add("Sultans Of Swing", "Dire Straits", 1978,(5*60) +59); 
        list.add("Dean Town", "Vulfpeck", 2016, (3*60)+33);
        list.add("Hématome", "L'Impératrice", 2021, (3*60)+39);

        System.out.println(list);
            System.out.println();

        list.playAll(false);
            System.out.println();

        list.playAll(true);
            System.out.println();

        list.playOnly("Dire Straits");
            System.out.println();

        list.playOnly("Vulfpeck");
            System.out.println();

        list.playOnly("The Beatles");
            System.out.println();

        list.playOnly(2021);
            System.out.println();

        list.playOnly(2003);
            System.out.println();
                Track track;
                track = new Track("Revolutions", "The Beetles", 1967,(3*60) + 24 );

                    System.out.println(track);

                if(track.getTitle().equals("Revolutions")){
                    track.setTitle("Revolution");
                }
                if(track.getArtist().equals("The Beetles")){
                    track.setArtist("The Beatles");
                }
                if(track.getYear() == 1967){
                    track.setYear(1968);
                }

                if(track.getDuration() == (3*60) + 24){
                    track.setDuration((3*60) + 26);
                }

                System.out.println(track);

                list.add(track);

        list.playOnly(1968);
    }
}
