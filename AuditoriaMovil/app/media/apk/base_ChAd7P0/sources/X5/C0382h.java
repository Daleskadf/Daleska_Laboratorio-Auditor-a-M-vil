package X5;

import android.util.Log;
/* renamed from: X5.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382h extends kotlin.jvm.internal.k implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f6494a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0382h(long j) {
        super(1);
        this.f6494a = j;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        if (((l6.f) obj).f13868a instanceof l6.e) {
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + this.f6494a);
        }
        return l6.j.f13876a;
    }
}
