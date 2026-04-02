package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* renamed from: j$.util.stream.y1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1346y1 extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    protected final J0 f13395a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f13396b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13397c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f13398d;

    public C1346y1(J0 j02, Object obj, int i7) {
        this.f13397c = i7;
        this.f13395a = j02;
        this.f13396b = 0;
        this.f13398d = obj;
    }

    C1346y1(C1346y1 c1346y1, J0 j02, int i7, byte b5) {
        super(c1346y1);
        this.f13395a = j02;
        this.f13396b = i7;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C1346y1 c1346y1 = this;
        while (c1346y1.f13395a.q() != 0) {
            c1346y1.setPendingCount(c1346y1.f13395a.q() - 1);
            int i7 = 0;
            int i8 = 0;
            while (i7 < c1346y1.f13395a.q() - 1) {
                C1346y1 a7 = c1346y1.a(i7, c1346y1.f13396b + i8);
                i8 = (int) (i8 + a7.f13395a.count());
                a7.fork();
                i7++;
            }
            c1346y1 = c1346y1.a(i7, c1346y1.f13396b + i8);
        }
        switch (c1346y1.f13397c) {
            case 0:
                ((I0) c1346y1.f13395a).r(c1346y1.f13396b, c1346y1.f13398d);
                break;
            default:
                c1346y1.f13395a.i((Object[]) c1346y1.f13398d, c1346y1.f13396b);
                break;
        }
        c1346y1.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1346y1(C1346y1 c1346y1, J0 j02, int i7) {
        this(c1346y1, j02, i7, (byte) 0);
        this.f13397c = 1;
        this.f13398d = (Object[]) c1346y1.f13398d;
    }

    final C1346y1 a(int i7, int i8) {
        switch (this.f13397c) {
            case 0:
                return new C1346y1(this, ((I0) this.f13395a).b(i7), i8);
            default:
                return new C1346y1(this, this.f13395a.b(i7), i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1346y1(C1346y1 c1346y1, I0 i02, int i7) {
        this(c1346y1, i02, i7, (byte) 0);
        this.f13397c = 0;
        this.f13398d = c1346y1.f13398d;
    }
}
