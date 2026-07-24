package dev.JpDev17.starwarscreator.planet;

import dev.JpDev17.starwarscreator.character.StarWarsCharacter;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_planet")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String region;
    private String climate;
    private Long population;

    @OneToMany(mappedBy = "planet")
    private List<StarWarsCharacter> inhabitants;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public List<StarWarsCharacter> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(List<StarWarsCharacter> inhabitants) {
        this.inhabitants = inhabitants;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", climate='" + climate + '\'' +
                ", population=" + population +
                ", inhabitants=" + inhabitants +
                '}';
    }
}
