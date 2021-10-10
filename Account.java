//Account class that contains name instance variable and methods to get and set name
public class Account{
    private String name; //instance variable
    public void setName(String name){
        this.name = name;//store the name
    }
    public String getName(){
        return name;//return value of name to the caller
    }
}