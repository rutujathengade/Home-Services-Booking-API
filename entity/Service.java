
package Home_services.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double startingPrice;
    private double rating;

    public Service()
    {
    }

    public Service(String name, String description,
                   double startingPrice, double rating)
    {
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.rating = rating;
    }

    public Long getId()
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public double getStartingPrice()
    {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice)
    {
        this.startingPrice = startingPrice;
    }

    public double getRating()
    {
        return rating;
    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }
}
