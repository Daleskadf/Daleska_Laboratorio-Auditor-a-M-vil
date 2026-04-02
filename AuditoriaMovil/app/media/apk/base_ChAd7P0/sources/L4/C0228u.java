package L4;

import java.util.Calendar;
import java.util.GregorianCalendar;
/* renamed from: L4.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228u implements I4.H {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3010b;

    public /* synthetic */ C0228u(Object obj, int i7) {
        this.f3009a = i7;
        this.f3010b = obj;
    }

    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        switch (this.f3009a) {
            case 0:
                if (aVar.f4022a == Number.class) {
                    return (C0230w) this.f3010b;
                }
                return null;
            case 1:
                if (aVar.f4022a == Object.class) {
                    return new C0232y(nVar, (I4.E) this.f3010b);
                }
                return null;
            default:
                Class cls = aVar.f4022a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (b0) this.f3010b;
        }
    }

    public String toString() {
        switch (this.f3009a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((b0) this.f3010b) + "]";
            default:
                return super.toString();
        }
    }
}
