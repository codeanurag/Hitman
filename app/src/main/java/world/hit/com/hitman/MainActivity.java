package world.hit.com.hitman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar _seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _seekBar = (SeekBar) findViewById(R.id.seekBar);

        setupUI();
    }

    private void setupUI(){
        _seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                showToast(String.valueOf(seekBar.getProgress()));
            }
        });
    }

    private void showToast(String msg){
        Toast.makeText(this,"Cursor at : "+msg,Toast.LENGTH_LONG).show();
    }
}
