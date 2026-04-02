package a;

import C4.c;
import D.AbstractC0055e;
import E.e;
import F3.o;
import H0.H;
import H4.W;
import L5.b;
import L5.f;
import U.l;
import X3.d;
import X5.C0396w;
import a4.C0468q;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import b3.C0585f;
import b4.InterfaceC0593a;
import com.google.android.gms.common.api.internal.C0740n;
import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.C;
import com.google.firebase.firestore.C0810l;
import com.google.firebase.firestore.C0818u;
import com.google.firebase.firestore.EnumC0809k;
import com.google.firebase.firestore.EnumC0815q;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.P;
import com.google.firebase.firestore.j0;
import com.google.firebase.firestore.n0;
import i3.InterfaceC1109a;
import io.flutter.plugins.firebase.firestore.A;
import io.flutter.plugins.firebase.firestore.B;
import io.flutter.plugins.firebase.firestore.F;
import io.flutter.plugins.firebase.firestore.G;
import io.flutter.plugins.firebase.firestore.m;
import io.flutter.plugins.firebase.firestore.s;
import io.flutter.plugins.firebase.firestore.u;
import io.flutter.plugins.firebase.firestore.w;
import io.flutter.plugins.firebase.firestore.z;
import io.flutter.plugins.googlemaps.A0;
import io.flutter.plugins.googlemaps.AbstractC1174g;
import io.flutter.plugins.googlemaps.C1164a0;
import io.flutter.plugins.googlemaps.C1166b0;
import io.flutter.plugins.googlemaps.C1170d0;
import io.flutter.plugins.googlemaps.C1186t;
import io.flutter.plugins.googlemaps.C1190x;
import io.flutter.plugins.googlemaps.D0;
import io.flutter.plugins.googlemaps.InterfaceC1167c;
import io.flutter.plugins.googlemaps.InterfaceC1180m;
import io.flutter.plugins.googlemaps.InterfaceC1183p;
import io.flutter.plugins.googlemaps.InterfaceC1185s;
import io.flutter.plugins.googlemaps.InterfaceC1188v;
import io.flutter.plugins.googlemaps.J;
import io.flutter.plugins.googlemaps.K;
import io.flutter.plugins.googlemaps.L;
import io.flutter.plugins.googlemaps.M;
import io.flutter.plugins.googlemaps.N;
import io.flutter.plugins.googlemaps.O;
import io.flutter.plugins.googlemaps.Q;
import io.flutter.plugins.googlemaps.S;
import io.flutter.plugins.googlemaps.T;
import io.flutter.plugins.googlemaps.U;
import io.flutter.plugins.googlemaps.X;
import io.flutter.plugins.googlemaps.Z;
import io.flutter.plugins.googlemaps.f0;
import io.flutter.plugins.googlemaps.g0;
import io.flutter.plugins.googlemaps.i0;
import io.flutter.plugins.googlemaps.l0;
import io.flutter.plugins.googlemaps.m0;
import io.flutter.plugins.googlemaps.p0;
import io.flutter.plugins.googlemaps.q0;
import io.flutter.plugins.googlemaps.u0;
import io.flutter.plugins.googlemaps.v0;
import io.flutter.plugins.googlemaps.y0;
import j$.util.Objects;
import j6.C1372c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k0.ActionMode$CallbackC1382i;
import kotlin.jvm.internal.j;
import m6.r;
import n4.C1517c;
import n4.D;
import n4.EnumC1528n;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.helpers.i;
import p.C1570C;
import q4.h;
import r3.C1737a;
import s3.C1775c;
import s3.C1776d;
import s3.C1779g;
import s3.C1780h;
import s3.C1788p;
import v1.C1881a;
import z0.AbstractActivityC2064y;
/* renamed from: a.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0412a {
    public static void A(l0 l0Var, InterfaceC1188v interfaceC1188v, AssetManager assetManager, float f, C1372c c1372c) {
        interfaceC1188v.d(l0Var.f12227a.floatValue());
        interfaceC1188v.c(l0Var.f12228b.f12095a.floatValue(), l0Var.f12228b.f12096b.floatValue());
        interfaceC1188v.b(l0Var.f12229c.booleanValue());
        interfaceC1188v.e(l0Var.f12230d.booleanValue());
        interfaceC1188v.f(l0Var.f12231e.booleanValue());
        interfaceC1188v.k(X(l0Var.f, assetManager, f, c1372c));
        C1170d0 c1170d0 = l0Var.f12232g;
        String str = c1170d0.f12124a;
        if (str != null) {
            interfaceC1188v.j(str, c1170d0.f12125b);
        }
        Z z7 = c1170d0.f12126c;
        interfaceC1188v.g(z7.f12095a.floatValue(), z7.f12096b.floatValue());
        interfaceC1188v.i(Y(l0Var.f12233h.a()));
        interfaceC1188v.h(l0Var.f12234i.floatValue());
        interfaceC1188v.setVisible(l0Var.j.booleanValue());
        interfaceC1188v.a(l0Var.f12235k.floatValue());
    }

    public static String B(p0 p0Var, y0 y0Var) {
        y0Var.b(p0Var.f12247b.booleanValue());
        y0Var.d(p0Var.f12249d.booleanValue());
        y0Var.setVisible(p0Var.f12251g.booleanValue());
        y0Var.f(p0Var.f12248c.intValue());
        y0Var.c(p0Var.f12252h.intValue());
        y0Var.g((float) p0Var.f12253i.longValue());
        y0Var.a((float) p0Var.j.longValue());
        y0Var.e(R(p0Var.f12250e));
        List<List> list = p0Var.f;
        ArrayList arrayList = new ArrayList(list.size());
        for (List list2 : list) {
            arrayList.add(R(list2));
        }
        y0Var.l(arrayList);
        return p0Var.f12246a;
    }

    public static String C(q0 q0Var, A0 a02, AssetManager assetManager, float f) {
        int i7;
        a02.b(q0Var.f12261b.booleanValue());
        a02.o(q0Var.f12262c.intValue());
        a02.j(d(q0Var.f12267i, assetManager, f));
        a02.p(d(q0Var.f12266h, assetManager, f));
        a02.d(q0Var.f12263d.booleanValue());
        int i8 = AbstractC1174g.f12139d[q0Var.f12264e.ordinal()];
        if (i8 != 2) {
            if (i8 != 3) {
                i7 = 0;
            } else {
                i7 = 2;
            }
        } else {
            i7 = 1;
        }
        a02.h(i7);
        a02.setVisible(q0Var.j.booleanValue());
        a02.i((float) q0Var.f12268k.longValue());
        a02.a((float) q0Var.f12269l.longValue());
        a02.e(R(q0Var.f12265g));
        List<m0> list = q0Var.f;
        ArrayList arrayList = null;
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (m0 m0Var : list) {
                int i9 = AbstractC1174g.f12140e[m0Var.f12238a.ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            arrayList2.add(new C1780h(m0Var.f12239b.floatValue(), 1));
                        }
                    } else {
                        arrayList2.add(new C1780h(m0Var.f12239b.floatValue(), 0));
                    }
                } else {
                    arrayList2.add(new C1788p(1, null));
                }
            }
            arrayList = arrayList2;
        }
        a02.k(arrayList);
        return q0Var.f12260a;
    }

    public static String D(u0 u0Var, D0 d02) {
        d02.i(u0Var.f12287b.booleanValue());
        d02.b(u0Var.f12288c.floatValue());
        d02.a((float) u0Var.f12289d.longValue());
        d02.setVisible(u0Var.f12290e.booleanValue());
        return u0Var.f12286a;
    }

    public static boolean E(byte b5) {
        if (b5 > -65) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, io.flutter.plugins.googlemaps.g0] */
    public static g0 F(LatLngBounds latLngBounds) {
        f0 H7 = H(latLngBounds.f9466b);
        f0 H8 = H(latLngBounds.f9465a);
        ?? obj = new Object();
        obj.f12141a = H7;
        obj.f12142b = H8;
        return obj;
    }

    public static LatLng G(f0 f0Var) {
        return new LatLng(f0Var.f12134a.doubleValue(), f0Var.f12135b.doubleValue());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [io.flutter.plugins.googlemaps.f0, java.lang.Object] */
    public static f0 H(LatLng latLng) {
        Double valueOf = Double.valueOf(latLng.f9463a);
        Double valueOf2 = Double.valueOf(latLng.f9464b);
        ?? obj = new Object();
        obj.f12134a = valueOf;
        obj.f12135b = valueOf2;
        return obj;
    }

    public static Uri I(String str) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = c.f536k;
        boolean startsWith = str.toLowerCase().startsWith("gs://");
        String str2 = StringUtils.EMPTY;
        if (startsWith) {
            String A7 = W.A(str.substring(5));
            if (!TextUtils.isEmpty(A7)) {
                String encode = Uri.encode(A7);
                I.i(encode);
                str2 = encode.replace("%2F", "/");
            }
            return Uri.parse("gs://" + str2);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme != null && (I.m(scheme.toLowerCase(), "http") || I.m(scheme.toLowerCase(), "https"))) {
            int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
            String encodedPath = parse.getEncodedPath();
            I.i(encodedPath);
            String replace = encodedPath.replace("%2F", "/");
            if (indexOf == 0 && replace.startsWith("/")) {
                int indexOf2 = replace.indexOf("/b/", 0);
                int i7 = indexOf2 + 3;
                int indexOf3 = replace.indexOf("/", i7);
                int indexOf4 = replace.indexOf("/o/", 0);
                if (indexOf2 != -1 && indexOf3 != -1) {
                    substring = replace.substring(i7, indexOf3);
                    if (indexOf4 != -1) {
                        str2 = replace.substring(indexOf4 + 3);
                    }
                    replace = str2;
                } else {
                    Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                    throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                }
            } else if (indexOf > 1) {
                substring = parse.getAuthority().substring(0, indexOf - 1);
            } else {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            I.f(substring, "No bucket specified");
            return new Uri.Builder().scheme("gs").authority(substring).encodedPath(replace).build();
        }
        Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
        throw new IllegalArgumentException("Uri scheme");
    }

    public static long J(String str) {
        if (str == null) {
            return 0L;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(replaceAll).getTime();
        } catch (ParseException e7) {
            Log.w("StorageUtil", "unable to parse datetime:" + replaceAll, e7);
            return 0L;
        }
    }

    public static ArrayList K(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0818u.b((String[]) ((List) it.next()).toArray(new String[0])));
        }
        return arrayList;
    }

    public static P L(s sVar) {
        int i7 = R5.a.f4781d[sVar.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                return P.CACHE;
            }
            throw new IllegalArgumentException("Unknown ListenSource value: " + sVar);
        }
        return P.DEFAULT;
    }

    public static Long M(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static EnumC0815q N(F f) {
        if (f == null) {
            return EnumC0815q.NONE;
        }
        int i7 = R5.a.f4779b[f.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    return EnumC0815q.PREVIOUS;
                }
                throw new IllegalArgumentException("Unknown server timestamp behavior: " + f);
            }
            return EnumC0815q.ESTIMATE;
        }
        return EnumC0815q.NONE;
    }

    public static n0 O(G g3) {
        int i7 = R5.a.f4778a[g3.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    return n0.SERVER;
                }
                throw new IllegalArgumentException("Unknown source: " + g3);
            }
            return n0.DEFAULT;
        }
        return n0.CACHE;
    }

    public static com.google.firebase.firestore.g0 P(FirebaseFirestore firebaseFirestore, String str, boolean z7, z zVar) {
        com.google.firebase.firestore.g0 b5;
        com.google.firebase.firestore.f0 f0Var;
        try {
            if (z7) {
                b5 = firebaseFirestore.c(str);
            } else {
                b5 = firebaseFirestore.b(str);
            }
            if (zVar == null) {
                return b5;
            }
            Map map = zVar.f11972i;
            if (map != null) {
                b5 = b5.j(p(map));
            }
            List<List> list = zVar.f11965a;
            Objects.requireNonNull(list);
            for (List list2 : list) {
                C0818u c0818u = (C0818u) list2.get(0);
                String str2 = (String) list2.get(1);
                Object obj = list2.get(2);
                if ("==".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.EQUAL, obj));
                } else if ("!=".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.NOT_EQUAL, obj));
                } else if ("<".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.LESS_THAN, obj));
                } else if ("<=".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.LESS_THAN_OR_EQUAL, obj));
                } else if (">".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.GREATER_THAN, obj));
                } else if (">=".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.GREATER_THAN_OR_EQUAL, obj));
                } else if ("array-contains".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.ARRAY_CONTAINS, obj));
                } else if ("array-contains-any".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.ARRAY_CONTAINS_ANY, (List) obj));
                } else if ("in".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.IN, (List) obj));
                } else if ("not-in".equals(str2)) {
                    b5.getClass();
                    b5 = b5.j(new C(c0818u, EnumC1528n.NOT_IN, (List) obj));
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Long l8 = zVar.f11967c;
            if (l8 != null) {
                b5 = b5.d(l8.longValue());
            }
            Long l9 = zVar.f11968d;
            if (l9 != null) {
                b5 = b5.e(l9.longValue());
            }
            List<List> list3 = zVar.f11966b;
            if (list3 == null) {
                return b5;
            }
            for (List list4 : list3) {
                C0818u c0818u2 = (C0818u) list4.get(0);
                if (((Boolean) list4.get(1)).booleanValue()) {
                    f0Var = com.google.firebase.firestore.f0.DESCENDING;
                } else {
                    f0Var = com.google.firebase.firestore.f0.ASCENDING;
                }
                b5 = b5.f(c0818u2, f0Var);
            }
            List list5 = zVar.f11969e;
            if (list5 != null) {
                Object[] array = list5.toArray();
                Objects.requireNonNull(array);
                C1517c b7 = b5.b("startAt", true, array);
                D d7 = b5.f9808a;
                b5 = new com.google.firebase.firestore.g0(new D(d7.f, d7.f14276g, d7.f14275e, d7.f14271a, d7.f14277h, d7.f14278i, b7, d7.f14279k), b5.f9809b);
            }
            List list6 = zVar.f;
            if (list6 != null) {
                Object[] array2 = list6.toArray();
                Objects.requireNonNull(array2);
                C1517c b8 = b5.b("startAfter", false, array2);
                D d8 = b5.f9808a;
                b5 = new com.google.firebase.firestore.g0(new D(d8.f, d8.f14276g, d8.f14275e, d8.f14271a, d8.f14277h, d8.f14278i, b8, d8.f14279k), b5.f9809b);
            }
            List list7 = zVar.f11970g;
            if (list7 != null) {
                Object[] array3 = list7.toArray();
                Objects.requireNonNull(array3);
                C1517c b9 = b5.b("endAt", true, array3);
                D d9 = b5.f9808a;
                b5 = new com.google.firebase.firestore.g0(new D(d9.f, d9.f14276g, d9.f14275e, d9.f14271a, d9.f14277h, d9.f14278i, d9.j, b9), b5.f9809b);
            }
            List list8 = zVar.f11971h;
            if (list8 != null) {
                Object[] array4 = list8.toArray();
                Objects.requireNonNull(array4);
                C1517c b10 = b5.b("endBefore", false, array4);
                D d10 = b5.f9808a;
                return new com.google.firebase.firestore.g0(new D(d10.f, d10.f14276g, d10.f14275e, d10.f14271a, d10.f14277h, d10.f14278i, d10.j, b10), b5.f9809b);
            }
            return b5;
        } catch (Exception e7) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e7);
            return null;
        }
    }

    public static ArrayList R(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            arrayList.add(new LatLng(f0Var.f12134a.doubleValue(), f0Var.f12135b.doubleValue()));
        }
        return arrayList;
    }

    public static void S(TextView textView, int i7) {
        int i8;
        if (i7 >= 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                X.c.l(textView, i7);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i8 = fontMetricsInt.top;
            } else {
                i8 = fontMetricsInt.ascent;
            }
            if (i7 > Math.abs(i8)) {
                textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void T(TextView textView, int i7) {
        int i8;
        if (i7 >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i8 = fontMetricsInt.bottom;
            } else {
                i8 = fontMetricsInt.descent;
            }
            if (i7 > Math.abs(i8)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static Set U(Object... objArr) {
        int length;
        int length2 = objArr.length;
        r rVar = r.f14076a;
        if (length2 > 0 && (length = objArr.length) != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(m6.s.O(objArr.length));
                for (Object obj : objArr) {
                    linkedHashSet.add(obj);
                }
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(objArr[0]);
            j.d(singleton, "singleton(...)");
            return singleton;
        }
        return rVar;
    }

    public static void V(f binaryMessenger, final C0396w c0396w) {
        Object obj;
        o oVar;
        j.e(binaryMessenger, "binaryMessenger");
        if (c0396w != null && (oVar = c0396w.f6533a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        e eVar = new e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", obj, null, 4);
        if (c0396w != null) {
            eVar.h0(new b() { // from class: X5.F
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    Object asList;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            try {
                                F3.o oVar2 = c0396w2.f6533a;
                                ((C0377c) oVar2.f1179c).a((C0395v) oVar2.f, longValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0395v c0395v = (C0395v) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0396w3.getClass();
                                try {
                                    String[] list2 = c0395v.f6531a.list(str);
                                    if (list2 == null) {
                                        asList = new ArrayList();
                                    } else {
                                        asList = Arrays.asList(list2);
                                    }
                                    E7 = G.i.A(asList);
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        default:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0395v c0395v2 = (C0395v) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0396w4.getClass();
                                E8 = G.i.A(((F5.d) c0395v2.f6532b.f218b).b(str2));
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        e eVar2 = new e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", obj, null, 4);
        if (c0396w != null) {
            eVar2.h0(new b() { // from class: X5.F
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    Object asList;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            try {
                                F3.o oVar2 = c0396w2.f6533a;
                                ((C0377c) oVar2.f1179c).a((C0395v) oVar2.f, longValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0395v c0395v = (C0395v) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0396w3.getClass();
                                try {
                                    String[] list2 = c0395v.f6531a.list(str);
                                    if (list2 == null) {
                                        asList = new ArrayList();
                                    } else {
                                        asList = Arrays.asList(list2);
                                    }
                                    E7 = G.i.A(asList);
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        default:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0395v c0395v2 = (C0395v) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0396w4.getClass();
                                E8 = G.i.A(((F5.d) c0395v2.f6532b.f218b).b(str2));
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        e eVar3 = new e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", obj, null, 4);
        if (c0396w != null) {
            eVar3.h0(new b() { // from class: X5.F
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    Object asList;
                    List E8;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            try {
                                F3.o oVar2 = c0396w2.f6533a;
                                ((C0377c) oVar2.f1179c).a((C0395v) oVar2.f, longValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0395v c0395v = (C0395v) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0396w3.getClass();
                                try {
                                    String[] list2 = c0395v.f6531a.list(str);
                                    if (list2 == null) {
                                        asList = new ArrayList();
                                    } else {
                                        asList = Arrays.asList(list2);
                                    }
                                    E7 = G.i.A(asList);
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        default:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0395v c0395v2 = (C0395v) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0396w4.getClass();
                                E8 = G.i.A(((F5.d) c0395v2.f6532b.f218b).b(str2));
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
    }

    public static int W(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        return 270;
                    }
                    throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Unsupported surface rotation: "));
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e6, code lost:
        r10 = java.lang.Double.valueOf(r0.doubleValue() * r12).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0127, code lost:
        r10 = java.lang.Double.valueOf(r3.doubleValue() * r12).intValue();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21, types: [io.flutter.plugins.googlemaps.E] */
    /* JADX WARN: Type inference failed for: r10v35, types: [s3.b] */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s3.C1774b X(io.flutter.plugins.googlemaps.B r10, android.content.res.AssetManager r11, float r12, j6.C1372c r13) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0412a.X(io.flutter.plugins.googlemaps.B, android.content.res.AssetManager, float, j6.c):s3.b");
    }

    public static LatLng Y(Object obj) {
        List list = (List) obj;
        return new LatLng(((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue());
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [io.flutter.plugins.firebase.firestore.u, java.lang.Object] */
    public static u Z(C0810l c0810l, EnumC0815q enumC0815q) {
        m mVar;
        EnumC0809k enumC0809k = c0810l.f9820a;
        int i7 = R5.a.f4780c[enumC0809k.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    mVar = m.REMOVED;
                } else {
                    throw new IllegalArgumentException("Unknown change type: " + enumC0809k);
                }
            } else {
                mVar = m.MODIFIED;
            }
        } else {
            mVar = m.ADDED;
        }
        Long valueOf = Long.valueOf(c0810l.f9822c);
        Long valueOf2 = Long.valueOf(c0810l.f9823d);
        w a02 = a0(c0810l.f9821b, enumC0815q);
        ?? obj = new Object();
        if (mVar != null) {
            obj.f11949a = mVar;
            obj.f11950b = a02;
            obj.f11951c = valueOf;
            obj.f11952d = valueOf2;
            return obj;
        }
        throw new IllegalStateException("Nonnull field \"type\" is null.");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [io.flutter.plugins.googlemaps.I, java.lang.Object] */
    public static io.flutter.plugins.googlemaps.I a(CameraPosition cameraPosition) {
        Double valueOf = Double.valueOf(cameraPosition.f9462d);
        f0 H7 = H(cameraPosition.f9459a);
        Double valueOf2 = Double.valueOf(cameraPosition.f9461c);
        Double valueOf3 = Double.valueOf(cameraPosition.f9460b);
        ?? obj = new Object();
        obj.f12061a = valueOf;
        obj.f12062b = H7;
        obj.f12063c = valueOf2;
        obj.f12064d = valueOf3;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugins.firebase.firestore.w, java.lang.Object] */
    public static w a0(com.google.firebase.firestore.r rVar, EnumC0815q enumC0815q) {
        B c02 = c0(rVar.f9846d);
        HashMap a7 = rVar.a(enumC0815q);
        h hVar = rVar.f9844b;
        hVar.getClass();
        String c8 = hVar.f15357a.c();
        ?? obj = new Object();
        if (c8 != null) {
            obj.f11955a = c8;
            obj.f11956b = a7;
            obj.f11957c = c02;
            return obj;
        }
        throw new IllegalStateException("Nonnull field \"path\" is null.");
    }

    public static C0585f b(K k2, float f) {
        Point point;
        Object obj = k2.f12066a;
        if (obj instanceof L) {
            io.flutter.plugins.googlemaps.I i7 = ((L) obj).f12067a;
            CameraPosition cameraPosition = new CameraPosition(G(i7.f12062b), i7.f12064d.floatValue(), i7.f12063c.floatValue(), i7.f12061a.floatValue());
            try {
                C1737a t02 = f7.a.t0();
                Parcel zza = t02.zza();
                zzc.zzd(zza, cameraPosition);
                Parcel zzJ = t02.zzJ(7, zza);
                InterfaceC1109a b5 = i3.b.b(zzJ.readStrongBinder());
                zzJ.recycle();
                return new C0585f(b5);
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            }
        } else if (obj instanceof M) {
            LatLng G2 = G(((M) obj).f12068a);
            try {
                C1737a t03 = f7.a.t0();
                Parcel zza2 = t03.zza();
                zzc.zzd(zza2, G2);
                Parcel zzJ2 = t03.zzJ(8, zza2);
                InterfaceC1109a b7 = i3.b.b(zzJ2.readStrongBinder());
                zzJ2.recycle();
                return new C0585f(b7);
            } catch (RemoteException e8) {
                throw new RuntimeException(e8);
            }
        } else if (obj instanceof O) {
            O o7 = (O) obj;
            LatLng G7 = G(o7.f12071a);
            float floatValue = o7.f12072b.floatValue();
            try {
                C1737a t04 = f7.a.t0();
                Parcel zza3 = t04.zza();
                zzc.zzd(zza3, G7);
                zza3.writeFloat(floatValue);
                Parcel zzJ3 = t04.zzJ(9, zza3);
                InterfaceC1109a b8 = i3.b.b(zzJ3.readStrongBinder());
                zzJ3.recycle();
                return new C0585f(b8);
            } catch (RemoteException e9) {
                throw new RuntimeException(e9);
            }
        } else if (obj instanceof N) {
            N n7 = (N) obj;
            g0 g0Var = n7.f12069a;
            LatLngBounds latLngBounds = new LatLngBounds(G(g0Var.f12142b), G(g0Var.f12141a));
            int doubleValue = (int) (n7.f12070b.doubleValue() * f);
            try {
                C1737a t05 = f7.a.t0();
                Parcel zza4 = t05.zza();
                zzc.zzd(zza4, latLngBounds);
                zza4.writeInt(doubleValue);
                Parcel zzJ4 = t05.zzJ(10, zza4);
                InterfaceC1109a b9 = i3.b.b(zzJ4.readStrongBinder());
                zzJ4.recycle();
                return new C0585f(b9);
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            }
        } else if (obj instanceof io.flutter.plugins.googlemaps.P) {
            io.flutter.plugins.googlemaps.P p7 = (io.flutter.plugins.googlemaps.P) obj;
            float floatValue2 = p7.f12073a.floatValue() * f;
            float floatValue3 = p7.f12074b.floatValue() * f;
            try {
                C1737a t06 = f7.a.t0();
                Parcel zza5 = t06.zza();
                zza5.writeFloat(floatValue2);
                zza5.writeFloat(floatValue3);
                Parcel zzJ5 = t06.zzJ(3, zza5);
                InterfaceC1109a b10 = i3.b.b(zzJ5.readStrongBinder());
                zzJ5.recycle();
                return new C0585f(b10);
            } catch (RemoteException e11) {
                throw new RuntimeException(e11);
            }
        } else if (obj instanceof S) {
            S s7 = (S) obj;
            Z z7 = s7.f12077b;
            if (z7 == null) {
                point = null;
            } else {
                double d7 = f;
                point = new Point((int) (z7.f12095a.doubleValue() * d7), (int) (z7.f12096b.doubleValue() * d7));
            }
            if (point != null) {
                float floatValue4 = s7.f12076a.floatValue();
                try {
                    C1737a t07 = f7.a.t0();
                    int i8 = point.x;
                    int i9 = point.y;
                    Parcel zza6 = t07.zza();
                    zza6.writeFloat(floatValue4);
                    zza6.writeInt(i8);
                    zza6.writeInt(i9);
                    Parcel zzJ6 = t07.zzJ(6, zza6);
                    InterfaceC1109a b11 = i3.b.b(zzJ6.readStrongBinder());
                    zzJ6.recycle();
                    return new C0585f(b11);
                } catch (RemoteException e12) {
                    throw new RuntimeException(e12);
                }
            }
            float floatValue5 = s7.f12076a.floatValue();
            try {
                C1737a t08 = f7.a.t0();
                Parcel zza7 = t08.zza();
                zza7.writeFloat(floatValue5);
                Parcel zzJ7 = t08.zzJ(5, zza7);
                InterfaceC1109a b12 = i3.b.b(zzJ7.readStrongBinder());
                zzJ7.recycle();
                return new C0585f(b12);
            } catch (RemoteException e13) {
                throw new RuntimeException(e13);
            }
        } else if (obj instanceof T) {
            float floatValue6 = ((T) obj).f12078a.floatValue();
            try {
                C1737a t09 = f7.a.t0();
                Parcel zza8 = t09.zza();
                zza8.writeFloat(floatValue6);
                Parcel zzJ8 = t09.zzJ(4, zza8);
                InterfaceC1109a b13 = i3.b.b(zzJ8.readStrongBinder());
                zzJ8.recycle();
                return new C0585f(b13);
            } catch (RemoteException e14) {
                throw new RuntimeException(e14);
            }
        } else if (obj instanceof Q) {
            if (((Q) obj).f12075a.booleanValue()) {
                try {
                    C1737a t010 = f7.a.t0();
                    Parcel zzJ9 = t010.zzJ(2, t010.zza());
                    InterfaceC1109a b14 = i3.b.b(zzJ9.readStrongBinder());
                    zzJ9.recycle();
                    return new C0585f(b14);
                } catch (RemoteException e15) {
                    throw new RuntimeException(e15);
                }
            }
            try {
                C1737a t011 = f7.a.t0();
                Parcel zzJ10 = t011.zzJ(1, t011.zza());
                InterfaceC1109a b15 = i3.b.b(zzJ10.readStrongBinder());
                zzJ10.recycle();
                return new C0585f(b15);
            } catch (RemoteException e16) {
                throw new RuntimeException(e16);
            }
        } else {
            throw new IllegalArgumentException("PlatformCameraUpdate's cameraUpdate field must be one of the PlatformCameraUpdate... case classes.");
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, io.flutter.plugins.firebase.firestore.A] */
    public static A b0(j0 j0Var, EnumC0815q enumC0815q) {
        B c02 = c0(j0Var.f);
        List<C0810l> e7 = j0Var.e();
        ArrayList arrayList = new ArrayList(e7.size());
        for (C0810l c0810l : e7) {
            arrayList.add(Z(c0810l, enumC0815q));
        }
        ArrayList f = j0Var.f();
        ArrayList arrayList2 = new ArrayList(f.size());
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList2.add(a0((com.google.firebase.firestore.r) it.next(), enumC0815q));
        }
        ?? obj = new Object();
        obj.f11902a = arrayList2;
        obj.f11903b = arrayList;
        obj.f11904c = c02;
        return obj;
    }

    public static boolean c(Z.e[] eVarArr, Z.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            Z.e eVar = eVarArr[i7];
            char c8 = eVar.f6714a;
            Z.e eVar2 = eVarArr2[i7];
            if (c8 != eVar2.f6714a || eVar.f6715b.length != eVar2.f6715b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugins.firebase.firestore.B, java.lang.Object] */
    public static B c0(com.google.firebase.firestore.m0 m0Var) {
        Boolean valueOf = Boolean.valueOf(m0Var.f9828a);
        Boolean valueOf2 = Boolean.valueOf(m0Var.f9829b);
        ?? obj = new Object();
        obj.f11905a = valueOf;
        obj.f11906b = valueOf2;
        return obj;
    }

    public static C1776d d(U u7, AssetManager assetManager, float f) {
        int i7 = AbstractC1174g.f[u7.f12079a.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        if (u7.f12081c != null) {
                            return new C1779g(X(u7.f12080b, assetManager, f, new C1372c(18)), u7.f12081c.floatValue());
                        }
                        throw new IllegalArgumentException("A Custom Cap must specify a refWidth value.");
                    }
                    throw new IllegalArgumentException("Unrecognized PlatformCap type: " + u7.f12079a);
                }
                return new C1775c(2);
            }
            return new C1775c(1);
        }
        return new C1775c(0);
    }

    public static Bitmap d0(Bitmap bitmap, float f) {
        if (Math.abs(f - 1.0f) > 0.001f && f > 0.0f) {
            return e0(bitmap, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f));
        }
        return bitmap;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [io.flutter.plugins.googlemaps.X, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, s3.l] */
    public static X e(String str, R4.a aVar) {
        int d7 = aVar.d();
        String[] strArr = new String[d7];
        C1186t[] c1186tArr = (C1186t[]) aVar.c().toArray(new C1186t[d7]);
        ?? obj = new Object();
        obj.f15620a = Double.POSITIVE_INFINITY;
        obj.f15621b = Double.NEGATIVE_INFINITY;
        obj.f15622c = Double.NaN;
        obj.f15623d = Double.NaN;
        for (int i7 = 0; i7 < d7; i7++) {
            C1186t c1186t = c1186tArr[i7];
            obj.b(c1186t.f12275a.f15629a);
            strArr[i7] = c1186t.f12277c;
        }
        f0 H7 = H(aVar.a());
        g0 F7 = F(obj.a());
        List asList = Arrays.asList(strArr);
        ?? obj2 = new Object();
        if (str != null) {
            obj2.f12090a = str;
            obj2.f12091b = H7;
            obj2.f12092c = F7;
            if (asList != null) {
                obj2.f12093d = asList;
                return obj2;
            }
            throw new IllegalStateException("Nonnull field \"markerIds\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"clusterManagerId\" is null.");
    }

    public static Bitmap e0(Bitmap bitmap, int i7, int i8) {
        if (i7 > 0 && i8 > 0) {
            if (bitmap.getWidth() != i7 || bitmap.getHeight() != i8) {
                return Bitmap.createScaledBitmap(bitmap, i7, i8, true);
            }
            return bitmap;
        }
        return bitmap;
    }

    public static float[] f(float[] fArr, int i7) {
        if (i7 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i7, length);
                float[] fArr2 = new float[i7];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static ActionMode.Callback f0(ActionMode.Callback callback) {
        if ((callback instanceof ActionMode$CallbackC1382i) && Build.VERSION.SDK_INT >= 26) {
            return ((ActionMode$CallbackC1382i) callback).f13565a;
        }
        return callback;
    }

    public static void g0(Object obj, String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new RuntimeException(W.z(str, obj));
    }

    public static C0742p h(Looper looper, Object obj, String str) {
        I.j(obj, "Listener must not be null");
        I.j(looper, "Looper must not be null");
        I.j(str, "Listener type must not be null");
        return new C0742p(looper, obj, str);
    }

    public static Object h0(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
            if (obj.equals(JSONObject.NULL)) {
                return obj;
            }
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : (Collection) obj) {
                    jSONArray.put(h0(obj2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                for (int i7 = 0; i7 < length; i7++) {
                    jSONArray2.put(h0(Array.get(obj, i7)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put((String) entry.getKey(), h0(entry.getValue()));
                }
                return jSONObject;
            } else {
                if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                    if (obj.getClass().getPackage().getName().startsWith("java.")) {
                        return obj.toString();
                    }
                    return null;
                }
                return obj;
            }
        }
        return obj;
    }

    public static C0742p i(Object obj, String str, Executor executor) {
        I.j(obj, "Listener must not be null");
        I.j(executor, "Executor must not be null");
        return new C0742p(obj, str, executor);
    }

    public static ActionMode.Callback i0(ActionMode.Callback callback, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && i7 <= 27 && !(callback instanceof ActionMode$CallbackC1382i) && callback != null) {
            return new ActionMode$CallbackC1382i(callback, textView);
        }
        return callback;
    }

    public static C0740n j(Object obj, String str) {
        I.j(obj, "Listener must not be null");
        I.f(str, "Listener type must not be empty");
        return new C0740n(obj, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Z.e[] k(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0412a.k(java.lang.String):Z.e[]");
    }

    public static Z.e[] n(Z.e[] eVarArr) {
        Z.e[] eVarArr2 = new Z.e[eVarArr.length];
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            eVarArr2[i7] = new Z.e(eVarArr[i7]);
        }
        return eVarArr2;
    }

    public static D.C o() {
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        androidx.camera.core.impl.W b5 = androidx.camera.core.impl.W.b();
        new D.A(b5, 0);
        b5.j(D.C.f599b, obj);
        b5.j(D.C.f600c, obj2);
        b5.j(D.C.f601d, obj3);
        return new D.C(androidx.camera.core.impl.Z.a(b5));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r2.equals("not-in") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.firestore.D p(java.util.Map r6) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0412a.p(java.util.Map):com.google.firebase.firestore.D");
    }

    public static String q(Z3.b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            X3.b bVar2 = (X3.b) Tasks.await(((d) bVar).b(false), 30000L, TimeUnit.MILLISECONDS);
            if (bVar2.f6377b != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + bVar2.f6377b);
            }
            return bVar2.f6376a;
        } catch (InterruptedException e7) {
            e = e7;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (TimeoutException e9) {
            e = e9;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        }
    }

    public static String r(InterfaceC0593a interfaceC0593a) {
        String str;
        if (interfaceC0593a != null) {
            try {
                FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0593a;
                str = ((C0468q) Tasks.await(firebaseAuth.j(firebaseAuth.f, false), 30000L, TimeUnit.MILLISECONDS)).f7043a;
            } catch (InterruptedException e7) {
                e = e7;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            } catch (ExecutionException e8) {
                e = e8;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            } catch (TimeoutException e9) {
                e = e9;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [U.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [U.m, java.lang.Object] */
    public static l s(U.j jVar) {
        ?? obj = new Object();
        obj.f5531c = new Object();
        l lVar = new l(obj);
        obj.f5530b = lVar;
        obj.f5529a = jVar.getClass();
        try {
            Object i7 = jVar.i(obj);
            if (i7 != null) {
                obj.f5529a = i7;
            }
        } catch (Exception e7) {
            lVar.f5535b.k(e7);
        }
        return lVar;
    }

    public static int t(int i7, int i8, boolean z7) {
        int i9;
        if (z7) {
            i9 = ((i8 - i7) + 360) % 360;
        } else {
            i9 = (i8 + i7) % 360;
        }
        if (i.E(2, i.N("CameraOrientationUtil"))) {
            i.l("CameraOrientationUtil", "getRelativeImageRotation: destRotationDegrees=" + i7 + ", sourceRotationDegrees=" + i8 + ", isOppositeFacing=" + z7 + ", result=" + i9);
        }
        return i9;
    }

    public static f0.d v(C1570C c1570c) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return new f0.d(X.c.h(c1570c));
        }
        TextPaint textPaint = new TextPaint(c1570c.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c1570c.getBreakStrategy();
        int hyphenationFrequency = c1570c.getHyphenationFrequency();
        if (c1570c.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z7 = true;
            if (i7 >= 28 && (c1570c.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(X.c.c(X.a.d(c1570c.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (c1570c.getLayoutDirection() != 1) {
                    z7 = false;
                }
                switch (c1570c.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z7) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new f0.d(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static String w(io.flutter.plugins.googlemaps.W w2, InterfaceC1167c interfaceC1167c) {
        interfaceC1167c.b(w2.f12082a.booleanValue());
        interfaceC1167c.f(w2.f12083b.intValue());
        interfaceC1167c.c(w2.f12084c.intValue());
        interfaceC1167c.g((float) w2.f12086e.longValue());
        interfaceC1167c.a(w2.f.floatValue());
        interfaceC1167c.n(Y(w2.f12087g.a()));
        interfaceC1167c.m(w2.f12088h.doubleValue());
        interfaceC1167c.setVisible(w2.f12085d.booleanValue());
        return w2.f12089i;
    }

    public static String x(C1166b0 c1166b0, InterfaceC1183p interfaceC1183p, AssetManager assetManager, float f, C1372c c1372c) {
        interfaceC1183p.b(c1166b0.f12114h.floatValue());
        interfaceC1183p.a(c1166b0.j.floatValue());
        interfaceC1183p.setVisible(c1166b0.f12116k.booleanValue());
        Z z7 = c1166b0.f12113g;
        if (z7 != null) {
            interfaceC1183p.c(z7.f12095a.floatValue(), c1166b0.f12113g.f12096b.floatValue());
        }
        interfaceC1183p.x(c1166b0.f12115i.floatValue());
        interfaceC1183p.g(c1166b0.f12117l.booleanValue());
        interfaceC1183p.h(X(c1166b0.f12109b, assetManager, f, c1372c));
        f0 f0Var = c1166b0.f12110c;
        if (f0Var != null) {
            Float f4 = null;
            if (c1166b0.f12112e != null) {
                LatLng G2 = G(f0Var);
                Float valueOf = Float.valueOf(c1166b0.f12112e.floatValue());
                Double d7 = c1166b0.f;
                if (d7 != null) {
                    f4 = Float.valueOf(d7.floatValue());
                }
                interfaceC1183p.j(G2, valueOf, f4);
            } else {
                throw new C1190x(null, "Invalid GroundOverlay", "Width is required when using a ground overlay with a position.");
            }
        } else {
            g0 g0Var = c1166b0.f12111d;
            if (g0Var != null) {
                interfaceC1183p.q(new LatLngBounds(G(g0Var.f12142b), G(g0Var.f12141a)));
            }
        }
        return c1166b0.f12108a;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, W4.d] */
    public static String y(Map map, InterfaceC1185s interfaceC1185s) {
        Object obj = map.get("data");
        int i7 = 0;
        if (obj != null) {
            List<List> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (List list2 : list) {
                LatLng Y3 = Y(list2.get(i7));
                double doubleValue = ((Number) list2.get(1)).doubleValue();
                ?? obj2 = new Object();
                double sin = Math.sin(Math.toRadians(Y3.f9463a));
                ArrayList arrayList2 = arrayList;
                obj2.f6219a = new X4.a(((Y3.f9464b / 360.0d) + 0.5d) * 1.0d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 1.0d);
                if (doubleValue >= 0.0d) {
                    obj2.f6220b = doubleValue;
                } else {
                    obj2.f6220b = 1.0d;
                }
                arrayList2.add(obj2);
                arrayList = arrayList2;
                i7 = 0;
            }
            interfaceC1185s.c(arrayList);
        }
        Object obj3 = map.get("gradient");
        if (obj3 != null) {
            Map map2 = (Map) obj3;
            List list3 = (List) map2.get("colors");
            int[] iArr = new int[list3.size()];
            for (int i8 = 0; i8 < list3.size(); i8++) {
                iArr[i8] = ((Number) list3.get(i8)).intValue();
            }
            List list4 = (List) map2.get("startPoints");
            float[] fArr = new float[list4.size()];
            for (int i9 = 0; i9 < list4.size(); i9++) {
                fArr[i9] = ((Number) list4.get(i9)).floatValue();
            }
            interfaceC1185s.v(new A3.N(iArr, fArr, ((Number) map2.get("colorMapSize")).intValue()));
        }
        Object obj4 = map.get("maxIntensity");
        if (obj4 != null) {
            interfaceC1185s.j(((Number) obj4).doubleValue());
        }
        Object obj5 = map.get("opacity");
        if (obj5 != null) {
            interfaceC1185s.q(((Number) obj5).doubleValue());
        }
        Object obj6 = map.get("radius");
        if (obj6 != null) {
            interfaceC1185s.b(((Number) obj6).intValue());
        }
        String str = (String) map.get("heatmapId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("heatmapId was null");
    }

    public static void z(i0 i0Var, InterfaceC1180m interfaceC1180m) {
        Float valueOf;
        LatLngBounds latLngBounds;
        J j = i0Var.f12162b;
        Float f = null;
        if (j != null) {
            g0 g0Var = j.f12065a;
            if (g0Var == null) {
                latLngBounds = null;
            } else {
                latLngBounds = new LatLngBounds(G(g0Var.f12142b), G(g0Var.f12141a));
            }
            interfaceC1180m.q(latLngBounds);
        }
        Boolean bool = i0Var.f12161a;
        if (bool != null) {
            interfaceC1180m.k(bool.booleanValue());
        }
        Boolean bool2 = i0Var.f12165e;
        if (bool2 != null) {
            interfaceC1180m.l(bool2.booleanValue());
        }
        io.flutter.plugins.googlemaps.j0 j0Var = i0Var.f12163c;
        if (j0Var != null) {
            int i7 = AbstractC1174g.f12137b[j0Var.ordinal()];
            int i8 = 1;
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 == 5) {
                            i8 = 4;
                        }
                    } else {
                        i8 = 3;
                    }
                } else {
                    i8 = 2;
                }
            } else {
                i8 = 0;
            }
            interfaceC1180m.b(i8);
        }
        v0 v0Var = i0Var.f12164d;
        if (v0Var != null) {
            Double d7 = v0Var.f12291a;
            if (d7 == null) {
                valueOf = null;
            } else {
                valueOf = Float.valueOf(d7.floatValue());
            }
            Double d8 = v0Var.f12292b;
            if (d8 != null) {
                f = Float.valueOf(d8.floatValue());
            }
            interfaceC1180m.w(valueOf, f);
        }
        C1164a0 c1164a0 = i0Var.f12172n;
        if (c1164a0 != null) {
            interfaceC1180m.c(c1164a0.f12101a.floatValue(), c1164a0.f12103c.floatValue(), c1164a0.f12102b.floatValue(), c1164a0.f12104d.floatValue());
        }
        Boolean bool3 = i0Var.f;
        if (bool3 != null) {
            interfaceC1180m.z(bool3.booleanValue());
        }
        Boolean bool4 = i0Var.f12166g;
        if (bool4 != null) {
            interfaceC1180m.n(bool4.booleanValue());
        }
        Boolean bool5 = i0Var.f12167h;
        if (bool5 != null) {
            interfaceC1180m.r(bool5.booleanValue());
        }
        Boolean bool6 = i0Var.f12168i;
        if (bool6 != null) {
            interfaceC1180m.m(bool6.booleanValue());
        }
        Boolean bool7 = i0Var.f12169k;
        if (bool7 != null) {
            interfaceC1180m.t(bool7.booleanValue());
        }
        Boolean bool8 = i0Var.f12176r;
        if (bool8 != null) {
            interfaceC1180m.o(bool8.booleanValue());
        }
        Boolean bool9 = i0Var.f12170l;
        if (bool9 != null) {
            interfaceC1180m.s(bool9.booleanValue());
        }
        Boolean bool10 = i0Var.j;
        if (bool10 != null) {
            interfaceC1180m.v(bool10.booleanValue());
        }
        Boolean bool11 = i0Var.f12171m;
        if (bool11 != null) {
            interfaceC1180m.i(bool11.booleanValue());
        }
        Boolean bool12 = i0Var.f12173o;
        if (bool12 != null) {
            interfaceC1180m.h(bool12.booleanValue());
        }
        Boolean bool13 = i0Var.f12174p;
        if (bool13 != null) {
            interfaceC1180m.x(bool13.booleanValue());
        }
        Boolean bool14 = i0Var.f12175q;
        if (bool14 != null) {
            interfaceC1180m.d(bool14.booleanValue());
        }
        String str = i0Var.f12178t;
        if (str != null) {
            interfaceC1180m.u(str);
        }
    }

    public abstract Object Q(Intent intent, int i7);

    public abstract Intent g(AbstractActivityC2064y abstractActivityC2064y, Intent intent);

    public H l(C1881a c1881a) {
        boolean z7;
        ByteBuffer byteBuffer = c1881a.f3350e;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        return m(c1881a, byteBuffer);
    }

    public abstract H m(C1881a c1881a, ByteBuffer byteBuffer);

    public F2.c u(AbstractActivityC2064y abstractActivityC2064y, Intent intent) {
        return null;
    }
}
