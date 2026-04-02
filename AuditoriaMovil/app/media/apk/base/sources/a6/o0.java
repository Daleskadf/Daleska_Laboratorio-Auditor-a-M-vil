package a6;

import D.AbstractC0055e;
import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: d  reason: collision with root package name */
    public static final List f7172d;

    /* renamed from: e  reason: collision with root package name */
    public static final o0 f7173e;
    public static final o0 f;

    /* renamed from: g  reason: collision with root package name */
    public static final o0 f7174g;

    /* renamed from: h  reason: collision with root package name */
    public static final o0 f7175h;

    /* renamed from: i  reason: collision with root package name */
    public static final o0 f7176i;
    public static final o0 j;

    /* renamed from: k  reason: collision with root package name */
    public static final o0 f7177k;

    /* renamed from: l  reason: collision with root package name */
    public static final o0 f7178l;

    /* renamed from: m  reason: collision with root package name */
    public static final o0 f7179m;

    /* renamed from: n  reason: collision with root package name */
    public static final o0 f7180n;

    /* renamed from: o  reason: collision with root package name */
    public static final c0 f7181o;

    /* renamed from: p  reason: collision with root package name */
    public static final c0 f7182p;

    /* renamed from: a  reason: collision with root package name */
    public final n0 f7183a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7184b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f7185c;

    static {
        n0[] values;
        o0 o0Var;
        TreeMap treeMap = new TreeMap();
        for (n0 n0Var : n0.values()) {
            if (((o0) treeMap.put(Integer.valueOf(n0Var.c()), new o0(n0Var, null, null))) != null) {
                throw new IllegalStateException("Code value duplication between " + o0Var.f7183a.name() + " & " + n0Var.name());
            }
        }
        f7172d = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        f7173e = n0.OK.b();
        f = n0.CANCELLED.b();
        f7174g = n0.UNKNOWN.b();
        n0.INVALID_ARGUMENT.b();
        f7175h = n0.DEADLINE_EXCEEDED.b();
        n0.NOT_FOUND.b();
        n0.ALREADY_EXISTS.b();
        f7176i = n0.PERMISSION_DENIED.b();
        j = n0.UNAUTHENTICATED.b();
        f7177k = n0.RESOURCE_EXHAUSTED.b();
        f7178l = n0.FAILED_PRECONDITION.b();
        n0.ABORTED.b();
        n0.OUT_OF_RANGE.b();
        n0.UNIMPLEMENTED.b();
        f7179m = n0.INTERNAL.b();
        f7180n = n0.UNAVAILABLE.b();
        n0.DATA_LOSS.b();
        f7181o = new c0("grpc-status", false, new C0483l(10));
        f7182p = new c0("grpc-message", false, new C0483l(1));
    }

    public o0(n0 n0Var, String str, Throwable th) {
        G.i.j(n0Var, "code");
        this.f7183a = n0Var;
        this.f7184b = str;
        this.f7185c = th;
    }

    public static String b(o0 o0Var) {
        String str = o0Var.f7184b;
        n0 n0Var = o0Var.f7183a;
        if (str == null) {
            return n0Var.toString();
        }
        return n0Var + ": " + o0Var.f7184b;
    }

    public static o0 c(int i7) {
        if (i7 >= 0) {
            List list = f7172d;
            if (i7 < list.size()) {
                return (o0) list.get(i7);
            }
        }
        return f7174g.g("Unknown code " + i7);
    }

    public static o0 d(Throwable th) {
        G.i.j(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof p0) {
                return ((p0) th2).f7188a;
            }
            if (th2 instanceof q0) {
                return ((q0) th2).f7191a;
            }
        }
        return f7174g.f(th);
    }

    public final o0 a(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.f7185c;
        n0 n0Var = this.f7183a;
        String str2 = this.f7184b;
        if (str2 == null) {
            return new o0(n0Var, str, th);
        }
        return new o0(n0Var, str2 + "\n" + str, th);
    }

    public final boolean e() {
        if (n0.OK == this.f7183a) {
            return true;
        }
        return false;
    }

    public final o0 f(Throwable th) {
        if (F.f.l(this.f7185c, th)) {
            return this;
        }
        return new o0(this.f7183a, this.f7184b, th);
    }

    public final o0 g(String str) {
        if (F.f.l(this.f7184b, str)) {
            return this;
        }
        return new o0(this.f7183a, str, this.f7185c);
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f7183a.name(), "code");
        C7.a(this.f7184b, "description");
        Throwable th = this.f7185c;
        String str = th;
        if (th != null) {
            Object obj = z3.r.f16897a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            str = stringWriter.toString();
        }
        C7.a(str, "cause");
        return C7.toString();
    }
}
