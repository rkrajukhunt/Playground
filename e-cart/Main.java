//import required packages here

import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price)
  {
    this.price=price;
  }
  public int getPrice()
  {
  	return price;
  }
}  
class Customer extends Item
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product)
  {
  	this.product=product;
  }
  public String getProduct()
  {
  	return product;
  }
  public void setQuantity(int quantity)
  {
  	this.quantity=quantity;
  }
  public int getQuantity()
  {
  	return quantity;
  } 
}

class Bill extends Customer
{
  public Bill(String product,int quantity,int price)
  {
  	
    this.setProduct(product);
    this.setQuantity(quantity);
    this.setPrice(price);
  }
  public void billing()
  {
  	System.out.println("Total Price is : "+(this.getPrice()*this.getQuantity()));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String prodName=sc.nextLine();
    int price=sc.nextInt();
    int quantity=sc.nextInt();
    Item i = new Item();
    i.setPrice(price);
    Customer c = new Customer();
    c.setProduct(prodName);
    c.setQuantity(quantity);
    Bill obj = new Bill(prodName,quantity,price);
    obj.billing();
  }
}