package K6;

import F6.E0;
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.k implements w6.p {

    /* renamed from: b  reason: collision with root package name */
    public static final y f2809b = new y(2, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final y f2810c = new y(2, 1);

    /* renamed from: d  reason: collision with root package name */
    public static final y f2811d = new y(2, 2);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2812a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i7, int i8) {
        super(i7);
        this.f2812a = i8;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i7;
        switch (this.f2812a) {
            case 0:
                n6.g gVar = (n6.g) obj2;
                if (gVar instanceof E0) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i7 = num.intValue();
                    } else {
                        i7 = 1;
                    }
                    if (i7 == 0) {
                        return gVar;
                    }
                    return Integer.valueOf(i7 + 1);
                }
                return obj;
            case 1:
                E0 e02 = (E0) obj;
                n6.g gVar2 = (n6.g) obj2;
                if (e02 == null) {
                    if (gVar2 instanceof E0) {
                        return (E0) gVar2;
                    }
                    return null;
                }
                return e02;
            default:
                n6.g gVar3 = (n6.g) obj2;
                return (A) obj;
        }
    }
}
