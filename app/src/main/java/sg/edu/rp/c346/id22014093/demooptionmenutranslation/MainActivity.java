package sg.edu.rp.c346.id22014093.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvViewTranslatedText;
    TextView tvViewTranslatedText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvViewTranslatedText= findViewById(R.id.textViewTranslatedText);
        tvViewTranslatedText2= findViewById(R.id.textViewTranslatedText2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvViewTranslatedText.setText("Hello ");
            return true;
        } else if (id == R.id.italianSelection) {
            tvViewTranslatedText.setText("Ciao");
            return true;
        } else {
            tvViewTranslatedText.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }


}