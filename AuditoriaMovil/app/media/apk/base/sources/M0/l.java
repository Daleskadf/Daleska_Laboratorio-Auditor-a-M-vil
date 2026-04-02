package M0;

import D.AbstractC0059i;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f3171i = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f3172a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3173b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3174c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f3175d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3176e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3177g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3178h;

    static {
        H0.D.a("media3.datasource");
    }

    public l(Uri uri, int i7, byte[] bArr, Map map, long j, long j8, String str, int i8) {
        boolean z7;
        boolean z8;
        boolean z9 = false;
        if (j >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        if (j >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.e(z8);
        K0.a.e((j8 > 0 || j8 == -1) ? true : z9);
        uri.getClass();
        this.f3172a = uri;
        this.f3173b = i7;
        this.f3174c = (bArr == null || bArr.length == 0) ? null : null;
        this.f3175d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f3176e = j;
        this.f = j8;
        this.f3177g = str;
        this.f3178h = i8;
    }

    public final l a(long j) {
        long j8 = this.f;
        long j9 = -1;
        if (j8 != -1) {
            j9 = j8 - j;
        }
        long j10 = j9;
        if (j == 0 && j8 == j10) {
            return this;
        }
        byte[] bArr = this.f3174c;
        int i7 = this.f3178h;
        return new l(this.f3172a, this.f3173b, bArr, this.f3175d, this.f3176e + j, j10, this.f3177g, i7);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i7 = this.f3173b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(StringUtils.SPACE);
        sb.append(this.f3172a);
        sb.append(", ");
        sb.append(this.f3176e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.f3177g);
        sb.append(", ");
        return AbstractC0059i.B(sb, this.f3178h, "]");
    }
}
