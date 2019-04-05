package karl.dusenbery.segagenesistunes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link FileAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link File} objects.
 */
public class FileAdapter extends ArrayAdapter<File>  {

    /**
     * Create a new {@link FileAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param files is the list of {@link File}s to be displayed.
     */
    public FileAdapter(Context context, ArrayList<File> files) {
        super(context, 0, files);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checks if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.file_browser_item, parent, false);
        }

        // Gets the {@link File} object located at this position in the list
        File currentFile = getItem(position);

        // Finds the TextView in the file_browser_item.xml layout with the ID tvFileName and sets it to a new TextView object.
        TextView fileNameTextView = (TextView) listItemView.findViewById(R.id.tvFileName);
        // Gets the file name from the currentFile object and sets this text on the fileNameTextView.
        fileNameTextView.setText(currentFile.getFileName());

        // Finds the TextView in the file_browser_item.xml layout with the ID tvFileSize and sets it to a new TextView object.
        TextView fileSizeTextView = (TextView) listItemView.findViewById(R.id.tvFileSize);
        // Gets the file size String from the currentFile object and sets this text on the fileSizeTextView.
        fileSizeTextView.setText(currentFile.geFileSize());

        // Returns the whole list item layout (containing 2 TextViews) so that it can be shown in the ListView.
        return listItemView;
    }
}