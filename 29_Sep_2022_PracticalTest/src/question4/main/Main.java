package question4.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price)
    {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product [id=" + id + ", name=" + name + ", price="
                + price + "]";
    }

	public static Stream<Product> stream() {
		// TODO Auto-generated method stub
		return null;
	}

}
public class Main {
	public static void main(String[] args)
    {
        List<Product> productList = new ArrayList<Product>();

      
        productList.add(new Product(1, "Sony mobile", 160));
        productList.add(new Product(2, "Lenovo mobile", 150));
        productList.add(new Product(3, "Nokia mobile", 100));
        productList.add(new Product(4, "Samsung mobile", 180));
        productList.add(new Product(5, "Iphone mobile", 120));


  
        Product maxPriceProduct = productList.stream()
                        .max((product1, product4)->
                        product1.getPrice() > product4.getPrice() ? 1: -1).get();
        System.out.println("Max price product = "+maxPriceProduct);

     
        Product minPriceProduct = productList.stream()
                .min((product2, product3)->
                product2.getPrice() > product3.getPrice() ? 1: -1).get();
        System.out.println("Min price product = "+minPriceProduct);
        
        Stream<String> stream = Stream.of(
                "Sony mobile", "Lenovo mobile", "Nokia mobile", "Samsung mobile","Iphone mobile");
        stream.filter(str -> str.startsWith("S"))
        .forEach(System.out::println);
            
   
     
      //Stream<Product> filterStream=productList.stream() 
      //.filter(p ->p.getPrice()> 100 && p.getPrice()<200); 
     // .forEach(System.out::println);     
    
    }
}
      
      
    
      
        
        
        
      
           
            
        
        
        
    

 


	 