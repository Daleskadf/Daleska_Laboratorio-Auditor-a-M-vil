package z8;

import com.google.common.base.Preconditions;
import java.text.MessageFormat;
import java.util.logging.Level;
import org.android.agoo.common.AgooConstants;
import y8.d0;
import y8.f;
/* loaded from: classes3.dex */
public final class n extends y8.f {

    /* renamed from: a  reason: collision with root package name */
    public final o f20762a;

    /* renamed from: b  reason: collision with root package name */
    public final j2 f20763b;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20764a;

        static {
            int[] iArr = new int[f.a.values().length];
            f20764a = iArr;
            try {
                iArr[f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20764a[f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20764a[f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(o oVar, j2 j2Var) {
        this.f20762a = (o) Preconditions.checkNotNull(oVar, "tracer");
        this.f20763b = (j2) Preconditions.checkNotNull(j2Var, AgooConstants.MESSAGE_TIME);
    }

    public static void d(y8.i0 i0Var, f.a aVar, String str) {
        Level f10 = f(aVar);
        if (o.f20767f.isLoggable(f10)) {
            o.d(i0Var, f10, str);
        }
    }

    public static void e(y8.i0 i0Var, f.a aVar, String str, Object... objArr) {
        Level f10 = f(aVar);
        if (o.f20767f.isLoggable(f10)) {
            o.d(i0Var, f10, MessageFormat.format(str, objArr));
        }
    }

    public static Level f(f.a aVar) {
        int i10 = a.f20764a[aVar.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return Level.FINEST;
            }
            return Level.FINER;
        }
        return Level.FINE;
    }

    public static d0.b g(f.a aVar) {
        int i10 = a.f20764a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return d0.b.CT_INFO;
            }
            return d0.b.CT_WARNING;
        }
        return d0.b.CT_ERROR;
    }

    @Override // y8.f
    public void a(f.a aVar, String str) {
        d(this.f20762a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    @Override // y8.f
    public void b(f.a aVar, String str, Object... objArr) {
        String format;
        Level f10 = f(aVar);
        if (!c(aVar) && !o.f20767f.isLoggable(f10)) {
            format = null;
        } else {
            format = MessageFormat.format(str, objArr);
        }
        a(aVar, format);
    }

    public final boolean c(f.a aVar) {
        if (aVar != f.a.DEBUG && this.f20762a.c()) {
            return true;
        }
        return false;
    }

    public final void h(f.a aVar, String str) {
        if (aVar == f.a.DEBUG) {
            return;
        }
        this.f20762a.f(new d0.a().b(str).c(g(aVar)).e(this.f20763b.a()).a());
    }
}
