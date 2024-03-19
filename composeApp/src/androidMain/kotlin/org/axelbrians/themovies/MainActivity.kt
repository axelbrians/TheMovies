package org.axelbrians.themovies

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import composeable.CardLandscapeHorizontal
import theme.AppThemeScaffold

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Box(modifier = Modifier.fillMaxSize()) {
                App()
                AppThemeScaffold {
                    CardLandscapeHorizontal(
                        modifier = Modifier.align(Alignment.BottomCenter)
                    ) {
                        this.ContentTitleSubtitle(
                            title = "Mixed Doubles: Tan Kian",
                            subtitle = "SPOTV"
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}