package c6;

import java.util.Random;
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public Random f8644a;

    /* renamed from: b  reason: collision with root package name */
    public long f8645b;

    /* renamed from: c  reason: collision with root package name */
    public double f8646c;

    /* renamed from: d  reason: collision with root package name */
    public double f8647d;

    /* renamed from: e  reason: collision with root package name */
    public long f8648e;

    public final long a() {
        boolean z7;
        long j = this.f8648e;
        double d7 = j;
        this.f8648e = Math.min((long) (this.f8646c * d7), this.f8645b);
        double d8 = this.f8647d;
        double d9 = (-d8) * d7;
        double d10 = d8 * d7;
        if (d10 >= d9) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.g(z7);
        return j + ((long) ((this.f8644a.nextDouble() * (d10 - d9)) + d9));
    }
}
