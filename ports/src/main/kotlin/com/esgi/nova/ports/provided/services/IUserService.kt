package com.esgi.nova.ports.provided.services

import com.esgi.nova.ports.provided.dtos.user.UserCmdDto
import com.esgi.nova.ports.provided.dtos.user.UserDto
import com.esgi.nova.ports.provided.enums.Role
import com.esgi.nova.ports.required.IGetAll

interface IUserService: IGetAll<UserDto> {
    fun getOrCreate(userDto: UserCmdDto): UserDto?
    fun hasSameRole(username: String, role: Iterable<Role>): Boolean
}