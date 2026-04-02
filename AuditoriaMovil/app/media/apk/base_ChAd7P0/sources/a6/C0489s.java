package a6;

import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: a6.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0489s {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7197a = Logger.getLogger(C0489s.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final C0489s f7198b = new Object();

    public static C0489s b() {
        ((v0) AbstractC0488q.f7190a).getClass();
        C0489s c0489s = (C0489s) v0.f7222b.get();
        C0489s c0489s2 = f7198b;
        if (c0489s == null) {
            c0489s = c0489s2;
        }
        if (c0489s == null) {
            return c0489s2;
        }
        return c0489s;
    }

    public final C0489s a() {
        ((v0) AbstractC0488q.f7190a).getClass();
        ThreadLocal threadLocal = v0.f7222b;
        C0489s c0489s = (C0489s) threadLocal.get();
        C0489s c0489s2 = f7198b;
        if (c0489s == null) {
            c0489s = c0489s2;
        }
        threadLocal.set(this);
        if (c0489s == null) {
            return c0489s2;
        }
        return c0489s;
    }

    public final void c(C0489s c0489s) {
        if (c0489s != null) {
            ((v0) AbstractC0488q.f7190a).getClass();
            ThreadLocal threadLocal = v0.f7222b;
            C0489s c0489s2 = (C0489s) threadLocal.get();
            C0489s c0489s3 = f7198b;
            if (c0489s2 == null) {
                c0489s2 = c0489s3;
            }
            if (c0489s2 != this) {
                v0.f7221a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
            }
            if (c0489s != c0489s3) {
                threadLocal.set(c0489s);
                return;
            } else {
                threadLocal.set(null);
                return;
            }
        }
        throw new NullPointerException("toAttach");
    }
}
