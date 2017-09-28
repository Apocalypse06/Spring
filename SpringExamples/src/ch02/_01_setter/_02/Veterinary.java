package ch02._01_setter._02;

public class Veterinary {
    IMammal  mammal;
    
    public Veterinary() {	
	}	

	public Veterinary(IMammal mammal) {
		super();
		this.mammal = mammal;
	}

	public IMammal getMammal() {
		return mammal;
	}

	public void setMammal(IMammal mammal) {
		this.mammal = mammal;
	}

	public void vaccinate (){
        mammal.cry() ;                  	                                     
        if ( mammal instanceof Dog) {  		
            Dog d = (Dog)mammal ;       	
            d.bark() ;             		
        } else if ( mammal instanceof Cat) {
  	      Cat c = (Cat)mammal ;             
  	      c.sleep() ;                    
        }
	}
}
