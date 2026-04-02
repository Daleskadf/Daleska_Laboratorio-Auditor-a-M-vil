package M6;

import B5.L;
import F6.H;
/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f3296c;

    public k(Runnable runnable, long j, L l8) {
        super(j, l8);
        this.f3296c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3296c.run();
        } finally {
            this.f3295b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3296c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(H.j(runnable));
        sb.append(", ");
        sb.append(this.f3294a);
        sb.append(", ");
        sb.append(this.f3295b);
        sb.append(']');
        return sb.toString();
    }
}
