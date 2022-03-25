package com.cp.fi;

import com.cp.wi.Book;

public class Main {

	public static void main(String[] args) {
		

		Book annyStoryBook = new Book() {

			@Override
			public void getChapters() {
				System.out.println("Annoy Implementation Of Book !!");
				
			}
			
		};
		
		annyStoryBook.getChapters();
		
		/// Lambd 
		
		Book lmbdaStoryBook = () -> {
			
				System.out.println("Lambda Implementation Of Book !!");
				return;	
			
		};
		
		lmbdaStoryBook.getChapters();
		
	}

}
