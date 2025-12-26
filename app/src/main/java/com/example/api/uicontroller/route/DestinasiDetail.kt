package com.example.api.uicontroller.route


import com.example.api.R

object DestinasiDetail {
    val route = "item_detail"
    val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}