package com.cp.def.fi;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		//consumer
		
		Consumer<String> consumer = (a) -> {
			System.out.println("This is Consumer.. " + a);
		};
		
		consumer.accept("dummy");
		
		
		
		// supplier		
		
		Supplier<Double> supplier = () -> (Math.random());
		System.out.println(supplier.get());
		
		
		// Function
		// Empty string checker
		Function<String , Boolean> function = (s) -> (s.isEmpty() || s == null);
		System.out.println(function.apply("codeplanet"));
		
		
		//Predicate
		Predicate<String> predicateTenCharString = (s) -> (s.length() > 10);
		System.out.println("Predicate :  " + predicateTenCharString.test("cp"));
		System.out.println("Predicate :  " + predicateTenCharString.test("abcdefghojkls"));
		
		
		// Unary Operator  & BinaryOperator
		
		BiFunction<Integer, Double, String>  bi = (i , d) -> (i + " Items bought for price - " + d);
		System.out.println("BiFunction " + bi.apply(5, 457.98));
	}
	


}
