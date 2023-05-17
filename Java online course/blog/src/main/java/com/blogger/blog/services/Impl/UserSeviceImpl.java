package com.blogger.blog.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.asm.Advice.This;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.blog.entities.User;
import com.blogger.blog.exceptions.ResourceNotFoundExeption;
import com.blogger.blog.payloads.UserDto;
import com.blogger.blog.repositories.UserRepo;
import com.blogger.blog.services.UserService;

@Service
public class UserSeviceImpl implements UserService{

	
	@Autowired 
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=this.dtoToUser(userDto);
		User savedUser=this.userRepo.save(user);
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundExeption("UserId","Id",userId));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		
		
		User updateUser=this.userRepo.save(user);
		UserDto userDto1=this.userToDto(updateUser);
		return userDto1;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundExeption("UserId","Id",userId));
		return this.userToDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users=this.userRepo.findAll();
		List<UserDto> userDtos=users.stream().map(user->this.userToDto(user)).collect(Collectors.toList());
		return userDtos;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundExeption("UserId","Id",userId));
		this.userRepo.delete(user);
		
	}
	
	public User dtoToUser(UserDto userDto) {
		User user=this.modelMapper.map(userDto,User.class);
		return user;
	}
	public UserDto userToDto(User user) {
		UserDto userDto=this.modelMapper.map(user,UserDto.class);
		return userDto;
	}
	

}
