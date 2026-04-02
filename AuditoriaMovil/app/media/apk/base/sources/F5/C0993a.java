package f5;

import A.m;
import A4.c;
import A4.d;
import D.AbstractC0055e;
import E.e;
import H0.r;
import J1.j;
import J1.l;
import L1.h;
import M0.x;
import M3.q;
import S3.k;
import X5.E;
import a4.C0462k;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Base64;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c4.C0632a;
import c4.InterfaceC0635d;
import c4.InterfaceC0636e;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.firebase.components.ComponentRegistrar;
import com.google.protobuf.S;
import e5.C0965a;
import e5.b;
import e5.g;
import j$.util.Objects;
import j3.C1367d;
import j3.InterfaceC1365b;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import k5.C1400c;
import k5.C1402e;
import o.MenuC1545i;
import o.o;
import org.apache.tika.utils.StringUtils;
import w.C1925j;
/* renamed from: f5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993a implements InterfaceC0636e, S, j, B, k, Continuation, InterfaceC0635d, InterfaceC1365b, o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11064a;

    public /* synthetic */ C0993a(int i7) {
        this.f11064a = i7;
    }

    @Override // c4.InterfaceC0636e
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C0632a c0632a : componentRegistrar.getComponents()) {
            String str = c0632a.f8375a;
            if (str != null) {
                d dVar = new d(6, str, c0632a);
                c0632a = new C0632a(str, c0632a.f8376b, c0632a.f8377c, c0632a.f8378d, c0632a.f8379e, dVar, c0632a.f8380g);
            }
            arrayList.add(c0632a);
        }
        return arrayList;
    }

    @Override // j3.InterfaceC1365b
    public int c(Context context, String str) {
        return C1367d.a(context, str);
    }

    @Override // c4.InterfaceC0635d
    public Object d(q qVar) {
        switch (this.f11064a) {
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                C0965a c0965a = (C0965a) qVar.a(C0965a.class);
                return new b(0);
            default:
                return new C1400c((C1402e) qVar.a(C1402e.class), (e5.d) qVar.a(e5.d.class), (g) qVar.a(g.class));
        }
    }

    @Override // j3.InterfaceC1365b
    public int e(Context context, String str, boolean z7) {
        return C1367d.d(context, str, z7);
    }

    @Override // o.o
    public boolean f(MenuC1545i menuC1545i) {
        return false;
    }

    @Override // S3.k
    public Object g(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }

    public String h(List list) {
        kotlin.jvm.internal.j.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        kotlin.jvm.internal.j.d(encodeToString, "encodeToString(byteStream.toByteArray(), 0)");
        return encodeToString;
    }

    @Override // J1.j
    public boolean i(r rVar) {
        String str = rVar.f1886m;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override // J1.j
    public l j(r rVar) {
        String str = rVar.f1886m;
        if (str != null) {
            List list = rVar.f1889p;
            char c8 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c8 = 7;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    return new h(list);
                case 1:
                    return new e(5);
                case 2:
                    return new c(21);
                case 3:
                    return new x(12, (byte) 0);
                case 4:
                    return new Q1.a(list);
                case 5:
                    return new N1.a(list);
                case 6:
                    return new O1.a();
                case 7:
                    return new P1.e();
            }
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Unsupported MIME type: ", str));
    }

    @Override // J1.j
    public int k(r rVar) {
        String str = rVar.f1886m;
        if (str != null) {
            char c8 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c8 = 7;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                case 6:
                case 7:
                    return 1;
            }
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Unsupported MIME type: ", str));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        String str;
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        if (exception != null) {
            str = exception.getMessage();
        } else {
            str = StringUtils.EMPTY;
        }
        return Tasks.forException(new C0462k("INTERNAL_ERROR", zzae.zzb(str)));
    }

    public C0993a(C1925j c1925j, x.j jVar, m mVar, G.k kVar, G.e eVar) {
        this.f11064a = 23;
        Integer num = (Integer) jVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            num.intValue();
        }
        new b(mVar);
        AbstractC0055e.n(new E(jVar, 25));
    }

    public C0993a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f11064a = 13;
    }

    @Override // o.o
    public void a(MenuC1545i menuC1545i, boolean z7) {
    }
}
