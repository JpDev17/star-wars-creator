package dev.JpDev17.starwarscreator.affiliation;

import dev.JpDev17.starwarscreator.character.StarWarsCharacter;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_affiliation")
public class Affiliation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String affiliationName;

    @OneToMany(mappedBy = "affiliation")
    private List<StarWarsCharacter> members;

    public Affiliation(Long id, String affiliationName, List<StarWarsCharacter> members) {
        this.id = id;
        this.affiliationName = affiliationName;
        this.members = members;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAffiliationName() {
        return affiliationName;
    }

    public void setAffiliationName(String affiliationName) {
        this.affiliationName = affiliationName;
    }

    public List<StarWarsCharacter> getMembers() {
        return members;
    }

    public void setMembers(List<StarWarsCharacter> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Affiliation{" +
                "id=" + id +
                ", affiliationName='" + affiliationName + '\'' +
                ", members=" + members +
                '}';
    }
}
