package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cat implements Animal {
    private String name;
    private String color;
    private List<String> commands;
    private String dateBirth;

    public Cat() {
        this("", "", "", new ArrayList<>());
    }

    public Cat(String name, String color, String dateBirth, List<String> commands) {
        this.name = name;
        this.color = color;
        this.commands = commands;
        this.dateBirth = dateBirth;
    }

    // Получить имя кошки
    @Override
    public String getName() {
        return this.name;
    }

    // Установить имя кошки
    @Override
    public void setName(String name) {
        this.name = name;
    }

    // Добавить новую команду
    @Override
    public void addCommand(String newCommand) {
        if (newCommand != null && commands.stream().noneMatch(c -> c.equals(newCommand))) {
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

    // Получить цвет кошки
    @Override
    public String getColor() {
        return this.color;
    }

    // Получить количество команд
    @Override
    public int getCommandCount() {
        return commands.size();
    }

    // Установить цвет кошки
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    // Установить дату рождения
    @Override
    public void setDateBirth(String date) {
        this.dateBirth = date;
    }

    // Получить дату рождения
    @Override
    public String getDateBirth() {
        return this.dateBirth;
    }

    // Переопределение метода toString для печати информации о кошке
    @Override
    public String toString() {
        return "Кот " + name + " " + color + " - " + dateBirth;
    }

    // Переопределение метода equals для сравнения объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    // Переопределение метода hashCode для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}