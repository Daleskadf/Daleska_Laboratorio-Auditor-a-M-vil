package j$.util.stream;

import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.C1360z;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Supplier, Predicate, IntFunction, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13338a;

    public /* synthetic */ r(int i7) {
        this.f13338a = i7;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f13338a) {
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f13338a) {
            case 11:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            default:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i7, int i8) {
        switch (this.f13338a) {
            case 9:
                return Math.min(i7, i8);
            case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return i7 + i8;
            default:
                return Math.max(i7, i8);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j8) {
        switch (this.f13338a) {
            case H4.p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return Math.min(j, j8);
            case 26:
                return Math.max(j, j8);
            default:
                return j + j8;
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f13338a) {
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f13338a) {
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f13338a) {
            case 1:
                return ((j$.util.C) obj).c();
            case 2:
                return ((j$.util.D) obj).c();
            case 3:
                return ((j$.util.E) obj).c();
            default:
                return ((Optional) obj).isPresent();
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i7) {
        switch (this.f13338a) {
            case 5:
                return new Object[i7];
            case 6:
                return new Integer[i7];
            case 8:
                return Integer.valueOf(i7);
            case 21:
                return new Long[i7];
            default:
                return new Object[i7];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f13338a) {
            case 0:
                return new double[3];
            case 14:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.f13338a) {
            case 17:
                ((j$.util.B) obj).accept(j);
                return;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                return;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f13338a) {
            case 11:
                ((C1360z) obj).b((C1360z) obj2);
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                ((j$.util.B) obj).b((j$.util.B) obj2);
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i7) {
        switch (this.f13338a) {
            case 10:
                ((C1360z) obj).accept(i7);
                return;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i7;
                return;
        }
    }
}
