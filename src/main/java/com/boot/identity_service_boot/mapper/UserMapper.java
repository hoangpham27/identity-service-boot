package com.boot.identity_service_boot.mapper;

import com.boot.identity_service_boot.dto.request.UserCreationRequest;
import com.boot.identity_service_boot.dto.request.UserUpdateRequest;
import com.boot.identity_service_boot.dto.response.UserResponse;
import com.boot.identity_service_boot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    // Note: User is Entity. UserCreationRequest and UserResponse are DTO
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
