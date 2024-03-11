package theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Stable
@Immutable
data class AppColor(
    val uiBackground: Color = Color.Unspecified,
    val uiBackground1: Color = Color.Unspecified,
    val uiBackground2: Color = Color.Unspecified,
    val uiBackground3: Color = Color.Unspecified,
    val uiBackground4: Color = Color.Unspecified,
    val uiBackground5: Color = Color.Unspecified,
    val uiBackground6: Color = Color.Unspecified,
    val btnBgIcon: Color = Color.Unspecified,
    val btnBgPrimary: Color = Color.Unspecified,
    val btnBgSecondary: Color = Color.Unspecified,
    val btnBgOutlined: Color = Color.Unspecified,
    val btnBgOutlined1: Color = Color.Unspecified,
    val alertError: Color = Color.Unspecified,
    val alertSuccess: Color = Color.Unspecified,
    val textError: Color = Color.Unspecified,
    val textSuccess: Color = Color.Unspecified,
    val textPrimary: Color = Color.Unspecified,
    val textSecondary: Color = Color.Unspecified,
    val textLink: Color = Color.Unspecified,
    val textDisabled: Color = Color.Unspecified,
    val textHelper: Color = Color.Unspecified,
    val iconPrimary: Color = Color.Unspecified,
    val iconSecondary: Color = Color.Unspecified,
    val iconDisabled: Color = Color.Unspecified,
    val tabBarActive: Color = Color.Unspecified,
    val tabBarInactive: Color = Color.Unspecified,
    val areaDisabled: Color = Color.Unspecified,
    val separator: Color = Color.Unspecified,
    val backgroundToast: Color = Color.Unspecified,
    val overlayBlocker: Color = Color.Unspecified,
    val border1: Color = Color.Unspecified,
    val border2: Color = Color.Unspecified,
    val interactive: Color = Color.Unspecified,
    val chipsActive: Color = Color.Unspecified,
    val chipsDefault: Color = Color.Unspecified,
    val textOnBackground: Color = Color.Unspecified,
    val indicator: Color = Color.Unspecified,
) {
    companion object: OtherColor {
        override val overlay: OverlayColor
            get() = DefaultOverlay
        override val red: ColorShade
            get() = Red
        override val blue: ColorShade
            get() = Blue
        override val tosca: ColorShade
            get() = Tosca
        override val green: ColorShade
            get() = Green
        override val purple: ColorShade
            get() = Purple
        override val pink: ColorShade
            get() = Pink
        override val yellow: ColorShade
            get() = Yellow
        override val gray: ColorShade
            get() = Gray
    }
}

@Stable
@Immutable
data class AppBackgroundTheme(
    val color: Color = Color.Unspecified,
    val tonalElevation: Dp = Dp.Unspecified,
)

@Stable
@Immutable
data class AppIconTint(
    val main: Color = Color.Unspecified,
    val primary: Color = Color.Unspecified,
    val secondary: Color = Color.Unspecified,
    val disabled: Color = Color.Unspecified
)

internal data object DefaultOverlay: OverlayColor {
    override val dark: Color
        get() = Color(0x990C0D0F)
    override val light: Color
        get() = Color(0x80F5F8FF)

}

internal data object Red: ColorShade {
    override val A70: Color
        get() = Color(0xFF7D0017)
    override val A60: Color
        get() = Color(0xFFB00423)
    override val A50: Color
        get() = Color(0xFFCA0528)
    override val A40: Color
        get() = Color(0xFFE3052D)
    override val A30: Color
        get() = Color(0xFFFD1B44)
    override val A20: Color
        get() = Color(0xFFFE5070)
    override val A10: Color
        get() = Color(0xFFF8C8D1)

}

internal data object Blue: ColorShade {
    override val A70: Color
        get() = Color(0xFF004496)
    override val A60: Color
        get() = Color(0xFF0153B6)
    override val A50: Color
        get() = Color(0xFF005DCC)
    override val A40: Color
        get() = Color(0xFF0067E2)
    override val A30: Color
        get() = Color(0xFF0074FF)
    override val A20: Color
        get() = Color(0xFF348BF4)
    override val A10: Color
        get() = Color(0xFFCAE2FF)

}

internal data object Tosca: ColorShade {
    override val A70: Color
        get() = Color(0xFF07575C)
    override val A60: Color
        get() = Color(0xFF0A747A)
    override val A50: Color
        get() = Color(0xFF0C9199)
    override val A40: Color
        get() = Color(0xFF0D9AA3)
    override val A30: Color
        get() = Color(0xFF10C1CC)
    override val A20: Color
        get() = Color(0xFF1CCEDA)
    override val A10: Color
        get() = Color(0xFFBDF2F5)

}

internal data object Green: ColorShade {
    override val A70: Color
        get() = Color(0xFF09782E)
    override val A60: Color
        get() = Color(0xFF078E45)
    override val A50: Color
        get() = Color(0xFF10AD58)
    override val A40: Color
        get() = Color(0xFF0ABA5B)
    override val A30: Color
        get() = Color(0xFF22DA76)
    override val A20: Color
        get() = Color(0xFF25E57E)
    override val A10: Color
        get() = Color(0xFFC4FBDD)

}

internal data object Purple: ColorShade {
    override val A70: Color
        get() = Color(0xFF2D075D)
    override val A60: Color
        get() = Color(0xFF3C0A7C)
    override val A50: Color
        get() = Color(0xFF4B0C9B)
    override val A40: Color
        get() = Color(0xFF500DA6)
    override val A30: Color
        get() = Color(0xFF6410CF)
    override val A20: Color
        get() = Color(0xFF7318E7)
    override val A10: Color
        get() = Color(0xFFD8BFF8)

}

internal data object Pink: ColorShade {
    override val A70: Color
        get() = Color(0xFF5C0A54)
    override val A60: Color
        get() = Color(0xFF7A0D70)
    override val A50: Color
        get() = Color(0xFF99118C)
    override val A40: Color
        get() = Color(0xFFA31296)
    override val A30: Color
        get() = Color(0xFFCC16BB)
    override val A20: Color
        get() = Color(0xFFE124CF)
    override val A10: Color
        get() = Color(0xFFFFC6FA)

}

internal data object Yellow: ColorShade {
    override val A70: Color
        get() = Color(0xFF956010)
    override val A60: Color
        get() = Color(0xFFBB7814)
    override val A50: Color
        get() = Color(0xFFC78015)
    override val A40: Color
        get() = Color(0xFFE09017)
    override val A30: Color
        get() = Color(0xFFF9A01A)
    override val A20: Color
        get() = Color(0xFFFFB23E)
    override val A10: Color
        get() = Color(0xFFFFEACA)

}

internal data object Gray: ColorShade {
    override val A70: Color
        get() = Color(0xFF0C0D0F)
    override val A60: Color
        get() = Color(0xFF18191C)
    override val A50: Color
        get() = Color(0xFF26292E)
    override val A40: Color
        get() = Color(0xFF525861)
    override val A30: Color
        get() = Color(0xFF9498A1)
    override val A20: Color
        get() = Color(0xFFC7CBD4)
    override val A10: Color
        get() = Color(0xFFF5F8FF)

}

sealed interface ColorShade {
    val A70: Color
    val A60: Color
    val A50: Color
    val A40: Color
    val A30: Color
    val A20: Color
    val A10: Color
}

internal interface OtherColor {
    val overlay: OverlayColor
    val red: ColorShade
    val blue: ColorShade
    val tosca: ColorShade
    val green: ColorShade
    val purple: ColorShade
    val pink: ColorShade
    val yellow: ColorShade
    val gray: ColorShade
}

sealed interface OverlayColor {
    val dark: Color
    val light: Color
}