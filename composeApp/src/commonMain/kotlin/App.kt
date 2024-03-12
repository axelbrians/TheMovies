import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import composeable.CardLandscapeHorizontal
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.AppTheme
import theme.AppThemeScaffold
import themovies.composeapp.generated.resources.Res
import themovies.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    val isInDarkMode = remember { mutableStateOf(true) }

    AppThemeScaffold(isDarkMode = isInDarkMode.value) {
        val showContent = remember { mutableStateOf(false) }
        Scaffold(
            backgroundColor = AppTheme.backgroundTheme.color,
            contentColor = AppTheme.colors.textPrimary
        ) {
            Button(onClick = { isInDarkMode.value = !isInDarkMode.value}) {
                Text(text = "App Theme")
            }
            HomeScreen(
                showContent = showContent,
                onClick = { showContent.value = !showContent.value },
                modifier = Modifier.padding(it)
            )
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomeScreen(
    showContent: State<Boolean>,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = onClick) {
            Text("Click me!")
        }
        AnimatedVisibility(showContent.value) {
            val greeting = remember { Greeting().greet() }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(resource = Res.drawable.compose_multiplatform),
                    contentDescription = null
                )
                Text("Compose: $greeting")
            }
        }
    }
}
