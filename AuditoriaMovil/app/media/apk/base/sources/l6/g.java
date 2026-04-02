package l6;

import java.io.Serializable;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class g implements c, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC1959a f13869a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f13870b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13871c;

    public g(InterfaceC1959a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        this.f13869a = initializer;
        this.f13870b = i.f13875a;
        this.f13871c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f13870b;
        i iVar = i.f13875a;
        if (obj2 != iVar) {
            return obj2;
        }
        synchronized (this.f13871c) {
            obj = this.f13870b;
            if (obj == iVar) {
                InterfaceC1959a interfaceC1959a = this.f13869a;
                kotlin.jvm.internal.j.b(interfaceC1959a);
                obj = interfaceC1959a.invoke();
                this.f13870b = obj;
                this.f13869a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f13870b != i.f13875a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
