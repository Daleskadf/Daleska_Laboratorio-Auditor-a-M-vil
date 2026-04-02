package com.adobe.air.utils;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class DeviceInfo {
    static String getHardwareInfo() {
        byte[] bArr;
        InputStream inputStream;
        int read;
        String str;
        int indexOf;
        int indexOf2;
        try {
            bArr = new byte[2048];
            inputStream = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start().getInputStream();
            read = inputStream.read(bArr, 0, 2048);
        } catch (IOException unused) {
        }
        if (read >= 0 && (indexOf = (str = new String(bArr, 0, read)).indexOf("Hardware")) >= 0 && (indexOf2 = str.indexOf(58, indexOf)) >= 0) {
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(10, i);
            if (indexOf3 == -1) {
                indexOf3 = str.length();
            }
            return str.substring(i, indexOf3).trim();
        }
        inputStream.close();
        return new String("");
    }

    static String getTotalMemory() {
        byte[] bArr;
        InputStream inputStream;
        int read;
        String str;
        int indexOf;
        int indexOf2;
        try {
            bArr = new byte[1024];
            inputStream = new ProcessBuilder("/system/bin/cat", "/proc/meminfo").start().getInputStream();
            read = inputStream.read(bArr, 0, 1024);
        } catch (IOException unused) {
        }
        if (read >= 0 && (indexOf = (str = new String(bArr, 0, read)).indexOf("MemTotal")) >= 0 && (indexOf2 = str.indexOf(58, indexOf)) >= 0) {
            int i = indexOf2 + 1;
            return str.substring(i, str.indexOf(10, i)).trim();
        }
        inputStream.close();
        return new String("");
    }

    static String getCPUCount() {
        byte[] bArr;
        InputStream inputStream;
        int read;
        try {
            bArr = new byte[1024];
            inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/present").start().getInputStream();
            read = inputStream.read(bArr, 0, 1024);
        } catch (IOException unused) {
        }
        if (read >= 0) {
            String str = new String(bArr, 0, read);
            int indexOf = str.indexOf("-");
            if (indexOf >= 0) {
                return Integer.toString(Integer.parseInt(str.substring(indexOf + 1, indexOf + 2)) + 1);
            }
            return Integer.toString(Integer.parseInt(str.substring(0, 1)) + 1);
        }
        inputStream.close();
        return new String("");
    }
}
