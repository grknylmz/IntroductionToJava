package networking;

/**
 * Created by Gürkan on 25.3.2015.
 */
public class StudentAddress implements java.io.Serializable {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;

    public StudentAddress(String name, String street , String city , String state , String zip){
        this.city=city;
        this.name=name;
        this.state=state;
        this.street=street;
        this.zip=zip;

    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
}
