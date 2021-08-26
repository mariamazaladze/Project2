package variable;

import utils.DataConection;

import java.util.Random;

public class Parametrs {

    DataConection dataConection = new DataConection();


    public String name = dataConection.GetSelectResult(" select FIRST_NAME_LAT FROM [BANK2000].[dbo].[CLIENTS]where PERSONAL_ID='59001101085'");
    public String lastname = dataConection.GetSelectResult("  select LAST_NAME_LAT FROM [BANK2000].[dbo].[CLIENTS]where PERSONAL_ID='59001101085'");
    public String telephone = dataConection.GetSelectResult("  select PHONE2 FROM [BANK2000].[dbo].[CLIENTS]where PERSONAL_ID='59001101085'");

    // { creat mail.
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();

    String generatedString = random.ints(leftLimit, rightLimit + 1)
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

    public String mail = generatedString + "@yahoo.com";
    // }



    public String password = generatedString;
    public String ipodtouchCounter = "2";
    public String companyy = "TBC bank";
    public String address = "Tbilisi";
    public String postcode = "123456";
    //public String name="mariam";
    //public String lastname="azaladze";
    //public String telephone="123456789";
    //public String password=generatedString;


}
