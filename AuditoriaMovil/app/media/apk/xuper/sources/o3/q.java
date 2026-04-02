package o3;

import java.io.Serializable;
/* loaded from: classes.dex */
public class q implements n3.q, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final q f17556c = new q(null);

    /* renamed from: d  reason: collision with root package name */
    public static final q f17557d = new q(null);

    /* renamed from: a  reason: collision with root package name */
    public final Object f17558a;

    /* renamed from: b  reason: collision with root package name */
    public final d4.a f17559b;

    public q(Object obj) {
        d4.a aVar;
        this.f17558a = obj;
        if (obj == null) {
            aVar = d4.a.ALWAYS_NULL;
        } else {
            aVar = d4.a.CONSTANT;
        }
        this.f17559b = aVar;
    }

    public static q a(Object obj) {
        if (obj == null) {
            return f17557d;
        }
        return new q(obj);
    }

    public static boolean b(n3.q qVar) {
        if (qVar == f17556c) {
            return true;
        }
        return false;
    }

    public static q c() {
        return f17557d;
    }

    public static q d() {
        return f17556c;
    }

    @Override // n3.q
    public Object getNullValue(k3.g gVar) {
        return this.f17558a;
    }
}
