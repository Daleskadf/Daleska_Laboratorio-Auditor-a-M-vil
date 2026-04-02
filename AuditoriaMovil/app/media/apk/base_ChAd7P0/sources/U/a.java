package U;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f5506c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f5507d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5508a;

    /* renamed from: b  reason: collision with root package name */
    public final CancellationException f5509b;

    static {
        if (h.f5524d) {
            f5507d = null;
            f5506c = null;
            return;
        }
        f5507d = new a(false, null);
        f5506c = new a(true, null);
    }

    public a(boolean z7, CancellationException cancellationException) {
        this.f5508a = z7;
        this.f5509b = cancellationException;
    }
}
