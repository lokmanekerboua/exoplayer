package me.lokmvne.exoplayer

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import dagger.hilt.android.AndroidEntryPoint
import me.lokmvne.exoplayer.presentation.ExoPlayerScreen
import me.lokmvne.exoplayer.ui.theme.ExoplayerTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContent {
            val windowsizeClass = calculateWindowSizeClass(activity = this)
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