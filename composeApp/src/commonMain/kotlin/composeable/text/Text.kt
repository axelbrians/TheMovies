package composeable.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.graphics.Color
import theme.AppTheme

@Composable
fun TextTitle4(
    text: String,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
    ) {
    Text(
        text = text,
        style = AppTheme.typography.title4,
        maxLines = maxLines,
        overflow = overflow,
        modifier = modifier
    )
}

@Composable
fun TextSmallTitle1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = AppTheme.colors.textPrimary,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    Text(
        text = text,
        style = AppTheme.typography.smallTitle1,
        color = color,
        maxLines = maxLines,
        overflow = overflow,
        modifier = modifier
    )
}

@Composable
fun TextSmallTitle3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = AppTheme.colors.textPrimary,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    Text(
        text = text,
        style = AppTheme.typography.smallTitle3,
        color = color,
        maxLines = maxLines,
        overflow = overflow,
        modifier = modifier
    )
}

@Composable
fun TextBody1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = AppTheme.colors.textPrimary,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
) {
    Text(
        text = text,
        style = AppTheme.typography.body1,
        color = color,
        maxLines = maxLines,
        overflow = overflow,
        modifier = modifier
    )
}
