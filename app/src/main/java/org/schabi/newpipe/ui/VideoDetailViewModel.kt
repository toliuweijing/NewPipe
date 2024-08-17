package org.schabi.newpipe.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class VideoDetailViewModel : ViewModel() {

    val onAddToPlaylistClick by mutableStateOf({})
    val onBackgroundClick by mutableStateOf({})
    val onPopupClick by mutableStateOf({})
    val onDownloadClick by mutableStateOf({})
}
