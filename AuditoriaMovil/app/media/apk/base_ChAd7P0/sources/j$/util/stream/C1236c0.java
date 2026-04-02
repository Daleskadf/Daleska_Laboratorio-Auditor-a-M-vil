package j$.util.stream;

import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1236c0 implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1298o2 f13208a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f13208a.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }
}
