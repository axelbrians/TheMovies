package composeable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import theme.AppColor
import theme.AppTheme
import themovies.composeapp.generated.resources.Res
import themovies.composeapp.generated.resources.chelsea_vs_newcastle

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ThumbnailImage(
    modifier: Modifier = Modifier,
    bottomEnd: @Composable (ThumbnailImageScope.() -> Unit)? = null
) {
    Box(modifier = modifier.aspectRatio(ThumbnailImageDefaults.ImageAspectRatio)) {
        Image(
            painter = painterResource(Res.drawable.chelsea_vs_newcastle),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(RoundedCornerShape(12.dp)).fillMaxSize()
        )
        
        bottomEnd?.let {
            Box(Modifier.align(Alignment.BottomEnd).padding(end = 12.dp, bottom = 12.dp)) {
                it(ThumbnailImageScope)
            }
        }
    }
}

object ThumbnailImageDefaults {
    
    const val ImageAspectRatio = 16f / 9f

    val durationBadgeBackgroundModifier: Modifier
        @Composable
        @ReadOnlyComposable
        get() = Modifier
            .clip(AppTheme.shapes.rounded4)
            .background(AppTheme.backgroundTheme.color.copy(alpha = 0.6f))
            .padding(horizontal = 12.dp, vertical = 6.dp)
} 

object ThumbnailImageScope {
    
    @Composable
    fun DurationBadge(text: String, modifier: Modifier = Modifier) {
        Text(
            text = text,
            style = AppTheme.typography.body2,
            color = AppColor.neutral.white,
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