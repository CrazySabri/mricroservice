package club.itchina.repository;

import club.itchina.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: sabri
 * @date: 2018/8/14 21:03
 * @description:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
