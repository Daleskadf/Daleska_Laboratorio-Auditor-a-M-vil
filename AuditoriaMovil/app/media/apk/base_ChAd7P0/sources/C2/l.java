package C2;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a  reason: collision with root package name */
    public final long f513a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f514b;

    /* renamed from: c  reason: collision with root package name */
    public final long f515c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f516d;

    /* renamed from: e  reason: collision with root package name */
    public final String f517e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final o f518g;

    public l(long j, Integer num, long j8, byte[] bArr, String str, long j9, o oVar) {
        this.f513a = j;
        this.f514b = num;
        this.f515c = j8;
        this.f516d = bArr;
        this.f517e = str;
        this.f = j9;
        this.f518g = oVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        l lVar = (l) sVar;
        if (this.f513a == lVar.f513a && ((num = this.f514b) != null ? num.equals(lVar.f514b) : lVar.f514b == null)) {
            if (this.f515c == lVar.f515c) {
                if (sVar instanceof l) {
                    bArr = ((l) sVar).f516d;
                } else {
                    bArr = lVar.f516d;
                }
                if (Arrays.equals(this.f516d, bArr)) {
                    String str = lVar.f517e;
                    String str2 = this.f517e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == lVar.f) {
                            o oVar = lVar.f518g;
                            o oVar2 = this.f518g;
                            if (oVar2 == null) {
                                if (oVar == null) {
                                    return true;
                                }
                            } else if (oVar2.equals(oVar)) {
                                return true;
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
        long j = this.f513a;
        int i7 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i8 = 0;
        Integer num = this.f514b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j8 = this.f515c;
        int hashCode3 = (((((i7 ^ hashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f516d)) * 1000003;
        String str = this.f517e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j9 = this.f;
        int i9 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        o oVar = this.f518g;
        if (oVar != null) {
            i8 = oVar.hashCode();
        }
        return i9 ^ i8;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f513a + ", eventCode=" + this.f514b + ", eventUptimeMs=" + this.f515c + ", sourceExtension=" + Arrays.toString(this.f516d) + ", sourceExtensionJsonProto3=" + this.f517e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.f518g + "}";
    }
}
