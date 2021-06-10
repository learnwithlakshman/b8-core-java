package com.careerit.cj.oops.innerclasses;

interface HasValidAccessCode{
	
}
interface Cab{
	void driverDetails();
}
class OlaDriver implements Cab,HasValidAccessCode{

	@Override
	public void driverDetails() {
	
	}
	
}
class UberDriver implements Cab,HasValidAccessCode{

	@Override
	public void driverDetails() {
		
	}
	
}

class BookCab{
	
		public void book(Cab cab,String name) {
			if(cab instanceof HasValidAccessCode) {
					System.out.println("Enjoy ride.....");
			}else {
				System.out.println("Don't worry, we arrange another driver");
			}
		}
}

public class Manager {

		public static void main(String[] args) {
			
				BookCab cab = new BookCab();
				cab.book(new OlaDriver(),"Rajesh");
		}
}
