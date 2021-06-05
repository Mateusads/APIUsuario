package br.com.projeto.usuario.api.services;

import br.com.projeto.usuario.api.entities.User;
import br.com.projeto.usuario.api.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

        private final UserRepository userRepository;

        public User createUser(User user){
            return userRepository.save(user);
        }
}
