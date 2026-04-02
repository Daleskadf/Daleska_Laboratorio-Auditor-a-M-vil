package j$.util.stream;

import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.C1359y;
import j$.util.C1360z;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import org.apache.tika.utils.XMLReaderUtils;
/* renamed from: j$.util.stream.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1300p implements BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, BinaryOperator, IntFunction, DoubleBinaryOperator, DoubleFunction, ToDoubleFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13326a;

    public /* synthetic */ C1300p(int i7) {
        this.f13326a = i7;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f13326a) {
            case 0:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case 2:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case 21:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            default:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f13326a) {
            case 9:
                return j$.com.android.tools.r8.a.b(this, function);
            case 10:
            case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            default:
                return j$.com.android.tools.r8.a.b(this, function);
            case 11:
                return j$.com.android.tools.r8.a.b(this, function);
            case 13:
                return j$.com.android.tools.r8.a.b(this, function);
        }
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d7) {
        return Double.valueOf(d7);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.f13326a) {
            case 8:
                return AbstractC1340x0.J(j);
            case 9:
            default:
                return AbstractC1340x0.U(j);
            case 10:
                return AbstractC1340x0.S(j);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d7, double d8) {
        switch (this.f13326a) {
            case 22:
                return Math.min(d7, d8);
            default:
                return Math.max(d7, d8);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d7) {
        switch (this.f13326a) {
            case 1:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                AbstractC1275k.a(dArr, d7);
                dArr[3] = dArr[3] + d7;
                return;
            case 2:
            default:
                ((C1359y) obj).accept(d7);
                return;
            case 3:
                double[] dArr2 = (double[]) obj;
                AbstractC1275k.a(dArr2, d7);
                dArr2[2] = dArr2[2] + d7;
                return;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f13326a) {
            case 4:
                return new Object();
            case 5:
                return new Object();
            case 6:
                return new Object();
            case 7:
                return new Object();
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return new C1359y();
            case 17:
                return new C1360z();
            case H4.p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new j$.util.B();
            case 19:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f13326a) {
            case 0:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC1275k.a(dArr, dArr2[0]);
                AbstractC1275k.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 2:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC1275k.a(dArr3, dArr4[0]);
                AbstractC1275k.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 21:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            default:
                ((C1359y) obj).b((C1359y) obj2);
                return;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i7) {
        switch (this.f13326a) {
            case 15:
                return new Object[i7];
            default:
                return new Double[i7];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f13326a) {
            case 9:
                return new L0((D0) obj, (D0) obj2);
            case 10:
            case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            default:
                return new L0((J0) obj, (J0) obj2);
            case 11:
                return new L0((F0) obj, (F0) obj2);
            case 13:
                return new L0((H0) obj, (H0) obj2);
        }
    }
}
