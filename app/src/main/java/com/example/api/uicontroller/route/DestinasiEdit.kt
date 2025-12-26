package com.example.api.uicontroller.route

import com.example.api.R

object DestinasiEdit : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}