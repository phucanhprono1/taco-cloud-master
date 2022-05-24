package tacos;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
@Data
@Entity
@NoArgsConstructor(access=AccessLevel.PUBLIC, force=true)
public class Ingredient {
    @Id
    private final String id;
    private final String name;
    @Enumerated(EnumType.STRING)
    private final Type type;

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }



    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}