package com.blogger.blog.payloads;



import org.hibernate.validator.constraints.NotEmpty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	

	private int id;
	
	@NotBlank
	@Size(min=4,message = "Username should be of length 4 or greater")
	private String name;
	
	@Email(message = "Wrong email formate")
	private String email;
	
	
	private String password;
	@NotNull
	private String about;


}
