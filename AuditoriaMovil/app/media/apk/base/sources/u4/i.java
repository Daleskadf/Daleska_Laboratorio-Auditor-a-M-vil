package u4;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final i f15999d = new i(null, null, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f16000a;

    /* renamed from: b  reason: collision with root package name */
    public final i f16001b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16002c;

    public i(i iVar, String str, int i7) {
        this.f16001b = iVar;
        this.f16002c = str;
        this.f16000a = i7;
    }

    public final String toString() {
        int i7 = this.f16000a;
        if (i7 == 0) {
            return StringUtils.EMPTY;
        }
        String str = this.f16002c;
        if (i7 == 1) {
            return str;
        }
        return this.f16001b.toString() + "." + str;
    }
}
