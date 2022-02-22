package pl.matacz.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class ReservationCollectionDto {
    private List<ReservationDto> reservation;

    public ReservationCollectionDto()
    {

    }

    public ReservationCollectionDto(List<ReservationDto> orders)
    {
        this.reservation = reservation;
    }

    public List<ReservationDto> getReservation() {
        return reservation;
    }

    public void setReservation(List<ReservationDto> reservation) {
        this.reservation = reservation;
    }
}