import java.io.Serializable;
public class AddProductBean implements Serializable
{
   String itemid,itemname,description;
   float price;

    public AddProductBean() 
    {
           }
    
    public String getItemid() {
        return itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
   
}
