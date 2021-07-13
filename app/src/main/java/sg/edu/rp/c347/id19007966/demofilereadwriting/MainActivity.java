package sg.edu.rp.c347.id19007966.demofilereadwriting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.FileObserver;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button writeButton, readButton;
    TextView statusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        writeButton = findViewById(R.id.writeButton);
        readButton = findViewById(R.id.readButton);
        statusTextView = findViewById(R.id.textView);

        String folderLocation = getFilesDir().getAbsolutePath() + "/MyFolder";

        File folder = new File(folderLocation);
        if (folder.exists() == false) {
            boolean result = folder.mkdir();
            if (result) {
                Log.d("File read/write", "Folder Created");
            }
        }
    }
}