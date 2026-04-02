package org.slf4j.helpers;

import D.AbstractC0055e;
import F3.o;
import H0.I;
import H4.e1;
import H4.p1;
import U3.j;
import U3.l;
import X5.C0396w;
import a4.AbstractC0456e;
import a4.C0449B;
import a4.C0455d;
import a4.C0457f;
import a4.C0458g;
import a4.C0462k;
import a4.C0464m;
import a4.C0465n;
import a4.C0466o;
import a4.C0469s;
import a4.E;
import a4.K;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import b4.C0602j;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.auth.C1147j;
import io.flutter.plugins.firebase.auth.F;
import io.flutter.plugins.firebase.auth.r;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o4.AbstractC1562e;
import org.apache.tika.utils.XMLReaderUtils;
import x.p;
/* loaded from: classes.dex */
public abstract class i implements T0.g {

    /* renamed from: a  reason: collision with root package name */
    public static h f14635a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f14636b = false;

    /* renamed from: c  reason: collision with root package name */
    public static int f14637c = 3;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A(String str) {
        char c8;
        if (str == null) {
            return -1;
        }
        String l8 = I.l(str);
        l8.getClass();
        switch (l8.hashCode()) {
            case -2123537834:
                if (l8.equals("audio/eac3-joc")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -1662384011:
                if (l8.equals("video/mp2p")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -1662384007:
                if (l8.equals("video/mp2t")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -1662095187:
                if (l8.equals("video/webm")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -1606874997:
                if (l8.equals("audio/amr-wb")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case -1487656890:
                if (l8.equals("image/avif")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case -1487464693:
                if (l8.equals("image/heic")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case -1487464690:
                if (l8.equals("image/heif")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case -1487394660:
                if (l8.equals("image/jpeg")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case -1487018032:
                if (l8.equals("image/webp")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case -1248337486:
                if (l8.equals("application/mp4")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            case -1079884372:
                if (l8.equals("video/x-msvideo")) {
                    c8 = 11;
                    break;
                }
                c8 = 65535;
                break;
            case -1004728940:
                if (l8.equals("text/vtt")) {
                    c8 = '\f';
                    break;
                }
                c8 = 65535;
                break;
            case -879272239:
                if (l8.equals("image/bmp")) {
                    c8 = '\r';
                    break;
                }
                c8 = 65535;
                break;
            case -879258763:
                if (l8.equals("image/png")) {
                    c8 = 14;
                    break;
                }
                c8 = 65535;
                break;
            case -387023398:
                if (l8.equals("audio/x-matroska")) {
                    c8 = 15;
                    break;
                }
                c8 = 65535;
                break;
            case -43467528:
                if (l8.equals("application/webm")) {
                    c8 = 16;
                    break;
                }
                c8 = 65535;
                break;
            case 13915911:
                if (l8.equals("video/x-flv")) {
                    c8 = 17;
                    break;
                }
                c8 = 65535;
                break;
            case 187078296:
                if (l8.equals("audio/ac3")) {
                    c8 = 18;
                    break;
                }
                c8 = 65535;
                break;
            case 187078297:
                if (l8.equals("audio/ac4")) {
                    c8 = 19;
                    break;
                }
                c8 = 65535;
                break;
            case 187078669:
                if (l8.equals("audio/amr")) {
                    c8 = 20;
                    break;
                }
                c8 = 65535;
                break;
            case 187090232:
                if (l8.equals("audio/mp4")) {
                    c8 = 21;
                    break;
                }
                c8 = 65535;
                break;
            case 187091926:
                if (l8.equals("audio/ogg")) {
                    c8 = 22;
                    break;
                }
                c8 = 65535;
                break;
            case 187099443:
                if (l8.equals("audio/wav")) {
                    c8 = 23;
                    break;
                }
                c8 = 65535;
                break;
            case 1331848029:
                if (l8.equals("video/mp4")) {
                    c8 = 24;
                    break;
                }
                c8 = 65535;
                break;
            case 1503095341:
                if (l8.equals("audio/3gpp")) {
                    c8 = 25;
                    break;
                }
                c8 = 65535;
                break;
            case 1504578661:
                if (l8.equals("audio/eac3")) {
                    c8 = 26;
                    break;
                }
                c8 = 65535;
                break;
            case 1504619009:
                if (l8.equals("audio/flac")) {
                    c8 = 27;
                    break;
                }
                c8 = 65535;
                break;
            case 1504824762:
                if (l8.equals("audio/midi")) {
                    c8 = 28;
                    break;
                }
                c8 = 65535;
                break;
            case 1504831518:
                if (l8.equals("audio/mpeg")) {
                    c8 = 29;
                    break;
                }
                c8 = 65535;
                break;
            case 1505118770:
                if (l8.equals("audio/webm")) {
                    c8 = 30;
                    break;
                }
                c8 = 65535;
                break;
            case 2039520277:
                if (l8.equals("video/x-matroska")) {
                    c8 = 31;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        switch (c8) {
            case 0:
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case RecognitionOptions.DATA_MATRIX /* 16 */:
            case 30:
            case 31:
                return 6;
            case 4:
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case '\b':
                return 14;
            case '\t':
                return 18;
            case '\n':
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return 13;
            case '\r':
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int B(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (lastPathSegment.endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if (lastPathSegment.endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if (lastPathSegment.endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                        if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                            if (!lastPathSegment.endsWith(".avif")) {
                                                                return -1;
                                                            }
                                                            return 21;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static r C() {
        return new r("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    public static boolean D(String str) {
        return E(3, N(str));
    }

    public static boolean E(int i7, String str) {
        if (f14637c > i7 && !Log.isLoggable(str, i7)) {
            return false;
        }
        return true;
    }

    public static r G() {
        return new r("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    public static r J(Exception exc) {
        String str = "UNKNOWN";
        if (exc == null) {
            return new r("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        if (exc instanceof C0464m) {
            C0464m c0464m = (C0464m) exc;
            HashMap hashMap2 = new HashMap();
            C0602j c0602j = c0464m.f7039b;
            ArrayList k2 = c0602j.k();
            String uuid = UUID.randomUUID().toString();
            C1147j.f11871b.put(uuid, c0602j.f8266b);
            String uuid2 = UUID.randomUUID().toString();
            C1147j.f11872c.put(uuid2, c0602j);
            ArrayList arrayList = new ArrayList();
            Iterator it = AbstractC0055e.q(k2).iterator();
            while (it.hasNext()) {
                arrayList.add(((F) it.next()).b());
            }
            U3.h hVar = FirebaseAuth.getInstance(U3.h.e(c0602j.f8267c)).f9703a;
            hVar.a();
            hashMap2.put("appName", hVar.f5750b);
            hashMap2.put("multiFactorHints", arrayList);
            hashMap2.put("multiFactorSessionId", uuid);
            hashMap2.put("multiFactorResolverId", uuid2);
            return new r(c0464m.f7038a, c0464m.getLocalizedMessage(), hashMap2);
        } else if (!(exc instanceof j) && (exc.getCause() == null || !(exc.getCause() instanceof j))) {
            if (!(exc instanceof U3.c) && (exc.getCause() == null || !(exc.getCause() instanceof U3.c))) {
                if (!(exc instanceof l) && (exc.getCause() == null || !(exc.getCause() instanceof l))) {
                    if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
                        return new r("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
                    }
                    if (message != null && message.contains("User has already been linked to the given provider.")) {
                        return new r("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
                    }
                    if (exc instanceof C0462k) {
                        str = ((C0462k) exc).f7038a;
                    }
                    if (exc instanceof C0466o) {
                        message = ((C0466o) exc).f7042b;
                    }
                    if (exc instanceof C0465n) {
                        C0465n c0465n = (C0465n) exc;
                        String str2 = c0465n.f7041c;
                        if (str2 != null) {
                            hashMap.put("email", str2);
                        }
                        AbstractC0456e abstractC0456e = c0465n.f7040b;
                        if (abstractC0456e != null) {
                            hashMap.put("authCredential", AbstractC0055e.r(abstractC0456e));
                        }
                    }
                    return new r(str, message, hashMap);
                }
                return new r("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
            }
            return new r("api-not-available", "The requested API is not available.", null);
        } else {
            return new r("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
    }

    public static void L(L5.f binaryMessenger, final C0396w c0396w) {
        Object obj;
        o oVar;
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        if (c0396w != null && (oVar = c0396w.f6533a) != null) {
            obj = oVar.j();
        } else {
            obj = new Object();
        }
        E.e eVar = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", obj, null, 4);
        if (c0396w != null) {
            eVar.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar.h0(null);
        }
        E.e eVar2 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", obj, null, 4);
        if (c0396w != null) {
            eVar2.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar2.h0(null);
        }
        E.e eVar3 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", obj, null, 4);
        if (c0396w != null) {
            eVar3.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar3.h0(null);
        }
        E.e eVar4 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", obj, null, 4);
        if (c0396w != null) {
            eVar4.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar4.h0(null);
        }
        E.e eVar5 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", obj, null, 4);
        if (c0396w != null) {
            eVar5.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar5.h0(null);
        }
        E.e eVar6 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", obj, null, 4);
        if (c0396w != null) {
            eVar6.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar6.h0(null);
        }
        E.e eVar7 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", obj, null, 4);
        if (c0396w != null) {
            eVar7.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar7.h0(null);
        }
        E.e eVar8 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", obj, null, 4);
        if (c0396w != null) {
            eVar8.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar8.h0(null);
        }
        E.e eVar9 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", obj, null, 4);
        if (c0396w != null) {
            eVar9.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar9.h0(null);
        }
        E.e eVar10 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", obj, null, 4);
        if (c0396w != null) {
            eVar10.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar10.h0(null);
        }
        E.e eVar11 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", obj, null, 4);
        if (c0396w != null) {
            eVar11.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar11.h0(null);
        }
        E.e eVar12 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", obj, null, 4);
        if (c0396w != null) {
            eVar12.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar12.h0(null);
        }
        E.e eVar13 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", obj, null, 4);
        if (c0396w != null) {
            eVar13.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar13.h0(null);
        }
        E.e eVar14 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", obj, null, 4);
        if (c0396w != null) {
            eVar14.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar14.h0(null);
        }
        E.e eVar15 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", obj, null, 4);
        if (c0396w != null) {
            eVar15.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar15.h0(null);
        }
        E.e eVar16 = new E.e(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", obj, null, 4);
        if (c0396w != null) {
            eVar16.h0(new L5.b() { // from class: X5.N
                @Override // L5.b
                public final void j(Object obj2, A.f fVar) {
                    List E4;
                    List E7;
                    List E8;
                    List E9;
                    List E10;
                    List E11;
                    List E12;
                    List E13;
                    List E14;
                    List E15;
                    List E16;
                    List E17;
                    List E18;
                    List E19;
                    List E20;
                    List E21;
                    switch (r2) {
                        case 0:
                            C0396w c0396w2 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0396w2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                E4 = G.i.A(null);
                            } catch (Throwable th) {
                                E4 = AbstractC0055e.E(th);
                            }
                            fVar.h(E4);
                            return;
                        case 1:
                            C0396w c0396w3 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            String str = (String) list2.get(1);
                            try {
                                c0396w3.getClass();
                                webSettings2.setUserAgentString(str);
                                E7 = G.i.A(null);
                            } catch (Throwable th2) {
                                E7 = AbstractC0055e.E(th2);
                            }
                            fVar.h(E7);
                            return;
                        case 2:
                            C0396w c0396w4 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0396w4.getClass();
                                webSettings3.setMediaPlaybackRequiresUserGesture(booleanValue2);
                                E8 = G.i.A(null);
                            } catch (Throwable th3) {
                                E8 = AbstractC0055e.E(th3);
                            }
                            fVar.h(E8);
                            return;
                        case 3:
                            C0396w c0396w5 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0396w5.getClass();
                                webSettings4.setSupportZoom(booleanValue3);
                                E9 = G.i.A(null);
                            } catch (Throwable th4) {
                                E9 = AbstractC0055e.E(th4);
                            }
                            fVar.h(E9);
                            return;
                        case 4:
                            C0396w c0396w6 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0396w6.getClass();
                                webSettings5.setLoadWithOverviewMode(booleanValue4);
                                E10 = G.i.A(null);
                            } catch (Throwable th5) {
                                E10 = AbstractC0055e.E(th5);
                            }
                            fVar.h(E10);
                            return;
                        case 5:
                            C0396w c0396w7 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0396w7.getClass();
                                webSettings6.setUseWideViewPort(booleanValue5);
                                E11 = G.i.A(null);
                            } catch (Throwable th6) {
                                E11 = AbstractC0055e.E(th6);
                            }
                            fVar.h(E11);
                            return;
                        case 6:
                            C0396w c0396w8 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0396w8.getClass();
                                webSettings7.setDisplayZoomControls(booleanValue6);
                                E12 = G.i.A(null);
                            } catch (Throwable th7) {
                                E12 = AbstractC0055e.E(th7);
                            }
                            fVar.h(E12);
                            return;
                        case 7:
                            C0396w c0396w9 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0396w9.getClass();
                                webSettings8.setBuiltInZoomControls(booleanValue7);
                                E13 = G.i.A(null);
                            } catch (Throwable th8) {
                                E13 = AbstractC0055e.E(th8);
                            }
                            fVar.h(E13);
                            return;
                        case 8:
                            C0396w c0396w10 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0396w10.getClass();
                                webSettings9.setAllowFileAccess(booleanValue8);
                                E14 = G.i.A(null);
                            } catch (Throwable th9) {
                                E14 = AbstractC0055e.E(th9);
                            }
                            fVar.h(E14);
                            return;
                        case 9:
                            C0396w c0396w11 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0396w11.getClass();
                                webSettings10.setAllowContentAccess(booleanValue9);
                                E15 = G.i.A(null);
                            } catch (Throwable th10) {
                                E15 = AbstractC0055e.E(th10);
                            }
                            fVar.h(E15);
                            return;
                        case 10:
                            C0396w c0396w12 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0396w12.getClass();
                                webSettings11.setGeolocationEnabled(booleanValue10);
                                E16 = G.i.A(null);
                            } catch (Throwable th11) {
                                E16 = AbstractC0055e.E(th11);
                            }
                            fVar.h(E16);
                            return;
                        case 11:
                            C0396w c0396w13 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj25).longValue();
                            try {
                                c0396w13.getClass();
                                webSettings12.setTextZoom((int) longValue);
                                E17 = G.i.A(null);
                            } catch (Throwable th12) {
                                E17 = AbstractC0055e.E(th12);
                            }
                            fVar.h(E17);
                            return;
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            C0396w c0396w14 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj26 = ((List) obj2).get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            try {
                                c0396w14.getClass();
                                E18 = G.i.A(webSettings13.getUserAgentString());
                            } catch (Throwable th13) {
                                E18 = AbstractC0055e.E(th13);
                            }
                            fVar.h(E18);
                            return;
                        case 13:
                            C0396w c0396w15 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj27 = list13.get(0);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            Object obj28 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj28).booleanValue();
                            try {
                                c0396w15.getClass();
                                webSettings14.setJavaScriptCanOpenWindowsAutomatically(booleanValue11);
                                E19 = G.i.A(null);
                            } catch (Throwable th14) {
                                E19 = AbstractC0055e.E(th14);
                            }
                            fVar.h(E19);
                            return;
                        case 14:
                            C0396w c0396w16 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj30).booleanValue();
                            try {
                                c0396w16.getClass();
                                webSettings15.setSupportMultipleWindows(booleanValue12);
                                E20 = G.i.A(null);
                            } catch (Throwable th15) {
                                E20 = AbstractC0055e.E(th15);
                            }
                            fVar.h(E20);
                            return;
                        default:
                            C0396w c0396w17 = c0396w;
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj32).booleanValue();
                            try {
                                c0396w17.getClass();
                                webSettings16.setJavaScriptEnabled(booleanValue13);
                                E21 = G.i.A(null);
                            } catch (Throwable th16) {
                                E21 = AbstractC0055e.E(th16);
                            }
                            fVar.h(E21);
                            return;
                    }
                }
            });
        } else {
            eVar16.h0(null);
        }
    }

    public static final void M(Object obj) {
        if (!(obj instanceof l6.e)) {
            return;
        }
        throw ((l6.e) obj).f13867a;
    }

    public static String N(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    public static void O(String str, String str2) {
        String N7 = N(str);
        if (E(5, N7)) {
            Log.w(N7, str2);
        }
    }

    public static void P(String str, String str2, Throwable th) {
        String N7 = N(str);
        if (E(5, N7)) {
            Log.w(N7, str2, th);
        }
    }

    public static ArrayList Q(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static byte R(Boolean bool) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                return (byte) 0;
            }
            return (byte) 1;
        }
        return (byte) -1;
    }

    public static zzaic S(AbstractC0456e abstractC0456e, String str) {
        com.google.android.gms.common.internal.I.i(abstractC0456e);
        if (C0469s.class.isAssignableFrom(abstractC0456e.getClass())) {
            C0469s c0469s = (C0469s) abstractC0456e;
            return new zzaic(c0469s.f7046a, c0469s.f7047b, "google.com", null, null, null, str, null, null);
        } else if (C0458g.class.isAssignableFrom(abstractC0456e.getClass())) {
            return new zzaic(null, ((C0458g) abstractC0456e).f7034a, "facebook.com", null, null, null, str, null, null);
        } else {
            if (E.class.isAssignableFrom(abstractC0456e.getClass())) {
                E e7 = (E) abstractC0456e;
                return new zzaic(null, e7.f6960a, "twitter.com", null, e7.f6961b, null, str, null, null);
            } else if (a4.r.class.isAssignableFrom(abstractC0456e.getClass())) {
                return new zzaic(null, ((a4.r) abstractC0456e).f7045a, "github.com", null, null, null, str, null, null);
            } else {
                if (C0449B.class.isAssignableFrom(abstractC0456e.getClass())) {
                    return new zzaic(null, null, "playgames.google.com", null, null, ((C0449B) abstractC0456e).f6952a, str, null, null);
                }
                if (K.class.isAssignableFrom(abstractC0456e.getClass())) {
                    K k2 = (K) abstractC0456e;
                    zzaic zzaicVar = k2.f6983d;
                    if (zzaicVar == null) {
                        return new zzaic(k2.f6981b, k2.f6982c, k2.f6980a, null, k2.f, null, str, k2.f6984e, k2.f6979X);
                    }
                    return zzaicVar;
                }
                throw new IllegalArgumentException("Unsupported credential type.");
            }
        }
    }

    public static Boolean T(byte b5) {
        if (b5 != 0) {
            if (b5 != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static final l6.e j(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        return new l6.e(exception);
    }

    public static void l(String str, String str2) {
        String N7 = N(str);
        if (E(3, N7)) {
            Log.d(N7, str2);
        }
    }

    public static String m(p pVar, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) pVar.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
                return null;
            }
            return "1";
        } else if (num.intValue() != 0 || ((Integer) pVar.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() != 0) {
            return null;
        } else {
            return "0";
        }
    }

    public static void o(File file) {
        Path path;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                path = file.toPath();
                Files.deleteIfExists(path);
            } catch (IOException e7) {
                throw new IOException("Failed to delete file " + file + ": " + e7);
            }
        } else if (!file.delete() && file.exists()) {
            throw new IOException("Failed to delete file " + file);
        }
    }

    public static X2.b r(byte[] bArr, Parcelable.Creator creator) {
        com.google.android.gms.common.internal.I.i(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        X2.b bVar = (X2.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }

    public static int s(int i7, int i8, RoundingMode roundingMode) {
        boolean z7;
        if (i8 != 0) {
            int i9 = i7 / i8;
            int i10 = i7 - (i8 * i9);
            if (i10 == 0) {
                return i9;
            }
            boolean z8 = true;
            int i11 = ((i7 ^ i8) >> 31) | 1;
            switch (AbstractC1562e.f14597a[roundingMode.ordinal()]) {
                case 1:
                case 2:
                    return i9;
                case 3:
                    break;
                case 4:
                    if (i11 <= 0) {
                        return i9;
                    }
                    break;
                case 5:
                    if (i11 >= 0) {
                        return i9;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i10);
                    int abs2 = abs - (Math.abs(i8) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if ((i9 & 1) == 0) {
                                z8 = false;
                            }
                            if (!(z7 & z8)) {
                                return i9;
                            }
                        }
                    } else if (abs2 <= 0) {
                        return i9;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            return i9 + i11;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static void t(String str, String str2) {
        String N7 = N(str);
        if (E(6, N7)) {
            Log.e(N7, str2);
        }
    }

    public static void u(String str, String str2, Throwable th) {
        String N7 = N(str);
        if (E(6, N7)) {
            Log.e(N7, str2, th);
        }
    }

    public static C0457f y(String str, String str2) {
        C0455d c0455d;
        int i7;
        boolean z7 = false;
        if (!TextUtils.isEmpty(str2)) {
            zzan zzanVar = C0455d.f7025d;
            com.google.android.gms.common.internal.I.e(str2);
            try {
                c0455d = new C0455d(str2);
            } catch (IllegalArgumentException unused) {
                c0455d = null;
            }
            if (c0455d != null) {
                zzan zzanVar2 = C0455d.f7025d;
                String str3 = c0455d.f7027b;
                if (zzanVar2.containsKey(str3)) {
                    i7 = ((Integer) zzanVar2.get(str3)).intValue();
                } else {
                    i7 = 3;
                }
                if (i7 == 4) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            return new C0457f(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }

    public abstract boolean F(Class cls);

    public abstract View H(int i7);

    public abstract boolean I();

    public abstract int K(byte[] bArr, int i7, int i8);

    public abstract String n(byte[] bArr, int i7, int i8);

    public abstract int v(String str, byte[] bArr, int i7, int i8);

    public abstract Method w(Class cls, Field field);

    public abstract Constructor x(Class cls);

    public abstract String[] z(Class cls);
}
