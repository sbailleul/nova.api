package com.esgi.nova.adapters.exposed.models

import com.esgi.nova.adapters.exposed.tables.Game
import com.esgi.nova.adapters.exposed.tables.GameEvent
import org.jetbrains.exposed.dao.UUIDEntity
import org.jetbrains.exposed.dao.UUIDEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import java.util.*

class GameEntity(id: EntityID<UUID>) : UUIDEntity(id) {
    companion object : UUIDEntityClass<GameEntity>(Game)

    var user by UserEntity referencedOn Game.user
    var startDate by Game.startDate
    var core by Game.core
    var events by EventEntity via GameEvent
}