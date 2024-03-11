package theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.dp

@Stable
@Immutable
data class AppShape(
    val rounded4: CornerBasedShape = RoundedCornerShape(4.dp),
    val circle: CornerBasedShape = CircleShape
)
