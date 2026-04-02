package C2;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class m extends t {

    /* renamed from: a  reason: collision with root package name */
    public final long f519a;

    /* renamed from: b  reason: collision with root package name */
    public final long f520b;

    /* renamed from: c  reason: collision with root package name */
    public final k f521c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f522d;

    /* renamed from: e  reason: collision with root package name */
    public final String f523e;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final x f524g;

    public m(long j, long j8, k kVar, Integer num, String str, ArrayList arrayList, x xVar) {
        this.f519a = j;
        this.f520b = j8;
        this.f521c = kVar;
        this.f522d = num;
        this.f523e = str;
        this.f = arrayList;
        this.f524g = xVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        m mVar = (m) ((t) obj);
        if (this.f519a == mVar.f519a) {
            if (this.f520b == mVar.f520b) {
                if (this.f521c.equals(mVar.f521c)) {
                    Integer num = mVar.f522d;
                    Integer num2 = this.f522d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = mVar.f523e;
                        String str2 = this.f523e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f.equals(mVar.f)) {
                                x xVar = mVar.f524g;
                                x xVar2 = this.f524g;
                                if (xVar2 == null) {
                                    if (xVar == null) {
                                        return true;
                                    }
                                } else if (xVar2.equals(xVar)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.f519a;
        long j8 = this.f520b;
        int hashCode3 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f521c.hashCode()) * 1000003;
        int i7 = 0;
        Integer num = this.f522d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i8 = (hashCode3 ^ hashCode) * 1000003;
        String str = this.f523e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode4 = (((i8 ^ hashCode2) * 1000003) ^ this.f.hashCode()) * 1000003;
        x xVar = this.f524g;
        if (xVar != null) {
            i7 = xVar.hashCode();
        }
        return hashCode4 ^ i7;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f519a + ", requestUptimeMs=" + this.f520b + ", clientInfo=" + this.f521c + ", logSource=" + this.f522d + ", logSourceName=" + this.f523e + ", logEvents=" + this.f + ", qosTier=" + this.f524g + "}";
    }
}
