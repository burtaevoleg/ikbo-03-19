package Lesson_12.PRAC.task2;

import java.util.StringTokenizer;

public class Address {
    private final String country;
    private final String region;
    private final String city;
    private final String street;
    private final String house;
    private final String flat;

    public Address(String fullAddress) {
        String result[]=fullAddress.split(",");
        this.country=result[0].trim();
        this.region=result[1].trim();
        this.city=result[2].trim();
        this.street=result[3].trim();
        this.house=result[4].trim();
        this.flat=result[5].trim();
    }
    public Address(String fullAddress, String stringTokenizer) {
        StringTokenizer result=new StringTokenizer(fullAddress,stringTokenizer);
        this.country= result.nextToken().trim();
        this.region=result.nextToken().trim();
        this.city=result.nextToken().trim();
        this.street=result.nextToken().trim();
        this.house=result.nextToken().trim();
        this.flat=result.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "страна='" + country + '\'' +
                ", регион='" + region + '\'' +
                ", город='" + city + '\'' +
                ", улица='" + street + '\'' +
                ", дом='" + house + '\'' +
                ", квартира='" + flat + '\'' +
                '}';
    }
}
