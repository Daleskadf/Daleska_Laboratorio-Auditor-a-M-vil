package B2;

import C2.h;
import C2.u;
import C2.v;
import E2.g;
import M3.q;
import a1.C0415A;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public final C0415A f252a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f253b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f254c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f255d;

    /* renamed from: e  reason: collision with root package name */
    public final L2.a f256e;
    public final L2.a f;

    /* renamed from: g  reason: collision with root package name */
    public final int f257g;

    public d(Context context, L2.a aVar, L2.a aVar2) {
        j4.d dVar = new j4.d();
        h.f499a.configure(dVar);
        dVar.f13450d = true;
        this.f252a = new C0415A(dVar);
        this.f254c = context;
        this.f253b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f255d = b(a.f241c);
        this.f256e = aVar2;
        this.f = aVar;
        this.f257g = 40000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Invalid url: ", str), e7);
        }
    }

    public final D2.a a(D2.a aVar) {
        int type;
        int subtype;
        NetworkInfo activeNetworkInfo = this.f253b.getActiveNetworkInfo();
        q c8 = aVar.c();
        int i7 = Build.VERSION.SDK_INT;
        HashMap hashMap = (HashMap) c8.f;
        if (hashMap != null) {
            hashMap.put("sdk-version", String.valueOf(i7));
            c8.h("model", Build.MODEL);
            c8.h("hardware", Build.HARDWARE);
            c8.h("device", Build.DEVICE);
            c8.h("product", Build.PRODUCT);
            c8.h("os-uild", Build.ID);
            c8.h("manufacturer", Build.MANUFACTURER);
            c8.h("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / PipesIterator.DEFAULT_QUEUE_SIZE;
            HashMap hashMap2 = (HashMap) c8.f;
            if (hashMap2 != null) {
                hashMap2.put("tz-offset", String.valueOf(offset));
                if (activeNetworkInfo == null) {
                    type = v.NONE.b();
                } else {
                    type = activeNetworkInfo.getType();
                }
                HashMap hashMap3 = (HashMap) c8.f;
                if (hashMap3 != null) {
                    hashMap3.put("net-type", String.valueOf(type));
                    int i8 = -1;
                    if (activeNetworkInfo == null) {
                        subtype = u.UNKNOWN_MOBILE_SUBTYPE.b();
                    } else {
                        subtype = activeNetworkInfo.getSubtype();
                        if (subtype == -1) {
                            subtype = u.COMBINED.b();
                        } else if (u.a(subtype) == null) {
                            subtype = 0;
                        }
                    }
                    HashMap hashMap4 = (HashMap) c8.f;
                    if (hashMap4 != null) {
                        hashMap4.put("mobile-subtype", String.valueOf(subtype));
                        c8.h("country", Locale.getDefault().getCountry());
                        c8.h("locale", Locale.getDefault().getLanguage());
                        Context context = this.f254c;
                        c8.h("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
                        try {
                            i8 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e7) {
                            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Unable to find version code for package", e7);
                        }
                        c8.h("application_build", Integer.toString(i8));
                        return c8.k();
                    }
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                }
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
}
