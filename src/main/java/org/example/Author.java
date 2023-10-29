package org.example;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private boolean alta;

    public Author(Integer id, String name, boolean alta) {
        this.id = id;
        this.name = name;
        this.alta = alta;
    }

    public Author() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alta=" + alta +
                '}';
    }
}
