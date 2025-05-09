package com.example.cupcake.data

import androidx.annotation.StringRes
import com.example.cupcake.R

enum class CupcakeScreen(
    @StringRes val title: Int
) {
    Start(title = R.string.app_name),
    Flavor(title = R.string.choose_flavor),
    Pickup(title = R.string.choose_pickup_date),
    Summary(title = R.string.order_summary)
}