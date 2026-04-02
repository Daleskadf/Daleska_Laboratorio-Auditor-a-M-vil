package j3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.common.zza;
import f5.C0993a;
import j6.C1372c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* renamed from: j3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367d {

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f13429e = null;
    public static String f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f13430g = false;

    /* renamed from: h  reason: collision with root package name */
    public static int f13431h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static Boolean f13432i;

    /* renamed from: m  reason: collision with root package name */
    public static i f13435m;

    /* renamed from: n  reason: collision with root package name */
    public static j f13436n;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13437a;
    public static final ThreadLocal j = new ThreadLocal();

    /* renamed from: k  reason: collision with root package name */
    public static final G.b f13433k = new G.b(8);

    /* renamed from: l  reason: collision with root package name */
    public static final C0993a f13434l = new C0993a(19);

    /* renamed from: b  reason: collision with root package name */
    public static final C1372c f13426b = new C1372c(19);

    /* renamed from: c  reason: collision with root package name */
    public static final t2.i f13427c = new t2.i(19);

    /* renamed from: d  reason: collision with root package name */
    public static final v4.d f13428d = new Object();

    public C1367d(Context context) {
        this.f13437a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!I.m(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0300  */
    /* JADX WARN: Type inference failed for: r11v0, types: [j3.h, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j3.C1367d c(android.content.Context r23, j3.InterfaceC1366c r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1367d.c(android.content.Context, j3.c, java.lang.String):j3.d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x018b, code lost:
        if (r2 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1367d.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static int e(Context context, String str, boolean z7, boolean z8) {
        boolean z9;
        Cursor cursor = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                long longValue = ((Long) f13433k.get()).longValue();
                String str2 = "api_force_staging";
                boolean z10 = true;
                if (true != z7) {
                    str2 = "api";
                }
                Cursor query = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(longValue)).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z11 = false;
                            int i7 = query.getInt(0);
                            if (i7 > 0) {
                                synchronized (C1367d.class) {
                                    f = query.getString(2);
                                    int columnIndex = query.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        f13431h = query.getInt(columnIndex);
                                    }
                                    int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (query.getInt(columnIndex2) != 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        f13430g = z9;
                                    } else {
                                        z9 = false;
                                    }
                                }
                                h hVar = (h) j.get();
                                if (hVar != null && hVar.f13440a == null) {
                                    hVar.f13440a = query;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    cursor = query;
                                }
                                z11 = z9;
                            } else {
                                cursor = query;
                            }
                            if (z8 && z11) {
                                throw new Exception("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i7;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        if (e instanceof C1364a) {
                            throw e;
                        }
                        throw new Exception("V2 version check failed: " + e.getMessage(), e);
                    } catch (Throwable th) {
                        cursor = query;
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new Exception("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.common.zza] */
    public static void f(ClassLoader classLoader) {
        try {
            j jVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof j) {
                    jVar = (j) queryLocalInterface;
                } else {
                    jVar = new zza(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
                }
            }
            f13436n = jVar;
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e9) {
            e = e9;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new Exception("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f13432i)) {
            return true;
        }
        boolean z7 = false;
        if (f13432i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (W2.f.f6172b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z7 = true;
            }
            f13432i = Boolean.valueOf(z7);
            if (z7 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f13430g = true;
            }
        }
        if (!z7) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i h(Context context) {
        i iVar;
        synchronized (C1367d.class) {
            i iVar2 = f13435m;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof i) {
                        iVar = (i) queryLocalInterface;
                    } else {
                        iVar = new zza(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                    }
                }
                if (iVar != 0) {
                    f13435m = iVar;
                    return iVar;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f13437a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e7);
        }
    }
}
