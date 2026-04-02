package t4;

import H4.e1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.firestore.I;
import java.util.Arrays;
import java.util.HashSet;
import p.C1608t;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final HashSet f15803d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: a  reason: collision with root package name */
    public final C1608t f15804a;

    /* renamed from: b  reason: collision with root package name */
    public final u4.e f15805b;

    /* renamed from: c  reason: collision with root package name */
    public final p f15806c;

    public i(u4.e eVar, C1608t c1608t, p pVar) {
        this.f15805b = eVar;
        this.f15804a = c1608t;
        this.f15806c = pVar;
    }

    public static boolean a(I i7) {
        switch (AbstractC1828h.f15802a[i7.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case RecognitionOptions.DATA_MATRIX /* 16 */:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + i7);
        }
    }
}
