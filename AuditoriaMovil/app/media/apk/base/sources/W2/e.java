package W2;

import W.C0366i;
import W.C0370m;
import W.C0372o;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.example.appecoactivate.R;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC0739m;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.I;
import f3.AbstractC0989b;
import org.apache.tika.utils.StringUtils;
import z0.AbstractActivityC2064y;
import z0.C2041a;
import z0.L;
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f6169c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final e f6170d = new Object();

    public static AlertDialog f(Activity activity, int i7, B b5, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(A.c(activity, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b7 = A.b(activity, i7);
        if (b7 != null) {
            builder.setPositiveButton(b7, b5);
        }
        String d7 = A.d(activity, i7);
        if (d7 != null) {
            builder.setTitle(d7);
        }
        Log.w("GoogleApiAvailability", io.flutter.plugins.pathprovider.b.e(i7, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [W2.c, android.app.DialogFragment] */
    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC2064y) {
                L j = ((AbstractActivityC2064y) activity).j();
                k kVar = new k();
                I.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f6182b1 = alertDialog;
                if (onCancelListener != null) {
                    kVar.f6183c1 = onCancelListener;
                }
                kVar.f16797Y0 = false;
                kVar.f16798Z0 = true;
                j.getClass();
                C2041a c2041a = new C2041a(j);
                c2041a.f16740o = true;
                c2041a.e(0, kVar, str);
                c2041a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        I.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f6163a = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f6164b = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    @Override // W2.f
    public final int c(Context context) {
        return d(context, f.f6171a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i7, GoogleApiActivity googleApiActivity2) {
        AlertDialog f = f(googleApiActivity, i7, new B(super.b(i7, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (f == null) {
            return;
        }
        g(googleApiActivity, f, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i7, PendingIntent pendingIntent) {
        String d7;
        String e7;
        int i8;
        int i9;
        boolean z7;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", io.flutter.plugins.pathprovider.b.f("GMS core API Availability. ConnectionResult=", i7, ", tag=null"), new IllegalArgumentException());
        if (i7 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i7 == 6) {
                d7 = A.f(context, "common_google_play_services_resolution_required_title");
            } else {
                d7 = A.d(context, i7);
            }
            if (d7 == null) {
                d7 = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i7 != 6 && i7 != 19) {
                e7 = A.c(context, i7);
            } else {
                e7 = A.e(context, "common_google_play_services_resolution_required_text", A.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            I.i(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C0372o c0372o = new C0372o(context, null);
            c0372o.f6076u = true;
            c0372o.c(16, true);
            c0372o.f6062e = C0372o.b(d7);
            C0370m c0370m = new C0370m(0);
            c0370m.f = C0372o.b(e7);
            c0372o.d(c0370m);
            PackageManager packageManager = context.getPackageManager();
            if (AbstractC0989b.f11053b == null) {
                AbstractC0989b.f11053b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (AbstractC0989b.f11053b.booleanValue()) {
                c0372o.f6055G.icon = context.getApplicationInfo().icon;
                c0372o.f6066k = 2;
                if (AbstractC0989b.d(context)) {
                    i8 = 2;
                    c0372o.f6059b.add(new C0366i(IconCompat.e(null, StringUtils.EMPTY, R.drawable.common_full_open_on_phone), resources.getString(R.string.common_open_on_phone), pendingIntent, new Bundle(), null, null, true, true, false));
                } else {
                    i8 = 2;
                    c0372o.f6063g = pendingIntent;
                }
            } else {
                i8 = 2;
                c0372o.f6055G.icon = 17301642;
                c0372o.f6055G.tickerText = C0372o.b(resources.getString(R.string.common_google_play_services_notification_ticker));
                c0372o.f6055G.when = System.currentTimeMillis();
                c0372o.f6063g = pendingIntent;
                c0372o.f = C0372o.b(e7);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                if (i10 >= 26) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                I.l(z7);
                synchronized (f6169c) {
                }
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(A.e.e(string));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                c0372o.f6050B = "com.google.android.gms.availability";
            }
            Notification a7 = c0372o.a();
            if (i7 != 1 && i7 != i8 && i7 != 3) {
                i9 = 39789;
            } else {
                i.f6175a.set(false);
                i9 = 10436;
            }
            notificationManager.notify(i9, a7);
        }
    }

    public final void i(Activity activity, InterfaceC0739m interfaceC0739m, int i7, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f = f(activity, i7, new B(super.b(i7, activity, "d"), interfaceC0739m, 1), onCancelListener);
        if (f == null) {
            return;
        }
        g(activity, f, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
