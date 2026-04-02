package io.flutter.plugins.pathprovider;

import G.i;
import K0.q;
import O0.H;
import android.content.Context;
import android.location.LocationManager;
import android.os.Parcel;
import android.util.LongSparseArray;
import androidx.camera.core.impl.C0506h;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.s0;
import androidx.camera.core.impl.t0;
import com.google.firebase.firestore.Z;
import i3.InterfaceC1109a;
import io.flutter.plugins.videoplayer.h;
import io.flutter.plugins.videoplayer.r;
import java.io.File;
import java.util.ArrayList;
import m1.G;
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static boolean a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
        boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
        if (!isProviderEnabled && !isProviderEnabled2) {
            return false;
        }
        return true;
    }

    public static void b(G g3, q qVar, int i7) {
        g3.a(qVar, i7, 0);
    }

    public static r0 c(ArrayList arrayList, r0 r0Var) {
        arrayList.add(r0Var);
        return new r0();
    }

    public static InterfaceC1109a d(Parcel parcel) {
        InterfaceC1109a b5 = i3.b.b(parcel.readStrongBinder());
        parcel.recycle();
        return b5;
    }

    public static String e(int i7, String str) {
        return str + i7;
    }

    public static String f(String str, int i7, String str2) {
        return str + i7 + str2;
    }

    public static String g(String str, long j) {
        return str + j;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder k(String str, int i7, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void m(t0 t0Var, s0 s0Var, long j, r0 r0Var) {
        r0Var.a(new C0506h(t0Var, s0Var, j));
    }

    public static void n(L5.f fVar, final f fVar2) {
        Z f = fVar.f();
        c cVar = c.f12389d;
        E.e eVar = new E.e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", cVar, f, 4);
        if (fVar2 != null) {
            eVar.h0(new L5.b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // L5.b
                public final void j(Object obj, A.f fVar3) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            f fVar4 = fVar2;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar4.f12391a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = m5.d.p(th);
                            }
                            fVar3.h(arrayList);
                            return;
                        case 1:
                            f fVar5 = fVar2;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = fVar5.f12391a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i.y(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = m5.d.p(th2);
                            }
                            fVar3.h(arrayList2);
                            return;
                        case 2:
                            f fVar6 = fVar2;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = fVar6.f12391a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i.y(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = m5.d.p(th3);
                            }
                            fVar3.h(arrayList3);
                            return;
                        case 3:
                            f fVar7 = fVar2;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, fVar7.f12391a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = m5.d.p(th4);
                            }
                            fVar3.h(arrayList4);
                            return;
                        case 4:
                            f fVar8 = fVar2;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = fVar8.f12391a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = m5.d.p(th5);
                            }
                            fVar3.h(arrayList5);
                            return;
                        case 5:
                            f fVar9 = fVar2;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                fVar9.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : fVar9.f12391a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = m5.d.p(th6);
                            }
                            fVar3.h(arrayList6);
                            return;
                        default:
                            f fVar10 = fVar2;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, fVar10.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = m5.d.p(th7);
                            }
                            fVar3.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", cVar, fVar.f(), 4);
        if (fVar2 != null) {
            eVar2.h0(new L5.b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // L5.b
                public final void j(Object obj, A.f fVar3) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            f fVar4 = fVar2;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar4.f12391a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = m5.d.p(th);
                            }
                            fVar3.h(arrayList);
                            return;
                        case 1:
                            f fVar5 = fVar2;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = fVar5.f12391a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i.y(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = m5.d.p(th2);
                            }
                            fVar3.h(arrayList2);
                            return;
                        case 2:
                            f fVar6 = fVar2;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = fVar6.f12391a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i.y(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = m5.d.p(th3);
                            }
                            fVar3.h(arrayList3);
                            return;
                        case 3:
                            f fVar7 = fVar2;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, fVar7.f12391a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = m5.d.p(th4);
                            }
                            fVar3.h(arrayList4);
                            return;
                        case 4:
                            f fVar8 = fVar2;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = fVar8.f12391a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = m5.d.p(th5);
                            }
                            fVar3.h(arrayList5);
                            return;
                        case 5:
                            f fVar9 = fVar2;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                fVar9.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : fVar9.f12391a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = m5.d.p(th6);
                            }
                            fVar3.h(arrayList6);
                            return;
                        default:
                            f fVar10 = fVar2;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, fVar10.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = m5.d.p(th7);
                            }
                            fVar3.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", cVar, fVar.f(), 4);
        if (fVar2 != null) {
            eVar3.h0(new L5.b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // L5.b
                public final void j(Object obj, A.f fVar3) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            f fVar4 = fVar2;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar4.f12391a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = m5.d.p(th);
                            }
                            fVar3.h(arrayList);
                            return;
                        case 1:
                            f fVar5 = fVar2;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = fVar5.f12391a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i.y(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = m5.d.p(th2);
                            }
                            fVar3.h(arrayList2);
                            return;
                        case 2:
                            f fVar6 = fVar2;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = fVar6.f12391a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i.y(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = m5.d.p(th3);
                            }
                            fVar3.h(arrayList3);
                            return;
                        case 3:
                            f fVar7 = fVar2;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, fVar7.f12391a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = m5.d.p(th4);
                            }
                            fVar3.h(arrayList4);
                            return;
                        case 4:
                            f fVar8 = fVar2;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = fVar8.f12391a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = m5.d.p(th5);
                            }
                            fVar3.h(arrayList5);
                            return;
                        case 5:
                            f fVar9 = fVar2;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                fVar9.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : fVar9.f12391a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = m5.d.p(th6);
                            }
                            fVar3.h(arrayList6);
                            return;
                        default:
                            f fVar10 = fVar2;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, fVar10.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = m5.d.p(th7);
                            }
                            fVar3.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", cVar, fVar.f(), 4);
        if (fVar2 != null) {
            eVar4.h0(new L5.b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // L5.b
                public final void j(Object obj, A.f fVar3) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            f fVar4 = fVar2;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar4.f12391a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = m5.d.p(th);
                            }
                            fVar3.h(arrayList);
                            return;
                        case 1:
                            f fVar5 = fVar2;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = fVar5.f12391a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i.y(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = m5.d.p(th2);
                            }
                            fVar3.h(arrayList2);
                            return;
                        case 2:
                            f fVar6 = fVar2;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = fVar6.f12391a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i.y(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = m5.d.p(th3);
                            }
                            fVar3.h(arrayList3);
                            return;
                        case 3:
                            f fVar7 = fVar2;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, fVar7.f12391a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = m5.d.p(th4);
                            }
                            fVar3.h(arrayList4);
                            return;
                        case 4:
                            f fVar8 = fVar2;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = fVar8.f12391a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = m5.d.p(th5);
                            }
                            fVar3.h(arrayList5);
                            return;
                        case 5:
                            f fVar9 = fVar2;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                fVar9.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : fVar9.f12391a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = m5.d.p(th6);
                            }
                            fVar3.h(arrayList6);
                            return;
                        default:
                            f fVar10 = fVar2;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, fVar10.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = m5.d.p(th7);
                            }
                            fVar3.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
        E.e eVar5 = new E.e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", cVar, fVar.f(), 4);
        if (fVar2 != null) {
            eVar5.h0(new L5.b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // L5.b
                public final void j(Object obj, A.f fVar3) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            f fVar4 = fVar2;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar4.f12391a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = m5.d.p(th);
                            }
                            fVar3.h(arrayList);
                            return;
                        case 1:
                            f fVar5 = fVar2;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = fVar5.f12391a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i.y(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = m5.d.p(th2);
                            }
                            fVar3.h(arrayList2);
                            return;
                        case 2:
                            f fVar6 = fVar2;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = fVar6.f12391a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i.y(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = m5.d.p(th3);
                            }
                            fVar3.h(arrayList3);
                            return;
                        case 3:
                            f fVar7 = fVar2;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, fVar7.f12391a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = m5.d.p(th4);
                            }
                            fVar3.h(arrayList4);
                            return;
                        case 4:
                            f fVar8 = fVar2;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = fVar8.f12391a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = m5.d.p(th5);
                            }
                            fVar3.h(arrayList5);
                            return;
                        case 5:
                            f fVar9 = fVar2;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                fVar9.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : fVar9.f12391a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = m5.d.p(th6);
                            }
                            fVar3.h(arrayList6);
                            return;
                        default:
                            f fVar10 = fVar2;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, fVar10.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = m5.d.p(th7);
                            }
                            fVar3.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            eVar5.h0(null);
        }
        E.e eVar6 = new E.e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", cVar, fVar.f(), 4);
        if (fVar2 != null) {
            eVar6.h0(new L5.b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // L5.b
                public final void j(Object obj, A.f fVar3) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            f fVar4 = fVar2;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar4.f12391a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = m5.d.p(th);
                            }
                            fVar3.h(arrayList);
                            return;
                        case 1:
                            f fVar5 = fVar2;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = fVar5.f12391a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i.y(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = m5.d.p(th2);
                            }
                            fVar3.h(arrayList2);
                            return;
                        case 2:
                            f fVar6 = fVar2;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = fVar6.f12391a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i.y(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = m5.d.p(th3);
                            }
                            fVar3.h(arrayList3);
                            return;
                        case 3:
                            f fVar7 = fVar2;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, fVar7.f12391a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = m5.d.p(th4);
                            }
                            fVar3.h(arrayList4);
                            return;
                        case 4:
                            f fVar8 = fVar2;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = fVar8.f12391a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = m5.d.p(th5);
                            }
                            fVar3.h(arrayList5);
                            return;
                        case 5:
                            f fVar9 = fVar2;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                fVar9.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : fVar9.f12391a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = m5.d.p(th6);
                            }
                            fVar3.h(arrayList6);
                            return;
                        default:
                            f fVar10 = fVar2;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, fVar10.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = m5.d.p(th7);
                            }
                            fVar3.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            eVar6.h0(null);
        }
        E.e eVar7 = new E.e(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", cVar, fVar.f(), 4);
        if (fVar2 != null) {
            eVar7.h0(new L5.b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // L5.b
                public final void j(Object obj, A.f fVar3) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            f fVar4 = fVar2;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, fVar4.f12391a.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = m5.d.p(th);
                            }
                            fVar3.h(arrayList);
                            return;
                        case 1:
                            f fVar5 = fVar2;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = fVar5.f12391a;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(i.y(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = m5.d.p(th2);
                            }
                            fVar3.h(arrayList2);
                            return;
                        case 2:
                            f fVar6 = fVar2;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = fVar6.f12391a;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(i.y(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = m5.d.p(th3);
                            }
                            fVar3.h(arrayList3);
                            return;
                        case 3:
                            f fVar7 = fVar2;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, fVar7.f12391a.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = m5.d.p(th4);
                            }
                            fVar3.h(arrayList4);
                            return;
                        case 4:
                            f fVar8 = fVar2;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = fVar8.f12391a.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = m5.d.p(th5);
                            }
                            fVar3.h(arrayList5);
                            return;
                        case 5:
                            f fVar9 = fVar2;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                fVar9.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : fVar9.f12391a.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = m5.d.p(th6);
                            }
                            fVar3.h(arrayList6);
                            return;
                        default:
                            f fVar10 = fVar2;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, fVar10.a((d) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = m5.d.p(th7);
                            }
                            fVar3.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            eVar7.h0(null);
        }
    }

    public static void o(L5.f fVar, final r rVar) {
        h hVar = h.f12412d;
        E.e eVar = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", hVar, null, 4);
        if (rVar != null) {
            eVar.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.create", hVar, null, 4);
        if (rVar != null) {
            eVar2.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", hVar, null, 4);
        if (rVar != null) {
            eVar3.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setLooping", hVar, null, 4);
        if (rVar != null) {
            eVar4.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
        E.e eVar5 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setVolume", hVar, null, 4);
        if (rVar != null) {
            eVar5.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar5.h0(null);
        }
        E.e eVar6 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setPlaybackSpeed", hVar, null, 4);
        if (rVar != null) {
            eVar6.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar6.h0(null);
        }
        E.e eVar7 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.play", hVar, null, 4);
        if (rVar != null) {
            eVar7.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar7.h0(null);
        }
        E.e eVar8 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.position", hVar, null, 4);
        if (rVar != null) {
            eVar8.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar8.h0(null);
        }
        E.e eVar9 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.seekTo", hVar, null, 4);
        if (rVar != null) {
            eVar9.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar9.h0(null);
        }
        E.e eVar10 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.pause", hVar, null, 4);
        if (rVar != null) {
            eVar10.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar10.h0(null);
        }
        E.e eVar11 = new E.e(fVar, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", hVar, null, 4);
        if (rVar != null) {
            eVar11.h0(new L5.b() { // from class: io.flutter.plugins.videoplayer.f
                @Override // L5.b
                public final void j(Object obj, A.f fVar2) {
                    LongSparseArray longSparseArray;
                    int i7;
                    int i8;
                    switch (r2) {
                        case 0:
                            r rVar2 = rVar;
                            ArrayList arrayList = new ArrayList();
                            int i9 = 0;
                            while (true) {
                                try {
                                    longSparseArray = rVar2.f12426a;
                                } catch (Throwable th) {
                                    arrayList = org.slf4j.helpers.i.Q(th);
                                }
                                if (i9 < longSparseArray.size()) {
                                    ((o) longSparseArray.valueAt(i9)).d();
                                    i9++;
                                } else {
                                    longSparseArray.clear();
                                    arrayList.add(0, null);
                                    fVar2.h(arrayList);
                                    return;
                                }
                            }
                        case 1:
                            r rVar3 = rVar;
                            ArrayList arrayList2 = new ArrayList();
                            Long l8 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar3.getClass();
                                B0.b bVar = (B0.b) rVar3.b(l8.longValue()).f12422c;
                                bVar.getClass();
                                H h8 = (H) bVar;
                                h8.Z();
                                h8.Z();
                                int d7 = h8.f3535t0.d(h8.f3513Y0.f3717e, false);
                                if (d7 == -1) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                                h8.W(d7, i7, false);
                                arrayList2.add(0, null);
                            } catch (Throwable th2) {
                                arrayList2 = org.slf4j.helpers.i.Q(th2);
                            }
                            fVar2.h(arrayList2);
                            return;
                        case 2:
                            r rVar4 = rVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                rVar4.f12428c.f29a = ((Boolean) ((ArrayList) obj).get(0)).booleanValue();
                                arrayList3.add(0, null);
                            } catch (Throwable th3) {
                                arrayList3 = org.slf4j.helpers.i.Q(th3);
                            }
                            fVar2.h(arrayList3);
                            return;
                        case 3:
                            r rVar5 = rVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, rVar5.a((g) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList4 = org.slf4j.helpers.i.Q(th4);
                            }
                            fVar2.h(arrayList4);
                            return;
                        case 4:
                            r rVar6 = rVar;
                            ArrayList arrayList5 = new ArrayList();
                            Long l9 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar6.getClass();
                                rVar6.b(l9.longValue()).d();
                                rVar6.f12426a.remove(l9.longValue());
                                arrayList5.add(0, null);
                            } catch (Throwable th5) {
                                arrayList5 = org.slf4j.helpers.i.Q(th5);
                            }
                            fVar2.h(arrayList5);
                            return;
                        case 5:
                            r rVar7 = rVar;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                rVar7.c((Long) arrayList7.get(0), (Boolean) arrayList7.get(1));
                                arrayList6.add(0, null);
                            } catch (Throwable th6) {
                                arrayList6 = org.slf4j.helpers.i.Q(th6);
                            }
                            fVar2.h(arrayList6);
                            return;
                        case 6:
                            r rVar8 = rVar;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            try {
                                rVar8.e((Long) arrayList9.get(0), (Double) arrayList9.get(1));
                                arrayList8.add(0, null);
                            } catch (Throwable th7) {
                                arrayList8 = org.slf4j.helpers.i.Q(th7);
                            }
                            fVar2.h(arrayList8);
                            return;
                        case 7:
                            r rVar9 = rVar;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                rVar9.d((Long) arrayList11.get(0), (Double) arrayList11.get(1));
                                arrayList10.add(0, null);
                            } catch (Throwable th8) {
                                arrayList10 = org.slf4j.helpers.i.Q(th8);
                            }
                            fVar2.h(arrayList10);
                            return;
                        case 8:
                            r rVar10 = rVar;
                            ArrayList arrayList12 = new ArrayList();
                            Long l10 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar10.getClass();
                                B0.b bVar2 = (B0.b) rVar10.b(l10.longValue()).f12422c;
                                bVar2.getClass();
                                H h9 = (H) bVar2;
                                h9.Z();
                                h9.Z();
                                int d8 = h9.f3535t0.d(h9.f3513Y0.f3717e, true);
                                if (d8 == -1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                h9.W(d8, i8, true);
                                arrayList12.add(0, null);
                            } catch (Throwable th9) {
                                arrayList12 = org.slf4j.helpers.i.Q(th9);
                            }
                            fVar2.h(arrayList12);
                            return;
                        case 9:
                            r rVar11 = rVar;
                            ArrayList arrayList13 = new ArrayList();
                            Long l11 = (Long) ((ArrayList) obj).get(0);
                            try {
                                rVar11.getClass();
                                o b5 = rVar11.b(l11.longValue());
                                O0.r rVar12 = b5.f12422c;
                                long F7 = ((H) rVar12).F();
                                b5.f12420a.l(((H) rVar12).y());
                                arrayList13.add(0, Long.valueOf(F7));
                            } catch (Throwable th10) {
                                arrayList13 = org.slf4j.helpers.i.Q(th10);
                            }
                            fVar2.h(arrayList13);
                            return;
                        default:
                            r rVar13 = rVar;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            Long l12 = (Long) arrayList15.get(0);
                            Long l13 = (Long) arrayList15.get(1);
                            try {
                                rVar13.getClass();
                                o b7 = rVar13.b(l12.longValue());
                                long intValue = l13.intValue();
                                B0.b bVar3 = (B0.b) b7.f12422c;
                                bVar3.getClass();
                                bVar3.r(((H) bVar3).E(), intValue);
                                arrayList14.add(0, null);
                            } catch (Throwable th11) {
                                arrayList14 = org.slf4j.helpers.i.Q(th11);
                            }
                            fVar2.h(arrayList14);
                            return;
                    }
                }
            });
        } else {
            eVar11.h0(null);
        }
    }
}
