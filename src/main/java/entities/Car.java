package entities;

import lombok.Getter;

public class Car {
    public Car(boolean a){
        cool = a;
    }
    @Getter
    private Boolean cool; //Поле может быть null

    @Override
    public String toString() {
        return "Car{" +
                "cool=" + cool +
                '}';
    }
}
