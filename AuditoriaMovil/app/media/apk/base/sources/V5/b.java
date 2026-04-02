package V5;

import L5.x;
import X5.C0377c;
import X5.E;
import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import io.flutter.plugin.platform.g;
import io.flutter.plugin.platform.h;
import io.flutter.plugins.videoplayer.i;
import io.flutter.plugins.videoplayer.o;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5976b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5977c;

    public b(C0377c c0377c) {
        super(x.f3044a);
        this.f5977c = c0377c;
    }

    @Override // io.flutter.plugin.platform.h
    public final g a(Context context, int i7, Object obj) {
        switch (this.f5976b) {
            case 0:
                i iVar = (i) obj;
                Objects.requireNonNull(iVar);
                return new a(context, ((o) ((LongSparseArray) ((E) this.f5977c).f6409b).get(iVar.f12413a.longValue())).f12422c);
            default:
                Integer num = (Integer) obj;
                if (num != null) {
                    Object e7 = ((C0377c) this.f5977c).e(num.intValue());
                    if (e7 instanceof g) {
                        return (g) e7;
                    }
                    if (e7 instanceof View) {
                        return new a((View) e7);
                    }
                    throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + e7);
                }
                throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
    }

    public b(E e7) {
        super(io.flutter.plugins.videoplayer.h.f12412d);
        this.f5977c = e7;
    }
}
