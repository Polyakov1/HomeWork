package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hamster implements Animal {
    private String name;
    private String color;
    private List<String> commands;
    private String dateBirth;

    public Hamster() {
        this("", "", "", new ArrayList<>());
    }

    public Hamster(String name, String color, String dateBirth, List<String> commands) {
        this.name = name;
        this.color = color;
        this.dateBirth = dateBirth;
        this.commands = commands;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addCommand(String newCommand) {
        if (!commands.contains(newCommand)) {
            commands.add(newCommand);
        }
    }

    @Override
    public void removeCommand(String command) {
        commands.remove(command);
    }

    @Override
    public List<String> getCommandList() {
        return commands;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getCommandCount() {
        return commands.size();
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setDateBirth(String date) {
        this.dateBirth = date;
    }

    @Override
    public String getDateBirth() {
        return dateBirth;
    }

    @Override
    public String toString() {
        return "Хомяк " + name + " " + color + " - " + dateBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamster hamster = (Hamster) o;
        return Objects.equals(name, hamster.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}