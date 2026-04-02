package j$.util.stream;

import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1295o implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1298o2 f13318a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.f13318a.accept(d7);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
