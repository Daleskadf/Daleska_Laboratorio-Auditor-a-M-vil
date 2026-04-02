package T6;

import com.google.android.gms.common.api.f;
import j$.util.function.IntUnaryOperator$CC;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.util.function.IntUnaryOperator;
/* loaded from: classes.dex */
public abstract class d extends b {
    static {
        OpenOption[] openOptionArr = U6.a.f5786a;
    }

    public d() {
        Charset.defaultCharset();
        Charset.defaultCharset();
        new IntUnaryOperator() { // from class: T6.c
            public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i7) {
                d.this.getClass();
                if (i7 <= Integer.MAX_VALUE) {
                    return i7;
                }
                throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i7), Integer.valueOf((int) f.API_PRIORITY_OTHER)));
            }

            public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
            }
        };
    }
}
