package Assignments;

public class Task {

    private String description, name;

    public Task(String n, String d) {
        d = description;
        n = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\n=======\n";
    }

    public boolean validate() {
        if (name == null || description == null || name.equals("") || description.equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
