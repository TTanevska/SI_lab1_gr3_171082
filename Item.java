enum danok{'A'== 15%,'B'==5%,'C'==0%}
class Item {
	int id;
	String name;
	double price;
     enum danok d;

	//TODO add variable.
     Item(int id,String name,double price,danok d)
     {
      id=id;
      this.name=name;
      price=price;
      this.d=d;
      }


	//TODO constructor

	//TODO setters and getters
     
      public String getName()
      {
        return name;
      }
      public String setName(String name)
      {
       this.name=name;
      } 
      public int getId()
      {
        return id;
      }
      public id setId(int id)
      {
       id=id;
      } 
      public doule getPrice()
      {
        return price;
      }
      public double setPrice(double price)
      {
       price=price;
      } 


	double taxReturn (double price) {
		return 15*price/100;
	}
}