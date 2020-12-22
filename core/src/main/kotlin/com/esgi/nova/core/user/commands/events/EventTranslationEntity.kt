package com.esgi.nova.core.user.commands.events

import com.esgi.nova.core_api.event_translations.commands.EventTranslationIdentifier
import com.esgi.nova.core_api.event_translations.commands.UpdateEventTranslationCommand
import com.esgi.nova.core_api.event_translations.events.UpdatedEventTranslationEvent
import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.modelling.command.EntityId

class EventTranslationEntity() {

    @EntityId
    lateinit var id: EventTranslationIdentifier

    lateinit var title: String
    lateinit var description: String

    constructor(id: EventTranslationIdentifier, title: String, description: String) : this() {
        this.id = id
        this.title = title
        this.description = description
    }

    @CommandHandler
    fun handle(cmd: UpdateEventTranslationCommand) {
        AggregateLifecycle.apply(
            UpdatedEventTranslationEvent(
                eventId = cmd.eventId,
                translationId = cmd.translationId,
                title = cmd.title,
                description = cmd.description
            )
        )
    }

    @EventSourcingHandler
    fun on(event: UpdatedEventTranslationEvent) {
        this.title = event.title
        this.description = event.description
    }

}
