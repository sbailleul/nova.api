package com.esgi.nova.adapters.exposed.mappers

import com.esgi.nova.adapters.exposed.models.UserEntity
import com.esgi.nova.ports.provided.UserDto
import org.mapstruct.Mapper

@Mapper(componentModel = "jsr330")
interface UserMapper {
    fun toDto(user: UserEntity): UserDto
    fun toEntity(user: UserDto): UserEntity
}