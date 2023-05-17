package com.blogger.blog.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.blog.entities.Category;
import com.blogger.blog.entities.User;
import com.blogger.blog.exceptions.ResourceNotFoundExeption;
import com.blogger.blog.payloads.CategoryDto;
import com.blogger.blog.payloads.UserDto;
import com.blogger.blog.repositories.CategoryRepo;
import com.blogger.blog.services.CategoryService;

@Service
public class CategorySeviceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		// TODO Auto-generated method stub
		
		
		Category cat=this.modelMapper.map(categoryDto,Category.class);
		Category addedCategory=this.categoryRepo.save(cat);
		return this.modelMapper.map(addedCategory,CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		// TODO Auto-generated method stub
		
		Category category=this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundExeption("CategoryId","Id",categoryId));
		category.setCategoryDescription(categoryDto.getCategoryDescription());
		category.setCategoryTitle(categoryDto.getCategoryTitle());
		
		
		Category updateCategory=this.categoryRepo.save(category);
		//CategoryDto categoryDto2=this.updateUser);
		return this.modelMapper.map(updateCategory, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		Category category=this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundExeption("CategoryId","Id",categoryId));
		this.categoryRepo.delete(category);
	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		
		Category category=this.categoryRepo.findById(categoryId)
				.orElseThrow(()->new ResourceNotFoundExeption("CategoryId","Id",categoryId));
		return this.modelMapper.map(category,CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		// TODO Auto-generated method stub
		List<Category> categories=this.categoryRepo.findAll();
		List<CategoryDto> categoriesDto=categories.stream().map((cat)-> this.modelMapper.map(cat,CategoryDto.class)).collect(Collectors.toList());
		
		return categoriesDto;
	}

}
