package com.test4Begin;

import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.win32.StdCallLibrary;

/**
 * Created by lizhr on 2017/10/24.
 * Description:
 */
public interface DLLDemo extends StdCallLibrary {
    DLLDemo Instance = (DLLDemo) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
            DLLDemo.class);
    // printf为msvcrt.dll中的一个方法.
    void printf(String format, Object... args);
}
