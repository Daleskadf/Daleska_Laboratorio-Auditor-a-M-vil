package e0;

import S1.C0338f;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* renamed from: e0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0929d {

    /* renamed from: a  reason: collision with root package name */
    public static final S.j f10591a = new S.j(2);

    /* renamed from: b  reason: collision with root package name */
    public static final K1.d f10592b = new K1.d(7);

    public static C0338f a(Context context, List list) {
        Trace.beginSection(F.f.D("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                C0930e c0930e = (C0930e) list.get(i7);
                ProviderInfo b5 = b(context.getPackageManager(), c0930e, context.getResources());
                if (b5 == null) {
                    C0338f c0338f = new C0338f();
                    Trace.endSection();
                    return c0338f;
                }
                arrayList.add(c(context, c0930e, b5.authority));
            }
            C0338f c0338f2 = new C0338f(arrayList);
            Trace.endSection();
            return c0338f2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, e0.c] */
    public static ProviderInfo b(PackageManager packageManager, C0930e c0930e, Resources resources) {
        Trace.beginSection(F.f.D("FontProvider.getProvider"));
        try {
            List list = c0930e.f10596d;
            String str = c0930e.f10593a;
            String str2 = c0930e.f10594b;
            if (list == null) {
                list = Y.b.j(resources, 0);
            }
            ?? obj = new Object();
            obj.f10588a = str;
            obj.f10589b = str2;
            obj.f10590c = list;
            S.j jVar = f10591a;
            ProviderInfo providerInfo = (ProviderInfo) jVar.get(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    K1.d dVar = f10592b;
                    Collections.sort(arrayList, dVar);
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i7));
                        Collections.sort(arrayList2, dVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i8), (byte[]) arrayList2.get(i8))) {
                                    break;
                                }
                            }
                            jVar.put(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, a1.A] */
    /* JADX WARN: Type inference failed for: r1v6, types: [e0.b, java.lang.Object] */
    public static i[] c(Context context, C0930e c0930e, String str) {
        InterfaceC0926a interfaceC0926a;
        int i7;
        int i8;
        Uri withAppendedId;
        int i9;
        boolean z7;
        Trace.beginSection(F.f.D("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                ?? obj = new Object();
                obj.f10587a = context.getContentResolver().acquireUnstableContentProviderClient(build);
                interfaceC0926a = obj;
            } else {
                ?? obj2 = new Object();
                obj2.f6744a = context.getContentResolver().acquireUnstableContentProviderClient(build);
                interfaceC0926a = obj2;
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            Trace.beginSection(F.f.D("ContentQueryWrapper.query"));
            Cursor e7 = interfaceC0926a.e(build, strArr, new String[]{c0930e.f10595c});
            Trace.endSection();
            if (e7 != null && e7.getCount() > 0) {
                int columnIndex = e7.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = e7.getColumnIndex("_id");
                int columnIndex3 = e7.getColumnIndex("file_id");
                int columnIndex4 = e7.getColumnIndex("font_ttc_index");
                int columnIndex5 = e7.getColumnIndex("font_weight");
                int columnIndex6 = e7.getColumnIndex("font_italic");
                while (e7.moveToNext()) {
                    if (columnIndex != -1) {
                        i7 = e7.getInt(columnIndex);
                    } else {
                        i7 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i8 = e7.getInt(columnIndex4);
                    } else {
                        i8 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, e7.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, e7.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i9 = e7.getInt(columnIndex5);
                    } else {
                        i9 = 400;
                    }
                    int i10 = i9;
                    if (columnIndex6 != -1 && e7.getInt(columnIndex6) == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    arrayList2.add(new i(uri, i8, i10, z7, i7));
                }
                arrayList = arrayList2;
            }
            if (e7 != null) {
                e7.close();
            }
            interfaceC0926a.close();
            i[] iVarArr = (i[]) arrayList.toArray(new i[0]);
            Trace.endSection();
            return iVarArr;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
