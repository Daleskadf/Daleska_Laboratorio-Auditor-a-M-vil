package com.hpplay.component.protocol;

import android.content.Context;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import com.hpplay.component.common.utils.CLog;
import com.hpplay.component.protocol.encrypt.ED25519Encrypt;
import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import com.hpplay.component.utils.EncryptUtil;
import com.hpplay.cybergarage.soap.SOAP;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Enumeration;
/* loaded from: classes2.dex */
public class ProtocolUtils {
    public static final String CONTENT_LENGTH = "Content-Length:";
    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] NUMBERS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final String TAG = "ProtocolUtils";

    public static byte[] Encrypt(String str) {
        byte[] bArr = new byte[16];
        try {
            ED25519Encrypt eD25519Encrypt = new ED25519Encrypt();
            byte[] bytes = str.getBytes("UTF-8");
            eD25519Encrypt.strcrypt(bytes, bytes.length, bArr);
            for (int i10 = 0; i10 < 16; i10++) {
                bArr[i10] = (byte) (bArr[i10] ^ 120);
            }
            return bArr;
        } catch (Exception e10) {
            CLog.w(TAG, e10);
            return null;
        }
    }

    public static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 5];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            cArr[i11] = '0';
            int i13 = i12 + 1;
            cArr[i12] = 'x';
            int i14 = i13 + 1;
            char[] cArr2 = HEX_CHAR;
            cArr[i13] = cArr2[(b10 >>> 4) & 15];
            int i15 = i14 + 1;
            cArr[i14] = cArr2[b10 & 15];
            cArr[i15] = ASCIIPropertyListParser.ARRAY_ITEM_DELIMITER_TOKEN;
            i10++;
            i11 = i15 + 1;
        }
        return new String(cArr);
    }

    public static int bytesToInt(byte[] bArr) {
        return ((bArr[3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[0] & UnsignedBytes.MAX_VALUE) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static boolean checkLoaclPort(int i10) {
        try {
            return isPortUsing("127.0.0.1", i10);
        } catch (Exception e10) {
            CLog.w(TAG, e10);
            return true;
        }
    }

    public static String createSessionId(String str) {
        return EncryptUtil.md5EncryData((str + String.valueOf(System.currentTimeMillis())).toUpperCase()).toUpperCase();
    }

    public static String drEncrypt(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] bArr = new byte[16];
            ED25519Encrypt eD25519Encrypt = new ED25519Encrypt();
            byte[] bytes = str.getBytes("UTF-8");
            eD25519Encrypt.strcrypt(bytes, bytes.length, bArr);
            String str2 = "";
            for (int i10 = 0; i10 < 16; i10++) {
                String hexString = Integer.toHexString(bArr[i10] & UnsignedBytes.MAX_VALUE);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (Exception e10) {
            CLog.w(TAG, e10);
            return "";
        }
    }

    public static byte[] getBody(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 13 && bArr[i10 + 1] == 10 && bArr[i10 + 2] == 13) {
                int i11 = i10 + 3;
                if (bArr[i11] == 10) {
                    int i12 = i10 + 4;
                    int length = bArr.length - i12;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, i12, bArr2, 0, length);
                    CLog.d(TAG, "body totalLength" + (bArr.length - i11));
                    return bArr2;
                }
            }
        }
        return null;
    }

    public static int getContentLength(String str) {
        String[] split = str.split("\r\n");
        for (int i10 = 0; i10 < split.length; i10++) {
            if (split[i10].contains("Content-Length:")) {
                try {
                    int intValue = Integer.valueOf(split[i10].split(SOAP.DELIM)[1].toString().trim()).intValue();
                    CLog.d(TAG, "contentLength" + intValue + "");
                    return intValue;
                } catch (Exception e10) {
                    CLog.w(TAG, e10);
                    return 0;
                }
            }
        }
        return 0;
    }

    public static String getDateTime(long j10) {
        TimeZone timeZone;
        Calendar calendar;
        int i10;
        int i11;
        String valueOf;
        int i12;
        String valueOf2;
        int i13;
        String valueOf3;
        int i14;
        String valueOf4;
        int i15;
        String valueOf5;
        timeZone = TimeZone.getTimeZone("GMT+8");
        calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j10);
        i10 = calendar.get(1);
        i11 = calendar.get(2);
        int i16 = i11 + 1;
        if (String.valueOf(i16).length() == 1) {
            valueOf = "0" + i16;
        } else {
            valueOf = String.valueOf(i16);
        }
        i12 = calendar.get(5);
        if (String.valueOf(i12).length() == 1) {
            valueOf2 = "0" + i12;
        } else {
            valueOf2 = String.valueOf(i12);
        }
        i13 = calendar.get(11);
        if (String.valueOf(i13).length() == 1) {
            valueOf3 = "0" + i13;
        } else {
            valueOf3 = String.valueOf(i13);
        }
        i14 = calendar.get(12);
        if (String.valueOf(i14).length() == 1) {
            valueOf4 = "0" + i14;
        } else {
            valueOf4 = String.valueOf(i14);
        }
        i15 = calendar.get(13);
        if (String.valueOf(i15).length() == 1) {
            valueOf5 = "0" + i15;
        } else {
            valueOf5 = String.valueOf(i15);
        }
        return i10 + Operator.Operation.MINUS + valueOf + Operator.Operation.MINUS + valueOf2 + " " + valueOf3 + SOAP.DELIM + valueOf4 + SOAP.DELIM + valueOf5;
    }

    public static String getFileEncrypt(String str) {
        FileInputStream fileInputStream = null;
        try {
            try {
                byte[] bArr = new byte[8192];
                ED25519Encrypt eD25519Encrypt = new ED25519Encrypt();
                eD25519Encrypt.mdInit();
                FileInputStream fileInputStream2 = new FileInputStream(new File(str));
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
                        if (read != -1) {
                            eD25519Encrypt.mdUpdate(bArr, read);
                        } else {
                            fileInputStream2.close();
                            byte[] bArr2 = new byte[16];
                            eD25519Encrypt.mdDoFinal(bArr2);
                            String bigInteger = new BigInteger(1, bArr2).toString(16);
                            try {
                                fileInputStream2.close();
                                return bigInteger;
                            } catch (IOException e10) {
                                e10.printStackTrace();
                                return bigInteger;
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = fileInputStream2;
                        CLog.w(TAG, e);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    public static String getFirstLineOfHeader(byte[] bArr) {
        try {
            String[] split = new String(bArr).split("\n");
            if (split == null || split.length <= 0) {
                return "";
            }
            return split[0];
        } catch (Exception e10) {
            CLog.w(TAG, e10);
            return "";
        }
    }

    public static String getHeader(byte[] bArr) {
        int length = bArr.length;
        int indexOf = new String(bArr).indexOf("\r\n\r\n");
        byte[] bArr2 = new byte[indexOf];
        System.arraycopy(bArr, 0, bArr2, 0, indexOf);
        return new String(bArr2, 0, indexOf);
    }

    public static String getLoaclIp() {
        String str = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!(nextElement instanceof Inet6Address) && !"127.0.0.1".equals(nextElement.getHostAddress())) {
                            str = nextElement.getHostAddress();
                            break;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            CLog.w(TAG, e10);
        }
        return str;
    }

    public static boolean getProtocolDivide(ArrayList<Byte> arrayList) {
        if (arrayList.size() > 11 && arrayList.get(arrayList.size() - 1).byteValue() == 10 && arrayList.get(arrayList.size() - 2).byteValue() == 13 && arrayList.get(arrayList.size() - 3).byteValue() == 10 && arrayList.get(arrayList.size() - 4).byteValue() == 13) {
            return true;
        }
        return false;
    }

    public static String getStreaEncrypt(InputStream inputStream) {
        if (inputStream == null) {
            return "";
        }
        try {
            byte[] bArr = new byte[8192];
            ED25519Encrypt eD25519Encrypt = new ED25519Encrypt();
            eD25519Encrypt.mdInit();
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    eD25519Encrypt.mdUpdate(bArr, read);
                } else {
                    inputStream.close();
                    byte[] bArr2 = new byte[16];
                    eD25519Encrypt.mdDoFinal(bArr2);
                    return new BigInteger(1, bArr2).toString(16);
                }
            }
        } catch (Exception e10) {
            CLog.w(TAG, e10);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[Catch: SocketException -> 0x0036, TryCatch #0 {SocketException -> 0x0036, blocks: (B:3:0x0001, B:4:0x0005, B:6:0x000b, B:8:0x0021, B:10:0x0027, B:12:0x0031), top: B:17:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getWifiIp() {
        /*
            r0 = 0
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L36
        L5:
            boolean r2 = r1.hasMoreElements()     // Catch: java.net.SocketException -> L36
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.nextElement()     // Catch: java.net.SocketException -> L36
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.net.SocketException -> L36
            java.util.Enumeration r3 = r2.getInetAddresses()     // Catch: java.net.SocketException -> L36
            java.lang.String r2 = r2.getDisplayName()     // Catch: java.net.SocketException -> L36
            java.lang.String r4 = "wlan0"
            boolean r2 = r2.contains(r4)     // Catch: java.net.SocketException -> L36
            if (r2 == 0) goto L5
        L21:
            boolean r1 = r3.hasMoreElements()     // Catch: java.net.SocketException -> L36
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r3.nextElement()     // Catch: java.net.SocketException -> L36
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch: java.net.SocketException -> L36
            boolean r2 = r1 instanceof java.net.Inet4Address     // Catch: java.net.SocketException -> L36
            if (r2 == 0) goto L21
            java.lang.String r0 = r1.getHostAddress()     // Catch: java.net.SocketException -> L36
            goto L3c
        L36:
            r1 = move-exception
            java.lang.String r2 = "ProtocolUtils"
            com.hpplay.component.common.utils.CLog.w(r2, r1)
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hpplay.component.protocol.ProtocolUtils.getWifiIp():java.lang.String");
    }

    public static byte[] intToBytes(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)};
    }

    public static boolean isNetworkConnected(Context context) {
        try {
            if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getType() != 1) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            CLog.w(TAG, e10);
            return false;
        }
    }

    public static boolean isPortUsing(String str, int i10) {
        try {
            try {
                new Socket(InetAddress.getByName(str), i10).close();
            } catch (IOException e10) {
                CLog.w(TAG, e10);
            }
            return true;
        } catch (IOException e11) {
            CLog.w(TAG, e11);
            return false;
        }
    }

    public static byte[] removeHeader(byte[] bArr) {
        int length = bArr.length;
        String str = new String(bArr);
        int indexOf = str.indexOf("\r\n\r\n");
        int i10 = (length - indexOf) - 4;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, indexOf + 4, bArr2, 0, i10);
        if (new String(bArr2, 0, i10).startsWith("\n")) {
            int indexOf2 = str.indexOf("\r\n\r\n\n");
            int i11 = (length - indexOf2) - 6;
            byte[] bArr3 = new byte[i11];
            System.arraycopy(bArr, indexOf2 + 6, bArr3, 0, i11);
            return bArr3;
        }
        return bArr2;
    }

    public static String strEncrpyt(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            CLog.w(TAG, e10);
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            bytes = str.getBytes();
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] bArr = new byte[16];
            new ED25519Encrypt().strcrypt(bytes, bytes.length, bArr);
            char[] cArr2 = new char[32];
            int i10 = 0;
            for (int i11 = 0; i11 < 16; i11++) {
                byte b10 = bArr[i11];
                int i12 = i10 + 1;
                cArr2[i10] = cArr[(b10 >>> 4) & 15];
                i10 = i12 + 1;
                cArr2[i12] = cArr[b10 & 15];
            }
            return new String(cArr2);
        } catch (Exception e11) {
            CLog.w(TAG, e11);
            return null;
        }
    }

    public static byte[] strToMdHash(String str) {
        byte[] bArr = new byte[16];
        try {
            ED25519Encrypt eD25519Encrypt = new ED25519Encrypt();
            byte[] bytes = str.getBytes("UTF-8");
            eD25519Encrypt.mdInit();
            eD25519Encrypt.mdUpdate(bytes, bytes.length);
            eD25519Encrypt.mdDoFinal(bArr);
            return bArr;
        } catch (Exception e10) {
            CLog.w(TAG, e10);
            return null;
        }
    }
}
