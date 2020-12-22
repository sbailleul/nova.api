package com.esgi.nova.core_api.event_translations.events

import com.esgi.nova.core_api.event_translations.commands.EventTranslationIdentifier
import com.esgi.nova.core_api.events.commands.EventIdentifier
import java.io.Serializable

data class DeletedEventTranslationEvent(
    val eventId: EventIdentifier,
    val translationId: EventTranslationIdentifier
): Serializable