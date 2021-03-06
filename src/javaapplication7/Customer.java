
package javaapplication7;

/**
 *
 * @author AHMET BURAK DİNÇ || 05200000054
 */
public class Customer {
    private int id;
    private String name;
    
    public Customer(int id , String name){
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return "Id: " + getId() + " Name: " + getName();
    }
    
    
}
