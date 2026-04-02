package T5;

import H4.e1;
import com.google.firebase.firestore.Z;
import java.util.List;
import org.apache.tika.utils.StringUtils;
/* renamed from: T5.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0347f f5433a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final l6.g f5434b = m5.d.m(C0346e.f5432a);

    public static L5.n a() {
        return (L5.n) f5434b.a();
    }

    public static void b(L5.f binaryMessenger, final InterfaceC0348g interfaceC0348g, String str) {
        String str2;
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        if (str.length() > 0) {
            str2 = ".".concat(str);
        } else {
            str2 = StringUtils.EMPTY;
        }
        Z f = binaryMessenger.f();
        E.e eVar = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar2.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar3.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar4.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
        E.e eVar5 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar5.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar5.h0(null);
        }
        E.e eVar6 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar6.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar6.h0(null);
        }
        E.e eVar7 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar7.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar7.h0(null);
        }
        E.e eVar8 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar8.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar8.h0(null);
        }
        E.e eVar9 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar9.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar9.h0(null);
        }
        E.e eVar10 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar10.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar10.h0(null);
        }
        E.e eVar11 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar11.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar11.h0(null);
        }
        E.e eVar12 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar12.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar12.h0(null);
        }
        E.e eVar13 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar13.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar13.h0(null);
        }
        E.e eVar14 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar14.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar14.h0(null);
        }
        E.e eVar15 = new E.e(binaryMessenger, io.flutter.plugins.pathprovider.b.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", str2), a(), f, 4);
        if (interfaceC0348g != null) {
            eVar15.h0(new L5.b() { // from class: T5.d
                @Override // L5.b
                public final void j(Object obj, A.f fVar) {
                    List d7;
                    List d8;
                    List d9;
                    List d10;
                    List d11;
                    List d12;
                    List d13;
                    List d14;
                    List d15;
                    List d16;
                    List d17;
                    List d18;
                    List d19;
                    List d20;
                    List d21;
                    switch (r2) {
                        case 0:
                            InterfaceC0348g interfaceC0348g2 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj3).booleanValue();
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g2.W(str3, booleanValue, (C0349h) obj4);
                                d7 = G.i.A(null);
                            } catch (Throwable th) {
                                d7 = F.f.d(th);
                            }
                            fVar.h(d7);
                            return;
                        case 1:
                            InterfaceC0348g interfaceC0348g3 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g3.J(str4, list3, (C0349h) obj7);
                                d8 = G.i.A(null);
                            } catch (Throwable th2) {
                                d8 = F.f.d(th2);
                            }
                            fVar.h(d8);
                            return;
                        case 2:
                            InterfaceC0348g interfaceC0348g4 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d9 = G.i.A(interfaceC0348g4.Z(str5, (C0349h) obj9));
                            } catch (Throwable th3) {
                                d9 = F.f.d(th3);
                            }
                            fVar.h(d9);
                            return;
                        case 3:
                            InterfaceC0348g interfaceC0348g5 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d10 = G.i.A(interfaceC0348g5.a0(str6, (C0349h) obj11));
                            } catch (Throwable th4) {
                                d10 = F.f.d(th4);
                            }
                            fVar.h(d10);
                            return;
                        case 4:
                            InterfaceC0348g interfaceC0348g6 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d11 = G.i.A(interfaceC0348g6.U(str7, (C0349h) obj13));
                            } catch (Throwable th5) {
                                d11 = F.f.d(th5);
                            }
                            fVar.h(d11);
                            return;
                        case 5:
                            InterfaceC0348g interfaceC0348g7 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d12 = G.i.A(interfaceC0348g7.R(str8, (C0349h) obj15));
                            } catch (Throwable th6) {
                                d12 = F.f.d(th6);
                            }
                            fVar.h(d12);
                            return;
                        case 6:
                            InterfaceC0348g interfaceC0348g8 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d13 = G.i.A(interfaceC0348g8.P(str9, (C0349h) obj17));
                            } catch (Throwable th7) {
                                d13 = F.f.d(th7);
                            }
                            fVar.h(d13);
                            return;
                        case 7:
                            InterfaceC0348g interfaceC0348g9 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d14 = G.i.A(interfaceC0348g9.l(str10, (C0349h) obj19));
                            } catch (Throwable th8) {
                                d14 = F.f.d(th8);
                            }
                            fVar.h(d14);
                            return;
                        case 8:
                            InterfaceC0348g interfaceC0348g10 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            List list11 = (List) list10.get(0);
                            Object obj20 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g10.q(list11, (C0349h) obj20);
                                d15 = G.i.A(null);
                            } catch (Throwable th9) {
                                d15 = F.f.d(th9);
                            }
                            fVar.h(d15);
                            return;
                        case 9:
                            InterfaceC0348g interfaceC0348g11 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            List list13 = (List) list12.get(0);
                            Object obj21 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d16 = G.i.A(interfaceC0348g11.B(list13, (C0349h) obj21));
                            } catch (Throwable th10) {
                                d16 = F.f.d(th10);
                            }
                            fVar.h(d16);
                            return;
                        case 10:
                            InterfaceC0348g interfaceC0348g12 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj;
                            List list15 = (List) list14.get(0);
                            Object obj22 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                d17 = G.i.A(interfaceC0348g12.G(list15, (C0349h) obj22));
                            } catch (Throwable th11) {
                                d17 = F.f.d(th11);
                            }
                            fVar.h(d17);
                            return;
                        case 11:
                            InterfaceC0348g interfaceC0348g13 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj23 = list16.get(0);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj23;
                            Object obj24 = list16.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj24;
                            Object obj25 = list16.get(2);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g13.C(str11, str12, (C0349h) obj25);
                                d18 = G.i.A(null);
                            } catch (Throwable th12) {
                                d18 = F.f.d(th12);
                            }
                            fVar.h(d18);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            InterfaceC0348g interfaceC0348g14 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g14.m(str13, longValue, (C0349h) obj28);
                                d19 = G.i.A(null);
                            } catch (Throwable th13) {
                                d19 = F.f.d(th13);
                            }
                            fVar.h(d19);
                            return;
                        case 13:
                            InterfaceC0348g interfaceC0348g15 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj30).doubleValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g15.Y(str14, doubleValue, (C0349h) obj31);
                                d20 = G.i.A(null);
                            } catch (Throwable th14) {
                                d20 = F.f.d(th14);
                            }
                            fVar.h(d20);
                            return;
                        default:
                            InterfaceC0348g interfaceC0348g16 = interfaceC0348g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj33;
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0348g16.p(str15, str16, (C0349h) obj34);
                                d21 = G.i.A(null);
                            } catch (Throwable th15) {
                                d21 = F.f.d(th15);
                            }
                            fVar.h(d21);
                            return;
                    }
                }
            });
        } else {
            eVar15.h0(null);
        }
    }
}
