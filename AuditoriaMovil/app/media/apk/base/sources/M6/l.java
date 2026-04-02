package M6;

import B5.L;
import K6.AbstractC0208a;
import K6.x;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.PipesConfigBase;
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3297a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f3298b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f3299c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f3300d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f3301e;
    public static final h f;

    /* renamed from: g  reason: collision with root package name */
    public static final L f3302g;

    /* renamed from: h  reason: collision with root package name */
    public static final L f3303h;

    static {
        String str;
        int i7 = x.f2808a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f3297a = str;
        f3298b = AbstractC0208a.j("kotlinx.coroutines.scheduler.resolution.ns", PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 1L, Long.MAX_VALUE);
        int i8 = x.f2808a;
        if (i8 < 2) {
            i8 = 2;
        }
        f3299c = AbstractC0208a.k("kotlinx.coroutines.scheduler.core.pool.size", i8, 1, 0, 8);
        f3300d = AbstractC0208a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f3301e = TimeUnit.SECONDS.toNanos(AbstractC0208a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = h.f3292a;
        f3302g = new L(0);
        f3303h = new L(1);
    }
}
