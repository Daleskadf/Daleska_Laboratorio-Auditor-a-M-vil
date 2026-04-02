package v4;

import S3.k;
import X0.i;
import X0.j;
import X0.m;
import Y1.C0406g;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Trace;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import c4.InterfaceC0635d;
import com.example.appecoactivate.R;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.InterfaceC0771u;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.protobuf.S;
import h0.InterfaceC1051k;
import j3.InterfaceC1365b;
import j3.InterfaceC1366c;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.concurrent.Executors;
import m1.G;
import m1.InterfaceC1426A;
import m1.n;
import m1.q;
/* loaded from: classes.dex */
public final class d implements F2.b, S, B, k, V1.a, i, InterfaceC0635d, InterfaceC0771u, InterfaceC1051k, InterfaceC1366c, q {

    /* renamed from: a  reason: collision with root package name */
    public static d f16063a;

    /* renamed from: b  reason: collision with root package name */
    public static d f16064b;

    public static MediaCodec i(X0.h hVar) {
        m mVar = hVar.f6280a;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = mVar.f6286a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0771u
    public /* bridge */ /* synthetic */ Object b(t tVar) {
        return null;
    }

    @Override // c4.InterfaceC0635d
    public Object d(M3.q qVar) {
        return new e5.h();
    }

    @Override // V1.a
    public CharSequence e(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return editTextPreference.f7987a.getString(R.string.not_set);
    }

    @Override // X0.i
    public j f(X0.h hVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = i(hVar);
            Trace.beginSection("configureCodec");
            mediaCodec.configure(hVar.f6281b, hVar.f6283d, hVar.f6284e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new R1.j(mediaCodec);
        } catch (IOException | RuntimeException e7) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e7;
        }
    }

    @Override // S3.k
    public Object g(String str, Provider provider) {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }

    @Override // k6.InterfaceC1408a
    public Object get() {
        return new G.g(Executors.newSingleThreadExecutor());
    }

    @Override // m1.q
    public G s(int i7, int i8) {
        return new n();
    }

    @Override // j3.InterfaceC1366c
    public C0406g v(Context context, String str, InterfaceC1365b interfaceC1365b) {
        int e7;
        C0406g c0406g = new C0406g();
        int c8 = interfaceC1365b.c(context, str);
        c0406g.f6659a = c8;
        int i7 = 1;
        int i8 = 0;
        if (c8 != 0) {
            e7 = interfaceC1365b.e(context, str, false);
            c0406g.f6660b = e7;
        } else {
            e7 = interfaceC1365b.e(context, str, true);
            c0406g.f6660b = e7;
        }
        int i9 = c0406g.f6659a;
        if (i9 == 0) {
            if (e7 == 0) {
                i7 = 0;
                c0406g.f6661c = i7;
                return c0406g;
            }
        } else {
            i8 = i9;
        }
        if (i8 >= e7) {
            i7 = -1;
        }
        c0406g.f6661c = i7;
        return c0406g;
    }

    @Override // m1.q
    public void h() {
    }

    @Override // m1.q
    public void x(InterfaceC1426A interfaceC1426A) {
    }

    @Override // h0.InterfaceC1051k
    public void a(int i7, int i8, int i9, boolean z7) {
    }

    @Override // h0.InterfaceC1051k
    public void c(int i7, int i8, int i9, int i10) {
    }
}
