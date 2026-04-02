package P0;

import A3.AbstractC0021t;
import A3.K;
import D.AbstractC0059i;
import H0.C0136p;
import H0.J;
import H4.e1;
import H4.p1;
import U0.r;
import X5.C0375a;
import android.graphics.Bitmap;
import e1.b0;
import f1.C0986h;
import java.io.IOException;
import java.util.List;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements K0.h, K0.i, z3.i, V6.a, V6.c, L5.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3901a;

    public /* synthetic */ b(int i7) {
        this.f3901a = i7;
    }

    public static Bitmap a(byte[] bArr, int i7) {
        try {
            return j3.f.q(bArr, i7);
        } catch (J e7) {
            throw new Exception("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i7 + ")", e7);
        } catch (IOException e8) {
            throw new Exception(e8);
        }
    }

    @Override // V6.a
    public void accept(Object obj) {
        switch (this.f3901a) {
            case 19:
                X6.b bVar = (X6.b) obj;
                throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.valueOf((int) com.google.android.gms.common.api.f.API_PRIORITY_OTHER)));
            default:
                throw ((IOException) obj);
        }
    }

    @Override // z3.i
    public Object apply(Object obj) {
        switch (this.f3901a) {
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return K.u(Integer.valueOf(((C0986h) obj).f11016a));
            default:
                r rVar = (r) obj;
                rVar.a();
                b0 b0Var = rVar.f5653D0;
                return K.p(AbstractC0021t.w(b0Var.f10781b, new com.it_nomads.fluttersecurestorage.ciphers.d(8)));
        }
    }

    @Override // K0.i
    public void c(Object obj, C0136p c0136p) {
        i iVar = (i) obj;
    }

    @Override // L5.c
    public void h(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Object obj2 = list.get(0);
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                org.slf4j.helpers.i.j(new C0375a((String) obj2, (String) obj3, (String) list.get(2)));
                return;
            }
            return;
        }
        AbstractC0059i.N("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", StringUtils.EMPTY);
    }

    @Override // K0.h
    public void invoke(Object obj) {
        i iVar = (i) obj;
        switch (this.f3901a) {
            case 0:
                iVar.getClass();
                return;
            case 1:
            default:
                iVar.getClass();
                return;
            case 2:
                iVar.getClass();
                return;
            case 3:
                iVar.getClass();
                return;
            case 4:
                iVar.getClass();
                return;
            case 5:
                iVar.getClass();
                return;
            case 6:
                iVar.getClass();
                return;
            case 7:
                iVar.getClass();
                return;
            case 8:
                iVar.getClass();
                return;
            case 9:
                iVar.getClass();
                return;
            case 10:
                iVar.getClass();
                return;
            case 11:
                iVar.getClass();
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                iVar.getClass();
                return;
            case 13:
                iVar.getClass();
                return;
            case 14:
                iVar.getClass();
                return;
            case 15:
                iVar.getClass();
                return;
        }
    }
}
