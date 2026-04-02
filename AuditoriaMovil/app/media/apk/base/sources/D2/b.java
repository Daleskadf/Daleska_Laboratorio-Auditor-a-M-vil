package D2;

import V2.k;
import android.util.Base64;
import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f835a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f836b;

    /* renamed from: c  reason: collision with root package name */
    public final A2.d f837c;

    public b(String str, byte[] bArr, A2.d dVar) {
        this.f835a = str;
        this.f836b = bArr;
        this.f837c = dVar;
    }

    public static k a() {
        k kVar = new k(6);
        A2.d dVar = A2.d.DEFAULT;
        if (dVar != null) {
            kVar.f5967d = dVar;
            return kVar;
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f835a.equals(bVar.f835a) && Arrays.equals(this.f836b, bVar.f836b) && this.f837c.equals(bVar.f837c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f835a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f836b)) * 1000003) ^ this.f837c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f836b;
        if (bArr == null) {
            encodeToString = StringUtils.EMPTY;
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.f835a + ", " + this.f837c + ", " + encodeToString + ")";
    }
}
