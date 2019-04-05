package karl.dusenbery.segagenesistunes;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class FileBrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.file_browser);





        // Create a list of File objects for the Sonic The Hedgehog 2 game soundtrack album and add them to an ArrayList
        ArrayList<File> sonicTheHedgehog2SoundtrackFiles = new ArrayList<File>();
        sonicTheHedgehog2SoundtrackFiles.add(new File("01 - Opening Theme MP3", "1,352 KB"));
        sonicTheHedgehog2SoundtrackFiles.add(new File("02 - Options MP3.mp3", "1,578 KB"));
        sonicTheHedgehog2SoundtrackFiles.add(new File("03 - Emerald Hill Zone MP3.mp3", "3,332 KB"));
        sonicTheHedgehog2SoundtrackFiles.add(new File("04 - Chemical Plant Zone MP3.mp3", "3,886 KB"));
        sonicTheHedgehog2SoundtrackFiles.add(new File("05 - Aquatic Ruin Zone MP3.mp3", "3,026 KB"));
        sonicTheHedgehog2SoundtrackFiles.add(new File("06 - Casino Night Zone MP3.mp3", "3,790 KB"));
        sonicTheHedgehog2SoundtrackFiles.add(new File("07 - Hill Top Zone MP3.mp3", "3,354 KB"));
        sonicTheHedgehog2SoundtrackFiles.add(new File("08 - Mystic Cave Zone MP3.mp3", "3,943 KB"));
        sonicTheHedgehog2SoundtrackFiles.add(new File("09 - Oil Ocean Zone MP3", "3,627 KB"));
        sonicTheHedgehog2SoundtrackFiles.add(new File("10 - Metropolis Zone MP3", "3,446 KB"));

        // Create an {@link FileAdapter}, whose data source is a list of {@link Files}s.
        // The adapter knows how to create list items for each item in the list.
        FileAdapter fileAdapter = new FileAdapter(this, sonicTheHedgehog2SoundtrackFiles);

        // Find the {@link ListView} object in the view hierarchy of the {@link FileBrowserActivity}.
        // There should be a {@link ListView} with the view ID called fileList, which is declared in the file_browser.xml layout file.
        ListView listView = (ListView) findViewById(R.id.fileList);

        // Make the {@link ListView} use the {@link FileAdapter} we created above, so that the {@link ListView} will display list items for each {@link File} in the list.
        listView.setAdapter(fileAdapter);
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