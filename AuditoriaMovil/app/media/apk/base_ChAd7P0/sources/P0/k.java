package P0;

import K0.x;
import android.media.metrics.LogSessionId;
import j$.util.Objects;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f3952a;

    /* renamed from: b  reason: collision with root package name */
    public final j f3953b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3954c;

    static {
        if (x.f2529a < 31) {
            new k(StringUtils.EMPTY);
        } else {
            new k(j.f3950b, StringUtils.EMPTY);
        }
    }

    public k(String str) {
        K0.a.j(x.f2529a < 31);
        this.f3952a = str;
        this.f3953b = null;
        this.f3954c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Objects.equals(this.f3952a, kVar.f3952a) && Objects.equals(this.f3953b, kVar.f3953b) && Objects.equals(this.f3954c, kVar.f3954c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3952a, this.f3953b, this.f3954c);
    }

    public k(LogSessionId logSessionId, String str) {
        this(new j(logSessionId), str);
    }

    public k(j jVar, String str) {
        this.f3953b = jVar;
        this.f3952a = str;
        this.f3954c = new Object();
    }
}
