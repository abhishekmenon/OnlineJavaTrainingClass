package com.testing.testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.doubleThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.testing.testing.test.BMICalculator;
import com.testing.testing.test.Coder;

@SpringBootTest
class TestingApplicationTests {

	
	@BeforeAll
	static void beforeAll() {
		System.out.println("this is before all operation");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("this is after all operation");
	}
	
	
	@ParameterizedTest()
	@ValueSource(doubles= {70.0,89.0,95.0,110.0})
	void should_ReturnTrue_When_DietRecommended(Double coderWeight){
		
		//given
		double weight=coderWeight;
		double height=1.72;
		//when
		boolean recommended=BMICalculator.isDietRecommended(weight, height);
		//then
		assertTrue(recommended);
		
		//not recom.
		//assert(BMICalculator.isDietRecommended(89.0,1.82));
	}

	@RepeatedTest(10)
	void should_ThrowArithmaticException_When_HeightZero(){
		
		//given
		double weight=89.0;
		double height=0.0;
		//when
		Executable executable=()-> BMICalculator.isDietRecommended(weight, height);
		//then
		assertThrows(ArithmeticException.class,executable);
		
		//not recom.
		//assert(BMICalculator.isDietRecommended(89.0,1.82));
	}
//	@Test
//	void should_ReturnCoder_When_Coder_isNotEmpty(){
//		
//		//given
//		List<Coder> coders=new ArrayList<>();
//		coders.add(new Coder(1.0,0.0));
//		coders.add(new Coder(1.83,98.0));
//		coders.add(new Coder(1.82,90.0));
//		
//		//when
//		Coder coderWorstBMICoder=BMICalculator.findCoderWithWorstBMI(coders);
//		
//		//then
//		assertAll(
//		()-> assertEquals(1.82, coderWorstBMICoder.getHeight()),
//		()->assertEquals(90.0, coderWorstBMICoder.getWeight())
//		//assertEquals(1.82, coderWorstBMICoder.getHeight());
//		);
//		
//		//not recom.
//		//assert(BMICalculator.isDietRecommended(89.0,1.82));
//	}
	
	
	@Test
	void should_ReturnCoderNull_When_Coder_isNotEmpty(){
		
		//given
		List<Coder> coders=new ArrayList<>();
		
		
		//when
		Coder coderWorstBMICoder=BMICalculator.findCoderWithWorstBMI(coders);
		
		//then
		assertNull(coderWorstBMICoder);
		
		//not recom.
		//assert(BMICalculator.isDietRecommended(89.0,1.82));
	}
	
	@Test
	void should_ReturnCorrectBMIScore_When_Coder_isNotEmpty(){
		
		//given
		List<Coder> coders=new ArrayList<>();
		coders.add(new Coder(1.80,60.0));
		coders.add(new Coder(1.82,98.0));
		coders.add(new Coder(1.82,64.7));
		double[] excepted= {18.52,29.59,19.53};
		
		
		
		
		//when
		double[] bmiScores=BMICalculator.getBMIScores(coders);
		
		//then
		assertArrayEquals(bmiScores,excepted);
		
		//not recom.
		//assert(BMICalculator.isDietRecommended(89.0,1.82));
	}


}

