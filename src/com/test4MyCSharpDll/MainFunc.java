package com.test4MyCSharpDll;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

/**
 * Created by lizhr on 2017/10/26.
 * Description:Test the dll in CSharp
 */
public interface MainFunc extends StdCallLibrary {

    /**
     * Created by Lee on 2017/11/2.
     * Description:
     * C++ code as fallows:
     *      extern "C" _declspec(dllexport)
                int add(int a, int b) {
                return a + b;
            }
     */
    MainFunc INSTANCE = (MainFunc) Native.loadLibrary("D:\\VC2017\\DllForJavaDemo\\Debug\\DllForJavaDemo.dll",
                    MainFunc.class);

    int add(int a, int b);
}
