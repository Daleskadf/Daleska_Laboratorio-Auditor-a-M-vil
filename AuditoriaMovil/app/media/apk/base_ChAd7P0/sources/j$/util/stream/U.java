package j$.util.stream;

import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class U implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1298o2 f13164a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f13164a.accept(i7);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }
}
