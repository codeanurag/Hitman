package world.hit.com.hitman

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var _seekBar: SeekBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        _seekBar = findViewById(R.id.seekBar) as SeekBar

        setupUI()
    }

    private fun setupUI() {
        _seekBar!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {}

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                showToast(seekBar.progress.toString())
            }
        })
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, "Cursor at : " + msg, Toast.LENGTH_LONG).show()
    }
}
