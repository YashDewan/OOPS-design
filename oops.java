// => OOPS - BIG OH NOTATION <=

import java.util.*;

class Owner{
	String name;
	ArrayList<Vechile>vcl;
	Owner(String name,ArrayList<Vechile> vcl){
	  this.name = name;
    this.vcl=vcl;
  }
  // get owner information : 
  public void getInfo(){
    System.out.println(this.name+" has " + this.vcl.size() + " Vehicles. ");
    for(Vechile v: this.vcl){
        v.getInfo();
    }
  }
}

class Vechile{
	String reg_no;
	int numOfTyres;
	String vechileMade;
	String vecCond;
  Vechile(String reg_no , int numOfTyres , String vechileMade , String vecCond){
    this.reg_no = reg_no;
    this.numOfTyres  = numOfTyres;
    this.vechileMade = vechileMade;
    this.vecCond = vecCond;
  }
  public void getInfo(){
    // prints vehicle details
    System.out.println("registration number is " + reg_no + ". this Vehicles is " + vechileMade + " and it is " + vecCond + ". ");
  }
}

class Car extends Vechile{
	String brand;
	Fuel fuelType;
  Car(String brand,Fuel fuelType,String reg_no , int numOfTyres , String vechileMade , String vecCond){
    super(reg_no , numOfTyres , vechileMade , vecCond);
    this.brand = brand;
    this.fuelType = fuelType;
  }
	public void getInfo(){
	// prints the car info
    super.getInfo();
    System.out.print(this.brand + " runs on ");
    this.fuelType.getFuelInfo();
  }
}

class Fuel{
	String fuelType;
  Fuel(String fuelType){
      this.fuelType = fuelType;
  }
	public void getFuelInfo(){
	  // prints whether the fuel is petrol or diesel
    System.out.println(this.fuelType);
  }
}



class Bike extends Vechile{
	String brand;
	Fuel fuelType;
  Bike(String brand,Fuel fuelType,String reg_no , int numOfTyres , String vechileMade , String vecCond){
      super(reg_no ,numOfTyres,vechileMade,vecCond);
      this.brand=brand;
      this.fuelType=fuelType;
  }
	public void getInfo(){
	  // prints the bike info
    super.getInfo();
    System.out.print(this.brand+" runs on ");
    this.fuelType.getFuelInfo();
  }
}


class Main{
	public static void main(String args[]){
    Fuel deisel = new Fuel("Deisel");
    Fuel petrol = new Fuel("Petrol");
		Vechile v1 = new Car("Honda accord",deisel,"1234",4,"Made in India","Used");
		Vechile v2 = new Bike("Ducati",petrol,"4321",2,"Imported","new");
    // adding vechiles : 
    ArrayList<Vechile> vechiles=new ArrayList<>();
    vechiles.add(v1);
    vechiles.add(v2);
    Owner o1 = new Owner("Saurabh",vechiles);
    o1.getInfo();
	}
}
