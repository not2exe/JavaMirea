package ru.mirea.practices.pr1112;

public class Address {
    private final String country;
    private final String region;
    private final String city;
    private final String house;
    private final int housing;
    private final int flat;


    public Address(String address) {
        String [] strings=address.split("/|.|,| |_|\n|\t|\r");
        this.country = strings[0];
        this.region =strings[1];
        this.city = strings[2];
        this.house = strings[3];
        this.housing = Integer.parseInt(strings[4]);
        this. flat = Integer.parseInt(strings[5]);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", house='" + house + '\'' +
                ", housing=" + housing +
                ", flat=" + flat +
                '}';
    }
}
