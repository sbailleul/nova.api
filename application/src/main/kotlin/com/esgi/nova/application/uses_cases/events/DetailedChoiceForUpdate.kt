package com.esgi.nova.application.uses_cases.events

import java.util.*

class DetailedChoiceForUpdate(
    val id: UUID,
    translations: List<ChoiceTranslationForEdition>,
    resources: List<ChoiceResourceForEdition>
): DetailedChoiceForEdition(translations, resources)