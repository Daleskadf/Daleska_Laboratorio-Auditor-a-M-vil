package J1;

import A3.K;
import java.util.List;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final K f2354a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2355b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2356c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2357d;

    public a(List list, long j, long j8) {
        this.f2354a = K.p(list);
        this.f2355b = j;
        this.f2356c = j8;
        long j9 = -9223372036854775807L;
        if (j != -9223372036854775807L && j8 != -9223372036854775807L) {
            j9 = j + j8;
        }
        this.f2357d = j9;
    }
}
