package com.hpplay.sdk.source.common.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.hpplay.sdk.source.log.SourceLog;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class HapplayUtils {
    private static final String TAG = "HapplayUtils";
    private static final boolean USE_LOOPBACK_ADDR = false;
    private static final boolean USE_ONLY_IPV4_ADDR = true;
    private static final boolean USE_ONLY_IPV6_ADDR = false;
    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] NUMBERS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static HashMap<String, String> mfMap = new HashMap<>();
    public static Application mApplication = null;

    public static boolean checkLoaclPort(int i10) {
        try {
            return isPortUsing("127.0.0.1", i10);
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
            return true;
        }
    }

    public static String getAppName(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
            return null;
        }
    }

    public static int getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            SourceLog.w(TAG, e10);
            return 0;
        }
    }

    public static Application getApplication() {
        Application application = mApplication;
        if (application != null) {
            return application;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            mApplication = (Application) cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, null), null);
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
        }
        return mApplication;
    }

    public static HashMap<String, String> getConfigMaps() {
        return mfMap;
    }

    public static final int getHostCount() {
        int i10 = 0;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    if (isUsableAddress(inetAddresses.nextElement())) {
                        i10++;
                    }
                }
            }
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
        }
        return i10;
    }

    public static final String getIpStr(int i10) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            int i11 = 0;
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (isUsableAddress(nextElement)) {
                        if (i11 < i10) {
                            i11++;
                        } else {
                            return nextElement.getHostAddress();
                        }
                    }
                }
            }
            return "";
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
            return "";
        }
    }

    public static String getJsonParams(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    jSONObject.put(str, map.get(str));
                } catch (Exception e10) {
                    SourceLog.w(TAG, e10);
                }
            }
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e A[Catch: Exception -> 0x0065, TryCatch #1 {Exception -> 0x0065, blocks: (B:5:0x0008, B:7:0x000e, B:8:0x001c, B:10:0x0022, B:13:0x002d, B:15:0x0039, B:19:0x0048), top: B:32:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getLoaclIp() {
        /*
            java.lang.String r0 = "HapplayUtils"
            r1 = 0
            java.util.Enumeration r2 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L67
            r3 = r1
        L8:
            boolean r4 = r2.hasMoreElements()     // Catch: java.lang.Exception -> L65
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r2.nextElement()     // Catch: java.lang.Exception -> L65
            java.net.NetworkInterface r4 = (java.net.NetworkInterface) r4     // Catch: java.lang.Exception -> L65
            java.util.Enumeration r5 = r4.getInetAddresses()     // Catch: java.lang.Exception -> L65
            java.lang.String r4 = r4.getDisplayName()     // Catch: java.lang.Exception -> L65
        L1c:
            boolean r6 = r5.hasMoreElements()     // Catch: java.lang.Exception -> L65
            if (r6 == 0) goto L8
            java.lang.Object r6 = r5.nextElement()     // Catch: java.lang.Exception -> L65
            java.net.InetAddress r6 = (java.net.InetAddress) r6     // Catch: java.lang.Exception -> L65
            boolean r7 = r6 instanceof java.net.Inet6Address     // Catch: java.lang.Exception -> L65
            if (r7 == 0) goto L2d
            goto L1c
        L2d:
            java.lang.String r7 = r6.getHostAddress()     // Catch: java.lang.Exception -> L65
            java.lang.String r8 = "127.0.0.1"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Exception -> L65
            if (r7 != 0) goto L1c
            java.lang.String r6 = r6.getHostAddress()     // Catch: java.lang.Exception -> L65
            java.lang.String r7 = "wlan0"
            boolean r7 = r7.equals(r4)     // Catch: java.lang.Exception -> L65
            if (r7 == 0) goto L47
            r1 = r6
            goto L48
        L47:
            r3 = r6
        L48:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L65
            r7.<init>()     // Catch: java.lang.Exception -> L65
            java.lang.String r8 = "getLoaclIp "
            r7.append(r8)     // Catch: java.lang.Exception -> L65
            r7.append(r6)     // Catch: java.lang.Exception -> L65
            java.lang.String r6 = "/"
            r7.append(r6)     // Catch: java.lang.Exception -> L65
            r7.append(r4)     // Catch: java.lang.Exception -> L65
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Exception -> L65
            com.hpplay.sdk.source.log.SourceLog.debug(r0, r6)     // Catch: java.lang.Exception -> L65
            goto L1c
        L65:
            r2 = move-exception
            goto L69
        L67:
            r2 = move-exception
            r3 = r1
        L69:
            com.hpplay.sdk.source.log.SourceLog.w(r0, r2)
        L6c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L73
            return r1
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hpplay.sdk.source.common.utils.HapplayUtils.getLoaclIp():java.lang.String");
    }

    public static String getMapParams(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(Operator.Operation.EQUALS);
                sb.append(map.get(str));
                sb.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
            }
        }
        if (!TextUtils.isEmpty(sb.toString()) && sb.length() > 1) {
            sb = new StringBuilder(sb.substring(0, sb.length() - 1));
        }
        return sb.toString();
    }

    public static String getMapParamsWithoutEmpty(Map<String, String> map) {
        String str = "";
        if (map != null) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (!TextUtils.isEmpty(str3)) {
                    str = str + str2 + Operator.Operation.EQUALS + str3 + DispatchConstants.SIGN_SPLIT_SYMBOL;
                }
            }
        }
        if (!TextUtils.isEmpty(str) && str.length() > 1) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static boolean getSystemPropertiesBoolean(String str, boolean z10) {
        try {
            boolean booleanValue = ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z10))).booleanValue();
            SourceLog.i(TAG, " get boolean SystemProperties ----> " + booleanValue);
            return booleanValue;
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
            return z10;
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
            java.lang.String r2 = "HapplayUtils"
            com.hpplay.sdk.source.log.SourceLog.w(r2, r1)
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hpplay.sdk.source.common.utils.HapplayUtils.getWifiIp():java.lang.String");
    }

    public static void initManufacture(Context context) {
        int i10;
        try {
            if (mfMap.size() == 0) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("mfConfig")));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append(",");
                }
                String[] split = sb.toString().split(",");
                int i11 = 0;
                while (i11 < split.length) {
                    int i12 = i11 + 1;
                    if (i12 % 2 == 0 && i12 < split.length) {
                        mfMap.put(split[i11], split[i11 - 1]);
                        SourceLog.debug(TAG, "key " + split[i11] + "  value " + split[i10]);
                    }
                    i11 = i12;
                }
            }
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
        }
    }

    public static boolean isNetworkConnected(Context context) {
        try {
            if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getType() != 1) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
            return false;
        }
    }

    public static boolean isPortUsing(String str, int i10) {
        try {
            try {
                new Socket(InetAddress.getByName(str), i10).close();
            } catch (IOException e10) {
                SourceLog.w(TAG, e10);
            }
            return true;
        } catch (IOException unused) {
            SourceLog.w(TAG, "isPortUsing IOException " + i10);
            return false;
        }
    }

    private static final boolean isUsableAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress() || (inetAddress instanceof Inet6Address)) {
            return false;
        }
        return true;
    }

    public static int parsePort(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e10) {
            SourceLog.w(TAG, e10);
            return 0;
        }
    }

    public static void setApplication(Application application) {
        mApplication = application;
    }
}
