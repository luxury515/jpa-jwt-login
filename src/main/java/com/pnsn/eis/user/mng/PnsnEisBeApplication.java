package com.pnsn.eis.user.mng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class PnsnEisBeApplication {

  public static void main(String[] args) {
    SpringApplication.run(PnsnEisBeApplication.class, args);
  }

  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
  //    @Bean
  //    CommandLineRunner run (UserService userService){
  //        return args -> {
  //            userService.saveRole(new Role(null,"ROLE_USER"));
  //            userService.saveRole(new Role(null,"ROLE_ADMIN"));
  //            userService.saveRole(new Role(null,"ROLE_MANAGER"));
  //            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
  //
  //            userService.saveUser(new User(null,"cai","caibingchun","1234",new ArrayList<>()));
  //            userService.saveUser(new User(null,"cai2","caibingchun2","1234",new ArrayList<>()));
  //            userService.saveUser(new User(null,"cai3","caibingchun3","1234",new ArrayList<>()));
  //            userService.saveUser(new User(null,"cai4","caibingchun4","1234",new ArrayList<>()));
  //
  //            userService.addRoleToUser("caibingchun","ROLE_USER");
  //            userService.addRoleToUser("caibingchun2","ROLE_ADMIN");
  //            userService.addRoleToUser("caibingchun3","ROLE_MANAGER");
  //            userService.addRoleToUser("caibingchun4","ROLE_SUPER_ADMIN");
  //            userService.addRoleToUser("caibingchun4","ROLE_ADMIN");
  //            userService.addRoleToUser("caibingchun4","ROLE_USER");
  //
  //        };
  //    }
}
