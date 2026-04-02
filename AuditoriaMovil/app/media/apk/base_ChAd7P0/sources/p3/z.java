package p3;

import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final W2.d f15157a;

    /* renamed from: b  reason: collision with root package name */
    public static final W2.d f15158b;

    /* renamed from: c  reason: collision with root package name */
    public static final W2.d f15159c;

    /* renamed from: d  reason: collision with root package name */
    public static final W2.d f15160d;

    /* renamed from: e  reason: collision with root package name */
    public static final W2.d f15161e;
    public static final W2.d f;

    /* renamed from: g  reason: collision with root package name */
    public static final W2.d f15162g;

    /* renamed from: h  reason: collision with root package name */
    public static final W2.d f15163h;

    /* renamed from: i  reason: collision with root package name */
    public static final W2.d[] f15164i;

    static {
        W2.d dVar = new W2.d("name_ulr_private", 1L);
        W2.d dVar2 = new W2.d("name_sleep_segment_request", 1L);
        f15157a = dVar2;
        W2.d dVar3 = new W2.d("get_last_activity_feature_id", 1L);
        W2.d dVar4 = new W2.d("support_context_feature_id", 1L);
        W2.d dVar5 = new W2.d("get_current_location", 2L);
        f15158b = dVar5;
        W2.d dVar6 = new W2.d("get_last_location_with_request", 1L);
        f15159c = dVar6;
        W2.d dVar7 = new W2.d("set_mock_mode_with_callback", 1L);
        f15160d = dVar7;
        W2.d dVar8 = new W2.d("set_mock_location_with_callback", 1L);
        f15161e = dVar8;
        W2.d dVar9 = new W2.d("inject_location_with_callback", 1L);
        W2.d dVar10 = new W2.d("location_updates_with_callback", 1L);
        f = dVar10;
        W2.d dVar11 = new W2.d("use_safe_parcelable_in_intents", 1L);
        W2.d dVar12 = new W2.d("flp_debug_updates", 1L);
        W2.d dVar13 = new W2.d("google_location_accuracy_enabled", 1L);
        f15162g = dVar13;
        W2.d dVar14 = new W2.d("geofences_with_callback", 1L);
        f15163h = dVar14;
        f15164i = new W2.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, new W2.d("location_enabled", 1L)};
    }

    public static String a(int i7) {
        switch (i7) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            default:
                return io.flutter.plugins.pathprovider.b.e(i7, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static void b(int i7) {
        boolean z7;
        if (i7 != 100 && i7 != 102 && i7 != 104) {
            if (i7 == 105) {
                i7 = 105;
            } else {
                z7 = false;
                com.google.android.gms.common.internal.I.b("priority %d must be a Priority.PRIORITY_* constant", z7, Integer.valueOf(i7));
            }
        }
        z7 = true;
        com.google.android.gms.common.internal.I.b("priority %d must be a Priority.PRIORITY_* constant", z7, Integer.valueOf(i7));
    }

    public static String c(int i7) {
        if (i7 != 100) {
            if (i7 != 102) {
                if (i7 != 104) {
                    if (i7 == 105) {
                        return "PASSIVE";
                    }
                    throw new IllegalArgumentException();
                }
                return "LOW_POWER";
            }
            return "BALANCED_POWER_ACCURACY";
        }
        return "HIGH_ACCURACY";
    }

    public static String d(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return "GRANULARITY_FINE";
                }
                throw new IllegalArgumentException();
            }
            return "GRANULARITY_COARSE";
        }
        return "GRANULARITY_PERMISSION_LEVEL";
    }
}
