package f3;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.I;
import h3.C1080b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
/* renamed from: f3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0989b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f11052a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f11053b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f11054c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f11055d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f11056e;
    public static String f;

    /* renamed from: g  reason: collision with root package name */
    public static int f11057g;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i7 = 0; i7 < length; i7++) {
            char[] cArr = f11052a;
            sb.append(cArr[(bArr[i7] & 240) >>> 4]);
            sb.append(cArr[bArr[i7] & 15]);
        }
        return sb.toString();
    }

    public static String b() {
        BufferedReader bufferedReader;
        String processName;
        if (f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f = processName;
            } else {
                int i7 = f11057g;
                if (i7 == 0) {
                    i7 = Process.myPid();
                    f11057g = i7;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                str = null;
                try {
                    if (i7 > 0) {
                        try {
                            String str2 = "/proc/" + i7 + "/cmdline";
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            try {
                                String readLine = bufferedReader.readLine();
                                I.i(readLine);
                                str = readLine.trim();
                                bufferedReader.close();
                            } catch (IOException unused) {
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                f = str;
                                return f;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (IOException unused4) {
                }
                f = str;
            }
        }
        return f;
    }

    public static byte[] c(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfo = ((Context) C1080b.a(context).f10587a).getPackageManager().getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i7 = 0;
            while (true) {
                if (i7 < 2) {
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i7++;
                } else {
                    messageDigest = null;
                    break;
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfo.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f11053b == null) {
            f11053b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f11053b.booleanValue() || Build.VERSION.SDK_INT >= 24) {
            if (f11054c == null) {
                f11054c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f11054c.booleanValue()) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 26 || i7 >= 30) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void e(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z7 = true;
        for (String str : hashMap.keySet()) {
            if (!z7) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z7 = false;
        }
        sb.append("}");
    }
}
