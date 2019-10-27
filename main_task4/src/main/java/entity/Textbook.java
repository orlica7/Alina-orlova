package main.java.entity;

import java.util.Objects;

public class Textbook extends Edition {
    private String science;


    public Textbook(String name, int pages, int age, String science, EditionType type) {
        super(name, pages, age, type);
        this.science = science;
        }

    @Override
    public String toString() {
        return "Textbook{" +
                "science='" + science + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Textbook)) return false;
        if (!super.equals(o)) return false;
        Textbook textbook = (Textbook) o;
        return Objects.equals(science, textbook.science) &&
                type == textbook.type  &&
                Objects.equals(name, textbook.name) && pages == textbook.pages
                && age == textbook.age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getScience() {
        return science;
    }

}
