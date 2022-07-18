package com.pnsn.eis.user.mng.service;

import com.pnsn.eis.user.mng.entity.Role;
import com.pnsn.eis.user.mng.entity.User;

import java.util.List;

public interface UserService {
  User saveUser(User user);

  Role saveRole(Role role);

  void addRoleToUser(String username, String roleName);

  User getUser(String username);

  List<User> getUsers();
}
