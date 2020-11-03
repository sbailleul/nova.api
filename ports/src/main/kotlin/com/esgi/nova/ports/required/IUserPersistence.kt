package com.esgi.nova.ports.required

import com.esgi.nova.ports.common.ICreate
import com.esgi.nova.ports.common.IGetAll
import com.esgi.nova.ports.provided.dtos.user.UserCmdDto
import com.esgi.nova.ports.provided.dtos.user.UserDto

interface IUserPersistence : IGetAll<UserDto>, ICreate<UserCmdDto, UserDto>,
    IGetAllTotal<UserDto> {
    fun getByName(username: String): UserDto?
    fun getOrCreate(userDto: UserCmdDto): UserDto?
}