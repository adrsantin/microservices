package br.com.microservices.photo.app.api.users.service;

import br.com.microservices.photo.app.api.users.shared.UserDto;

public interface UsersService {
    UserDto createUser(UserDto userDetails);
}
