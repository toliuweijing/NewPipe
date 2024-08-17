package org.schabi.newpipe.ui

import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.schabi.newpipe.R
import org.schabi.newpipe.ui.theme.AppTheme

@Composable
fun VideoDetailScreen() {
    AppTheme {
    }
}

@Preview
@Composable
fun VideoDetailScreenPreview() {
    VideoDetailScreen()
}

@Composable
fun DetailControlPanel(videoDetailViewModel: VideoDetailViewModel) {
    Row(horizontalArrangement = Arrangement.SpaceEvenly) {
        DetailControlItem(
            modifier = Modifier
                .padding(
                    vertical = dimensionResource(id = R.dimen.detail_control_padding)
                )
                .clickable { videoDetailViewModel.onAddToPlaylistClick() },
            textRes = R.string.controls_add_to_playlist_title,
            drawableRes = R.drawable.ic_playlist_add,
            textColorRes = androidx.appcompat.R.color.secondary_text_default_material_light,
            contentDescriptionRes = R.string.add_to_playlist,
            dimenRes = R.dimen.detail_control_text_size,
        )
        DetailControlItem(
            modifier = Modifier.padding(
                vertical = dimensionResource(id = R.dimen.detail_control_padding)
            ).clickable { videoDetailViewModel.onBackgroundClick() },
            textRes = R.string.controls_background_title,
            drawableRes = R.drawable.ic_headset,
            textColorRes = androidx.appcompat.R.color.secondary_text_default_material_light,
            contentDescriptionRes = R.string.play_audio,
            dimenRes = R.dimen.detail_control_text_size,
        )
        DetailControlItem(
            modifier = Modifier.padding(
                vertical = dimensionResource(id = R.dimen.detail_control_padding)
            ).clickable { videoDetailViewModel.onPopupClick() },
            textRes = R.string.controls_popup_title,
            drawableRes = R.drawable.ic_picture_in_picture,
            textColorRes = androidx.appcompat.R.color.secondary_text_default_material_light,
            contentDescriptionRes = R.string.open_in_popup_mode,
            dimenRes = R.dimen.detail_control_text_size
        )
        DetailControlItem(
            modifier = Modifier.padding(
                vertical = dimensionResource(id = R.dimen.detail_control_padding)
            ).clickable { videoDetailViewModel.onDownloadClick },
            textRes = R.string.download,
            drawableRes = R.drawable.ic_file_download,
            textColorRes = androidx.appcompat.R.color.secondary_text_default_material_light,
            contentDescriptionRes = R.string.controls_download_desc,
            dimenRes = R.dimen.detail_control_text_size
        )
    }
}

@Composable
fun DetailControlItem(
    modifier: Modifier = Modifier,
    @StringRes textRes: Int,
    @DrawableRes drawableRes: Int,
    @ColorRes textColorRes: Int,
    @StringRes contentDescriptionRes: Int,
    @DimenRes dimenRes: Int,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            painter = painterResource(id = drawableRes),
            contentDescription = stringResource(id = contentDescriptionRes),
        )
        Text(
            text = stringResource(id = textRes),
            fontSize = dimensionResource(id = dimenRes).value.sp,
            color = colorResource(id = textColorRes),
        )
    }
}

@Preview
@Composable
fun VideoDetailControlsPlaylistAppendPreview() {
    AppTheme {
//        VideoDetailControlsPlaylistAppend()
    }
}
