package org.example;

import dev.failsafe.internal.util.Assert;

public class DataUtils {
    @org.testng.annotations.DataProvider(name="login",indices = {0})
    public Object[][] getData() {
        String[][] data= new String[2][2];
        data[0][0]="koushik350@gmail.com";
        data[0][1]="Pass123$";
        data[1][0]="koushik1@letcode.com";
        data[1][1]="Pass123$";
        return data;

    }
}
