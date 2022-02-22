package pl.matacz.hotelsapplication.remote.rest.dto.response;
import pl.matacz.hotelsapplication.domain.model.ReservationStatusType;
import pl.matacz.hotelsapplication.remote.rest.dto.request.PersonDto;
import pl.matacz.hotelsapplication.remote.rest.dto.request.RoomsReservationDto;
import java.util.List;
public class ReservationsDto {
    private Integer id;
    private ReservationStatusType status;
    private List<RoomsReservationDto> rooms;
    private PersonDto person;
    public ReservationsDto(){
    }

    public ReservationsDto(Integer id, ReservationStatusType status, List<RoomsReservationDto> rooms, PersonDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomsReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomsReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}