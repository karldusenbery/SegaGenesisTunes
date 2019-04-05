
package karl.dusenbery.segagenesistunes;


/**
 * {@link File} represents a single file that contains the song the user wants to listen to.
 * It contains an add button, file name, and a file size.
 */
public class File {

    /** File name for the file */
    private String mFileName;

    /** File size name for the file */
    private String mFileSize;

    /**
     * Creates a new File object.
     *
     * @param fileName is the artist name for the song
     * @param fileSize is the album name for the song
     */
    public File (String fileName, String fileSize) {

        mFileName = fileName;
        mFileSize = fileSize;
    }

    /**
     * Gets the file name for the song.
     */
    public String getFileName() {
        return mFileName;
    }

    /**
     * Gets the file size for the song.
     */
    public String geFileSize() {
        return mFileSize;
    }
}