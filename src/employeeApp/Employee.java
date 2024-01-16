package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String email;
    private String fullName;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Employee(int id, String email, String fullName, String password) {
        this(id, fullName);
        this.email = email;
        this.password = password;
    }

    public Employee(int id, String email, String fullName, String password, String[] healthPlans) {
        this(id, email, fullName, password);
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0)
            System.out.println("Index value must be zero or more");
        else {
            try {
                if (healthPlans[index] == null)
                    healthPlans[index] = name;
                else
                    System.out.println("Index is not null!");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Invalid index: " + index);
            } catch (Exception exception) {
                System.out.println("Error occurred: " + exception.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }


}
