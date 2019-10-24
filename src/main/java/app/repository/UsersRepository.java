package app.repository;

import app.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
    public User findByUserId(Long id);
    public User findUserByLoginAndPassword(String login, String password);
}
