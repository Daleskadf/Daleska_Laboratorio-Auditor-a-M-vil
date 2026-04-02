package com.google.firebase.storage;

import B5.S;
import H4.W;
import android.net.Uri;
import android.text.TextUtils;
import b4.InterfaceC0593a;
import com.google.android.gms.common.internal.I;
import org.apache.tika.utils.StringUtils;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final U3.h f9900a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1956b f9901b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1956b f9902c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9903d;

    /* renamed from: e  reason: collision with root package name */
    public long f9904e = 600000;
    public long f = 600000;

    /* renamed from: g  reason: collision with root package name */
    public long f9905g = 120000;

    /* renamed from: h  reason: collision with root package name */
    public S f9906h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [Z3.a, java.lang.Object] */
    public f(String str, U3.h hVar, InterfaceC1956b interfaceC1956b, InterfaceC1956b interfaceC1956b2) {
        this.f9903d = str;
        this.f9900a = hVar;
        this.f9901b = interfaceC1956b;
        this.f9902c = interfaceC1956b2;
        if (interfaceC1956b2 != null && interfaceC1956b2.get() != null) {
            ((X3.d) ((Z3.b) interfaceC1956b2.get())).a(new Object());
        }
    }

    public static f c(U3.h hVar, Uri uri) {
        String str;
        f fVar;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        hVar.a();
        g gVar = (g) hVar.f5752d.a(g.class);
        I.j(gVar, "Firebase Storage component is not present.");
        synchronized (gVar) {
            fVar = (f) gVar.f9907a.get(str);
            if (fVar == null) {
                fVar = new f(str, gVar.f9908b, gVar.f9909c, gVar.f9910d);
                gVar.f9907a.put(str, fVar);
            }
        }
        return fVar;
    }

    public final Z3.b a() {
        InterfaceC1956b interfaceC1956b = this.f9902c;
        if (interfaceC1956b != null) {
            return (Z3.b) interfaceC1956b.get();
        }
        return null;
    }

    public final InterfaceC0593a b() {
        InterfaceC1956b interfaceC1956b = this.f9901b;
        if (interfaceC1956b != null) {
            return (InterfaceC0593a) interfaceC1956b.get();
        }
        return null;
    }

    public final m d(String str) {
        boolean z7;
        String replace;
        I.a("location must not be null or empty", !TextUtils.isEmpty(str));
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("gs://") && !lowerCase.startsWith("https://") && !lowerCase.startsWith("http://")) {
            String str2 = this.f9903d;
            if (!TextUtils.isEmpty(str2)) {
                Uri build = new Uri.Builder().scheme("gs").authority(str2).path("/").build();
                I.j(build, "uri must not be null");
                if (!TextUtils.isEmpty(str2) && !build.getAuthority().equalsIgnoreCase(str2)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                I.a("The supplied bucketname does not match the storage bucket of the current instance.", z7);
                I.a("childName cannot be null or empty", !TextUtils.isEmpty(str));
                String A7 = W.A(str);
                Uri.Builder buildUpon = build.buildUpon();
                if (TextUtils.isEmpty(A7)) {
                    replace = StringUtils.EMPTY;
                } else {
                    String encode = Uri.encode(A7);
                    I.i(encode);
                    replace = encode.replace("%2F", "/");
                }
                return new m(buildUpon.appendEncodedPath(replace).build(), this);
            }
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        throw new IllegalArgumentException("location should not be a full URL.");
    }
}
