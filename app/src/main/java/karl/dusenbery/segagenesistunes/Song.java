
package karl.dusenbery.segagenesistunes;

/**
 * {@link Song} represents a single song that the user wants to listen to.
 * It contains a track title, artist name, and a album name for the song.
 */
public class Song {

    /** Drawable resource ID for the album art of the song */
    private int mImageResourceId;

    /** Track title for the song */
    private String mTrackTitle;

    /** Artist name for the song */
    private String mArtistName;

    /** Album name for the song */
    private String mAlbumName;

    /**
     * Creates a new Song object.
     *
     * @param imageResourceId is the album art drawable image of the song
     * @param trackTitle is the name of the song
     * @param artistName is the artist name for the song
     * @param albumName is the album name for the song
     */
    public Song(int imageResourceId, String trackTitle, String artistName, String albumName) {
        mImageResourceId = imageResourceId;
        mTrackTitle = trackTitle;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    /**
     * Gets the image resource ID for the song's album art
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Gets the track title (song name) for the song.
     */
    public String getTrackTitle() {
        return mTrackTitle;
    }

    /**
     * Gets the artist name for the song.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Gets the artist name for the song.
     */
    public String getAlbumName() {
        return mAlbumName;
    }
}