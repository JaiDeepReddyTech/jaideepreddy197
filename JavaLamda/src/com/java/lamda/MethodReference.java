package com.java.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable {
	void display(String msg);
}

class RefPrintable implements Printable {
	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}
}

public class MethodReference {
	public static int addition(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		// Method reference to static method
		// lambda expression
		Function<Integer, Double> funtionLambda = (input) -> Math.sqrt(input);
		System.out.println(funtionLambda.apply(59));
//using Method reference
		Function<Integer, Double> funtion = Math::sqrt;
		System.out.println(funtion.apply(47));
//lambda expression
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> MethodReference.addition(a, b);
		System.out.println(biFunction.apply(25, 37));
//Method Reference
		BiFunction<Integer, Integer, Integer> bifunction = MethodReference::addition;
		System.out.println(bifunction.apply(39, 67));
		List<String> arr = new ArrayList();
		arr.add("Jai");
		arr.add("Rolex");
		arr.add("Charlie");
		arr.add("Robert");
		System.out.println(Arrays.asList(arr));
		// Instance method for object
		RefPrintable printable = new RefPrintable();
		// Lambda
		Printable printobj = (msg) -> printable.display(msg);
		printable.display("hello world");
		printobj.display("jaideep");
		// using Method Reference
		Printable printRef = printable::display;
		printRef.display("samkhl");
	}

}
