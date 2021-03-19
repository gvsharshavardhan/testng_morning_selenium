package com.testng.dataProvider;

import org.testng.annotations.Test;
import testdata.FormData;

import java.util.Map;

public class DataProviderTest {

    @Test(dataProvider = "mydata", dataProviderClass = testdata.LoginData.class, enabled = false)
    public void testLogin(FormData fd) {
        System.out.println(fd.getName());
        System.out.println(fd.getSalary());
        System.out.println(fd.getClgname());
        System.out.println(fd.getRollnum());
        System.out.println("***********************************");
    }

    @Test(dataProvider = "mymapdata", dataProviderClass = testdata.LoginData.class)
    public void testMap(Map<String, String> m) {
        for (Map.Entry e : m.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
        System.out.println("#####################################");
    }
}