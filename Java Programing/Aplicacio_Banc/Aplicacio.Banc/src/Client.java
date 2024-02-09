import java.time.LocalDate;

public class Client {
    private String name;
    private String lastName;
    private String addres;
    private String city;
    private LocalDate birthDate;
    public Client(String name , String lastName , String addres , String city , LocalDate birthDate){
        this.name = name;
        this.lastName = lastName;
        this.addres = addres;
        this.city = city;
        this.birthDate = birthDate;
    }
    public Client(){
    }
    public String fulName(){
        String fullName = "Name: "+ this.name+ " " + "Last Name: "+ this.lastName;
        return fullName;
    }
    public String fulAdrress(){
        String fullAdrress = this.addres + " " + " " + this.city;
        return fullAdrress;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddres() {
        return this.addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public LocalDate getBirthDate() {
        return this.birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}