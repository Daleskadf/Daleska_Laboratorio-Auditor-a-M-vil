package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
/* renamed from: j$.util.stream.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1275k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f13293a = 0;

    static {
        EnumC1265i enumC1265i = EnumC1265i.CONCURRENT;
        EnumC1265i enumC1265i2 = EnumC1265i.UNORDERED;
        EnumC1265i enumC1265i3 = EnumC1265i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC1265i, enumC1265i2, enumC1265i3));
        Collections.unmodifiableSet(EnumSet.of(enumC1265i, enumC1265i2));
        Collections.unmodifiableSet(EnumSet.of(enumC1265i3));
        Collections.unmodifiableSet(EnumSet.of(enumC1265i2, enumC1265i3));
        Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC1265i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(double[] dArr, double d7) {
        double d8 = d7 - dArr[1];
        double d9 = dArr[0];
        double d10 = d9 + d8;
        dArr[1] = (d10 - d9) - d8;
        dArr[0] = d10;
    }
}
