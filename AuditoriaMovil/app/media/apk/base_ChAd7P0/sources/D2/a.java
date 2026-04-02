package D2;

import M3.q;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f830a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f831b;

    /* renamed from: c  reason: collision with root package name */
    public final e f832c;

    /* renamed from: d  reason: collision with root package name */
    public final long f833d;

    /* renamed from: e  reason: collision with root package name */
    public final long f834e;
    public final HashMap f;

    public a(String str, Integer num, e eVar, long j, long j8, HashMap hashMap) {
        this.f830a = str;
        this.f831b = num;
        this.f832c = eVar;
        this.f833d = j;
        this.f834e = j8;
        this.f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return StringUtils.EMPTY;
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, M3.q] */
    public final q c() {
        ?? obj = new Object();
        String str = this.f830a;
        if (str != null) {
            obj.f3252a = str;
            obj.f3253b = this.f831b;
            e eVar = this.f832c;
            if (eVar != null) {
                obj.f3254c = eVar;
                obj.f3255d = Long.valueOf(this.f833d);
                obj.f3256e = Long.valueOf(this.f834e);
                obj.f = new HashMap(this.f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f830a.equals(aVar.f830a)) {
            Integer num = aVar.f831b;
            Integer num2 = this.f831b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f832c.equals(aVar.f832c) && this.f833d == aVar.f833d && this.f834e == aVar.f834e && this.f.equals(aVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f830a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f831b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.f833d;
        long j8 = this.f834e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f832c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f830a + ", code=" + this.f831b + ", encodedPayload=" + this.f832c + ", eventMillis=" + this.f833d + ", uptimeMillis=" + this.f834e + ", autoMetadata=" + this.f + "}";
    }
}
