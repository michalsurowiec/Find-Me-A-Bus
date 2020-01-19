package pl.arrivalModel;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ArrivalService {

    private ArrivalRepository arrivalRepository;

    public ArrivalService(ArrivalRepository arrivalRepository){
        this.arrivalRepository = arrivalRepository;
    }

    public void create(Arrival arrival){
        arrivalRepository.save(arrival);
    }

    public Arrival read(Long id){
        Optional<Arrival> optionalArrival = arrivalRepository.findById(id);
        return optionalArrival.orElse(null);
    }

    public void update(Arrival arrival){
        arrivalRepository.save(arrival);
//        Arrival originalArrival = arrivalRepository.getOne(arrival.getId());
//        originalArrival.setId(arrival.getId());
//        originalArrival.setLine(arrival.getLine());
//        originalArrival.setFunctioningDays(arrival.getFunctioningDays());
//        originalArrival.setCourse(arrival.getCourse());
//        originalArrival.setBusStop(arrival.getBusStop());
//        originalArrival.setArrivalHour(arrival.getArrivalHour());
//        arrivalRepository.save(originalArrival);
    }

    public void delete(Long id){
        if (arrivalRepository.findById(id).isPresent()){
            arrivalRepository.delete(arrivalRepository.findById(id).get());
        }
    }
}
