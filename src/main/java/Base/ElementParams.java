package Base;

public class ElementParams {
    public static String registerCSS = "#loginPanel > p:nth-child(3) > a";
    public static String registerFirstName = "customer.firstName";
    public static String registerLastName = "customer.lastName";
    public static String registerAddress = "customer.address.street";
    public static String registerCity = "customer.address.city";
    public static String registerState = "customer.address.state";
    public static String registerZipCode = "customer.address.zipCode";
    public static String registerBtnRegister = "#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input";

    public String paramsRead(String fieldName){
        String param = "";
        if (fieldName.equals("Register")) param = registerCSS;
        else if (fieldName.equals("Username")) param = registerFirstName;
        else if (fieldName.equals("LastName")) param = registerLastName;
        else if (fieldName.equals("Adress")) param = registerAddress;
        else if (fieldName.equals("City")) param = registerCity;
        else if (fieldName.equals("State")) param = registerState;
        else if (fieldName.equals("ZipCode")) param = registerZipCode;
        else if (fieldName.equals("registerBtnRegister")) param = registerBtnRegister;

        return param;
    }
}
