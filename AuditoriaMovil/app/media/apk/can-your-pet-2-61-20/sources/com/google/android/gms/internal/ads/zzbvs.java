package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbvs implements zzbvu {
    public static zzbvu zza;
    static zzbvu zzb;
    static zzbvu zzc;
    private static final Object zzd = new Object();
    private final Context zzf;
    private final ExecutorService zzh;
    private final VersionInfoParcel zzi;
    private final String zzj;
    private final String zzk;
    private final Object zze = new Object();
    private final WeakHashMap zzg = new WeakHashMap();

    protected zzbvs(Context context, VersionInfoParcel versionInfoParcel) {
        zzftf.zza();
        this.zzh = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzf = context;
        this.zzi = versionInfoParcel;
        String str = "unknown";
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhK)).booleanValue() ? Locale.getDefault().getCountry() : "unknown";
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhK)).booleanValue()) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            str = null;
            if (context != null) {
                try {
                    PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
                    if (packageInfo != null) {
                        str = Integer.toString(packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        this.zzk = str;
    }

    public static zzbvu zza(Context context) {
        synchronized (zzd) {
            if (zza == null) {
                if (((Boolean) zzbgb.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhG)).booleanValue()) {
                        zza = new zzbvs(context, VersionInfoParcel.forPackage());
                    }
                }
                zza = new zzbvt();
            }
        }
        return zza;
    }

    public static zzbvu zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zzd) {
            if (zzc == null) {
                if (((Boolean) zzbgb.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhG)).booleanValue()) {
                        zzbvs zzbvsVar = new zzbvs(context, versionInfoParcel);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbvsVar.zze) {
                                zzbvsVar.zzg.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzbvr(zzbvsVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbvq(zzbvsVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzc = zzbvsVar;
                    }
                }
                zzc = new zzbvt();
            }
        }
        return zzc;
    }

    public static zzbvu zzc(Context context) {
        synchronized (zzd) {
            if (zzb == null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhH)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhG)).booleanValue()) {
                        zzb = new zzbvs(context, VersionInfoParcel.forPackage());
                    }
                }
                zzb = new zzbvt();
            }
        }
        return zzb;
    }

    public static String zzd(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zze(Throwable th) {
        return zzfxg.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzg(zzd(th)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzf(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            zzh(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzg(Throwable th, String str) {
        zzh(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzh(Throwable th, String str, float f) {
        Throwable th2;
        Throwable th3;
        String str2;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo zzc2;
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean z = false;
        if (((Boolean) zzbgb.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                linkedList.push(th4);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th5 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th5.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        } else {
                            arrayList.add(stackTraceElement);
                        }
                    }
                }
                if (z2) {
                    if (th2 == null) {
                        th3 = new Throwable(th5.getMessage());
                    } else {
                        th3 = new Throwable(th5.getMessage(), th2);
                    }
                    th2 = th3;
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String zzd2 = zzd(th);
        String zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziJ)).booleanValue() ? zze(th) : "";
        double d = f;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        double random = Math.random();
        int i2 = i > 0 ? (int) (1.0f / f) : 1;
        if (random < d) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zzf).isCallerInstantApp();
            } catch (Throwable th6) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching instant app info", th6);
            }
            try {
                str2 = this.zzf.getPackageName();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = str3 + " " + str4;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzi.afmaVersion).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzd2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "619949182").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(zzbgb.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzf))).appendQueryParameter("lite", true != this.zzi.isLiteSdk ? "0" : "1");
            if (!TextUtils.isEmpty(zze)) {
                appendQueryParameter2.appendQueryParameter("hash", zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhL)).booleanValue() && (zzc2 = com.google.android.gms.ads.internal.util.client.zzf.zzc(this.zzf)) != null) {
                appendQueryParameter2.appendQueryParameter("available_memory", Long.toString(zzc2.availMem));
                appendQueryParameter2.appendQueryParameter("total_memory", Long.toString(zzc2.totalMem));
                appendQueryParameter2.appendQueryParameter("is_low_memory", true == zzc2.lowMemory ? "1" : "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhK)).booleanValue()) {
                if (!TextUtils.isEmpty(this.zzj)) {
                    appendQueryParameter2.appendQueryParameter("countrycode", this.zzj);
                }
                if (!TextUtils.isEmpty(this.zzk)) {
                    appendQueryParameter2.appendQueryParameter("psv", this.zzk);
                }
                Context context = this.zzf;
                if (Build.VERSION.SDK_INT >= 26) {
                    packageInfo = WebView.getCurrentWebViewPackage();
                } else {
                    if (context != null) {
                        try {
                            packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    appendQueryParameter2.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                    appendQueryParameter2.appendQueryParameter("wvvn", packageInfo.versionName);
                    appendQueryParameter2.appendQueryParameter("wvpn", packageInfo.packageName);
                }
            }
            arrayList2.add(appendQueryParameter2.toString());
            for (final String str5 : arrayList2) {
                final com.google.android.gms.ads.internal.util.client.zzr zzrVar = new com.google.android.gms.ads.internal.util.client.zzr(null);
                this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvp
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.internal.util.client.zzr.this.zza(str5);
                    }
                });
            }
        }
    }
}
