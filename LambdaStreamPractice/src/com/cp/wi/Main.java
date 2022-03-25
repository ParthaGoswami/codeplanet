package com.cp.wi;

public class Main {

	public static void main(String[] args) {
		
		
		Book storyBook = new StoryBook();
		storyBook.getChapters();
		
		
		Book annyStoryBook = new Book() {

			@Override
			public void getChapters() {
				System.out.println("Annoy Implementation Of Book !!");
				
			}
			
		};
		
		annyStoryBook.getChapters();
		
		
		
		

	}

}
