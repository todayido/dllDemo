package com.testCom;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

/**
 * Created by Lee on 2017/10/26.
 * Description: Test the usage of the c sharp component
 */
public class testCom {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
            ActiveXComponent dotnetCom = new ActiveXComponent("DeviceCom.Class1");//DeviceCom is namespace and Class1 is the class name

            Variant var = Dispatch.call(dotnetCom,"add", 1,4);   //Call the method add() and it is parameters
            String str  = var.toString();  // return
            System.out.println(str);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
