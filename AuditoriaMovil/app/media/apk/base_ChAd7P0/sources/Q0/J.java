package Q0;

import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public static final J f4228a = new Object();

    public static int a(int i7) {
        if (i7 != 20) {
            if (i7 != 30) {
                switch (i7) {
                    case 5:
                        return 80000;
                    case 6:
                        return 768000;
                    case 7:
                        return 192000;
                    case 8:
                        return 2250000;
                    case 9:
                        return 40000;
                    case 10:
                        return 100000;
                    case 11:
                        return 16000;
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        return 7000;
                    default:
                        switch (i7) {
                            case 14:
                                return 3062500;
                            case 15:
                                return 8000;
                            case RecognitionOptions.DATA_MATRIX /* 16 */:
                                return 256000;
                            case 17:
                                return 336000;
                            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                return 768000;
                            default:
                                throw new IllegalArgumentException();
                        }
                }
            }
            return 2250000;
        }
        return 63750;
    }
}
