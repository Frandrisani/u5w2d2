package francescoandrisani.u5w2d2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String birthDate;
    private String avatar;


    public Author(int id, String name, String surname, String email, String birthDate, String avatar) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
        this.avatar = avatar;
    }
}
