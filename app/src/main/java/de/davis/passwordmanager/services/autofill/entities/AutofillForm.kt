package de.davis.passwordmanager.services.autofill.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AutofillForm(
    val autofillFields: MutableList<AutofillField> = mutableListOf(),
    var url: String? = null
) : Parcelable