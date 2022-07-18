package com.pnsn.eis.user.mng.repository;

import com.pnsn.eis.user.mng.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Role findByName(String name);
}
