package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC1202i;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes2.dex */
public final class f implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final long[] f12820i = new long[0];
    private static final e[] j = new e[0];

    /* renamed from: k  reason: collision with root package name */
    private static final LocalDateTime[] f12821k = new LocalDateTime[0];

    /* renamed from: l  reason: collision with root package name */
    private static final b[] f12822l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a  reason: collision with root package name */
    private final long[] f12823a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset[] f12824b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f12825c;

    /* renamed from: d  reason: collision with root package name */
    private final LocalDateTime[] f12826d;

    /* renamed from: e  reason: collision with root package name */
    private final ZoneOffset[] f12827e;
    private final e[] f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeZone f12828g;

    /* renamed from: h  reason: collision with root package name */
    private final transient ConcurrentHashMap f12829h = new ConcurrentHashMap();

    public static f h(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return new f(zoneOffset);
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f12823a = jArr;
        this.f12824b = zoneOffsetArr;
        this.f12825c = jArr2;
        this.f12827e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.f12826d = f12821k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (i7 < jArr2.length) {
                int i8 = i7 + 1;
                b bVar = new b(jArr2[i7], zoneOffsetArr2[i7], zoneOffsetArr2[i8]);
                if (bVar.D()) {
                    arrayList.add(bVar.q());
                    arrayList.add(bVar.o());
                } else {
                    arrayList.add(bVar.o());
                    arrayList.add(bVar.q());
                }
                i7 = i8;
            }
            this.f12826d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f12828g = null;
    }

    private f(ZoneOffset zoneOffset) {
        this.f12824b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f12820i;
        this.f12823a = jArr;
        this.f12825c = jArr;
        this.f12826d = f12821k;
        this.f12827e = zoneOffsetArr;
        this.f = j;
        this.f12828g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(TimeZone timeZone) {
        this.f12824b = r0;
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        long[] jArr = f12820i;
        this.f12823a = jArr;
        this.f12825c = jArr;
        this.f12826d = f12821k;
        this.f12827e = zoneOffsetArr;
        this.f = j;
        this.f12828g = timeZone;
    }

    private static ZoneOffset i(int i7) {
        return ZoneOffset.c0(i7 / PipesIterator.DEFAULT_QUEUE_SIZE);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f12828g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        long[] jArr = this.f12823a;
        objectOutput.writeInt(jArr.length);
        for (long j8 : jArr) {
            a.c(j8, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.f12824b) {
            a.d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.f12825c;
        objectOutput.writeInt(jArr2.length);
        for (long j9 : jArr2) {
            a.c(j9, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f12827e) {
            a.d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = this.f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f12828g.getID());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f j(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        long[] jArr = f12820i;
        long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            jArr2[i7] = a.a(objectInput);
        }
        int i8 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            zoneOffsetArr[i9] = a.b(objectInput);
        }
        int readInt2 = objectInput.readInt();
        if (readInt2 != 0) {
            jArr = new long[readInt2];
        }
        long[] jArr3 = jArr;
        for (int i10 = 0; i10 < readInt2; i10++) {
            jArr3[i10] = a.a(objectInput);
        }
        int i11 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            zoneOffsetArr2[i12] = a.b(objectInput);
        }
        int readByte = objectInput.readByte();
        e[] eVarArr = readByte == 0 ? j : new e[readByte];
        for (int i13 = 0; i13 < readByte; i13++) {
            eVarArr[i13] = e.b(objectInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f12828g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f12825c;
        if (jArr.length == 0) {
            return this.f12824b[0];
        }
        long T7 = instant.T();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.f12827e;
        if (length > 0 && T7 > jArr[jArr.length - 1]) {
            b[] b5 = b(c(T7, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i7 = 0; i7 < b5.length; i7++) {
                bVar = b5[i7];
                if (T7 < bVar.Q()) {
                    return bVar.w();
                }
            }
            return bVar.t();
        }
        int binarySearch = Arrays.binarySearch(jArr, T7);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return zoneOffsetArr[binarySearch + 1];
    }

    public final List g(LocalDateTime localDateTime) {
        Object e7 = e(localDateTime);
        if (e7 instanceof b) {
            return ((b) e7).B();
        }
        return Collections.singletonList((ZoneOffset) e7);
    }

    public final b f(LocalDateTime localDateTime) {
        Object e7 = e(localDateTime);
        if (e7 instanceof b) {
            return (b) e7;
        }
        return null;
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f12824b;
        int i7 = 0;
        TimeZone timeZone = this.f12828g;
        if (timeZone != null) {
            b[] b5 = b(localDateTime.a0());
            if (b5.length == 0) {
                return i(timeZone.getOffset(AbstractC1202i.o(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = b5.length;
            while (i7 < length) {
                b bVar = b5[i7];
                Object a7 = a(localDateTime, bVar);
                if ((a7 instanceof b) || a7.equals(bVar.w())) {
                    return a7;
                }
                i7++;
                obj = a7;
            }
            return obj;
        } else if (this.f12825c.length == 0) {
            return zoneOffsetArr[0];
        } else {
            int length2 = this.f.length;
            LocalDateTime[] localDateTimeArr = this.f12826d;
            if (length2 > 0 && localDateTime.b0(localDateTimeArr[localDateTimeArr.length - 1])) {
                b[] b7 = b(localDateTime.a0());
                int length3 = b7.length;
                while (i7 < length3) {
                    b bVar2 = b7[i7];
                    Object a8 = a(localDateTime, bVar2);
                    if ((a8 instanceof b) || a8.equals(bVar2.w())) {
                        return a8;
                    }
                    i7++;
                    obj = a8;
                }
                return obj;
            }
            int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
            ZoneOffset[] zoneOffsetArr2 = this.f12827e;
            if (binarySearch == -1) {
                return zoneOffsetArr2[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else if (binarySearch < localDateTimeArr.length - 1) {
                int i8 = binarySearch + 1;
                if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i8])) {
                    binarySearch = i8;
                }
            }
            if ((binarySearch & 1) == 0) {
                LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
                LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
                int i9 = binarySearch / 2;
                ZoneOffset zoneOffset = zoneOffsetArr2[i9];
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i9 + 1];
                if (zoneOffset2.Z() > zoneOffset.Z()) {
                    return new b(localDateTime2, zoneOffset, zoneOffset2);
                }
                return new b(localDateTime3, zoneOffset, zoneOffset2);
            }
            return zoneOffsetArr2[(binarySearch / 2) + 1];
        }
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime q2 = bVar.q();
        if (bVar.D()) {
            if (localDateTime.c0(q2)) {
                return bVar.w();
            }
            return localDateTime.c0(bVar.o()) ? bVar : bVar.t();
        } else if (localDateTime.c0(q2)) {
            return localDateTime.c0(bVar.o()) ? bVar.w() : bVar;
        } else {
            return bVar.t();
        }
    }

    private b[] b(int i7) {
        long j8;
        Integer valueOf = Integer.valueOf(i7);
        ConcurrentHashMap concurrentHashMap = this.f12829h;
        b[] bVarArr = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f12828g;
        if (timeZone != null) {
            b[] bVarArr2 = f12822l;
            if (i7 < 1800) {
                return bVarArr2;
            }
            long o7 = AbstractC1202i.o(LocalDateTime.d0(i7 - 1), this.f12824b[0]);
            int offset = timeZone.getOffset(o7 * 1000);
            long j9 = 31968000 + o7;
            while (o7 < j9) {
                long j10 = 7776000 + o7;
                long j11 = o7;
                if (offset != timeZone.getOffset(j10 * 1000)) {
                    o7 = j11;
                    while (j10 - o7 > 1) {
                        int i8 = offset;
                        long j12 = j9;
                        long k2 = j$.com.android.tools.r8.a.k(j10 + o7, 2L);
                        if (timeZone.getOffset(k2 * 1000) == i8) {
                            o7 = k2;
                        } else {
                            j10 = k2;
                        }
                        offset = i8;
                        j9 = j12;
                    }
                    j8 = j9;
                    int i9 = offset;
                    if (timeZone.getOffset(o7 * 1000) == i9) {
                        o7 = j10;
                    }
                    ZoneOffset i10 = i(i9);
                    offset = timeZone.getOffset(o7 * 1000);
                    ZoneOffset i11 = i(offset);
                    if (c(o7, i11) == i7) {
                        bVarArr2 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr2[bVarArr2.length - 1] = new b(o7, i10, i11);
                    }
                } else {
                    j8 = j9;
                    o7 = j10;
                }
                j9 = j8;
            }
            if (1916 <= i7 && i7 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            bVarArr3[i12] = eVarArr[i12].a(i7);
        }
        if (i7 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j8, ZoneOffset zoneOffset) {
        return j$.time.h.i0(j$.com.android.tools.r8.a.k(j8 + zoneOffset.Z(), 86400)).a0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return Objects.equals(this.f12828g, fVar.f12828g) && Arrays.equals(this.f12823a, fVar.f12823a) && Arrays.equals(this.f12824b, fVar.f12824b) && Arrays.equals(this.f12825c, fVar.f12825c) && Arrays.equals(this.f12827e, fVar.f12827e) && Arrays.equals(this.f, fVar.f);
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f12828g) ^ Arrays.hashCode(this.f12823a)) ^ Arrays.hashCode(this.f12824b)) ^ Arrays.hashCode(this.f12825c)) ^ Arrays.hashCode(this.f12827e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.f12828g;
        if (timeZone != null) {
            String id = timeZone.getID();
            return "ZoneRules[timeZone=" + id + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f12824b;
        ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
        return "ZoneRules[currentStandardOffset=" + zoneOffset + "]";
    }
}
