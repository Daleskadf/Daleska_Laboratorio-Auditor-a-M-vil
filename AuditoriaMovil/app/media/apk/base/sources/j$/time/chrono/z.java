package j$.time.chrono;

import j$.time.temporal.Temporal;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class z implements n, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final z f12650d;

    /* renamed from: e  reason: collision with root package name */
    private static final z[] f12651e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a  reason: collision with root package name */
    private final transient int f12652a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.h f12653b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f12654c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object B(j$.time.temporal.r rVar) {
        return AbstractC1202i.n(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean g(j$.time.temporal.q qVar) {
        return AbstractC1202i.j(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return AbstractC1202i.f(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long w(j$.time.temporal.q qVar) {
        return AbstractC1202i.g(this, qVar);
    }

    static {
        z zVar = new z(-1, j$.time.h.g0(1868, 1, 1), "Meiji");
        f12650d = zVar;
        z zVar2 = new z(0, j$.time.h.g0(1912, 7, 30), "Taisho");
        z zVar3 = new z(1, j$.time.h.g0(1926, 12, 25), "Showa");
        z zVar4 = new z(2, j$.time.h.g0(1989, 1, 8), "Heisei");
        z zVar5 = new z(3, j$.time.h.g0(2019, 5, 1), "Reiwa");
        f12651e = r8;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z m() {
        z[] zVarArr = f12651e;
        return zVarArr[zVarArr.length - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A() {
        int a02 = 1000000000 - m().f12653b.a0();
        z[] zVarArr = f12651e;
        int a03 = zVarArr[0].f12653b.a0();
        for (int i7 = 1; i7 < zVarArr.length; i7++) {
            z zVar = zVarArr[i7];
            a02 = Math.min(a02, (zVar.f12653b.a0() - a03) + 1);
            a03 = zVar.f12653b.a0();
        }
        return a02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long y() {
        z[] zVarArr;
        long f = j$.time.temporal.a.DAY_OF_YEAR.o().f();
        for (z zVar : f12651e) {
            f = Math.min(f, ((zVar.f12653b.c0() ? 366 : 365) - zVar.f12653b.X()) + 1);
            if (zVar.r() != null) {
                f = Math.min(f, zVar.r().f12653b.X() - 1);
            }
        }
        return f;
    }

    private z(int i7, j$.time.h hVar, String str) {
        this.f12652a = i7;
        this.f12653b = hVar;
        this.f12654c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.h n() {
        return this.f12653b;
    }

    public static z v(int i7) {
        int i8 = i7 + 1;
        if (i8 >= 0) {
            z[] zVarArr = f12651e;
            if (i8 < zVarArr.length) {
                return zVarArr[i8];
            }
        }
        throw new RuntimeException("Invalid era: " + i7);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    public static z[] C() {
        z[] zVarArr = f12651e;
        return (z[]) Arrays.copyOf(zVarArr, zVarArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z h(j$.time.h hVar) {
        if (hVar.b0(y.f12646d)) {
            throw new RuntimeException("JapaneseDate before Meiji 6 are not supported");
        }
        z[] zVarArr = f12651e;
        for (int length = zVarArr.length - 1; length >= 0; length--) {
            z zVar = zVarArr[length];
            if (hVar.compareTo(zVar.f12653b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.f12652a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (qVar != aVar) {
            return j$.time.temporal.l.d(this, qVar);
        }
        return w.f12644d.K(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final z r() {
        if (this == m()) {
            return null;
        }
        return v(this.f12652a + 1);
    }

    public final String toString() {
        return this.f12654c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(DataOutput dataOutput) {
        dataOutput.writeByte(this.f12652a);
    }
}
