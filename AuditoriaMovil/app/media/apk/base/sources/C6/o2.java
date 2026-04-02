package c6;

import a6.AbstractC0482k;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0482k[] f8947a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f8948b = new AtomicBoolean(false);

    static {
        new o2(new AbstractC0482k[0]);
    }

    public o2(AbstractC0482k[] abstractC0482kArr) {
        this.f8947a = abstractC0482kArr;
    }

    public final void a(long j) {
        for (AbstractC0482k abstractC0482k : this.f8947a) {
            abstractC0482k.g(j);
        }
    }
}
