// Bill Ruben
// Exercise 4-1  p.156 
public class Sandwich 
{
    private String main;
    private String bread;
    private double price;

    public void setMain(String food) 
    {
        main = food;
    }
    public void setBread(String type) 
    {
        bread = type;
    }
    public void setPrice(double servicePrice) 
    {
        price = servicePrice;
    }
    public String getMain() 
    {
        return main;
    }
    public String getBread() 
    {
        return bread;
    }
    public double getPrice() 
    {
        return price;
    }

}