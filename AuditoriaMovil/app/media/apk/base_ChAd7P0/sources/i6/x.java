package i6;

import a6.AbstractC0478g;
import a6.Q;
import a6.S;
import a6.h0;
import java.util.Map;
/* loaded from: classes.dex */
public final class x extends S {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11575a = 0;

    @Override // a6.S
    public String a() {
        return "round_robin";
    }

    @Override // a6.S
    public int b() {
        return 5;
    }

    @Override // a6.S
    public boolean c() {
        return true;
    }

    @Override // a6.S
    public final Q d(AbstractC0478g abstractC0478g) {
        return new w(abstractC0478g);
    }

    @Override // a6.S
    public h0 e(Map map) {
        return new h0("no service config");
    }
}
