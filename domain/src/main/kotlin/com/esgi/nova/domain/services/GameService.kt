package com.esgi.nova.domain.services

import com.esgi.nova.ports.provided.Query
import com.esgi.nova.ports.provided.dtos.game.GameCmdDto
import com.esgi.nova.ports.provided.dtos.game.GameDto
import com.esgi.nova.ports.provided.services.IGameService
import com.esgi.nova.ports.required.IGamePersistence
import com.google.inject.Inject
import java.util.*

class GameService @Inject constructor(private val gamePersistence: IGamePersistence) : IGameService {
    override fun getAll(query: Query) = gamePersistence.getAll(query)
    override fun create(element: GameCmdDto): GameDto? = gamePersistence.create(element)
    override fun getOne(id: UUID): GameDto? = gamePersistence.getOne(id)
}