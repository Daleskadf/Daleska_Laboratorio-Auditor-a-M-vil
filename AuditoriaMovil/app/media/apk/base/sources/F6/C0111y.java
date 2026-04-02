package F6;
/* renamed from: F6.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111y extends kotlin.jvm.internal.k implements w6.p {

    /* renamed from: b  reason: collision with root package name */
    public static final C0111y f1321b = new C0111y(2, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final C0111y f1322c = new C0111y(2, 1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1323a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0111y(int i7, int i8) {
        super(i7);
        this.f1323a = i8;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1323a) {
            case 0:
                return ((n6.i) obj).plus((n6.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                n6.g gVar = (n6.g) obj2;
                return bool;
            default:
                return ((n6.i) obj).plus((n6.g) obj2);
        }
    }
}
