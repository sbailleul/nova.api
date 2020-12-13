package com.esgi.nova.core_api.events.commands

import com.esgi.nova.core_api.languages.LanguageIdentifier
import org.axonframework.modelling.command.TargetAggregateIdentifier

class CreateEventTranslationCommand(
        @TargetAggregateIdentifier val eventId: EventIdentifier,
        val languageId: LanguageIdentifier,
        val title: String,
        val description: String
)