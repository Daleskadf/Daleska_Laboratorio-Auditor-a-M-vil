package io.flutter.plugins.firebase.auth;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* renamed from: io.flutter.plugins.firebase.auth.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152o extends L5.x {

    /* renamed from: e  reason: collision with root package name */
    public static final C1152o f11880e = new C1152o(0);
    public static final C1152o f = new C1152o(1);

    /* renamed from: g  reason: collision with root package name */
    public static final C1152o f11881g = new C1152o(2);

    /* renamed from: h  reason: collision with root package name */
    public static final C1152o f11882h = new C1152o(3);

    /* renamed from: i  reason: collision with root package name */
    public static final C1152o f11883i = new C1152o(4);

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f11884d;

    public /* synthetic */ C1152o(int i7) {
        this.f11884d = i7;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [io.flutter.plugins.firebase.auth.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [io.flutter.plugins.firebase.auth.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.flutter.plugins.firebase.auth.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [io.flutter.plugins.firebase.auth.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [io.flutter.plugins.firebase.auth.G, java.lang.Object] */
    @Override // L5.x
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        Object obj;
        Object obj2;
        switch (this.f11884d) {
            case 0:
                switch (b5) {
                    case Byte.MIN_VALUE:
                        return C1150m.a((ArrayList) e(byteBuffer));
                    case -127:
                        return y.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList = (ArrayList) e(byteBuffer);
                        ?? obj3 = new Object();
                        obj3.f11900a = (String) arrayList.get(0);
                        obj3.f11901b = (String) arrayList.get(1);
                        obj = obj3;
                        break;
                    case -125:
                        return A.a((ArrayList) e(byteBuffer));
                    case -124:
                        return B.a((ArrayList) e(byteBuffer));
                    case -123:
                        return C.a((ArrayList) e(byteBuffer));
                    case -122:
                        return D.a((ArrayList) e(byteBuffer));
                    case -121:
                        return E.a((ArrayList) e(byteBuffer));
                    case -120:
                        return F.a((ArrayList) e(byteBuffer));
                    case -119:
                        ?? obj4 = new Object();
                        String str = (String) ((ArrayList) e(byteBuffer)).get(0);
                        if (str != null) {
                            obj4.f11792a = str;
                            obj = obj4;
                            break;
                        } else {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                    case -118:
                        return H.a((ArrayList) e(byteBuffer));
                    case -117:
                        return I.a((ArrayList) e(byteBuffer));
                    case -116:
                        return J.a((ArrayList) e(byteBuffer));
                    case -115:
                        return K.a((ArrayList) e(byteBuffer));
                    case -114:
                        return L.a((ArrayList) e(byteBuffer));
                    case -113:
                        return M.a((ArrayList) e(byteBuffer));
                    case -112:
                        return N.a((ArrayList) e(byteBuffer));
                    case -111:
                        return O.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b5, byteBuffer);
                }
                return obj;
            case 1:
                switch (b5) {
                    case Byte.MIN_VALUE:
                        return C1150m.a((ArrayList) e(byteBuffer));
                    case -127:
                        return y.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                        ?? obj5 = new Object();
                        obj5.f11900a = (String) arrayList2.get(0);
                        obj5.f11901b = (String) arrayList2.get(1);
                        obj2 = obj5;
                        break;
                    case -125:
                        return A.a((ArrayList) e(byteBuffer));
                    case -124:
                        return B.a((ArrayList) e(byteBuffer));
                    case -123:
                        return C.a((ArrayList) e(byteBuffer));
                    case -122:
                        return D.a((ArrayList) e(byteBuffer));
                    case -121:
                        return E.a((ArrayList) e(byteBuffer));
                    case -120:
                        return F.a((ArrayList) e(byteBuffer));
                    case -119:
                        ?? obj6 = new Object();
                        String str2 = (String) ((ArrayList) e(byteBuffer)).get(0);
                        if (str2 != null) {
                            obj6.f11792a = str2;
                            obj2 = obj6;
                            break;
                        } else {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                    case -118:
                        return H.a((ArrayList) e(byteBuffer));
                    case -117:
                        return I.a((ArrayList) e(byteBuffer));
                    case -116:
                        return J.a((ArrayList) e(byteBuffer));
                    case -115:
                        return K.a((ArrayList) e(byteBuffer));
                    case -114:
                        return L.a((ArrayList) e(byteBuffer));
                    case -113:
                        return M.a((ArrayList) e(byteBuffer));
                    case -112:
                        return N.a((ArrayList) e(byteBuffer));
                    case -111:
                        return O.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b5, byteBuffer);
                }
                return obj2;
            case 2:
                switch (b5) {
                    case Byte.MIN_VALUE:
                        return B.a((ArrayList) e(byteBuffer));
                    case -127:
                        return C.a((ArrayList) e(byteBuffer));
                    case -126:
                        return H.a((ArrayList) e(byteBuffer));
                    case -125:
                        return K.a((ArrayList) e(byteBuffer));
                    case -124:
                        return L.a((ArrayList) e(byteBuffer));
                    case -123:
                        return M.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b5, byteBuffer);
                }
            case 3:
                if (b5 != Byte.MIN_VALUE) {
                    return super.f(b5, byteBuffer);
                }
                return J.a((ArrayList) e(byteBuffer));
            default:
                switch (b5) {
                    case Byte.MIN_VALUE:
                        return C1150m.a((ArrayList) e(byteBuffer));
                    case -127:
                        return F.a((ArrayList) e(byteBuffer));
                    case -126:
                        ?? obj7 = new Object();
                        String str3 = (String) ((ArrayList) e(byteBuffer)).get(0);
                        if (str3 != null) {
                            obj7.f11792a = str3;
                            return obj7;
                        }
                        throw new IllegalStateException("Nonnull field \"id\" is null.");
                    case -125:
                        return H.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b5, byteBuffer);
                }
        }
    }

    @Override // L5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Integer valueOf;
        Integer valueOf2;
        switch (this.f11884d) {
            case 0:
                if (obj instanceof C1150m) {
                    byteArrayOutputStream.write(RecognitionOptions.ITF);
                    k(byteArrayOutputStream, ((C1150m) obj).b());
                    return;
                } else if (obj instanceof y) {
                    byteArrayOutputStream.write(129);
                    y yVar = (y) obj;
                    yVar.getClass();
                    ArrayList arrayList = new ArrayList(2);
                    EnumC1149l enumC1149l = yVar.f11898a;
                    if (enumC1149l == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(enumC1149l.index);
                    }
                    arrayList.add(valueOf);
                    arrayList.add(yVar.f11899b);
                    k(byteArrayOutputStream, arrayList);
                    return;
                } else if (obj instanceof z) {
                    byteArrayOutputStream.write(130);
                    z zVar = (z) obj;
                    zVar.getClass();
                    ArrayList arrayList2 = new ArrayList(2);
                    arrayList2.add(zVar.f11900a);
                    arrayList2.add(zVar.f11901b);
                    k(byteArrayOutputStream, arrayList2);
                    return;
                } else if (obj instanceof A) {
                    byteArrayOutputStream.write(131);
                    k(byteArrayOutputStream, ((A) obj).b());
                    return;
                } else if (obj instanceof B) {
                    byteArrayOutputStream.write(132);
                    k(byteArrayOutputStream, ((B) obj).b());
                    return;
                } else if (obj instanceof C) {
                    byteArrayOutputStream.write(133);
                    k(byteArrayOutputStream, ((C) obj).b());
                    return;
                } else if (obj instanceof D) {
                    byteArrayOutputStream.write(134);
                    k(byteArrayOutputStream, ((D) obj).b());
                    return;
                } else if (obj instanceof E) {
                    byteArrayOutputStream.write(135);
                    k(byteArrayOutputStream, ((E) obj).b());
                    return;
                } else if (obj instanceof F) {
                    byteArrayOutputStream.write(136);
                    k(byteArrayOutputStream, ((F) obj).b());
                    return;
                } else if (obj instanceof G) {
                    byteArrayOutputStream.write(137);
                    G g3 = (G) obj;
                    g3.getClass();
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(g3.f11792a);
                    k(byteArrayOutputStream, arrayList3);
                    return;
                } else if (obj instanceof H) {
                    byteArrayOutputStream.write(138);
                    k(byteArrayOutputStream, ((H) obj).b());
                    return;
                } else if (obj instanceof I) {
                    byteArrayOutputStream.write(139);
                    I i7 = (I) obj;
                    i7.getClass();
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(i7.f11795a);
                    arrayList4.add(i7.f11796b);
                    arrayList4.add(i7.f11797c);
                    k(byteArrayOutputStream, arrayList4);
                    return;
                } else if (obj instanceof J) {
                    byteArrayOutputStream.write(140);
                    k(byteArrayOutputStream, ((J) obj).b());
                    return;
                } else if (obj instanceof K) {
                    byteArrayOutputStream.write(141);
                    k(byteArrayOutputStream, ((K) obj).b());
                    return;
                } else if (obj instanceof L) {
                    byteArrayOutputStream.write(142);
                    k(byteArrayOutputStream, ((L) obj).b());
                    return;
                } else if (obj instanceof M) {
                    byteArrayOutputStream.write(143);
                    k(byteArrayOutputStream, ((M) obj).b());
                    return;
                } else if (obj instanceof N) {
                    byteArrayOutputStream.write(144);
                    N n7 = (N) obj;
                    n7.getClass();
                    ArrayList arrayList5 = new ArrayList(4);
                    arrayList5.add(n7.f11818a);
                    arrayList5.add(n7.f11819b);
                    arrayList5.add(n7.f11820c);
                    arrayList5.add(n7.f11821d);
                    k(byteArrayOutputStream, arrayList5);
                    return;
                } else if (obj instanceof O) {
                    byteArrayOutputStream.write(145);
                    k(byteArrayOutputStream, ((O) obj).b());
                    return;
                } else {
                    super.k(byteArrayOutputStream, obj);
                    return;
                }
            case 1:
                if (obj instanceof C1150m) {
                    byteArrayOutputStream.write(RecognitionOptions.ITF);
                    k(byteArrayOutputStream, ((C1150m) obj).b());
                    return;
                } else if (obj instanceof y) {
                    byteArrayOutputStream.write(129);
                    y yVar2 = (y) obj;
                    yVar2.getClass();
                    ArrayList arrayList6 = new ArrayList(2);
                    EnumC1149l enumC1149l2 = yVar2.f11898a;
                    if (enumC1149l2 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(enumC1149l2.index);
                    }
                    arrayList6.add(valueOf2);
                    arrayList6.add(yVar2.f11899b);
                    k(byteArrayOutputStream, arrayList6);
                    return;
                } else if (obj instanceof z) {
                    byteArrayOutputStream.write(130);
                    z zVar2 = (z) obj;
                    zVar2.getClass();
                    ArrayList arrayList7 = new ArrayList(2);
                    arrayList7.add(zVar2.f11900a);
                    arrayList7.add(zVar2.f11901b);
                    k(byteArrayOutputStream, arrayList7);
                    return;
                } else if (obj instanceof A) {
                    byteArrayOutputStream.write(131);
                    k(byteArrayOutputStream, ((A) obj).b());
                    return;
                } else if (obj instanceof B) {
                    byteArrayOutputStream.write(132);
                    k(byteArrayOutputStream, ((B) obj).b());
                    return;
                } else if (obj instanceof C) {
                    byteArrayOutputStream.write(133);
                    k(byteArrayOutputStream, ((C) obj).b());
                    return;
                } else if (obj instanceof D) {
                    byteArrayOutputStream.write(134);
                    k(byteArrayOutputStream, ((D) obj).b());
                    return;
                } else if (obj instanceof E) {
                    byteArrayOutputStream.write(135);
                    k(byteArrayOutputStream, ((E) obj).b());
                    return;
                } else if (obj instanceof F) {
                    byteArrayOutputStream.write(136);
                    k(byteArrayOutputStream, ((F) obj).b());
                    return;
                } else if (obj instanceof G) {
                    byteArrayOutputStream.write(137);
                    G g4 = (G) obj;
                    g4.getClass();
                    ArrayList arrayList8 = new ArrayList(1);
                    arrayList8.add(g4.f11792a);
                    k(byteArrayOutputStream, arrayList8);
                    return;
                } else if (obj instanceof H) {
                    byteArrayOutputStream.write(138);
                    k(byteArrayOutputStream, ((H) obj).b());
                    return;
                } else if (obj instanceof I) {
                    byteArrayOutputStream.write(139);
                    I i8 = (I) obj;
                    i8.getClass();
                    ArrayList arrayList9 = new ArrayList(3);
                    arrayList9.add(i8.f11795a);
                    arrayList9.add(i8.f11796b);
                    arrayList9.add(i8.f11797c);
                    k(byteArrayOutputStream, arrayList9);
                    return;
                } else if (obj instanceof J) {
                    byteArrayOutputStream.write(140);
                    k(byteArrayOutputStream, ((J) obj).b());
                    return;
                } else if (obj instanceof K) {
                    byteArrayOutputStream.write(141);
                    k(byteArrayOutputStream, ((K) obj).b());
                    return;
                } else if (obj instanceof L) {
                    byteArrayOutputStream.write(142);
                    k(byteArrayOutputStream, ((L) obj).b());
                    return;
                } else if (obj instanceof M) {
                    byteArrayOutputStream.write(143);
                    k(byteArrayOutputStream, ((M) obj).b());
                    return;
                } else if (obj instanceof N) {
                    byteArrayOutputStream.write(144);
                    N n8 = (N) obj;
                    n8.getClass();
                    ArrayList arrayList10 = new ArrayList(4);
                    arrayList10.add(n8.f11818a);
                    arrayList10.add(n8.f11819b);
                    arrayList10.add(n8.f11820c);
                    arrayList10.add(n8.f11821d);
                    k(byteArrayOutputStream, arrayList10);
                    return;
                } else if (obj instanceof O) {
                    byteArrayOutputStream.write(145);
                    k(byteArrayOutputStream, ((O) obj).b());
                    return;
                } else {
                    super.k(byteArrayOutputStream, obj);
                    return;
                }
            case 2:
                if (obj instanceof B) {
                    byteArrayOutputStream.write(RecognitionOptions.ITF);
                    k(byteArrayOutputStream, ((B) obj).b());
                    return;
                } else if (obj instanceof C) {
                    byteArrayOutputStream.write(129);
                    k(byteArrayOutputStream, ((C) obj).b());
                    return;
                } else if (obj instanceof H) {
                    byteArrayOutputStream.write(130);
                    k(byteArrayOutputStream, ((H) obj).b());
                    return;
                } else if (obj instanceof K) {
                    byteArrayOutputStream.write(131);
                    k(byteArrayOutputStream, ((K) obj).b());
                    return;
                } else if (obj instanceof L) {
                    byteArrayOutputStream.write(132);
                    k(byteArrayOutputStream, ((L) obj).b());
                    return;
                } else if (obj instanceof M) {
                    byteArrayOutputStream.write(133);
                    k(byteArrayOutputStream, ((M) obj).b());
                    return;
                } else {
                    super.k(byteArrayOutputStream, obj);
                    return;
                }
            case 3:
                if (obj instanceof J) {
                    byteArrayOutputStream.write(RecognitionOptions.ITF);
                    k(byteArrayOutputStream, ((J) obj).b());
                    return;
                }
                super.k(byteArrayOutputStream, obj);
                return;
            default:
                if (obj instanceof C1150m) {
                    byteArrayOutputStream.write(RecognitionOptions.ITF);
                    k(byteArrayOutputStream, ((C1150m) obj).b());
                    return;
                } else if (obj instanceof F) {
                    byteArrayOutputStream.write(129);
                    k(byteArrayOutputStream, ((F) obj).b());
                    return;
                } else if (obj instanceof G) {
                    byteArrayOutputStream.write(130);
                    G g8 = (G) obj;
                    g8.getClass();
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(g8.f11792a);
                    k(byteArrayOutputStream, arrayList11);
                    return;
                } else if (obj instanceof H) {
                    byteArrayOutputStream.write(131);
                    k(byteArrayOutputStream, ((H) obj).b());
                    return;
                } else {
                    super.k(byteArrayOutputStream, obj);
                    return;
                }
        }
    }
}
