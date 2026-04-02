package R6;

import B5.Q;
import D.AbstractC0059i;
import E6.m;
import H4.W;
import Q6.AbstractC0281b;
import Q6.B;
import Q6.l;
import Q6.o;
import Q6.s;
import androidx.lifecycle.O;
import androidx.lifecycle.Y;
import c5.C0639a;
import com.google.firebase.firestore.Z;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import l2.i;
import m6.AbstractC1447h;
import org.apache.tika.utils.StringUtils;
import w6.InterfaceC1959a;
/* loaded from: classes.dex */
public final class d extends k implements InterfaceC1959a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4790a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i7) {
        super(0);
        this.f4790a = i7;
        this.f4791b = obj;
    }

    @Override // w6.InterfaceC1959a
    public final Object invoke() {
        int i7;
        Iterator it;
        l6.d dVar;
        int d7;
        l6.d dVar2;
        k7.h hVar;
        Object obj = this.f4791b;
        switch (this.f4790a) {
            case 0:
                o oVar = e.f4792c;
                ClassLoader classLoader = (ClassLoader) obj;
                Enumeration<URL> resources = classLoader.getResources(StringUtils.EMPTY);
                j.d(resources, "getResources(\"\")");
                ArrayList<URL> list = Collections.list(resources);
                j.d(list, "list(this)");
                ArrayList arrayList = new ArrayList();
                for (URL it2 : list) {
                    o oVar2 = e.f4792c;
                    j.d(it2, "it");
                    if (!j.a(it2.getProtocol(), "file")) {
                        dVar2 = null;
                    } else {
                        l lVar = Q6.j.f4473a;
                        String str = o.f4480b;
                        dVar2 = new l6.d(lVar, Z.t(new File(it2.toURI())));
                    }
                    if (dVar2 != null) {
                        arrayList.add(dVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                j.d(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
                ArrayList list2 = Collections.list(resources2);
                j.d(list2, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    URL it4 = (URL) it3.next();
                    o oVar3 = e.f4792c;
                    j.d(it4, "it");
                    String url = it4.toString();
                    j.d(url, "toString()");
                    if (m.e0(url, "jar:file:")) {
                        if (true & true) {
                            i7 = m.P(url);
                        } else {
                            i7 = 0;
                        }
                        j.e(url, "<this>");
                        j.e("!", "string");
                        int lastIndexOf = url.lastIndexOf("!", i7);
                        if (lastIndexOf != -1) {
                            String str2 = o.f4480b;
                            String substring = url.substring(4, lastIndexOf);
                            j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            o t7 = Z.t(new File(URI.create(substring)));
                            l fileSystem = Q6.j.f4473a;
                            j.e(fileSystem, "fileSystem");
                            Q6.k e7 = fileSystem.e(t7);
                            try {
                                long b5 = e7.b() - 22;
                                if (b5 >= 0) {
                                    long max = Math.max(b5 - 65536, 0L);
                                    while (true) {
                                        s b7 = AbstractC0281b.b(e7.c(b5));
                                        if (b7.d() == 101010256) {
                                            int j = b7.j() & 65535;
                                            int j8 = b7.j() & 65535;
                                            long j9 = b7.j() & 65535;
                                            it = it3;
                                            if (j9 == (b7.j() & 65535) && j == 0 && j8 == 0) {
                                                b7.o(4L);
                                                int j10 = b7.j() & 65535;
                                                Q q2 = new Q(j10, j9, b7.d() & 4294967295L);
                                                b7.m(j10);
                                                b7.close();
                                                long j11 = b5 - 20;
                                                if (j11 > 0) {
                                                    s b8 = AbstractC0281b.b(e7.c(j11));
                                                    if (b8.d() == 117853008) {
                                                        int d8 = b8.d();
                                                        long g3 = b8.g();
                                                        if (b8.d() == 1 && d8 == 0) {
                                                            s b9 = AbstractC0281b.b(e7.c(g3));
                                                            try {
                                                                if (b9.d() == 101075792) {
                                                                    b9.o(12L);
                                                                    int d9 = b9.d();
                                                                    int d10 = b9.d();
                                                                    long g4 = b9.g();
                                                                    if (g4 == b9.g() && d9 == 0 && d10 == 0) {
                                                                        b9.o(8L);
                                                                        Q q7 = new Q(j10, g4, b9.g());
                                                                        W.g(b9, null);
                                                                        q2 = q7;
                                                                    } else {
                                                                        throw new IOException("unsupported zip: spanned");
                                                                    }
                                                                } else {
                                                                    throw new IOException("bad zip: expected " + b.b(101075792) + " but was " + b.b(d7));
                                                                }
                                                            } finally {
                                                            }
                                                        } else {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                    }
                                                    W.g(b8, null);
                                                }
                                                long j12 = q2.f333b;
                                                ArrayList arrayList3 = new ArrayList();
                                                s b10 = AbstractC0281b.b(e7.c(j12));
                                                long j13 = q2.f332a;
                                                for (long j14 = 0; j14 < j13; j14++) {
                                                    f c8 = b.c(b10);
                                                    if (c8.f4798e < j12) {
                                                        o oVar4 = e.f4792c;
                                                        if (C0639a.h(c8.f4794a)) {
                                                            arrayList3.add(c8);
                                                        }
                                                    } else {
                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                    }
                                                }
                                                W.g(b10, null);
                                                B b11 = new B(t7, fileSystem, b.a(arrayList3));
                                                W.g(e7, null);
                                                dVar = new l6.d(b11, e.f4792c);
                                            } else {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                        } else {
                                            Iterator it5 = it3;
                                            b7.close();
                                            b5--;
                                            if (b5 >= max) {
                                                it3 = it5;
                                            } else {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                        }
                                    }
                                } else {
                                    throw new IOException("not a zip: size=" + e7.b());
                                }
                            } finally {
                            }
                        }
                    }
                    it = it3;
                    dVar = null;
                    if (dVar != null) {
                        arrayList2.add(dVar);
                    }
                    it3 = it;
                }
                return AbstractC1447h.T(arrayList2, arrayList);
            case 1:
                return O.e((Y) obj);
            case 2:
                i2.l lVar2 = (i2.l) obj;
                return BigInteger.valueOf(lVar2.f11468a).shiftLeft(32).or(BigInteger.valueOf(lVar2.f11469b)).shiftLeft(32).or(BigInteger.valueOf(lVar2.f11470c));
            case 3:
                k7.o oVar5 = (k7.o) obj;
                if (oVar5.f13779n && (hVar = oVar5.f13772e) != null) {
                    hVar.start();
                }
                return l6.j.f13876a;
            case 4:
                File file = (File) ((i) obj).invoke();
                String name = file.getName();
                j.d(name, "getName(...)");
                if (m.h0(name, '.', StringUtils.EMPTY).equals("preferences_pb")) {
                    String str3 = o.f4480b;
                    File absoluteFile = file.getAbsoluteFile();
                    j.d(absoluteFile, "file.absoluteFile");
                    return Z.t(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                return AbstractC0059i.z(((F3.o) obj).k().getPackageName(), ".flutter.share_provider");
        }
    }
}
