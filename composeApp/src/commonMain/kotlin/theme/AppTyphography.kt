package theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font
import themovies.composeapp.generated.resources.*
import themovies.composeapp.generated.resources.Res
import themovies.composeapp.generated.resources.roboto_black
import themovies.composeapp.generated.resources.roboto_light
import themovies.composeapp.generated.resources.roboto_medium

@OptIn(ExperimentalResourceApi::class)
@Stable
@Composable
internal fun robotoFontFamily(): FontFamily {
    return FontFamily(
        Font(resource = Res.font.roboto_black, weight = FontWeight.Black, style = FontStyle.Normal),
        Font(resource = Res.font.roboto_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
        Font(resource = Res.font.roboto_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
        Font(resource = Res.font.roboto_light, weight = FontWeight.Light, style = FontStyle.Normal),
        Font(resource = Res.font.roboto_medium, weight = FontWeight.Medium, style = FontStyle.Normal),
        Font(resource = Res.font.roboto_regular, weight = FontWeight.Normal, style = FontStyle.Normal),
        Font(resource = Res.font.roboto_thin, weight = FontWeight.Thin, style = FontStyle.Normal),
    )
}

@Stable
@Immutable
data class AppTyphography(
    val title1: TextStyle = TextStyle.Default,
    val title2: TextStyle = TextStyle.Default,
    val title3: TextStyle = TextStyle.Default,
    val title4: TextStyle = TextStyle.Default,
    val body1: TextStyle = TextStyle.Default,
    val body2: TextStyle = TextStyle.Default,
    val smallTitle1: TextStyle = TextStyle.Default,
    val smallTitle2: TextStyle = TextStyle.Default,
    val smallTitle3: TextStyle = TextStyle.Default,
    val caption: TextStyle = TextStyle.Default,
    val tinyLabel: TextStyle = TextStyle.Default,
)