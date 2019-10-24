package app.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
    public User findByUserId(Long id);
}
