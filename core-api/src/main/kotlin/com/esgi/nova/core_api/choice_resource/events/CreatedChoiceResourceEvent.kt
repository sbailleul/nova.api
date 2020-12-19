package com.esgi.nova.core_api.choice_resource.events

import com.esgi.nova.core_api.choice_resource.commands.ChoiceResourceIdentifier
import com.esgi.nova.core_api.choice_translations.commands.ChoiceTranslationIdentifier
import java.io.Serializable

data class CreatedChoiceResourceEvent(
    val id: ChoiceResourceIdentifier,
    val changeValue: Int
) : Serializable