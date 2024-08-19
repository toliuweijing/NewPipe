package org.schabi.newpipe.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Extended color for error hint.
 * See [specification](https://m1.material.io/patterns/errors.html#errors-user-input-errors)
 */
val md_theme_light_error_hint = Color(0x61000000)

val md_theme_dark_error_hint = Color(0x80FFFFFF)

val ColorScheme.errorHint: Color
    @Composable get() = if (isSystemInDarkTheme()) {
        Color(0x80FFFFFF)
    } else {
        Color(0x61000000)
    }
