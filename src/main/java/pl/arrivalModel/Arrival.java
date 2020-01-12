package pl.arrivalModel;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

@Data
@Entity
public class Arrival{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private byte line;
    String functioningDays;
    private byte course;
    String busStop;
    Time arrivalHour;
}
