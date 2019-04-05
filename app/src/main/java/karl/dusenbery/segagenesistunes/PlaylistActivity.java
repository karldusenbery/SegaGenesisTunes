package karl.dusenbery.segagenesistunes;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class PlaylistActivity extends AppCompatActivity {

    /** Drawable resource ID for the album art of the song that was clicked on in the ListView from the adapter */
    private int mClickedOnImageResourceId;

    /** Track title for the song that was clicked on in the ListView from the adapter */
    private String mClickedOnTrackTitle;

    /** Artist name for the song that was clicked on in the ListView from the adapter */
    private String mClickedOnArtistName;

    /** Album name for the song that was clicked on in the ListView from the adapter */
    private String mClickedOnAlbumName;


    /**
     * Creates a new PlaylistActivity object.
     *
     * @param imageResourceId is the album art drawable image of the song
     * @param trackTitle is the name of the song
     * @param artistName is the artist name for the song
     * @param albumName is the album name for the song
     */
    public void PlaylistActivity(int imageResourceId, String trackTitle, String artistName, String albumName) {
        mClickedOnImageResourceId = imageResourceId;
        mClickedOnTrackTitle = trackTitle;
        mClickedOnArtistName = artistName;
        mClickedOnAlbumName = albumName;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        //final String clickedOnTrackTitle;

        // Create a list of Song objects for the Sonic The Hedgehog 2 game soundtrack album and add them to an ArrayList
        ArrayList<Song> sonicTheHedgehog2Songs = new ArrayList<Song>();
        sonicTheHedgehog2Songs.add(new Song(R.drawable.sonic_2_soundtrack_album_art, "Emerald Hill Zone", "Masato Nakamura", "Sonic the Hedgehog 2 OST"));
        sonicTheHedgehog2Songs.add(new Song(R.drawable.sonic_2_soundtrack_album_art, "Chemical Plant Zone", "Masato Nakamura", "Sonic the Hedgehog 2 OST"));
        sonicTheHedgehog2Songs.add(new Song(R.drawable.sonic_2_soundtrack_album_art, "Aquatic Ruin Zone", "Masato Nakamura", "Sonic the Hedgehog 2 OST"));
        sonicTheHedgehog2Songs.add(new Song(R.drawable.sonic_2_soundtrack_album_art, "Casino Night Zone", "Masato Nakamura", "Sonic the Hedgehog 2 OST"));
        sonicTheHedgehog2Songs.add(new Song(R.drawable.sonic_2_soundtrack_album_art, "Hill Top Zone", "Masato Nakamura", "Sonic the Hedgehog 2 OST"));

        // Create a list of Song objects for the Steets of Rage 2 game soundtrack album and add them to an ArrayList
        /*
        ArrayList<Song> streetsOfRage2Songs = new ArrayList<Song>();
        streetsOfRage2Songs.add(new Song(R.drawable.streets_of_rage_2_soundtrack_cover, "Go Straight", "Yuzo Koshiro", "Streets of Rage 2 OST"));
        streetsOfRage2Songs.add(new Song(R.drawable.streets_of_rage_2_soundtrack_cover, "In the Bar", "Yuzo Koshiro", "Streets of Rage 2 OST"));
        streetsOfRage2Songs.add(new Song(R.drawable.streets_of_rage_2_soundtrack_cover, "Never Return Alive", "Yuzo Koshiro", "Streets of Rage 2 OST"));
        streetsOfRage2Songs.add(new Song(R.drawable.streets_of_rage_2_soundtrack_cover, "Spin on the Bridge", "Yuzo Koshiro", "Streets of Rage 2 OST"));
        streetsOfRage2Songs.add(new Song(R.drawable.streets_of_rage_2_soundtrack_cover, "Ready Funk", "Yuzo Koshiro", "Streets of Rage 2 OST"));
        */


        // Create an ArrayList of Song objects that have been added to the playlist from the File Browser activity's list item's add button
        ArrayList<Song> addedToPlaylistSongs = new ArrayList<Song>();


        /*
        // Create an {@link SongAdapter}, whose data source is the ArrayList of {@link Song}s that were requested to be added from the File Browser activity.
        // The adapter knows how to create list items for each item in the list.
        SongAdapter playlistSongsAdapter = new SongAdapter(this, addedToPlaylistSongs);
        */



        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s.
        // The adapter knows how to create list items for each item in the list.
        final SongAdapter songAdapter = new SongAdapter(this, sonicTheHedgehog2Songs);


        // Find the {@link ListView} object in the view hierarchy of the {@link PlaylistActivity}.
        // There should be a {@link ListView} with the view ID called playlist, which is declared in the playlist.xml layout file.
        ListView listView = (ListView) findViewById(R.id.playlist);


        /*
        // Make the {@link ListView} use the {@link SongAdapter} playlistSongsAdapter that we created above, so that the {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(songAdapter);
        */


        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(songAdapter);


        //set an OnItemClickedListener for when the user clicks an item in the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Get the song name String from the list item that was clicked
                Song song = songAdapter.getItem(i);

                //Show a Toast saying that the song is now playing
                Toast.makeText(getApplicationContext(), song.getTrackTitle() + " is playing", Toast.LENGTH_LONG).show();

                //Set the member variable of this Class to the info from the currently clicked on Song object
                //clickedOnTrackTitle = song.getTrackTitle();
            }
        });


    }

    //Provides a way for the user to navigate back to the Main Activity
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Gets the image resource ID for the last clicked on song's album art
     */
    public int getImageResourceId() {
        return mClickedOnImageResourceId;
    }

    /**
     * Gets the track title (song name) for the song that was clicked on last.
     */
    public String getTrackTitle() {
        return mClickedOnTrackTitle;
    }

    /**
     * Gets the artist name for the song that was clicked on last.
     */
    public String getArtistName() {
        return mClickedOnArtistName;
    }

    /**
     * Gets the artist name for the song that was clicked on last.
     */
    public String getAlbumName() {
        return mClickedOnAlbumName;
    }
}