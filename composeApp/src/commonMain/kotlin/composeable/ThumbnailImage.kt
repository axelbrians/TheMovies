package composeable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.AppTheme
import themovies.composeapp.generated.resources.Res
import themovies.composeapp.generated.resources.chelsea_vs_newcastle

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ThumbnailImage(
    modifier: Modifier = Modifier,
    bottomEnd: @Composable (ThumbnailImageScope.() -> Unit)? = null
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(Res.drawable.chelsea_vs_newcastle),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(RoundedCornerShape(12.dp))
        )
        
        bottomEnd?.let {
            Box(Modifier.align(Alignment.BottomEnd)) {
                it(ThumbnailImageScope)
            }
        }
    }
}

object ThumbnailImageDefaults {
    
    val durationBadgeBackgroundModifier: Modifier
        @Composable
        @ReadOnlyComposable
        get() = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
            .background(AppTheme.backgroundTheme.color)
} 

object ThumbnailImageScope {
    
    @Composable
    fun DurationBadge(text: String, modifier: Modifier = Modifier) {
        Text(
            text = text,
            modifier = modifier
                .then(ThumbnailImageDefaults.durationBadgeBackgroundModifier)
        )
    }
}

@Preview
@Composable
private fun Preview_ThumbnailImage() {
    ThumbnailImage(
        bottomEnd = {
            DurationBadge(text = "10 : 34")
        }
    )
}