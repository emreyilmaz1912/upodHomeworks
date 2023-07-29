package practices.studentUsers;

public class Users {
    String id;
    String name;
    String surname;
    String userName;
    String password;

    public Users(String id, String name, String surname, String userName, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "id:" + id + "Name: " + name + ", Surname: " + surname + ", UserName: " + userName + ", Password: " + password;
    }
    public Users(){
        this("","","","","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
