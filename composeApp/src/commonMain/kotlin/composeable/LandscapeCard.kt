package composeable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import composeable.text.TextBody1
import composeable.text.TextSmallTitle1
import composeable.text.TextTitle4
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun CardLandscapeHorizontal(
    modifier: Modifier = Modifier,
    belowContent: @Composable (CardLandscapeHorizontalScope.() -> Unit)? = null
) {
    Column(modifier = modifier.width(180.dp)) {
        ThumbnailImage()

        Spacer(modifier.height(8.dp))

        belowContent?.let { it(CardLandscapeHorizontalScope) }
    }
}

object CardLandscapeHorizontalScope {
    @Composable
    fun ContentTitleSubtitle(
        title: String,
        subtitle: String = "",
        modifier: Modifier = Modifier
    ) {
        Column(modifier = modifier) {
            TextTitle4(
                text = title,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            if (subtitle.isNotBlank()) {
                Spacer(modifier.height(6.dp))

                TextBody1(
                    text = "SPOTV",
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

object CardLandscapeHorizontalDefaults {
    
}

@Preview
@Composable
private fun Preview_LandscapeCard() {
    CardLandscapeHorizontal(
        belowContent = {
            ContentTitleSubtitle("Mixed Doubles: Tan Kian - Ki Juan vs Dan Corigo - Jorge Poshita", "SPOTV")
        }
    )
}
