package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

interface Theme {
    @get:Composable
    @get:ReadOnlyComposable
    val colors: AppColor

    @get:Composable
    @get:ReadOnlyComposable
    val typography: AppTyphography

    @get:Composable
    @get:ReadOnlyComposable
    val shapes: AppShape

    @get:Composable
    @get:ReadOnlyComposable
    val backgroundTheme: AppBackgroundTheme

    @get:Composable
    @get:ReadOnlyComposable
    val tint: AppIconTint
}

data object AppTheme : Theme {
    override val colors: AppColor
        @Composable
        @ReadOnlyComposable
        get() = LocalAppColors.current

    override val typography: AppTyphography
        @Composable
        @ReadOnlyComposable
        get() = LocalAppType.current

    override val shapes: AppShape
        @Composable
        @ReadOnlyComposable
    get() = LocalAppShapes.current

    override val backgroundTheme: AppBackgroundTheme
        @Composable
        @ReadOnlyComposable
        get() = LocalAppBackgroundTheme.current

    override val tint: AppIconTint
        @Composable
        @ReadOnlyComposable
        get() = LocalAppIconTint.current
}

val LocalAppColors = staticCompositionLocalOf {
    AppColor()
}

val LocalAppBackgroundTheme = staticCompositionLocalOf {
    AppBackgroundTheme()
}

val LocalAppIconTint = staticCompositionLocalOf {
    AppIconTint()
}

val LocalAppShapes = staticCompositionLocalOf {
    AppShape()
}

val LocalAppType = staticCompositionLocalOf {
    AppTyphography()
}

@Composable
fun AppTheme(
    isDarkMode: Boolean = isSystemInDarkTheme(),
    customProviders: Array<ProvidedValue<*>> = arrayOf(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (isDarkMode) darkThemeColors else lightThemeColors
    val typography = typography(robotoFontFamily())
    val backgroundTheme = AppBackgroundTheme(color = colorScheme.uiBackground)
    val iconTint = AppIconTint(
        main = if (isDarkMode) AppColor.gray.A10 else AppColor.red.A30,
        primary = colorScheme.iconPrimary,
        secondary = colorScheme.iconSecondary,
        disabled = colorScheme.iconDisabled
    )
    CompositionLocalProvider(
        LocalAppColors provides colorScheme,
        LocalAppType provides typography,
        LocalAppShapes provides AppShape(),
        LocalAppBackgroundTheme provides backgroundTheme,
        LocalAppIconTint provides iconTint,
        *customProviders
    ) {
        content()
    }
}

@Stable
@Composable
private fun typography(fontFamily: FontFamily): AppTyphography {
    return AppTyphography(
        title1 = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 34.sp,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.sp
        ),
        title2 = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 28.sp,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.sp
        ),
        title3 = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 22.sp,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.5.sp
        ),
        title4 = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 24.sp,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = 0.sp
        ),
        body1 = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 24.sp,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.5.sp
        ),
        body2 = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 21.sp,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.25.sp
        ),
        smallTitle1 = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 19.sp,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = 0.1.sp
        ),
        smallTitle2 = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 18.sp,
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = 0.2.sp
        ),
        smallTitle3 = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 16.sp,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = 0.2.sp
        ),
        caption = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 18.sp,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.4.sp
        ),
        tinyLabel = TextStyle(
            fontFamily = fontFamily,
            lineHeight = 14.sp,
            fontSize = 10.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = 0.2.sp
        ),
    )
}
private val lightThemeColors = AppColor(
    uiBackground = AppColor.gray.A10,
    uiBackground1 = AppColor.gray.A10,
    uiBackground2 = AppColor.gray.A10,
    uiBackground3 = AppColor.gray.A10,
    uiBackground4 = AppColor.gray.A10,
    uiBackground5 = AppColor.gray.A10,
    uiBackground6 = AppColor.overlay.light,
    btnBgIcon = AppColor.gray.A10,
    btnBgPrimary = AppColor.red.A30,
    btnBgSecondary = AppColor.gray.A10,
    btnBgOutlined = AppColor.gray.A50,
    btnBgOutlined1 = AppColor.blue.A30,
    alertError = AppColor.red.A30,
    alertSuccess = AppColor.green.A40,
    textError = AppColor.red.A30,
    textSuccess = AppColor.green.A40,
    textPrimary = AppColor.gray.A70,
    textSecondary = AppColor.gray.A60,
    textLink = AppColor.blue.A40,
    textDisabled = AppColor.gray.A20,
    textHelper = AppColor.gray.A30,
    iconPrimary = AppColor.gray.A70,
    iconSecondary = AppColor.gray.A60,
    iconDisabled = AppColor.gray.A20,
    tabBarActive = AppColor.gray.A70,
    tabBarInactive = AppColor.gray.A20,
    areaDisabled = AppColor.gray.A10,
    separator = AppColor.gray.A10,
    backgroundToast = AppColor.gray.A10,
    overlayBlocker = AppColor.overlay.light,
    border1 = AppColor.gray.A20,
    border2 = AppColor.gray.A60,
    interactive = AppColor.blue.A50,
    chipsActive = AppColor.gray.A60,
    chipsDefault = AppColor.gray.A10,
    textOnBackground = AppColor.gray.A10,
    indicator = AppColor.red.A30,
)

private val darkThemeColors = AppColor(
    uiBackground = AppColor.gray.A70,
    uiBackground1 = AppColor.gray.A60,
    uiBackground2 = AppColor.gray.A60,
    uiBackground3 = AppColor.gray.A60,
    uiBackground4 = AppColor.gray.A50,
    uiBackground5 = AppColor.gray.A60,
    uiBackground6 = AppColor.gray.A40,
    btnBgIcon = AppColor.gray.A60,
    btnBgPrimary = AppColor.red.A30,
    btnBgSecondary = AppColor.gray.A10,
    btnBgOutlined = AppColor.gray.A20,
    btnBgOutlined1 = AppColor.gray.A10,
    alertError = AppColor.red.A30,
    alertSuccess = AppColor.green.A40,
    textError = AppColor.red.A30,
    textSuccess = AppColor.green.A40,
    textPrimary = AppColor.gray.A10,
    textSecondary = AppColor.gray.A20,
    textLink = AppColor.blue.A30,
    textDisabled = AppColor.gray.A30,
    textHelper = AppColor.gray.A40,
    iconPrimary = AppColor.gray.A10,
    iconSecondary = AppColor.gray.A20,
    iconDisabled = AppColor.gray.A30,
    tabBarActive = AppColor.gray.A10,
    tabBarInactive = AppColor.gray.A30,
    areaDisabled = AppColor.gray.A60,
    separator = AppColor.gray.A50,
    backgroundToast = AppColor.gray.A60,
    overlayBlocker = AppColor.overlay.dark,
    border1 = AppColor.gray.A30,
    border2 = AppColor.gray.A10,
    interactive = AppColor.blue.A30,
    chipsActive = AppColor.gray.A10,
    chipsDefault = AppColor.gray.A40,
    textOnBackground = AppColor.gray.A10,
    indicator = AppColor.red.A30,
)
