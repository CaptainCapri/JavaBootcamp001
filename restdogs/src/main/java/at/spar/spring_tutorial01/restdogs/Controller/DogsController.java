package at.spar.spring_tutorial01.restdogs.Controller;

import at.spar.spring_tutorial01.restdogs.domain.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController(value = "/dogs")

public class DogsController {

    @GetMapping(value = "/(name)")
    public Dog getDog(@PathVariable(value = "name") String name){

        return getDummyDog();

    }

    private Dog getDummyDog(){
        Dog bo = new Dog();
        bo.setAge(3);
        bo.setColour("blue");
        bo.setName("bo");
        return bo;



    }

}
