package fr.sebastienr.recupback.repositories;

import fr.sebastienr.recupback.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AdminRepository implements JpaRepository<Admin, Long> {

    public abstract Admin findByEmail(String email);
}
