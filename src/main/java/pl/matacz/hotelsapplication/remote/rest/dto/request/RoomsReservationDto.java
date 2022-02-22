package pl.matacz.hotelsapplication.remote.rest.dto.request;

public class RoomsReservationDto {
    private Integer id;
    private Integer roomId;
    private Integer days;
    public RoomsReservationDto() {
    }

    public RoomsReservationDto(Integer id, Integer sizeId, Integer count) {
        this.id = id;
        this.roomId = sizeId;
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer sizeId) {
        this.roomId = sizeId;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer count) {
        this.days = days;
    }
}
