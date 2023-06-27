package com.testing.testing.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DietPlannerTest {

	
	private DietPlanner dietPlanner;
	
	
	@BeforeEach
	void setup() {
		this.dietPlanner=new DietPlanner(20,30,50);
	}
	
	@Test
	void test() {
		//given
		Coder coder=new Coder(1.82,75.0,26,Gender.MALE);
		DietPlan expecteDietPlan=new DietPlan(1799,89,59, 224);
		
		//when
		DietPlan actualDietPlan=dietPlanner.calculateDiet(coder);
		
		//then
		assertAll(
				()->assertEquals(expecteDietPlan.getCalories(),actualDietPlan.getCalories()),
				()->assertEquals(expecteDietPlan.getCarbohydrate(),actualDietPlan.getCarbohydrate()),
				()->assertEquals(expecteDietPlan.getFat(),actualDietPlan.getFat()),
				()->assertEquals(expecteDietPlan.getProtein(),actualDietPlan.getProtein())
		);
		@Test
		void test2() {
			//given
			Coder coder=new Coder(1.82,75.0,26,Gender.MALE);
			DietPlan expecteDietPlan=new DietPlan(1799,89,59, 224);
			
			//when
			DietPlan actualDietPlan=dietPlanner.calculateDiet(coder);
			
			//then
			assertAll(
					()->assertEquals(expecteDietPlan.getCalories(),actualDietPlan.getCalories()),
					()->assertEquals(expecteDietPlan.getCarbohydrate(),actualDietPlan.getCarbohydrate()),
					()->assertEquals(expecteDietPlan.getFat(),actualDietPlan.getFat()),
					()->assertEquals(expecteDietPlan.getProtein(),actualDietPlan.getProtein())
			);
	}

}
