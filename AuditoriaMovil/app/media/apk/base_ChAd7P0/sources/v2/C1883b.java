package v2;

import B5.AbstractActivityC0032e;
import H4.e1;
import H4.p1;
import K5.m;
import L5.t;
import L5.v;
import W.L;
import X.d;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.utils.XMLReaderUtils;
/* renamed from: v2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883b implements t, v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16035a;

    /* renamed from: b  reason: collision with root package name */
    public m f16036b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractActivityC0032e f16037c;

    /* renamed from: d  reason: collision with root package name */
    public int f16038d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap f16039e;

    public C1883b(Context context) {
        this.f16035a = context;
    }

    public final int a(int i7) {
        int i8;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i9 = 0;
        Context context = this.f16035a;
        if (i7 == 17) {
            if (Build.VERSION.SDK_INT < 33) {
                if (new L(context).a()) {
                    return 1;
                }
                return 0;
            } else if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                return 1;
            } else {
                return android.support.v4.media.session.a.j(this.f16037c, "android.permission.POST_NOTIFICATIONS");
            }
        } else if (i7 == 21) {
            ArrayList p7 = android.support.v4.media.session.a.p(context, 21);
            if (p7 != null && !p7.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        } else if ((i7 == 30 || i7 == 28 || i7 == 29) && Build.VERSION.SDK_INT < 31) {
            ArrayList p8 = android.support.v4.media.session.a.p(context, 21);
            if (p8 != null && !p8.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        } else if ((i7 == 37 || i7 == 0) && !b()) {
            return 0;
        } else {
            ArrayList p9 = android.support.v4.media.session.a.p(context, i7);
            if (p9 == null) {
                Log.d("permissions_handler", "No android specific permissions needed for: " + i7);
                return 1;
            } else if (p9.size() == 0) {
                Log.d("permissions_handler", "No permissions found in manifest for: " + p9 + i7);
                if (i7 != 22 || Build.VERSION.SDK_INT >= 30) {
                    return 0;
                }
                return 2;
            } else {
                if (context.getApplicationInfo().targetSdkVersion >= 23) {
                    HashSet hashSet = new HashSet();
                    Iterator it = p9.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (i7 == 16) {
                            String packageName = context.getPackageName();
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                                hashSet.add(1);
                            } else {
                                hashSet.add(Integer.valueOf(i9));
                            }
                        } else if (i7 == 22) {
                            if (Build.VERSION.SDK_INT < 30) {
                                hashSet.add(2);
                            }
                            isExternalStorageManager = Environment.isExternalStorageManager();
                            hashSet.add(Integer.valueOf(isExternalStorageManager ? 1 : 0));
                        } else if (i7 == 23) {
                            hashSet.add(Integer.valueOf(Settings.canDrawOverlays(context) ? 1 : 0));
                        } else if (i7 == 24) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                                hashSet.add(Integer.valueOf(canRequestPackageInstalls ? 1 : 0));
                            }
                        } else if (i7 == 27) {
                            hashSet.add(Integer.valueOf(((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                        } else if (i7 == 34) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                canScheduleExactAlarms = ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms();
                                hashSet.add(Integer.valueOf(canScheduleExactAlarms ? 1 : 0));
                            } else {
                                hashSet.add(1);
                            }
                        } else if (i7 != 9 && i7 != 32) {
                            if (d.checkSelfPermission(context, str) != 0) {
                                hashSet.add(Integer.valueOf(android.support.v4.media.session.a.j(this.f16037c, str)));
                            }
                        } else {
                            int checkSelfPermission = d.checkSelfPermission(context, str);
                            if (Build.VERSION.SDK_INT >= 34) {
                                i8 = d.checkSelfPermission(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                            } else {
                                i8 = checkSelfPermission;
                            }
                            if (i8 == 0 && checkSelfPermission == -1) {
                                hashSet.add(3);
                            } else if (checkSelfPermission == 0) {
                                hashSet.add(1);
                            } else {
                                hashSet.add(Integer.valueOf(android.support.v4.media.session.a.j(this.f16037c, str)));
                            }
                        }
                        i9 = 0;
                    }
                    if (!hashSet.isEmpty()) {
                        return android.support.v4.media.session.a.B(hashSet).intValue();
                    }
                }
                return 1;
            }
        }
    }

    public final boolean b() {
        boolean z7;
        boolean z8;
        ArrayList p7 = android.support.v4.media.session.a.p(this.f16035a, 37);
        if (p7 != null && p7.contains("android.permission.WRITE_CALENDAR")) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (p7 != null && p7.contains("android.permission.READ_CALENDAR")) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 && z8) {
            return true;
        }
        if (!z7) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z8) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void c(int i7, String str) {
        if (this.f16037c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f16037c.getPackageName()));
        }
        this.f16037c.startActivityForResult(intent, i7);
        this.f16038d++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L5.t
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        boolean z7;
        int i9;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i10;
        AbstractActivityC0032e abstractActivityC0032e = this.f16037c;
        boolean z8 = false;
        z8 = false;
        if (abstractActivityC0032e == null) {
            return false;
        }
        if (this.f16039e == null) {
            this.f16038d = 0;
            return false;
        }
        if (i7 == 209) {
            Context context = this.f16035a;
            String packageName = context.getPackageName();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                z8 = true;
            }
            i9 = 16;
            i10 = z8;
        } else if (i7 == 210) {
            if (Build.VERSION.SDK_INT >= 30) {
                isExternalStorageManager = Environment.isExternalStorageManager();
                i9 = 22;
                i10 = isExternalStorageManager;
            } else {
                return false;
            }
        } else if (i7 == 211) {
            i9 = 23;
            i10 = Settings.canDrawOverlays(abstractActivityC0032e);
        } else if (i7 == 212) {
            if (Build.VERSION.SDK_INT >= 26) {
                canRequestPackageInstalls = abstractActivityC0032e.getPackageManager().canRequestPackageInstalls();
                i9 = 24;
                i10 = canRequestPackageInstalls;
            } else {
                return false;
            }
        } else if (i7 == 213) {
            i9 = 27;
            i10 = ((NotificationManager) abstractActivityC0032e.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else if (i7 != 214) {
            return false;
        } else {
            AlarmManager alarmManager = (AlarmManager) abstractActivityC0032e.getSystemService("alarm");
            if (Build.VERSION.SDK_INT >= 31) {
                canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                z7 = canScheduleExactAlarms;
            } else {
                z7 = true;
            }
            i9 = 34;
            i10 = z7;
        }
        this.f16039e.put(Integer.valueOf(i9), Integer.valueOf(i10));
        int i11 = this.f16038d - 1;
        this.f16038d = i11;
        m mVar = this.f16036b;
        if (mVar != null && i11 == 0) {
            mVar.f2706b.a(this.f16039e);
        }
        return true;
    }

    @Override // L5.v
    public final boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        int i8;
        int i9 = 14;
        int i10 = 0;
        if (i7 != 24) {
            this.f16038d = 0;
            return false;
        } else if (this.f16039e == null) {
            return false;
        } else {
            if (strArr.length == 0 && iArr.length == 0) {
                this.f16038d = 0;
                Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
                return false;
            }
            List asList = Arrays.asList(strArr);
            int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
            if (indexOf >= 0) {
                int C7 = android.support.v4.media.session.a.C(this.f16037c, "android.permission.WRITE_CALENDAR", iArr[indexOf]);
                this.f16039e.put(36, Integer.valueOf(C7));
                int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
                if (indexOf2 >= 0) {
                    int C8 = android.support.v4.media.session.a.C(this.f16037c, "android.permission.READ_CALENDAR", iArr[indexOf2]);
                    Integer valueOf = Integer.valueOf(C7);
                    Integer valueOf2 = Integer.valueOf(C8);
                    HashSet hashSet = new HashSet();
                    hashSet.add(valueOf);
                    hashSet.add(valueOf2);
                    Integer B7 = android.support.v4.media.session.a.B(hashSet);
                    this.f16039e.put(37, B7);
                    this.f16039e.put(0, B7);
                }
            }
            int i11 = 0;
            while (i11 < strArr.length) {
                String str = strArr[i11];
                if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                    int i12 = -1;
                    switch (str.hashCode()) {
                        case -2062386608:
                            if (str.equals("android.permission.READ_SMS")) {
                                i12 = i10;
                                break;
                            }
                            break;
                        case -1928411001:
                            if (str.equals("android.permission.READ_CALENDAR")) {
                                i12 = 1;
                                break;
                            }
                            break;
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                i12 = 2;
                                break;
                            }
                            break;
                        case -1921431796:
                            if (str.equals("android.permission.READ_CALL_LOG")) {
                                i12 = 3;
                                break;
                            }
                            break;
                        case -1888586689:
                            if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                i12 = 4;
                                break;
                            }
                            break;
                        case -1813079487:
                            if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                                i12 = 5;
                                break;
                            }
                            break;
                        case -1783097621:
                            if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                                i12 = 6;
                                break;
                            }
                            break;
                        case -1561629405:
                            if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                                i12 = 7;
                                break;
                            }
                            break;
                        case -1479758289:
                            if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                                i12 = 8;
                                break;
                            }
                            break;
                        case -1238066820:
                            if (str.equals("android.permission.BODY_SENSORS")) {
                                i12 = 9;
                                break;
                            }
                            break;
                        case -1164582768:
                            if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                                i12 = 10;
                                break;
                            }
                            break;
                        case -909527021:
                            if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                                i12 = 11;
                                break;
                            }
                            break;
                        case -895679497:
                            if (str.equals("android.permission.RECEIVE_MMS")) {
                                i12 = 12;
                                break;
                            }
                            break;
                        case -895673731:
                            if (str.equals("android.permission.RECEIVE_SMS")) {
                                i12 = 13;
                                break;
                            }
                            break;
                        case -798669607:
                            if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                                i12 = i9;
                                break;
                            }
                            break;
                        case -406040016:
                            if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                                i12 = 15;
                                break;
                            }
                            break;
                        case -63024214:
                            if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                                i12 = 16;
                                break;
                            }
                            break;
                        case -5573545:
                            if (str.equals("android.permission.READ_PHONE_STATE")) {
                                i12 = 17;
                                break;
                            }
                            break;
                        case 52602690:
                            if (str.equals("android.permission.SEND_SMS")) {
                                i12 = 18;
                                break;
                            }
                            break;
                        case 112197485:
                            if (str.equals("android.permission.CALL_PHONE")) {
                                i12 = 19;
                                break;
                            }
                            break;
                        case 175802396:
                            if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                                i12 = 20;
                                break;
                            }
                            break;
                        case 214526995:
                            if (str.equals("android.permission.WRITE_CONTACTS")) {
                                i12 = 21;
                                break;
                            }
                            break;
                        case 361658321:
                            if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                                i12 = 22;
                                break;
                            }
                            break;
                        case 463403621:
                            if (str.equals("android.permission.CAMERA")) {
                                i12 = 23;
                                break;
                            }
                            break;
                        case 603653886:
                            if (str.equals("android.permission.WRITE_CALENDAR")) {
                                i12 = 24;
                                break;
                            }
                            break;
                        case 610633091:
                            if (str.equals("android.permission.WRITE_CALL_LOG")) {
                                i12 = 25;
                                break;
                            }
                            break;
                        case 691260818:
                            if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                                i12 = 26;
                                break;
                            }
                            break;
                        case 710297143:
                            if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                                i12 = 27;
                                break;
                            }
                            break;
                        case 784519842:
                            if (str.equals("android.permission.USE_SIP")) {
                                i12 = 28;
                                break;
                            }
                            break;
                        case 970694249:
                            if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                                i12 = 29;
                                break;
                            }
                            break;
                        case 1166454870:
                            if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                                i12 = 30;
                                break;
                            }
                            break;
                        case 1271781903:
                            if (str.equals("android.permission.GET_ACCOUNTS")) {
                                i12 = 31;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                i12 = 32;
                                break;
                            }
                            break;
                        case 1777263169:
                            if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                                i12 = 33;
                                break;
                            }
                            break;
                        case 1780337063:
                            if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                                i12 = 34;
                                break;
                            }
                            break;
                        case 1831139720:
                            if (str.equals("android.permission.RECORD_AUDIO")) {
                                i12 = 35;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                i12 = 36;
                                break;
                            }
                            break;
                        case 2024715147:
                            if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                                i12 = 37;
                                break;
                            }
                            break;
                        case 2062356686:
                            if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                                i12 = 38;
                                break;
                            }
                            break;
                        case 2114579147:
                            if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                                i12 = 39;
                                break;
                            }
                            break;
                        case 2133799037:
                            if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                                i12 = 40;
                                break;
                            }
                            break;
                    }
                    switch (i12) {
                        case 0:
                        case 8:
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        case 13:
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            i8 = 13;
                            break;
                        case 1:
                        case 24:
                            i8 = i10;
                            break;
                        case 2:
                            i8 = 17;
                            break;
                        case 3:
                        case 10:
                        case 17:
                        case 19:
                        case 25:
                        case 28:
                        case 40:
                            i8 = 8;
                            break;
                        case 4:
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            i8 = 3;
                            break;
                        case 5:
                            i8 = 22;
                            break;
                        case 6:
                            i8 = 27;
                            break;
                        case 7:
                            i8 = 23;
                            break;
                        case 9:
                            i8 = 12;
                            break;
                        case 11:
                            i8 = 31;
                            break;
                        case 14:
                            i8 = 30;
                            break;
                        case 15:
                        case RecognitionOptions.EAN_13 /* 32 */:
                            i8 = 15;
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            i8 = 9;
                            break;
                        case 21:
                        case 31:
                        case 36:
                            i8 = 2;
                            break;
                        case 22:
                            i8 = 35;
                            break;
                        case 23:
                            i8 = 1;
                            break;
                        case 26:
                            i8 = 33;
                            break;
                        case 27:
                            i8 = 32;
                            break;
                        case 29:
                            i8 = 34;
                            break;
                        case 30:
                            i8 = 29;
                            break;
                        case 33:
                            i8 = 24;
                            break;
                        case 34:
                            i8 = 19;
                            break;
                        case 35:
                            i8 = 7;
                            break;
                        case 37:
                            i8 = 4;
                            break;
                        case 38:
                            i8 = 28;
                            break;
                        case 39:
                            i8 = 18;
                            break;
                        default:
                            i8 = 20;
                            break;
                    }
                    if (i8 != 20) {
                        int i13 = iArr[i11];
                        if (i8 == 8) {
                            Integer valueOf3 = Integer.valueOf(android.support.v4.media.session.a.C(this.f16037c, str, i13));
                            HashSet hashSet2 = new HashSet();
                            hashSet2.add((Integer) this.f16039e.get(8));
                            hashSet2.add(valueOf3);
                            this.f16039e.put(8, android.support.v4.media.session.a.B(hashSet2));
                        } else if (i8 == 7) {
                            if (!this.f16039e.containsKey(7)) {
                                this.f16039e.put(7, Integer.valueOf(android.support.v4.media.session.a.C(this.f16037c, str, i13)));
                            }
                            if (!this.f16039e.containsKey(Integer.valueOf(i9))) {
                                this.f16039e.put(Integer.valueOf(i9), Integer.valueOf(android.support.v4.media.session.a.C(this.f16037c, str, i13)));
                            }
                        } else if (i8 == 4) {
                            int C9 = android.support.v4.media.session.a.C(this.f16037c, str, i13);
                            if (!this.f16039e.containsKey(4)) {
                                this.f16039e.put(4, Integer.valueOf(C9));
                            }
                        } else {
                            if (i8 == 3) {
                                int C10 = android.support.v4.media.session.a.C(this.f16037c, str, i13);
                                if (Build.VERSION.SDK_INT < 29 && !this.f16039e.containsKey(4)) {
                                    this.f16039e.put(4, Integer.valueOf(C10));
                                }
                                if (!this.f16039e.containsKey(5)) {
                                    this.f16039e.put(5, Integer.valueOf(C10));
                                }
                                this.f16039e.put(Integer.valueOf(i8), Integer.valueOf(C10));
                            } else if (i8 != 9 && i8 != 32) {
                                if (!this.f16039e.containsKey(Integer.valueOf(i8))) {
                                    this.f16039e.put(Integer.valueOf(i8), Integer.valueOf(android.support.v4.media.session.a.C(this.f16037c, str, i13)));
                                }
                            } else {
                                this.f16039e.put(Integer.valueOf(i8), Integer.valueOf(a(i8)));
                            }
                            i11++;
                            i9 = 14;
                            i10 = 0;
                        }
                    }
                }
                i11++;
                i9 = 14;
                i10 = 0;
            }
            int length = this.f16038d - iArr.length;
            this.f16038d = length;
            m mVar = this.f16036b;
            if (mVar != null && length == 0) {
                mVar.f2706b.a(this.f16039e);
            }
            return true;
        }
    }
}
