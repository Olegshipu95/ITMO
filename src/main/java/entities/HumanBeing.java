package entities;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HumanBeing {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически

    
    private String name; //Поле не может быть null, Строка не может быть пустой

    private Coordinates coordinates; //Поле не может быть null

    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private boolean realHero;
    private boolean hasToothpick;
    private Float impactSpeed; //Поле может быть null

    private Integer minutesOfWaiting; //Поле может быть null

    private WeaponType weaponType; //Поле может быть null

    private Mood mood; //Поле может быть null

    private Car car; //Поле не может быть null


    @Override
    public int hashCode() {
        return this.id;
    }
    @Override
    public String toString() {
        return String.format("Flat{id=%d, name=%s, coordinates=%s, creationDate=%s, " +
                        "realHero=%b, hasToothpick=%b, impactSpeed=%f, minutesOfWaiting=%d, weaponType=%s, mood=%s, car=%s}",
                id, name, coordinates, creationDate, realHero, hasToothpick, impactSpeed, minutesOfWaiting, weaponType, mood, car);
    }
}
