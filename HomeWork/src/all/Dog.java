package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dog implements Animal {
    private String name;
    private String color;
    private List<String> commands;
    private String dateOfBirth;

    public Dog() {
        this("", "", "", new ArrayList<>());
    }

    public Dog(String name, String color, String dateOfBirth, List<String> commands) {
        this.name = name;
        this.color = color;
        this.commands = commands;
        this.dateOfBirth = dateOfBirth;
    }

    // Получить имя собаки
    @Override
    public String getName() {
        return this.name;
    }

    // Установить имя собаки
    @Override
    public void setName(String name) {
        this.name = name;
    }

    // Добавить новую команду, если ее нет в списке
    @Override
    public void addCommand(String newCommand) {
        if (newCommand != null && !commands.contains(newCommand)) {
            commands.add(newCommand);
        }
    }

    // Удалить команду
    @Override
    public void removeCommand(String command) {
        commands.remove(command);
    }

    // Получить список команд
    @Override
    public List<String> getCommandList() {
        return commands;
    }

    // Получить цвет собаки
    @Override
    public String getColor() {
        return this.color;
    }

    // Получить количество команд
    @Override
    public int getCommandCount() {
        return commands.size();
    }

    // Установить цвет собаки
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    // Установить дату рождения
    @Override
    public void setDateBirth(String date) {
        this.dateOfBirth = date;
    }

    // Получить дату рождения
    @Override
    public String getDateBirth() {
        return this.dateOfBirth;
    }

    // Переопределение метода toString для печати информации о собаке
    @Override
    public String toString() {
        return "Собака " + name + " " + color + " - " + dateOfBirth;
    }

    // Переопределение метода equals для сравнения объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    // Переопределение метода hashCode для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}