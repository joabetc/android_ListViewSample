package com.example.listviewsample;

import java.util.Objects;

public class Languages {

    private String name;
    private int logo;

    public Languages(String name, int logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Languages)) return false;
        Languages languages = (Languages) o;
        return getLogo() == languages.getLogo() &&
                Objects.equals(getName(), languages.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLogo());
    }

    @Override
    public String toString() {
        return "com.example.listviewsample.Languages{" +
                "name='" + name + '\'' +
                ", logo=" + logo +
                '}';
    }
}
