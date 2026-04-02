package R5;

import com.google.firebase.firestore.EnumC0809k;
import io.flutter.plugins.firebase.firestore.F;
import io.flutter.plugins.firebase.firestore.G;
import io.flutter.plugins.firebase.firestore.k;
import io.flutter.plugins.firebase.firestore.s;
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4778a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f4779b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f4780c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int[] f4781d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int[] f4782e;

    static {
        int[] iArr = new int[k.values().length];
        f4782e = iArr;
        try {
            iArr[k.SERVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        int[] iArr2 = new int[s.values().length];
        f4781d = iArr2;
        try {
            iArr2[s.DEFAULT_SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4781d[s.CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr3 = new int[EnumC0809k.values().length];
        f4780c = iArr3;
        try {
            iArr3[EnumC0809k.ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4780c[EnumC0809k.MODIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f4780c[EnumC0809k.REMOVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr4 = new int[F.values().length];
        f4779b = iArr4;
        try {
            iArr4[F.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f4779b[F.ESTIMATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f4779b[F.PREVIOUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr5 = new int[G.values().length];
        f4778a = iArr5;
        try {
            iArr5[G.CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f4778a[G.SERVER_AND_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f4778a[G.SERVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
