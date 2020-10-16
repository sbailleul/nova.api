package com.esgi.nova.adapters.exposed.mappers

import com.esgi.nova.adapters.exposed.models.EventEntity
import com.esgi.nova.adapters.exposed.models.GameEntity
import com.esgi.nova.ports.provided.dtos.EventDto
import com.esgi.nova.ports.provided.dtos.GameDto
import org.jetbrains.exposed.sql.SizedIterable
import org.mapstruct.Mapper

@Mapper(componentModel = "jsr330", uses = [GameMapper::class])
interface EventMapper {

    fun toDto(eventEntity: EventEntity): EventDto
    fun map(gameEntities: SizedIterable<EventEntity>): Iterable<EventDto>

}