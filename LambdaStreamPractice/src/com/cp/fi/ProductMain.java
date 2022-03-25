package com.cp.fi;

public class ProductMain {

	public static void main(String[] args) {

		// Without Lambda
		
//		Product productAnnonymous = new Product() {
//
//			@Override
//			public String getProductValue(Double value) {
//				// TODO Auto-generated method stub
//				return "Product Annonymous Dummy with value : " + value;
//			}
//			
//		};
//		
//		String resultAnn = productAnnonymous.getProductValue(897.67);
//		System.out.println(resultAnn);
		
		/// With Lambda 
		Product product = (v) -> ("Product Dummy with value : " + v);  // imvokeVirtual() system call added
		
		String result  = product.getProductValue(101.99);
		System.out.println(result);

	}

}
