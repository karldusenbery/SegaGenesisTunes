package karl.dusenbery.segagenesistunes;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;



public class NowPlayingActivity extends AppCompatActivity {

    //test String
    private String theSong = "THE SONG";


    /** Drawable resource ID for the album art of the song currently playing */
    private int mCurrentImageResourceId;

    /** Track title for the song currently playing */
    private String mCurrentTrackTitle;

    /** Artist name for the song currently playing */
    private String mCurrentArtistName;

    /** Album name for the song currently playing*/
    private String mCurrentAlbumName;


    /**
     * Creates a new NowPlayingActivity object.
     *
     * @param imageResourceId is the album art drawable image of the song
     * @param trackTitle is the name of the song
     * @param artistName is the artist name for the song
     * @param albumName is the album name for the song
     */
    public void Song(int imageResourceId, String trackTitle, String artistName, String albumName) {
        mCurrentImageResourceId = imageResourceId;
        mCurrentTrackTitle = trackTitle;
        mCurrentArtistName = artistName;
        mCurrentAlbumName = albumName;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // Gets the String of the current song that was clicked on in the Playlist activity's ListView item and sets it to the String currentTrackTitle.

        //theSong = PlaylistActivity.getTrackTitle();
        Log.i("Info log",theSong );


        /*
        // Finds the TextView in the now_playing.xml layout with the ID tvSongTitle and sets it to a new TextView object trackTextView.
        TextView trackTextView = (TextView) findViewById(R.id.tvTrack);

        // Sets the current track member String variable Sting text on the trackTextView.
        trackTextView.setText(mCurrentTrackTitle);
        */




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
}
