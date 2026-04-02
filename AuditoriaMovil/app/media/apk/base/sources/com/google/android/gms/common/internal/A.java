package com.google.android.gms.common.internal;

import D.AbstractC0055e;
import H4.e1;
import H4.p1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.example.appecoactivate.R;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f3.AbstractC0989b;
import h3.C1080b;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final S.k f9290a = new S.k(0);

    /* renamed from: b  reason: collision with root package name */
    public static Locale f9291b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) C1080b.a(context).f10587a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i7) {
        Resources resources = context.getResources();
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(R.string.common_google_play_services_enable_button);
            }
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        return resources.getString(R.string.common_google_play_services_install_button);
    }

    public static String c(Context context, int i7) {
        Resources resources = context.getResources();
        String a7 = a(context);
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 5) {
                        if (i7 != 7) {
                            if (i7 != 9) {
                                if (i7 != 20) {
                                    switch (i7) {
                                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                                            return e(context, "common_google_play_services_api_unavailable_text", a7);
                                        case 17:
                                            return e(context, "common_google_play_services_sign_in_failed_text", a7);
                                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            return resources.getString(R.string.common_google_play_services_updating_text, a7);
                                        default:
                                            return resources.getString(R.string.common_google_play_services_unknown_issue, a7);
                                    }
                                }
                                return e(context, "common_google_play_services_restricted_profile_text", a7);
                            }
                            return resources.getString(R.string.common_google_play_services_unsupported_text, a7);
                        }
                        return e(context, "common_google_play_services_network_error_text", a7);
                    }
                    return e(context, "common_google_play_services_invalid_account_text", a7);
                }
                return resources.getString(R.string.common_google_play_services_enable_text, a7);
            } else if (AbstractC0989b.d(context)) {
                return resources.getString(R.string.common_google_play_services_wear_update_text);
            } else {
                return resources.getString(R.string.common_google_play_services_update_text, a7);
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, a7);
    }

    public static String d(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i7);
                return null;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String f = f(context, str);
        if (f == null) {
            f = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, f, str2);
    }

    public static String f(Context context, String str) {
        Resources resources;
        S.k kVar = f9290a;
        synchronized (kVar) {
            try {
                Locale locale = AbstractC0055e.j(context.getResources().getConfiguration()).f10166a.get(0);
                if (!locale.equals(f9291b)) {
                    kVar.clear();
                    f9291b = locale;
                }
                String str2 = (String) kVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = W2.i.f6175a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f9290a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
