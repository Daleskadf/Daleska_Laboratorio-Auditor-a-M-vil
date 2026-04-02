package K5;

import android.util.Log;
/* loaded from: classes.dex */
public final class r implements L5.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2733b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2734c;

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.f2732a = i7;
        this.f2734c = obj;
        this.f2733b = obj2;
    }

    @Override // L5.q
    public final void a(Object obj) {
        switch (this.f2732a) {
            case 0:
                ((s) this.f2734c).f2738d = (byte[]) this.f2733b;
                return;
            default:
                ((D5.f) this.f2733b).a(((L5.r) ((A.f) this.f2734c).f11c).f3042c.a(obj));
                return;
        }
    }

    @Override // L5.q
    public final void b(Object obj, String str, String str2) {
        switch (this.f2732a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                return;
            default:
                ((D5.f) this.f2733b).a(((L5.r) ((A.f) this.f2734c).f11c).f3042c.d(obj, str, str2));
                return;
        }
    }

    @Override // L5.q
    public final void c() {
        switch (this.f2732a) {
            case 0:
                return;
            default:
                ((D5.f) this.f2733b).a(null);
                return;
        }
    }

    private final void d() {
    }
}
