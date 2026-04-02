package j$.util;

import j$.util.stream.AbstractC1340x0;
import j$.util.stream.Stream;
/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return AbstractC1340x0.f0(Spliterators.m(tArr, 0, tArr.length), false);
    }
}
