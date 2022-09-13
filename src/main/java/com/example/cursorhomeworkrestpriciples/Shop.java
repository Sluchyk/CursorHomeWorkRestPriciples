package com.example.cursorhomeworkrestpriciples;

import java.util.Objects;

public class Shop {
    private long id;
    private String name;
    private String locationCity;
    private String locationStreet;
    private int quatityOfEployees;
    private boolean isWebSiteAvailable;

    public Shop(long id, String name, String locationCity, String locationStreet, int quatityOfEployees, boolean isWebSiteAvailable) {
        this.id = id;
        this.name = name;
        this.locationCity = locationCity;
        this.locationStreet = locationStreet;
        this.quatityOfEployees = quatityOfEployees;
        this.isWebSiteAvailable = isWebSiteAvailable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationStreet() {
        return locationStreet;
    }

    public void setLocationStreet(String locationStreet) {
        this.locationStreet = locationStreet;
    }

    public int getQuatityOfEployees() {
        return quatityOfEployees;
    }

    public void setQuatityOfEployees(int quatityOfEployees) {
        this.quatityOfEployees = quatityOfEployees;
    }

    public boolean isWebSiteAvailable() {
        return isWebSiteAvailable;
    }

    public void setWebSiteAvailable(boolean webSiteAvailable) {
        isWebSiteAvailable = webSiteAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return id == shop.id && quatityOfEployees == shop.quatityOfEployees && isWebSiteAvailable == shop.isWebSiteAvailable && name.equals(shop.name) && locationCity.equals(shop.locationCity) && locationStreet.equals(shop.locationStreet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, locationCity, locationStreet, quatityOfEployees, isWebSiteAvailable);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", locationCity='" + locationCity + '\'' +
                ", locationStreet='" + locationStreet + '\'' +
                ", quatityOfEployees=" + quatityOfEployees +
                ", isWebSiteAvailable=" + isWebSiteAvailable +
                '}';
    }
}
