package K0;

import H4.e1;
import H4.p1;
import Q0.C0268e;
import Q0.C0272i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.concurrent.Executor;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final class n extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2499a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2500b;

    public /* synthetic */ n(Object obj, int i7) {
        this.f2499a = i7;
        this.f2500b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        switch (this.f2499a) {
            case 0:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i7 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i7 = type != 9 ? 8 : 7;
                                        }
                                        i7 = 5;
                                    }
                                }
                                i7 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i7 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                case 14:
                                case 15:
                                case 17:
                                    i7 = 4;
                                    break;
                                case 13:
                                    i7 = 5;
                                    break;
                                case RecognitionOptions.DATA_MATRIX /* 16 */:
                                case 19:
                                default:
                                    i7 = 6;
                                    break;
                                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    i7 = 2;
                                    break;
                                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                                    if (x.f2529a >= 29) {
                                        i7 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i7 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i8 = x.f2529a;
                o oVar = (o) this.f2500b;
                if (i8 >= 31 && i7 == 5) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        m mVar = new m(oVar);
                        mainExecutor = context.getMainExecutor();
                        telephonyManager.registerTelephonyCallback(mainExecutor, mVar);
                        telephonyManager.unregisterTelephonyCallback(mVar);
                        return;
                    } catch (RuntimeException unused2) {
                        o.a(5, oVar);
                        return;
                    }
                }
                o.a(i7, oVar);
                return;
            case 1:
                if (!isInitialStickyBroadcast()) {
                    C0272i c0272i = (C0272i) this.f2500b;
                    c0272i.a(C0268e.c(context, intent, c0272i.f4287i, c0272i.f4286h));
                    return;
                }
                return;
            default:
                if ("close action".equals(intent.getAction())) {
                    ((WebViewActivity) this.f2500b).finish();
                    return;
                }
                return;
        }
    }
}
