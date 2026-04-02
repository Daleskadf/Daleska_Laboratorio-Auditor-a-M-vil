package l2;

import m2.InterfaceC1435a;
/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13819a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13820b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f13816c = new b("NONE", 0);

    /* renamed from: d  reason: collision with root package name */
    public static final b f13817d = new b("FULL", 0);

    /* renamed from: e  reason: collision with root package name */
    public static final b f13818e = new b("FLAT", 1);
    public static final b f = new b("HALF_OPENED", 1);

    /* renamed from: X  reason: collision with root package name */
    public static final b f13814X = new b("FOLD", 2);

    /* renamed from: Y  reason: collision with root package name */
    public static final b f13815Y = new b("HINGE", 2);

    public /* synthetic */ b(String str, int i7) {
        this.f13819a = i7;
        this.f13820b = str;
    }

    public String toString() {
        switch (this.f13819a) {
            case 0:
                return (String) this.f13820b;
            case 1:
                return (String) this.f13820b;
            case 2:
                return (String) this.f13820b;
            default:
                return super.toString();
        }
    }

    public b(InterfaceC1435a interfaceC1435a) {
        this.f13819a = 3;
        int i7 = o.f13845b;
        this.f13820b = interfaceC1435a;
    }
}
