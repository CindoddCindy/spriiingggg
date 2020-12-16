package springspring.myspringspringtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springspring.myspringspringtest.models.ERole;
import springspring.myspringspringtest.models.Role;

import java.util.Optional;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
