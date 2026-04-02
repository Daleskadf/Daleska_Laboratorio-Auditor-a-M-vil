package m6;

import java.util.Collection;
/* renamed from: m6.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1449j extends AbstractC1448i {
    public static int M(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
