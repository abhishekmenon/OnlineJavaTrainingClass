package com.blogger.blog.services.Impl;


import java.awt.print.Pageable;
import java.security.PublicKey;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

//import org.hibernate.validator.internal.util.logging.formatter.CollectionOfObjectsToStringFormatter;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.asm.Advice.This;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.blogger.blog.entities.Category;
import com.blogger.blog.entities.Post;
import com.blogger.blog.entities.User;
import com.blogger.blog.exceptions.ResourceNotFoundExeption;
import com.blogger.blog.payloads.PostDto;
import com.blogger.blog.payloads.PostResponse;
import com.blogger.blog.repositories.CategoryRepo;
import com.blogger.blog.repositories.PostRepo;
import com.blogger.blog.repositories.UserRepo;
import com.blogger.blog.services.PostService;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	
	@Override
	public PostDto createPost(PostDto postDto,Integer userId,Integer categoryId) {
		// TODO Auto-generated method stub
		
		User user=this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundExeption("UserId","Id",userId));
		Category category=this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundExeption("CategoryId","Id",categoryId));
		
		Post post=this.modelMapper.map(postDto,Post.class);
		post.setImageName("default.png");
		post.setAddedDate(new Date());
		post.setUser(user);
		post.setCategory(category);
		
		Post newPost=this.postRepo.save(post);
		
		//PostRepo 
		return this.modelMapper.map(newPost,PostDto.class);
	}
	
	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {
		Post post=this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundExeption("PostId","Id",postId));
		post.setTitle(postDto.getTitle());
		post.setContent(postDto.getContent());
		post.setImageName(postDto.getImageName());
		Post updatePostDto=this.postRepo.save(post);
		return this.modelMapper.map(updatePostDto, PostDto.class);
	}

	@Override
	public void deletePost(Integer postId) {
		Post post=this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundExeption("PostId","Id",postId));
		this.postRepo.delete(post);
		
		
	}
	
	
	public List<PostDto> getPostsByCategory(Integer categoryId){
		Category cat=this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundExeption("CategoryId","Id",categoryId));
		List<Post> posts=this.postRepo.findByCategory(cat);
		List<PostDto> postDtos=posts.stream().map((post-> this.modelMapper.map(post, PostDto.class))).collect(Collectors.toList());
		return postDtos;
	}

	
	public List<PostDto> getPostsByUser(Integer userId){
		User user=this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundExeption("UserId","Id",userId));
		List<Post> posts=this.postRepo.findByUser(user);
		List<PostDto> postDtos=posts.stream().map((post-> this.modelMapper.map(post, PostDto.class))).collect(Collectors.toList());
		return postDtos;
	}
	int pageNumber=0;
	int pageSize=2;
	@Override
	public PostResponse getAllPost(Integer pageNumber,Integer pageSizes) {
		
		
		// TODO Auto-generated method stub
		PageRequest p=PageRequest.of(pageNumber,pageSize);
		Page<Post> pagePost=this.postRepo.findAll(p);
		
		
		List<Post> allPosts=this.postRepo.findAll();
		List<PostDto> collect=allPosts.stream().map((post)->this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());
		
		PostResponse postResponse=new PostResponse();
		postResponse.setContent(collect);
		postResponse.setPageNumber(pagePost.getNumber());
		postResponse.setPageSize(pagePost.getSize());
		postResponse.setTotalElements(pagePost.getTotalElements());
		
		return postResponse;
	}

	@Override
	public PostDto getPostById(Integer postId) {
		// TODO Auto-generated method stub
		
		Post post=this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundExeption("PostId","Id",postId));
		return this.modelMapper.map(post, PostDto.class);
	}



	@Override
	public List<PostDto> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}



}
