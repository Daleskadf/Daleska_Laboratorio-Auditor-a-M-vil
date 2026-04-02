package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.common.internal.f */
/* loaded from: classes.dex */
public abstract class AbstractC0757f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private W2.b zzB;
    private boolean zzC;
    private volatile O zzD;
    U zza;
    final Handler zzb;
    protected InterfaceC0755d zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC0764m zzn;
    private final W2.f zzo;
    private final Object zzp;
    private final Object zzq;
    private r zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private L zzu;
    private int zzv;
    private final InterfaceC0753b zzw;
    private final InterfaceC0754c zzx;
    private final int zzy;
    private final String zzz;
    private static final W2.d[] zze = new W2.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public AbstractC0757f(Context context, Looper looper, T t7, int i7, C0772v c0772v, C0772v c0772v2, String str) {
        W2.e eVar = W2.e.f6170d;
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        I.j(context, "Context must not be null");
        this.zzl = context;
        I.j(looper, "Looper must not be null");
        this.zzm = looper;
        I.j(t7, "Supervisor must not be null");
        this.zzn = t7;
        this.zzo = eVar;
        this.zzb = new J(this, looper);
        this.zzy = i7;
        this.zzw = c0772v;
        this.zzx = c0772v2;
        this.zzz = str;
    }

    public static void zzj(AbstractC0757f abstractC0757f, O o7) {
        C0773w c0773w;
        abstractC0757f.zzD = o7;
        if (abstractC0757f.usesClientTelemetry()) {
            C0761j c0761j = o7.f9327d;
            C0772v b5 = C0772v.b();
            if (c0761j == null) {
                c0773w = null;
            } else {
                c0773w = c0761j.f9360a;
            }
            synchronized (b5) {
                if (c0773w == null) {
                    c0773w = C0772v.f9398c;
                } else {
                    C0773w c0773w2 = (C0773w) b5.f9399a;
                    if (c0773w2 != null) {
                        if (c0773w2.f9400a < c0773w.f9400a) {
                        }
                    }
                }
                b5.f9399a = c0773w;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC0757f abstractC0757f, int i7) {
        int i8;
        int i9;
        synchronized (abstractC0757f.zzp) {
            i8 = abstractC0757f.zzv;
        }
        if (i8 == 3) {
            abstractC0757f.zzC = true;
            i9 = 5;
        } else {
            i9 = 4;
        }
        Handler handler = abstractC0757f.zzb;
        handler.sendMessage(handler.obtainMessage(i9, abstractC0757f.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC0757f abstractC0757f, int i7, int i8, IInterface iInterface) {
        synchronized (abstractC0757f.zzp) {
            try {
                if (abstractC0757f.zzv != i7) {
                    return false;
                }
                abstractC0757f.a(i8, iInterface);
                return true;
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.base/java.util.BitSet.or(BitSet.java:941)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.AbstractC0757f r2) {
        /*
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC0757f.zzo(com.google.android.gms.common.internal.f):boolean");
    }

    public final void a(int i7, IInterface iInterface) {
        boolean z7;
        boolean z8;
        boolean z9;
        U u7;
        U u8;
        if (i7 != 4) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (iInterface == null) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z7 == z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        I.c(z9);
        synchronized (this.zzp) {
            try {
                this.zzv = i7;
                this.zzs = iInterface;
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        if (i7 == 4) {
                            I.i(iInterface);
                            onConnectedLocked(iInterface);
                        }
                    } else {
                        L l8 = this.zzu;
                        if (l8 != null && (u8 = this.zza) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + u8.f9345a + " on " + u8.f9346b);
                            AbstractC0764m abstractC0764m = this.zzn;
                            String str = this.zza.f9345a;
                            I.i(str);
                            String str2 = this.zza.f9346b;
                            zze();
                            boolean z10 = this.zza.f9347c;
                            abstractC0764m.getClass();
                            abstractC0764m.c(new P(str, str2, z10), l8);
                            this.zzd.incrementAndGet();
                        }
                        L l9 = new L(this, this.zzd.get());
                        this.zzu = l9;
                        if (this.zzv == 3 && getLocalStartServiceAction() != null) {
                            u7 = new U(getContext().getPackageName(), getLocalStartServiceAction(), false);
                        } else {
                            u7 = new U(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup());
                        }
                        this.zza = u7;
                        if (u7.f9347c && getMinApkVersion() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f9345a)));
                        }
                        AbstractC0764m abstractC0764m2 = this.zzn;
                        String str3 = this.zza.f9345a;
                        I.i(str3);
                        if (!abstractC0764m2.d(new P(str3, this.zza.f9346b, this.zza.f9347c), l9, zze(), getBindServiceExecutor())) {
                            U u9 = this.zza;
                            Log.w("GmsClient", "unable to connect to service: " + u9.f9345a + " on " + u9.f9346b);
                            zzl(16, null, this.zzd.get());
                        }
                    }
                } else {
                    L l10 = this.zzu;
                    if (l10 != null) {
                        AbstractC0764m abstractC0764m3 = this.zzn;
                        String str4 = this.zza.f9345a;
                        I.i(str4);
                        String str5 = this.zza.f9346b;
                        zze();
                        boolean z11 = this.zza.f9347c;
                        abstractC0764m3.getClass();
                        abstractC0764m3.c(new P(str4, str5, z11), l10);
                        this.zzu = null;
                    }
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int d7 = this.zzo.d(this.zzl, getMinApkVersion());
        if (d7 != 0) {
            a(1, null);
            triggerNotAvailable(new C0772v(this), d7, null);
            return;
        }
        connect(new C0772v(this));
    }

    public final void checkConnected() {
        if (isConnected()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    public void connect(InterfaceC0755d interfaceC0755d) {
        I.j(interfaceC0755d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0755d;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((F) this.zzt.get(i7)).c();
                }
                this.zzt.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i7;
        IInterface iInterface;
        r rVar;
        synchronized (this.zzp) {
            i7 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            rVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (rVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((H) rVar).asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + StringUtils.SPACE + format);
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i8 = this.zzf;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i8));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j8 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j8));
            append2.println(j8 + StringUtils.SPACE + format2);
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) p3.z.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j9 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j9));
            append3.println(j9 + StringUtils.SPACE + format3);
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public abstract Account getAccount();

    public W2.d[] getApiFeatures() {
        return zze;
    }

    public final W2.d[] getAvailableFeatures() {
        O o7 = this.zzD;
        if (o7 == null) {
            return null;
        }
        return o7.f9325b;
    }

    public abstract Executor getBindServiceExecutor();

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        U u7;
        if (isConnected() && (u7 = this.zza) != null) {
            return u7.f9346b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(InterfaceC0766o interfaceC0766o, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i7 = W2.f.f6171a;
        Scope[] scopeArr = C0762k.f9365j0;
        Bundle bundle = new Bundle();
        int i8 = this.zzy;
        W2.d[] dVarArr = C0762k.f9366k0;
        C0762k c0762k = new C0762k(6, i8, i7, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0762k.f9373d = this.zzl.getPackageName();
        c0762k.f9367X = getServiceRequestExtraArgs;
        if (set != null) {
            c0762k.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c0762k.f9368Y = account;
            if (interfaceC0766o != null) {
                c0762k.f9374e = interfaceC0766o.asBinder();
            }
        } else if (requiresAccount()) {
            c0762k.f9368Y = getAccount();
        }
        c0762k.f9369Z = zze;
        c0762k.f9375e0 = getApiFeatures();
        if (usesClientTelemetry()) {
            c0762k.f9378h0 = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    r rVar = this.zzr;
                    if (rVar != null) {
                        ((H) rVar).b(new K(this, this.zzd.get()), c0762k);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            triggerConnectionSuspended(3);
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public abstract Set getScopes();

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv != 5) {
                    checkConnected();
                    iInterface = this.zzs;
                    I.j(iInterface, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                r rVar = this.zzr;
                if (rVar == null) {
                    return null;
                }
                return ((H) rVar).asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C0761j getTelemetryConfiguration() {
        O o7 = this.zzD;
        if (o7 == null) {
            return null;
        }
        return o7.f9327d;
    }

    public boolean getUseDynamicLookup() {
        if (getMinApkVersion() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z7;
        synchronized (this.zzp) {
            if (this.zzv == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
        }
        return z7;
    }

    public boolean isConnecting() {
        boolean z7;
        synchronized (this.zzp) {
            int i7 = this.zzv;
            z7 = true;
            if (i7 != 2 && i7 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(W2.b bVar) {
        this.zzi = bVar.f6160b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i7) {
        this.zzf = i7;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i7, IBinder iBinder, Bundle bundle, int i8) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i8, -1, new M(this, i7, iBinder, bundle)));
    }

    public void onUserSignOut(InterfaceC0756e interfaceC0756e) {
        A.c cVar = (A.c) interfaceC0756e;
        ((com.google.android.gms.common.api.internal.G) cVar.f4b).f9185o.f9264i0.post(new G.c((Object) cVar, 22));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i7) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i7));
    }

    public void triggerNotAvailable(InterfaceC0755d interfaceC0755d, int i7, PendingIntent pendingIntent) {
        I.j(interfaceC0755d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0755d;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i7, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        if (str == null) {
            return this.zzl.getClass().getName();
        }
        return str;
    }

    public final void zzl(int i7, Bundle bundle, int i8) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i8, -1, new N(this, i7)));
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
