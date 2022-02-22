package pl.matacz.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class HotelsCollectionDto {

    private List<HotelDto> hotel;

    public HotelsCollectionDto()
    {

    }

    public HotelsCollectionDto(List<HotelDto> hotel)
    {
        this.hotel = hotel;
    }

    public List<HotelDto> getHotel() {
        return hotel;
    }

    public void setHotel(List<HotelDto> hotel) {
        this.hotel = hotel;
    }
}