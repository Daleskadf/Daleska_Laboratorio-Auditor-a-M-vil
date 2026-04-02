package io.flutter.plugins.firebase.firestore;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class p extends C1160e {

    /* renamed from: e  reason: collision with root package name */
    public static final p f11943e = new Object();

    /* JADX WARN: Type inference failed for: r10v1, types: [io.flutter.plugins.firebase.firestore.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [io.flutter.plugins.firebase.firestore.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, io.flutter.plugins.firebase.firestore.z] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, io.flutter.plugins.firebase.firestore.A] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, io.flutter.plugins.firebase.firestore.j] */
    /* JADX WARN: Type inference failed for: r10v20, types: [io.flutter.plugins.firebase.firestore.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [io.flutter.plugins.firebase.firestore.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, io.flutter.plugins.firebase.firestore.q] */
    /* JADX WARN: Type inference failed for: r10v8, types: [io.flutter.plugins.firebase.firestore.u, java.lang.Object] */
    @Override // io.flutter.plugins.firebase.firestore.C1160e, L5.x
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        v a7;
        G g3;
        w a8;
        long longValue;
        Long valueOf;
        long longValue2;
        long longValue3;
        Long valueOf2;
        long longValue4;
        F f = null;
        v vVar = null;
        B b7 = null;
        Long l8 = null;
        Long l9 = null;
        x xVar = null;
        switch (b5) {
            case Byte.MIN_VALUE:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                ?? obj = new Object();
                l lVar = l.values()[((Integer) arrayList.get(0)).intValue()];
                if (lVar != null) {
                    obj.f11931a = lVar;
                    obj.f11932b = (String) arrayList.get(1);
                    return obj;
                }
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            case -127:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                ?? obj2 = new Object();
                obj2.a(l.values()[((Integer) arrayList2.get(0)).intValue()]);
                obj2.f11934b = (String) arrayList2.get(1);
                obj2.f11935c = (Double) arrayList2.get(2);
                return obj2;
            case -126:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                ?? obj3 = new Object();
                String str = (String) arrayList3.get(0);
                if (str != null) {
                    obj3.f11936a = str;
                    obj3.f11937b = (Map) arrayList3.get(1);
                    Object obj4 = arrayList3.get(2);
                    if (obj4 == null) {
                        a7 = null;
                    } else {
                        a7 = v.a((ArrayList) obj4);
                    }
                    obj3.f11938c = a7;
                    Object obj5 = arrayList3.get(3);
                    if (obj5 == null) {
                        g3 = null;
                    } else {
                        g3 = G.values()[((Integer) obj5).intValue()];
                    }
                    obj3.f11939d = g3;
                    Object obj6 = arrayList3.get(4);
                    if (obj6 != null) {
                        f = F.values()[((Integer) obj6).intValue()];
                    }
                    obj3.f11940e = f;
                    return obj3;
                }
                throw new IllegalStateException("Nonnull field \"path\" is null.");
            case -125:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                ?? obj7 = new Object();
                String str2 = (String) arrayList4.get(0);
                if (str2 != null) {
                    obj7.f11944a = str2;
                    Object obj8 = arrayList4.get(1);
                    if (obj8 != null) {
                        xVar = x.a((ArrayList) obj8);
                    }
                    if (xVar != null) {
                        obj7.f11945b = xVar;
                        String str3 = (String) arrayList4.get(2);
                        if (str3 != null) {
                            obj7.f11946c = str3;
                            return obj7;
                        }
                        throw new IllegalStateException("Nonnull field \"databaseURL\" is null.");
                    }
                    throw new IllegalStateException("Nonnull field \"settings\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            case -124:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                ?? obj9 = new Object();
                m mVar = m.values()[((Integer) arrayList5.get(0)).intValue()];
                if (mVar != null) {
                    obj9.f11949a = mVar;
                    Object obj10 = arrayList5.get(1);
                    if (obj10 == null) {
                        a8 = null;
                    } else {
                        a8 = w.a((ArrayList) obj10);
                    }
                    if (a8 != null) {
                        obj9.f11950b = a8;
                        Object obj11 = arrayList5.get(2);
                        if (obj11 == null) {
                            valueOf = null;
                        } else {
                            if (obj11 instanceof Integer) {
                                longValue = ((Integer) obj11).intValue();
                            } else {
                                longValue = ((Long) obj11).longValue();
                            }
                            valueOf = Long.valueOf(longValue);
                        }
                        if (valueOf != null) {
                            obj9.f11951c = valueOf;
                            Object obj12 = arrayList5.get(3);
                            if (obj12 != null) {
                                if (obj12 instanceof Integer) {
                                    longValue2 = ((Integer) obj12).intValue();
                                } else {
                                    longValue2 = ((Long) obj12).longValue();
                                }
                                l9 = Long.valueOf(longValue2);
                            }
                            if (l9 != null) {
                                obj9.f11952d = l9;
                                return obj9;
                            }
                            throw new IllegalStateException("Nonnull field \"newIndex\" is null.");
                        }
                        throw new IllegalStateException("Nonnull field \"oldIndex\" is null.");
                    }
                    throw new IllegalStateException("Nonnull field \"document\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            case -123:
                return v.a((ArrayList) e(byteBuffer));
            case -122:
                return w.a((ArrayList) e(byteBuffer));
            case -121:
                return x.a((ArrayList) e(byteBuffer));
            case -120:
                ArrayList arrayList6 = (ArrayList) e(byteBuffer);
                ?? obj13 = new Object();
                G g4 = G.values()[((Integer) arrayList6.get(0)).intValue()];
                if (g4 != null) {
                    obj13.f11963a = g4;
                    F f4 = F.values()[((Integer) arrayList6.get(1)).intValue()];
                    if (f4 != null) {
                        obj13.f11964b = f4;
                        return obj13;
                    }
                    throw new IllegalStateException("Nonnull field \"serverTimestampBehavior\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"source\" is null.");
            case -119:
                ArrayList arrayList7 = (ArrayList) e(byteBuffer);
                ?? obj14 = new Object();
                obj14.f11965a = (List) arrayList7.get(0);
                obj14.f11966b = (List) arrayList7.get(1);
                Object obj15 = arrayList7.get(2);
                if (obj15 == null) {
                    valueOf2 = null;
                } else {
                    if (obj15 instanceof Integer) {
                        longValue3 = ((Integer) obj15).intValue();
                    } else {
                        longValue3 = ((Long) obj15).longValue();
                    }
                    valueOf2 = Long.valueOf(longValue3);
                }
                obj14.f11967c = valueOf2;
                Object obj16 = arrayList7.get(3);
                if (obj16 != null) {
                    if (obj16 instanceof Integer) {
                        longValue4 = ((Integer) obj16).intValue();
                    } else {
                        longValue4 = ((Long) obj16).longValue();
                    }
                    l8 = Long.valueOf(longValue4);
                }
                obj14.f11968d = l8;
                obj14.f11969e = (List) arrayList7.get(4);
                obj14.f = (List) arrayList7.get(5);
                obj14.f11970g = (List) arrayList7.get(6);
                obj14.f11971h = (List) arrayList7.get(7);
                obj14.f11972i = (Map) arrayList7.get(8);
                return obj14;
            case -118:
                ArrayList arrayList8 = (ArrayList) e(byteBuffer);
                ?? obj17 = new Object();
                List list = (List) arrayList8.get(0);
                if (list != null) {
                    obj17.f11902a = list;
                    List list2 = (List) arrayList8.get(1);
                    if (list2 != null) {
                        obj17.f11903b = list2;
                        Object obj18 = arrayList8.get(2);
                        if (obj18 != null) {
                            b7 = B.a((ArrayList) obj18);
                        }
                        if (b7 != null) {
                            obj17.f11904c = b7;
                            return obj17;
                        }
                        throw new IllegalStateException("Nonnull field \"metadata\" is null.");
                    }
                    throw new IllegalStateException("Nonnull field \"documentChanges\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"documents\" is null.");
            case -117:
                return B.a((ArrayList) e(byteBuffer));
            case -116:
                ArrayList arrayList9 = (ArrayList) e(byteBuffer);
                ?? obj19 = new Object();
                E e7 = E.values()[((Integer) arrayList9.get(0)).intValue()];
                if (e7 != null) {
                    obj19.f11907a = e7;
                    String str4 = (String) arrayList9.get(1);
                    if (str4 != null) {
                        obj19.f11908b = str4;
                        obj19.f11909c = (Map) arrayList9.get(2);
                        Object obj20 = arrayList9.get(3);
                        if (obj20 != null) {
                            vVar = v.a((ArrayList) obj20);
                        }
                        obj19.f11910d = vVar;
                        return obj19;
                    }
                    throw new IllegalStateException("Nonnull field \"path\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // io.flutter.plugins.firebase.firestore.C1160e, L5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Integer valueOf;
        Integer valueOf2;
        ArrayList b5;
        Integer valueOf3;
        Object obj2 = null;
        if (obj instanceof i) {
            byteArrayOutputStream.write(RecognitionOptions.ITF);
            i iVar = (i) obj;
            iVar.getClass();
            ArrayList arrayList = new ArrayList(2);
            l lVar = iVar.f11931a;
            if (lVar != null) {
                obj2 = Integer.valueOf(lVar.index);
            }
            arrayList.add(obj2);
            arrayList.add(iVar.f11932b);
            k(byteArrayOutputStream, arrayList);
        } else if (obj instanceof j) {
            byteArrayOutputStream.write(129);
            j jVar = (j) obj;
            jVar.getClass();
            ArrayList arrayList2 = new ArrayList(3);
            l lVar2 = jVar.f11933a;
            if (lVar2 != null) {
                obj2 = Integer.valueOf(lVar2.index);
            }
            arrayList2.add(obj2);
            arrayList2.add(jVar.f11934b);
            arrayList2.add(jVar.f11935c);
            k(byteArrayOutputStream, arrayList2);
        } else if (obj instanceof n) {
            byteArrayOutputStream.write(130);
            n nVar = (n) obj;
            nVar.getClass();
            ArrayList arrayList3 = new ArrayList(5);
            arrayList3.add(nVar.f11936a);
            arrayList3.add(nVar.f11937b);
            v vVar = nVar.f11938c;
            if (vVar == null) {
                b5 = null;
            } else {
                b5 = vVar.b();
            }
            arrayList3.add(b5);
            G g3 = nVar.f11939d;
            if (g3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(g3.index);
            }
            arrayList3.add(valueOf3);
            F f = nVar.f11940e;
            if (f != null) {
                obj2 = Integer.valueOf(f.index);
            }
            arrayList3.add(obj2);
            k(byteArrayOutputStream, arrayList3);
        } else if (obj instanceof q) {
            byteArrayOutputStream.write(131);
            q qVar = (q) obj;
            qVar.getClass();
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(qVar.f11944a);
            x xVar = qVar.f11945b;
            if (xVar != null) {
                obj2 = xVar.b();
            }
            arrayList4.add(obj2);
            arrayList4.add(qVar.f11946c);
            k(byteArrayOutputStream, arrayList4);
        } else if (obj instanceof u) {
            byteArrayOutputStream.write(132);
            k(byteArrayOutputStream, ((u) obj).a());
        } else if (obj instanceof v) {
            byteArrayOutputStream.write(133);
            k(byteArrayOutputStream, ((v) obj).b());
        } else if (obj instanceof w) {
            byteArrayOutputStream.write(134);
            k(byteArrayOutputStream, ((w) obj).b());
        } else if (obj instanceof x) {
            byteArrayOutputStream.write(135);
            k(byteArrayOutputStream, ((x) obj).b());
        } else if (obj instanceof y) {
            byteArrayOutputStream.write(136);
            y yVar = (y) obj;
            yVar.getClass();
            ArrayList arrayList5 = new ArrayList(2);
            G g4 = yVar.f11963a;
            if (g4 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(g4.index);
            }
            arrayList5.add(valueOf2);
            F f4 = yVar.f11964b;
            if (f4 != null) {
                obj2 = Integer.valueOf(f4.index);
            }
            arrayList5.add(obj2);
            k(byteArrayOutputStream, arrayList5);
        } else if (obj instanceof z) {
            byteArrayOutputStream.write(137);
            z zVar = (z) obj;
            zVar.getClass();
            ArrayList arrayList6 = new ArrayList(9);
            arrayList6.add(zVar.f11965a);
            arrayList6.add(zVar.f11966b);
            arrayList6.add(zVar.f11967c);
            arrayList6.add(zVar.f11968d);
            arrayList6.add(zVar.f11969e);
            arrayList6.add(zVar.f);
            arrayList6.add(zVar.f11970g);
            arrayList6.add(zVar.f11971h);
            arrayList6.add(zVar.f11972i);
            k(byteArrayOutputStream, arrayList6);
        } else if (obj instanceof A) {
            byteArrayOutputStream.write(138);
            A a7 = (A) obj;
            a7.getClass();
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(a7.f11902a);
            arrayList7.add(a7.f11903b);
            B b7 = a7.f11904c;
            if (b7 != null) {
                obj2 = b7.b();
            }
            arrayList7.add(obj2);
            k(byteArrayOutputStream, arrayList7);
        } else if (obj instanceof B) {
            byteArrayOutputStream.write(139);
            k(byteArrayOutputStream, ((B) obj).b());
        } else if (obj instanceof C) {
            byteArrayOutputStream.write(140);
            C c8 = (C) obj;
            c8.getClass();
            ArrayList arrayList8 = new ArrayList(4);
            E e7 = c8.f11907a;
            if (e7 == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(e7.index);
            }
            arrayList8.add(valueOf);
            arrayList8.add(c8.f11908b);
            arrayList8.add(c8.f11909c);
            v vVar2 = c8.f11910d;
            if (vVar2 != null) {
                obj2 = vVar2.b();
            }
            arrayList8.add(obj2);
            k(byteArrayOutputStream, arrayList8);
        } else {
            super.k(byteArrayOutputStream, obj);
        }
    }
}
