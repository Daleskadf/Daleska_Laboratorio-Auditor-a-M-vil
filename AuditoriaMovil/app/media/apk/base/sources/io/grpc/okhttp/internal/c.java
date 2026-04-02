package io.grpc.okhttp.internal;

import androidx.datastore.preferences.protobuf.Y;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f12538e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12539a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f12540b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f12541c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12542d;

    static {
        a[] aVarArr = {a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        b bVar = new b(true);
        bVar.a(aVarArr);
        n nVar = n.TLS_1_3;
        n nVar2 = n.TLS_1_2;
        bVar.b(nVar, nVar2);
        if (bVar.f12534a) {
            bVar.f12537d = true;
            c cVar = new c(bVar);
            f12538e = cVar;
            b bVar2 = new b(cVar);
            bVar2.b(nVar, nVar2, n.TLS_1_1, n.TLS_1_0);
            if (bVar2.f12534a) {
                bVar2.f12537d = true;
                new c(bVar2);
                new c(new b(false));
                return;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public c(b bVar) {
        this.f12539a = bVar.f12534a;
        this.f12540b = bVar.f12535b;
        this.f12541c = bVar.f12536c;
        this.f12542d = bVar.f12537d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        boolean z7 = cVar.f12539a;
        boolean z8 = this.f12539a;
        if (z8 != z7) {
            return false;
        }
        if (z8 && (!Arrays.equals(this.f12540b, cVar.f12540b) || !Arrays.equals(this.f12541c, cVar.f12541c) || this.f12542d != cVar.f12542d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f12539a) {
            return ((((527 + Arrays.hashCode(this.f12540b)) * 31) + Arrays.hashCode(this.f12541c)) * 31) + (!this.f12542d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List unmodifiableList;
        a valueOf;
        String obj;
        n nVar;
        if (this.f12539a) {
            String[] strArr = this.f12540b;
            if (strArr == null) {
                unmodifiableList = null;
            } else {
                a[] aVarArr = new a[strArr.length];
                for (int i7 = 0; i7 < strArr.length; i7++) {
                    String str = strArr[i7];
                    if (str.startsWith("SSL_")) {
                        valueOf = a.valueOf("TLS_" + str.substring(4));
                    } else {
                        valueOf = a.valueOf(str);
                    }
                    aVarArr[i7] = valueOf;
                }
                String[] strArr2 = o.f12566a;
                unmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
            }
            if (unmodifiableList == null) {
                obj = "[use default]";
            } else {
                obj = unmodifiableList.toString();
            }
            StringBuilder m7 = Y.m("ConnectionSpec(cipherSuites=", obj, ", tlsVersions=");
            String[] strArr3 = this.f12541c;
            n[] nVarArr = new n[strArr3.length];
            for (int i8 = 0; i8 < strArr3.length; i8++) {
                String str2 = strArr3[i8];
                if ("TLSv1.3".equals(str2)) {
                    nVar = n.TLS_1_3;
                } else if ("TLSv1.2".equals(str2)) {
                    nVar = n.TLS_1_2;
                } else if ("TLSv1.1".equals(str2)) {
                    nVar = n.TLS_1_1;
                } else if ("TLSv1".equals(str2)) {
                    nVar = n.TLS_1_0;
                } else if ("SSLv3".equals(str2)) {
                    nVar = n.SSL_3_0;
                } else {
                    throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Unexpected TLS version: ", str2));
                }
                nVarArr[i8] = nVar;
            }
            String[] strArr4 = o.f12566a;
            m7.append(DesugarCollections.unmodifiableList(Arrays.asList((Object[]) nVarArr.clone())));
            m7.append(", supportsTlsExtensions=");
            m7.append(this.f12542d);
            m7.append(")");
            return m7.toString();
        }
        return "ConnectionSpec()";
    }
}
