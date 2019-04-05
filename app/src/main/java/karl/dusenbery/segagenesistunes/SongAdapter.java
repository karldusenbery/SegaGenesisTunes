package karl.dusenbery.segagenesistunes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song>  {

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checks if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.playlist_item, parent, false);
        }

        // Gets the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);


        // Finds the ImageView in the playlist_item.xml.xml layout with the ID ivSmallAlbumArt and sets it to a new ImageView object.
        ImageView trackImageView = (ImageView) listItemView.findViewById(R.id.ivSmallAlbumArt);
        // Gets the album art image asset from the currentSong object and sets this image resrource on the trackImageView.
        trackImageView.setImageResource(currentSong.getImageResourceId());


        // Finds the TextView in the playlist_item.xml layout with the ID tvTrack and sets it to a new TextView object.
        TextView trackTextView = (TextView) listItemView.findViewById(R.id.tvTrack);
        // Gets the track title from the currentSong object and sets this text on the trackTextView.
        trackTextView.setText(currentSong.getTrackTitle());


        // Finds the TextView in the playlist_item.xml layout with the ID tvArtist and sets it to a new TextView object.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.tvArtist);
        // Gets the artist name from the currentSong object and sets this text on the artistTextView.
        artistTextView.setText(currentSong.getArtistName());


        // Finds the TextView in the playlist_item.xml layout with the ID tvAlbum and sets it to a new TextView object.
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.tvAlbum);
        // Gets the album name from the currentSong object and sets this text on the albumTextView.
        albumTextView.setText(currentSong.getAlbumName());


        // Returns the whole list item layout (containing 1 ImageView, and 3 TextViews) so that it can be shown in the ListView.
        return listItemView;
    }
}