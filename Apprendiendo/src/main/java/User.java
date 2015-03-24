import org.hibernate.annotations.*;

import java.util.Date;

/**
 * Created by Nash on 24/03/15
 */
@Entity
//@Table(name = "EMPLOYEE")
public class User {
    private String lastName;
    private String name;
    private String mail;
    private String password;
    private Date born; // TODO -> Ver
    private int documentType;
    private int documentNumber;
    private String country;
    private String province;
    private String city;


}
