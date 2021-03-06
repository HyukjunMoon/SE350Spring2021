/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment2.solution.exercise4;

public abstract class Item {
    private String id;
    private String title;
    private String name;
    private int price;
    private String genre;
    public Item(String id, String title, String name, int price, String genre) {
        super();
        setId(id);
        setTitle(title);
        setName(name);
        setPrice(price);
        setGenre(genre);
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}