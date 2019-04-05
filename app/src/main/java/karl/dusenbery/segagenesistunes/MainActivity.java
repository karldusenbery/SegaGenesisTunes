package karl.dusenbery.segagenesistunes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mFileBrowserButton;
    private Button mNowPlayingButton;
    private Button mplaylistButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFileBrowserButton = (Button) findViewById(R.id.btnFileBrowser);
        mNowPlayingButton = (Button) findViewById(R.id.btnNowPlaying);
        mplaylistButton = (Button) findViewById(R.id.btnPlaylist);

        // Set a click listener for the File Browser button
        mFileBrowserButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the File Browser button is clicked on.
            @Override
            public void onClick(View view) {
                Intent fileBrowserIntent = new Intent(MainActivity.this, FileBrowserActivity.class);
                startActivity(fileBrowserIntent);
            }
        });

        // Set a click listener for the Now Playing button
        mNowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing button is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Set a click listener for the Playlist button
        mplaylistButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlist button is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}
