package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class J implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f12847a;

    public /* synthetic */ J(Consumer consumer) {
        this.f12847a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f12847a.accept(Integer.valueOf(i7));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }
}
