package M0;

import H0.J;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
/* loaded from: classes.dex */
public final class f extends AbstractC0236c {

    /* renamed from: X  reason: collision with root package name */
    public int f3155X;

    /* renamed from: Y  reason: collision with root package name */
    public int f3156Y;

    /* renamed from: e  reason: collision with root package name */
    public l f3157e;
    public byte[] f;

    @Override // M0.h
    public final void close() {
        if (this.f != null) {
            this.f = null;
            c();
        }
        this.f3157e = null;
    }

    @Override // M0.h
    public final long e(l lVar) {
        h();
        this.f3157e = lVar;
        Uri normalizeScheme = lVar.f3172a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        K0.a.d("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i7 = K0.x.f2529a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e7) {
                    throw new J(io.flutter.plugins.pathprovider.b.h("Error while parsing Base64 encoded string: ", str), e7, true, 0);
                }
            } else {
                this.f = URLDecoder.decode(str, z3.h.f16884a.name()).getBytes(z3.h.f16886c);
            }
            byte[] bArr = this.f;
            long j = lVar.f3176e;
            if (j <= bArr.length) {
                int i8 = (int) j;
                this.f3155X = i8;
                int length = bArr.length - i8;
                this.f3156Y = length;
                long j8 = lVar.f;
                int i9 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
                if (i9 != 0) {
                    this.f3156Y = (int) Math.min(length, j8);
                }
                k(lVar);
                if (i9 == 0) {
                    return this.f3156Y;
                }
                return j8;
            }
            this.f = null;
            throw new i(2008);
        }
        throw new J("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // M0.h
    public final Uri p() {
        l lVar = this.f3157e;
        if (lVar != null) {
            return lVar.f3172a;
        }
        return null;
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f3156Y;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        byte[] bArr2 = this.f;
        int i10 = K0.x.f2529a;
        System.arraycopy(bArr2, this.f3155X, bArr, i7, min);
        this.f3155X += min;
        this.f3156Y -= min;
        b(min);
        return min;
    }
}
