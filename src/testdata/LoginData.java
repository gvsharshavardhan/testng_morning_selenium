package testdata;

import org.testng.annotations.DataProvider;

import java.util.HashMap;
import java.util.Map;

public class LoginData {

    @DataProvider(name = "mydata")
    public Object[] pumpData() {
        FormData fd1 = new FormData("harsha", 22, "jntu", 45000.89);
        FormData fd2 = new FormData("goutham", 46, "iit", 56660.89);
        FormData fd3 = new FormData("vineeth", 31, "nit", 89990.89);
        FormData fd4 = new FormData("ravi", 89, "mit", 37689.89);
        Object[] data = {fd1, fd2, fd3, fd4};
        return data;
    }

    @DataProvider(name="mymapdata")
    public Object[] pumpData2(){
        Map m1 = new HashMap();
        Map m2 = new HashMap();
        Map m3 = new HashMap();

        m1.put("name","harsha");
        m1.put("empid","234");
        m1.put("branch","hyd");

        m2.put("name","goutham");
        m2.put("empid","456");
        m2.put("branch","chennai");

        m3.put("name","sai");
        m3.put("empid","2888");
        m3.put("branch","delhi");

        Object[] employees = {m1,m2,m3};
        return employees;
    }
}