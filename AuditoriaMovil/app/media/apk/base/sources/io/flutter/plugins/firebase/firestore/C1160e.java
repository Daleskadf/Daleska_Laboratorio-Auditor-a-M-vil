package io.flutter.plugins.firebase.firestore;

import D.AbstractC0059i;
import android.util.Log;
import com.google.firebase.firestore.C0806h;
import com.google.firebase.firestore.C0810l;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.C0818u;
import com.google.firebase.firestore.C0819v;
import com.google.firebase.firestore.C0820w;
import com.google.firebase.firestore.C0822y;
import com.google.firebase.firestore.EnumC0815q;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.K;
import com.google.firebase.firestore.L;
import com.google.firebase.firestore.N;
import com.google.firebase.firestore.W;
import com.google.firebase.firestore.Z;
import com.google.firebase.firestore.b0;
import com.google.firebase.firestore.f0;
import com.google.firebase.firestore.g0;
import com.google.firebase.firestore.h0;
import com.google.firebase.firestore.j0;
import com.google.firebase.firestore.m0;
import com.google.firebase.firestore.s0;
import com.google.protobuf.AbstractC0852m;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n4.C1517c;
import n4.EnumC1528n;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
/* renamed from: io.flutter.plugins.firebase.firestore.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1160e extends L5.x {

    /* renamed from: d  reason: collision with root package name */
    public static final C1160e f11918d = new Object();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r2.equals("not-in") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.firestore.D l(java.util.Map r6) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.firestore.C1160e.l(java.util.Map):com.google.firebase.firestore.D");
    }

    public static Object[] m(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(AbstractC0059i.M("java.util.List was expected, unable to convert '", obj.getClass().getCanonicalName(), "' to an object array"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v38, types: [com.google.firebase.firestore.X, com.google.firebase.firestore.Y, java.lang.Object] */
    @Override // L5.x
    public Object f(byte b5, ByteBuffer byteBuffer) {
        FirebaseFirestore d7;
        String str;
        g0 b7;
        f0 f0Var;
        switch (b5) {
            case -76:
                return new Date(byteBuffer.getLong());
            case -75:
                L5.x.c(8, byteBuffer);
                return new N(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -74:
                return ((FirebaseFirestore) e(byteBuffer)).d((String) e(byteBuffer));
            case -73:
                int d8 = L5.x.d(byteBuffer);
                byte[] bArr = new byte[d8];
                byteBuffer.get(bArr);
                return new C0806h(AbstractC0852m.l(bArr, 0, d8));
            case -72:
                return new C0820w(Arrays.asList(m(e(byteBuffer))));
            case -71:
                return new C0819v(Arrays.asList(m(e(byteBuffer))));
            case -70:
                return com.google.firebase.firestore.A.f9737a;
            case -69:
                return com.google.firebase.firestore.A.f9738b;
            case -68:
                return new U3.p(byteBuffer.getInt(), byteBuffer.getLong());
            case -67:
                return new C0822y(Double.valueOf(((Number) e(byteBuffer)).doubleValue()));
            case -66:
                return new C0822y(Long.valueOf(((Number) e(byteBuffer)).intValue()));
            case -65:
                return C0818u.f9850c;
            case -64:
                int d9 = L5.x.d(byteBuffer);
                ArrayList arrayList = new ArrayList(d9);
                for (int i7 = 0; i7 < d9; i7++) {
                    arrayList.add(e(byteBuffer));
                }
                return C0818u.b((String[]) arrayList.toArray(new String[0]));
            case -63:
                return Double.valueOf(Double.NaN);
            case -62:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -61:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -60:
                String str2 = (String) e(byteBuffer);
                String str3 = (String) e(byteBuffer);
                L l8 = (L) e(byteBuffer);
                synchronized (C1162g.f11922Y) {
                    try {
                        d7 = C1162g.d(str2, str3);
                        if (d7 == null) {
                            d7 = FirebaseFirestore.e(U3.h.e(str2), str3);
                            d7.h(l8);
                            C1162g.i(d7, str3);
                        }
                    } finally {
                    }
                }
                return d7;
            case -59:
                try {
                    Map map = (Map) e(byteBuffer);
                    Object obj = map.get("firestore");
                    Objects.requireNonNull(obj);
                    FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
                    Object obj2 = map.get("path");
                    Objects.requireNonNull(obj2);
                    String str4 = (String) obj2;
                    boolean booleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
                    Map map2 = (Map) map.get("parameters");
                    if (booleanValue) {
                        b7 = firebaseFirestore.c(str4);
                    } else {
                        b7 = firebaseFirestore.b(str4);
                    }
                    if (map2 != null) {
                        if (map2.containsKey("filters")) {
                            Object obj3 = map2.get("filters");
                            Objects.requireNonNull(obj3);
                            b7 = b7.j(l((Map) obj3));
                        }
                        Object obj4 = map2.get("where");
                        Objects.requireNonNull(obj4);
                        for (List list : (List) obj4) {
                            C0818u c0818u = (C0818u) list.get(0);
                            String str5 = (String) list.get(1);
                            Object obj5 = list.get(2);
                            if ("==".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.EQUAL, obj5));
                            } else if ("!=".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.NOT_EQUAL, obj5));
                            } else if ("<".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.LESS_THAN, obj5));
                            } else if ("<=".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.LESS_THAN_OR_EQUAL, obj5));
                            } else if (">".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.GREATER_THAN, obj5));
                            } else if (">=".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.GREATER_THAN_OR_EQUAL, obj5));
                            } else if ("array-contains".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.ARRAY_CONTAINS, obj5));
                            } else if ("array-contains-any".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.ARRAY_CONTAINS_ANY, (List) obj5));
                            } else if ("in".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.IN, (List) obj5));
                            } else if ("not-in".equals(str5)) {
                                b7.getClass();
                                b7 = b7.j(new com.google.firebase.firestore.C(c0818u, EnumC1528n.NOT_IN, (List) obj5));
                            } else {
                                Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str5 + " was received but not handled.");
                            }
                        }
                        Number number = (Number) map2.get("limit");
                        if (number != null) {
                            b7 = b7.d(number.longValue());
                        }
                        Number number2 = (Number) map2.get("limitToLast");
                        if (number2 != null) {
                            b7 = b7.e(number2.longValue());
                        }
                        List<List> list2 = (List) map2.get("orderBy");
                        if (list2 != null) {
                            for (List list3 : list2) {
                                C0818u c0818u2 = (C0818u) list3.get(0);
                                if (((Boolean) list3.get(1)).booleanValue()) {
                                    f0Var = f0.DESCENDING;
                                } else {
                                    f0Var = f0.ASCENDING;
                                }
                                b7 = b7.f(c0818u2, f0Var);
                            }
                            List list4 = (List) map2.get("startAt");
                            if (list4 == null) {
                                str = "FLTFirestoreMsgCodec";
                            } else {
                                Object[] array = list4.toArray();
                                Objects.requireNonNull(array);
                                C1517c b8 = b7.b("startAt", true, array);
                                n4.D d10 = b7.f9808a;
                                str = "FLTFirestoreMsgCodec";
                                try {
                                    b7 = new g0(new n4.D(d10.f, d10.f14276g, d10.f14275e, d10.f14271a, d10.f14277h, d10.f14278i, b8, d10.f14279k), b7.f9809b);
                                } catch (Exception e7) {
                                    e = e7;
                                    Log.e(str, "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e);
                                    return null;
                                }
                            }
                            List list5 = (List) map2.get("startAfter");
                            if (list5 != null) {
                                Object[] array2 = list5.toArray();
                                Objects.requireNonNull(array2);
                                C1517c b9 = b7.b("startAfter", false, array2);
                                n4.D d11 = b7.f9808a;
                                b7 = new g0(new n4.D(d11.f, d11.f14276g, d11.f14275e, d11.f14271a, d11.f14277h, d11.f14278i, b9, d11.f14279k), b7.f9809b);
                            }
                            List list6 = (List) map2.get("endAt");
                            if (list6 != null) {
                                Object[] array3 = list6.toArray();
                                Objects.requireNonNull(array3);
                                C1517c b10 = b7.b("endAt", true, array3);
                                n4.D d12 = b7.f9808a;
                                b7 = new g0(new n4.D(d12.f, d12.f14276g, d12.f14275e, d12.f14271a, d12.f14277h, d12.f14278i, d12.j, b10), b7.f9809b);
                            }
                            List list7 = (List) map2.get("endBefore");
                            if (list7 != null) {
                                Object[] array4 = list7.toArray();
                                Objects.requireNonNull(array4);
                                C1517c b11 = b7.b("endBefore", false, array4);
                                n4.D d13 = b7.f9808a;
                                return new g0(new n4.D(d13.f, d13.f14276g, d13.f14275e, d13.f14271a, d13.f14277h, d13.f14278i, d13.j, b11), b7.f9809b);
                            }
                            return b7;
                        }
                        return b7;
                    }
                    return b7;
                } catch (Exception e8) {
                    e = e8;
                    str = "FLTFirestoreMsgCodec";
                }
            case -58:
                Map map3 = (Map) e(byteBuffer);
                K k2 = new K();
                if (map3.get("persistenceEnabled") != null) {
                    if (Boolean.TRUE.equals((Boolean) map3.get("persistenceEnabled"))) {
                        long j = 104857600;
                        if (map3.get("cacheSizeBytes") != null) {
                            Long l9 = 104857600L;
                            Object obj6 = map3.get("cacheSizeBytes");
                            if (obj6 instanceof Long) {
                                l9 = (Long) obj6;
                            } else if (obj6 instanceof Integer) {
                                l9 = Long.valueOf(((Integer) obj6).intValue());
                            }
                            if (l9.longValue() == -1) {
                                j = -1;
                            } else {
                                j = l9.longValue();
                            }
                        }
                        k2.b(new b0(j));
                    } else {
                        Z z7 = new Z(0);
                        ?? obj7 = new Object();
                        obj7.f9797a = z7;
                        k2.b(obj7);
                    }
                }
                if (map3.get("host") != null) {
                    Object obj8 = map3.get("host");
                    Objects.requireNonNull(obj8);
                    k2.f9764a = (String) obj8;
                    if (map3.get("sslEnabled") != null) {
                        Object obj9 = map3.get("sslEnabled");
                        Objects.requireNonNull(obj9);
                        k2.f9765b = ((Boolean) obj9).booleanValue();
                    }
                }
                return k2.a();
            case -57:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                double[] dArr = new double[arrayList2.size()];
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    Double d14 = (Double) arrayList2.get(i8);
                    Objects.requireNonNull(d14, "Null value at index " + i8);
                    dArr[i8] = d14.doubleValue();
                }
                return new s0(dArr);
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // L5.x
    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object obj2;
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-76);
            L5.x.i(byteArrayOutputStream, ((Date) obj).getTime());
        } else if (obj instanceof U3.p) {
            byteArrayOutputStream.write(-68);
            U3.p pVar = (U3.p) obj;
            L5.x.i(byteArrayOutputStream, pVar.f5765a);
            L5.x.h(byteArrayOutputStream, pVar.f5766b);
        } else if (obj instanceof N) {
            byteArrayOutputStream.write(-75);
            L5.x.g(byteArrayOutputStream, 8);
            N n7 = (N) obj;
            L5.x.i(byteArrayOutputStream, Double.doubleToLongBits(n7.f9779a));
            L5.x.i(byteArrayOutputStream, Double.doubleToLongBits(n7.f9780b));
        } else if (obj instanceof s0) {
            byteArrayOutputStream.write(-57);
            k(byteArrayOutputStream, (double[]) ((s0) obj).f9848a.clone());
        } else if (obj instanceof C0814p) {
            byteArrayOutputStream.write(-74);
            C0814p c0814p = (C0814p) obj;
            FirebaseFirestore firebaseFirestore = c0814p.f9839b;
            U3.h hVar = firebaseFirestore.f9751g;
            hVar.a();
            k(byteArrayOutputStream, hVar.f5750b);
            k(byteArrayOutputStream, c0814p.d());
            synchronized (C1162g.f11922Y) {
                obj2 = C1162g.b(firebaseFirestore).f11915b;
            }
            k(byteArrayOutputStream, obj2);
        } else {
            boolean z7 = false;
            String str = null;
            if (obj instanceof com.google.firebase.firestore.r) {
                com.google.firebase.firestore.r rVar = (com.google.firebase.firestore.r) obj;
                HashMap hashMap = new HashMap();
                q4.h hVar2 = rVar.f9844b;
                hVar2.getClass();
                hashMap.put("path", hVar2.f15357a.c());
                if (rVar.f9845c != null) {
                    z7 = true;
                }
                if (z7) {
                    EnumC0815q enumC0815q = (EnumC0815q) C1162g.f11923Z.get(Integer.valueOf(rVar.hashCode()));
                    if (enumC0815q != null) {
                        hashMap.put("data", rVar.a(enumC0815q));
                    } else {
                        hashMap.put("data", rVar.b());
                    }
                } else {
                    hashMap.put("data", null);
                }
                hashMap.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, rVar.f9846d);
                C1162g.f11923Z.remove(Integer.valueOf(rVar.hashCode()));
                k(byteArrayOutputStream, hashMap);
            } else if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                ArrayList arrayList = new ArrayList();
                HashMap hashMap2 = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                EnumC0815q enumC0815q2 = (EnumC0815q) C1162g.f11923Z.get(Integer.valueOf(j0Var.hashCode()));
                Iterator it = j0Var.f().iterator();
                while (it.hasNext()) {
                    com.google.firebase.firestore.r rVar2 = (com.google.firebase.firestore.r) it.next();
                    q4.h hVar3 = rVar2.f9844b;
                    hVar3.getClass();
                    arrayList.add(hVar3.f15357a.c());
                    if (enumC0815q2 != null) {
                        arrayList2.add(rVar2.a(enumC0815q2));
                    } else {
                        arrayList2.add(rVar2.b());
                    }
                    arrayList3.add(rVar2.f9846d);
                }
                hashMap2.put("paths", arrayList);
                hashMap2.put("documents", arrayList2);
                hashMap2.put("metadatas", arrayList3);
                hashMap2.put("documentChanges", j0Var.e());
                hashMap2.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, j0Var.f);
                C1162g.f11923Z.remove(Integer.valueOf(j0Var.hashCode()));
                k(byteArrayOutputStream, hashMap2);
            } else if (obj instanceof C0810l) {
                C0810l c0810l = (C0810l) obj;
                HashMap hashMap3 = new HashMap();
                int i7 = AbstractC1159d.f11916a[c0810l.f9820a.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            str = "DocumentChangeType.removed";
                        }
                    } else {
                        str = "DocumentChangeType.modified";
                    }
                } else {
                    str = "DocumentChangeType.added";
                }
                hashMap3.put("type", str);
                h0 h0Var = c0810l.f9821b;
                hashMap3.put("data", h0Var.b());
                q4.h hVar4 = h0Var.f9844b;
                hVar4.getClass();
                hashMap3.put("path", hVar4.f15357a.c());
                hashMap3.put("oldIndex", Integer.valueOf(c0810l.f9822c));
                hashMap3.put("newIndex", Integer.valueOf(c0810l.f9823d));
                hashMap3.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, h0Var.f9846d);
                k(byteArrayOutputStream, hashMap3);
            } else if (obj instanceof W) {
                W w2 = (W) obj;
                HashMap hashMap4 = new HashMap();
                hashMap4.put("bytesLoaded", Long.valueOf(w2.f9794c));
                hashMap4.put("documentsLoaded", Integer.valueOf(w2.f9792a));
                hashMap4.put("totalBytes", Long.valueOf(w2.f9795d));
                hashMap4.put("totalDocuments", Integer.valueOf(w2.f9793b));
                int i8 = AbstractC1159d.f11917b[w2.f9796e.ordinal()];
                String str2 = "running";
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            str2 = "error";
                        }
                    } else {
                        str2 = "success";
                    }
                }
                hashMap4.put("taskState", str2);
                k(byteArrayOutputStream, hashMap4);
            } else if (obj instanceof m0) {
                m0 m0Var = (m0) obj;
                HashMap hashMap5 = new HashMap();
                hashMap5.put("hasPendingWrites", Boolean.valueOf(m0Var.f9828a));
                hashMap5.put("isFromCache", Boolean.valueOf(m0Var.f9829b));
                k(byteArrayOutputStream, hashMap5);
            } else if (obj instanceof C0806h) {
                byteArrayOutputStream.write(-73);
                byte[] v6 = ((C0806h) obj).f9810a.v();
                L5.x.j(byteArrayOutputStream, v6.length);
                byteArrayOutputStream.write(v6, 0, v6.length);
            } else if (obj instanceof Double) {
                Double d7 = (Double) obj;
                if (Double.isNaN(d7.doubleValue())) {
                    byteArrayOutputStream.write(-63);
                } else if (d7.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
                    byteArrayOutputStream.write(-61);
                } else if (d7.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
                    byteArrayOutputStream.write(-62);
                } else {
                    super.k(byteArrayOutputStream, obj);
                }
            } else {
                super.k(byteArrayOutputStream, obj);
            }
        }
    }
}
