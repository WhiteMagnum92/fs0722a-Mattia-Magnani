package com.GestioneDispositivi.auth.runners;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.GestioneDispositivi.auth.devices.Device;
import com.GestioneDispositivi.auth.devices.DeviceRepo;
import com.GestioneDispositivi.auth.devices.EState;
import com.GestioneDispositivi.auth.devices.EType;
import com.GestioneDispositivi.auth.roles.ERole;
import com.GestioneDispositivi.auth.roles.Role;
import com.GestioneDispositivi.auth.roles.RoleRepository;
import com.GestioneDispositivi.auth.users.User;
import com.GestioneDispositivi.auth.users.UserRepository;

@Component
public class UserRunner implements ApplicationRunner {
	
	@Autowired RoleRepository roleRepository;
	@Autowired UserRepository userRepository;
	@Autowired DeviceRepo deviceRepository;
	@Autowired PasswordEncoder encoder;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Role admin = new Role();
		admin.setRoleName(ERole.ROLE_ADMIN);
		//roleRepository.save(admin);
		
		Role user = new Role();
		user.setRoleName(ERole.ROLE_USER);
		//roleRepository.save(user);
		
		Role moderator = new Role();
		moderator.setRoleName(ERole.ROLE_MODERATOR);
		//roleRepository.save(moderator);
		
		Device phone = new Device();
		phone.setName("IPHONE 14 PRO");
		phone.setState(EState.ASSEGNATO);
		phone.setType(EType.SMARTPHONE);
		//deviceRepository.save(phone);
		
		Device tablet = new Device();
		tablet.setName("IPAD MINI PRO");
		tablet.setState(EState.ASSEGNATO);
		tablet.setType(EType.TABLET);
		//deviceRepository.save(tablet);
		
		Device laptop = new Device();
		laptop.setName("ALIENWARE M15");
		laptop.setState(EState.IN_MANUTENZIONE);
		laptop.setType(EType.LAPTOP);
		//deviceRepository.save(laptop);
		
		Device laptop2 = new Device();
		laptop2.setName("ASUS ROG");
		laptop2.setState(EState.DISPONIBILE);
		laptop2.setType(EType.LAPTOP);
		//deviceRepository.save(laptop2);

		
		Set<Role> adminRole = new HashSet<Role>();
		adminRole.add(admin);
		adminRole.add(moderator);
		adminRole.add(user);
		
		Set<Role> moderatorRole = new HashSet<Role>();
		moderatorRole.add(moderator);
		moderatorRole.add(user);
		
		Set<Role> userRole = new HashSet<Role>();
		userRole.add(user);
		
		Set<Device> userDevice = new HashSet<Device>();
		userDevice.add(laptop);
		
		Set<Device> adminDevice = new HashSet<Device>();
		adminDevice.add(tablet);
		adminDevice.add(phone);
		
		
		
		User userAdmin = new User();
		userAdmin.setNome("GIGINO");
		userAdmin.setCognome("OP");
		userAdmin.setUsername("ADMIN");
		userAdmin.setEmail("admin@example.com");
		userAdmin.setPassword(encoder.encode("admin"));
		userAdmin.setRoles(adminRole);
		userAdmin.setDevices(adminDevice);
		
		//userRepository.save(userAdmin);
		
		User simpleUser = new User();
		simpleUser.setNome("Gerry");
		simpleUser.setCognome("Scottex");
		simpleUser.setUsername("rotoliover9000");
		simpleUser.setEmail("rotolino@example.com");
		simpleUser.setPassword(encoder.encode("12345"));
		simpleUser.setRoles(userRole);
		simpleUser.setDevices(userDevice);
		//userRepository.save(simpleUser);
		
		User userModerator = new User();
		userModerator.setNome("Mario");
		userModerator.setCognome("Rossi");
		userModerator.setUsername("mariello");
		userModerator.setEmail("mario.r@example.com");
		userModerator.setPassword(encoder.encode("67890"));
		userModerator.setRoles(moderatorRole);
		//userRepository.save(userModerator);
	}

}
