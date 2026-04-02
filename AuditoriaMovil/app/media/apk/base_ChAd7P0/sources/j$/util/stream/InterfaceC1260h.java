package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
/* renamed from: j$.util.stream.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1260h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC1260h onClose(Runnable runnable);

    InterfaceC1260h parallel();

    InterfaceC1260h sequential();

    Spliterator spliterator();

    InterfaceC1260h unordered();
}
