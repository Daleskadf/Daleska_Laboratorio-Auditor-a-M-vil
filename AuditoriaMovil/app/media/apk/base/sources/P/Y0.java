package p;

import B5.AbstractActivityC0032e;
import D.AbstractC0059i;
import R3.C0297h0;
import R3.C0299i0;
import a6.EnumC0486o;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;
import b6.C0617c;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.C0787n;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.HashMap;
import java.util.Map;
import r2.C1735d;
import u2.C1868b;
/* loaded from: classes.dex */
public final class Y0 implements L5.p {

    /* renamed from: X  reason: collision with root package name */
    public Object f14758X;

    /* renamed from: a  reason: collision with root package name */
    public Object f14759a;

    /* renamed from: b  reason: collision with root package name */
    public Object f14760b;

    /* renamed from: c  reason: collision with root package name */
    public Object f14761c;

    /* renamed from: d  reason: collision with root package name */
    public Object f14762d;

    /* renamed from: e  reason: collision with root package name */
    public Object f14763e;
    public Object f;

    public /* synthetic */ Y0(Object obj, Object obj2, Object obj3, Serializable serializable, Serializable serializable2, Object obj4, Object obj5) {
        this.f14759a = obj;
        this.f14760b = obj2;
        this.f14761c = obj3;
        this.f14762d = serializable;
        this.f14763e = serializable2;
        this.f = obj4;
        this.f14758X = obj5;
    }

    public static byte[] d(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            } else {
                sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
            }
            try {
                String string = sharedPreferences.getString(str, null);
                if (string == null) {
                    return null;
                }
                return m5.d.d(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(AbstractC0059i.M("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public static F3.g e(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            R3.H0 F7 = R3.H0.F(byteArrayInputStream, C0787n.a());
            byteArrayInputStream.close();
            return new F3.g((R3.E0) ((R3.H0) V2.k.q(F7).f5965b).x(), 3);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public synchronized L3.a a() {
        L3.a aVar;
        try {
            if (((String) this.f14760b) != null) {
                synchronized (L3.a.f2907b) {
                    byte[] d7 = d((Context) this.f14759a, (String) this.f14760b, (String) this.f14761c);
                    if (d7 == null) {
                        if (((String) this.f14762d) != null) {
                            this.f14763e = g();
                        }
                        this.f14758X = b();
                    } else if (((String) this.f14762d) != null) {
                        this.f14758X = f(d7);
                    } else {
                        this.f14758X = e(d7);
                    }
                    aVar = new L3.a(this);
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    public F3.g b() {
        SharedPreferences.Editor edit;
        if (((F3.j) this.f) != null) {
            F3.g gVar = new F3.g(R3.H0.E(), 3);
            F3.j jVar = (F3.j) this.f;
            synchronized (gVar) {
                gVar.a(jVar.f1173a);
            }
            gVar.h(F3.u.a((R3.H0) gVar.c().f5965b).A().C());
            Context context = (Context) this.f14759a;
            String str = (String) this.f14760b;
            String str2 = (String) this.f14761c;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    edit = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                } else {
                    edit = applicationContext.getSharedPreferences(str2, 0).edit();
                }
                if (((L3.b) this.f14763e) != null) {
                    V2.k c8 = gVar.c();
                    L3.b bVar = (L3.b) this.f14763e;
                    byte[] bArr = new byte[0];
                    R3.H0 h02 = (R3.H0) c8.f5965b;
                    byte[] a7 = bVar.a(h02.e(), bArr);
                    try {
                        if (R3.H0.G(bVar.b(a7, bArr), C0787n.a()).equals(h02)) {
                            C0297h0 B7 = C0299i0.B();
                            C0780g h8 = AbstractC0781h.h(a7, 0, a7.length);
                            B7.e();
                            C0299i0.y((C0299i0) B7.f9699b, h8);
                            R3.M0 a8 = F3.u.a(h02);
                            B7.e();
                            C0299i0.z((C0299i0) B7.f9699b, a8);
                            if (!edit.putString(str, m5.d.e(((C0299i0) B7.b()).e())).commit()) {
                                throw new IOException("Failed to write to SharedPreferences");
                            }
                        } else {
                            throw new GeneralSecurityException("cannot encrypt keyset");
                        }
                    } catch (com.google.crypto.tink.shaded.protobuf.F unused) {
                        throw new GeneralSecurityException("invalid keyset, corrupted key material");
                    }
                } else if (!edit.putString(str, m5.d.e(((R3.H0) gVar.c().f5965b).e())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
                return gVar;
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        throw new GeneralSecurityException("cannot read or generate keyset");
    }

    public void c(C0617c c0617c) {
        EnumC0486o u7 = c0617c.f8313d.u();
        u4.q.a("GrpcCallProvider", "Current gRPC connectivity state: " + u7, new Object[0]);
        if (((p4.P) this.f14763e) != null) {
            u4.q.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            ((p4.P) this.f14763e).b();
            this.f14763e = null;
        }
        if (u7 == EnumC0486o.CONNECTING) {
            u4.q.a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f14763e = ((u4.e) this.f14761c).b(u4.d.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new t4.q(this, c0617c, 1));
        }
        c0617c.v(u7, new t4.q(this, c0617c, 2));
    }

    public F3.g f(byte[] bArr) {
        try {
            this.f14763e = new L3.c().c((String) this.f14762d);
            try {
                return new F3.g((R3.E0) ((R3.H0) V2.k.C(new F3.g(new ByteArrayInputStream(bArr), 1), (L3.b) this.f14763e).f5965b).x(), 3);
            } catch (IOException | GeneralSecurityException e7) {
                try {
                    return e(bArr);
                } catch (IOException unused) {
                    throw e7;
                }
            }
        } catch (GeneralSecurityException | ProviderException e8) {
            try {
                F3.g e9 = e(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e8);
                return e9;
            } catch (IOException unused2) {
                throw e8;
            }
        }
    }

    public L3.b g() {
        L3.c cVar = new L3.c();
        try {
            boolean a7 = L3.c.a((String) this.f14762d);
            try {
                return cVar.c((String) this.f14762d);
            } catch (GeneralSecurityException | ProviderException e7) {
                if (a7) {
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e7);
                    return null;
                }
                throw new KeyStoreException(AbstractC0059i.M("the master key ", (String) this.f14762d, " exists but is unusable"), e7);
            }
        } catch (GeneralSecurityException | ProviderException e8) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e8);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31, types: [e0.b, java.lang.Object] */
    @Override // L5.p
    public void onMethodCall(L5.o oVar, L5.q qVar) {
        boolean z7;
        int i7 = 3;
        String str = oVar.f3038a;
        str.getClass();
        HashMap hashMap = (HashMap) this.f14763e;
        boolean z8 = true;
        t2.g gVar = (t2.g) this.f14761c;
        C1868b c1868b = (C1868b) this.f14760b;
        t2.j jVar = null;
        Object obj = oVar.f3039b;
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1757019252:
                if (str.equals("getCurrentPosition")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1156770336:
                if (str.equals("getLastKnownPosition")) {
                    c8 = 1;
                    break;
                }
                break;
            case -821636766:
                if (str.equals("openLocationSettings")) {
                    c8 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c8 = 3;
                    break;
                }
                break;
            case 356040619:
                if (str.equals("isLocationServiceEnabled")) {
                    c8 = 4;
                    break;
                }
                break;
            case 686218487:
                if (str.equals("checkPermission")) {
                    c8 = 5;
                    break;
                }
                break;
            case 746581438:
                if (str.equals("requestPermission")) {
                    c8 = 6;
                    break;
                }
                break;
            case 877043524:
                if (str.equals("getLocationAccuracy")) {
                    c8 = 7;
                    break;
                }
                break;
            case 1774650278:
                if (str.equals("cancelGetCurrentPosition")) {
                    c8 = '\b';
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                try {
                    c1868b.getClass();
                    if (!C1868b.c((Context) this.f14759a)) {
                        s2.b bVar = s2.b.permissionDenied;
                        ((K5.r) qVar).b(null, bVar.toString(), bVar.a());
                        return;
                    }
                    Map map = (Map) obj;
                    if (map.get("forceLocationManager") != null) {
                        z7 = ((Boolean) map.get("forceLocationManager")).booleanValue();
                    } else {
                        z7 = false;
                    }
                    t2.o a7 = t2.o.a(map);
                    String str2 = (String) map.get("requestId");
                    boolean[] zArr = {false};
                    gVar.getClass();
                    t2.k a8 = t2.g.a((Context) this.f14759a, z7, a7);
                    hashMap.put(str2, a8);
                    AbstractActivityC0032e abstractActivityC0032e = (AbstractActivityC0032e) this.f;
                    K5.r rVar = (K5.r) qVar;
                    C1735d c1735d = new C1735d(this, zArr, a8, str2, rVar);
                    C1735d c1735d2 = new C1735d(this, zArr, a8, str2, rVar);
                    gVar.f15733a.add(a8);
                    a8.b(abstractActivityC0032e, c1735d, c1735d2);
                    return;
                } catch (s2.c unused) {
                    s2.b bVar2 = s2.b.permissionDefinitionsNotFound;
                    ((K5.r) qVar).b(null, bVar2.toString(), bVar2.a());
                    return;
                }
            case 1:
                try {
                    c1868b.getClass();
                    if (!C1868b.c((Context) this.f14759a)) {
                        s2.b bVar3 = s2.b.permissionDenied;
                        ((K5.r) qVar).b(null, bVar3.toString(), bVar3.a());
                        return;
                    }
                    Boolean bool = (Boolean) oVar.a("forceLocationManager");
                    Context context = (Context) this.f14759a;
                    if (bool == null || !bool.booleanValue()) {
                        z8 = false;
                    }
                    K5.r rVar2 = (K5.r) qVar;
                    K5.m mVar = new K5.m(rVar2, 3);
                    K5.m mVar2 = new K5.m(rVar2, 4);
                    gVar.getClass();
                    t2.g.a(context, z8, null).d(mVar, mVar2);
                    return;
                } catch (s2.c unused2) {
                    s2.b bVar4 = s2.b.permissionDefinitionsNotFound;
                    ((K5.r) qVar).b(null, bVar4.toString(), bVar4.a());
                    return;
                }
            case 2:
                Context context2 = (Context) this.f14759a;
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addFlags(268435456);
                    intent.addFlags(1073741824);
                    intent.addFlags(8388608);
                    context2.startActivity(intent);
                } catch (Exception unused3) {
                    z8 = false;
                }
                ((K5.r) qVar).a(Boolean.valueOf(z8));
                return;
            case 3:
                Context context3 = (Context) this.f14759a;
                try {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setData(Uri.parse("package:" + context3.getPackageName()));
                    intent2.addFlags(268435456);
                    intent2.addFlags(1073741824);
                    intent2.addFlags(8388608);
                    context3.startActivity(intent2);
                } catch (Exception unused4) {
                    z8 = false;
                }
                ((K5.r) qVar).a(Boolean.valueOf(z8));
                return;
            case 4:
                Context context4 = (Context) this.f14759a;
                ?? obj2 = new Object();
                obj2.f10587a = (K5.r) qVar;
                if (context4 == null) {
                    gVar.getClass();
                    s2.b bVar5 = s2.b.locationServicesDisabled;
                    ((K5.r) obj2.f10587a).b(null, bVar5.toString(), bVar5.a());
                }
                gVar.getClass();
                t2.g.a(context4, false, null).c(obj2);
                return;
            case 5:
                try {
                    c1868b.getClass();
                    int ordinal = C1868b.a((Context) this.f14759a).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    throw new IndexOutOfBoundsException();
                                }
                            } else {
                                i7 = 2;
                            }
                        } else {
                            i7 = 1;
                        }
                    } else {
                        i7 = 0;
                    }
                    ((K5.r) qVar).a(Integer.valueOf(i7));
                    return;
                } catch (s2.c unused5) {
                    s2.b bVar6 = s2.b.permissionDefinitionsNotFound;
                    ((K5.r) qVar).b(null, bVar6.toString(), bVar6.a());
                    return;
                }
            case 6:
                try {
                    c1868b.d((AbstractActivityC0032e) this.f, new K5.m((K5.r) qVar, 1), new K5.m((K5.r) qVar, 2));
                    return;
                } catch (s2.c unused6) {
                    s2.b bVar7 = s2.b.permissionDefinitionsNotFound;
                    ((K5.r) qVar).b(null, bVar7.toString(), bVar7.a());
                    return;
                }
            case 7:
                Context context5 = (Context) this.f14759a;
                ((t2.i) this.f14762d).getClass();
                if (X.d.checkSelfPermission(context5, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    jVar = t2.j.precise;
                } else if (X.d.checkSelfPermission(context5, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    jVar = t2.j.reduced;
                } else {
                    s2.b bVar8 = s2.b.permissionDenied;
                    ((K5.r) qVar).b(null, bVar8.toString(), bVar8.a());
                }
                if (jVar != null) {
                    ((K5.r) qVar).a(Integer.valueOf(jVar.ordinal()));
                    return;
                }
                return;
            case '\b':
                String str3 = (String) ((Map) obj).get("requestId");
                t2.k kVar = (t2.k) hashMap.get(str3);
                if (kVar != null) {
                    kVar.e();
                }
                hashMap.remove(str3);
                ((K5.r) qVar).a(null);
                return;
            default:
                ((K5.r) qVar).c();
                return;
        }
    }

    public Y0() {
        this.f14759a = null;
        this.f14760b = null;
        this.f14761c = null;
        this.f14762d = null;
        this.f14763e = null;
        this.f = null;
    }
}
