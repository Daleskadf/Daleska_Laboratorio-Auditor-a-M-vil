package q5;

import K5.r;
import L5.q;
import M.d;
import android.os.Handler;
import android.os.Looper;
import c1.RunnableC0626c;
import com.google.firebase.firestore.S;
import j$.util.Objects;
import kotlin.jvm.internal.j;
/* renamed from: q5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1712a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15387a;

    /* renamed from: b  reason: collision with root package name */
    public final r f15388b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f15389c;

    public C1712a(r rVar, int i7) {
        this.f15387a = i7;
        switch (i7) {
            case 1:
                this.f15388b = rVar;
                this.f15389c = new Handler(Looper.getMainLooper());
                return;
            default:
                this.f15389c = new Handler(Looper.getMainLooper());
                this.f15388b = rVar;
                return;
        }
    }

    @Override // L5.q
    public final void a(Object obj) {
        switch (this.f15387a) {
            case 0:
                this.f15389c.post(new S(28, this, obj));
                return;
            default:
                this.f15389c.post(new S(29, this, obj));
                return;
        }
    }

    @Override // L5.q
    public final void b(Object obj, String errorCode, String str) {
        switch (this.f15387a) {
            case 0:
                this.f15389c.post(new d(this, errorCode, str, obj, 16));
                return;
            default:
                j.e(errorCode, "errorCode");
                this.f15389c.post(new d(this, errorCode, str, obj, 17));
                return;
        }
    }

    @Override // L5.q
    public final void c() {
        switch (this.f15387a) {
            case 0:
                Handler handler = this.f15389c;
                r rVar = this.f15388b;
                Objects.requireNonNull(rVar);
                handler.post(new RunnableC0626c(rVar, 15));
                return;
            default:
                this.f15389c.post(new RunnableC0626c(this, 16));
                return;
        }
    }
}
