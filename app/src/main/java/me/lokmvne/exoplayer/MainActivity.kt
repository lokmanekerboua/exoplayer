package me.lokmvne.exoplayer

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import dagger.hilt.android.AndroidEntryPoint
import me.lokmvne.exoplayer.ui.theme.ExoplayerTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContent {
            ExoplayerTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                ) {
                    ExoPlayerScreen()
                }
            }
        }
    }
}