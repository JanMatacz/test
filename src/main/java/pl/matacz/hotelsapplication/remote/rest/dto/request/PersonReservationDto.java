package pl.matacz.hotelsapplication.remote.rest.dto.request;

import java.math.BigDecimal;

public class PersonReservationDto {
    private String name;
    private BigDecimal phone;
    private String address;
    private Integer floor;
    public PersonReservationDto() {
    }

    public PersonReservationDto(String name, BigDecimal phone, String address, Integer floor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPhone() {
        return phone;
    }

    public void setPhone(BigDecimal phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
