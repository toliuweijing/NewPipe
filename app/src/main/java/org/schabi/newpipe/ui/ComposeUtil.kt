package org.schabi.newpipe.ui

import androidx.compose.ui.platform.ComposeView
import org.schabi.newpipe.ui.theme.AppTheme

object ComposeUtil {

    fun setDetailControlPanel(
        view: ComposeView,
        videoDetailViewModel: VideoDetailViewModel,
    ) {
        view.setContent {
            AppTheme {
                DetailControlPanel(videoDetailViewModel)
            }
        }
    }
}
