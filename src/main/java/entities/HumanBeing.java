package entities;

import collections.IdCollection;
import lombok.*;

@Getter
@EqualsAndHashCode(of = {"id" , "name"})
@RequiredArgsConstructor
public class HumanBeing {
    public HumanBeing(int id,String name, Coordinates coordinates, boolean realHero,
                      boolean hasToothpick, Float impactSpeed, Integer minutesOfWaiting,WeaponType weaponType, Mood mood, Car car){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.realHero = realHero;
        this.hasToothpick = hasToothpick;
        this.impactSpeed = impactSpeed;
        this.minutesOfWaiting = minutesOfWaiting;
        this.weaponType = weaponType;
        this.mood = mood;
        this.car = car;
        IdCollection.idCollection.add(id);
    }
    @NonNull
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    @NonNull
    private String name; //Поле не может быть null, Строка не может быть пустой
    @NonNull
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    @NonNull
    private boolean realHero;
    @NonNull
    private boolean hasToothpick;
    @NonNull
    private Float impactSpeed; //Поле может быть null
    @NonNull
    private Integer minutesOfWaiting; //Поле может быть null
    @NonNull
    private WeaponType weaponType; //Поле может быть null
    @NonNull
    private Mood mood; //Поле может быть null
    @NonNull
    private Car car; //Поле не может быть null

    @Override
    public String toString() {
        return id +
                "," + name + "," +
                + coordinates.getX() +
                ","+ coordinates.getY() +"," + realHero +
                "," + hasToothpick +
                "," + impactSpeed +
                "," + minutesOfWaiting +
                "," + weaponType +
                "," + mood +
                "," + car.getCool();
    }
}
