package P5;

import D.AbstractC0055e;
import H4.e1;
import H4.p1;
import a4.AbstractC0452a;
import android.net.Uri;
import b4.C0603k;
import b4.C0605m;
import b4.G;
import b4.T;
import b4.U;
import b4.W;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.auth.C1140c;
import io.flutter.plugins.firebase.auth.C1147j;
import io.flutter.plugins.firebase.auth.C1148k;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.auth.EnumC1149l;
import io.flutter.plugins.firebase.auth.r;
import j$.util.Objects;
import java.util.HashMap;
import java.util.UUID;
import org.apache.tika.utils.XMLReaderUtils;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4032a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4033b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f4032a = i7;
        this.f4033b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.flutter.plugins.firebase.auth.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [io.flutter.plugins.firebase.auth.J, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v105, types: [io.flutter.plugins.firebase.auth.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v33, types: [io.flutter.plugins.firebase.auth.y, java.lang.Object] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        EnumC1149l enumC1149l;
        String str;
        String str2 = null;
        Object obj = this.f4033b;
        switch (this.f4032a) {
            case 0:
                HashMap hashMap = d.f4034c;
                h hVar = (h) obj;
                if (task.isSuccessful()) {
                    hVar.c(task.getResult());
                    return;
                } else {
                    hVar.a(task.getException());
                    return;
                }
            case 1:
                HashMap hashMap2 = C1140c.f11846Z;
                h hVar2 = (h) obj;
                if (task.isSuccessful()) {
                    hVar2.c(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    hVar2.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 2:
                HashMap hashMap3 = C1140c.f11846Z;
                h hVar3 = (h) obj;
                if (task.isSuccessful()) {
                    hVar3.c(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    hVar3.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 3:
                HashMap hashMap4 = C1140c.f11846Z;
                h hVar4 = (h) obj;
                if (task.isSuccessful()) {
                    hVar4.b();
                    return;
                } else {
                    hVar4.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 4:
                HashMap hashMap5 = C1140c.f11846Z;
                h hVar5 = (h) obj;
                if (task.isSuccessful()) {
                    hVar5.c((String) task.getResult());
                    return;
                } else {
                    hVar5.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 5:
                HashMap hashMap6 = C1140c.f11846Z;
                h hVar6 = (h) obj;
                if (task.isSuccessful()) {
                    hVar6.c(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    hVar6.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 6:
                HashMap hashMap7 = C1140c.f11846Z;
                h hVar7 = (h) obj;
                if (task.isSuccessful()) {
                    U u7 = (U) task.getResult();
                    int i7 = u7.f8221a;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        if (i7 != 6) {
                                            enumC1149l = null;
                                        } else {
                                            enumC1149l = EnumC1149l.REVERT_SECOND_FACTOR_ADDITION;
                                        }
                                    } else {
                                        enumC1149l = EnumC1149l.VERIFY_AND_CHANGE_EMAIL;
                                    }
                                } else {
                                    enumC1149l = EnumC1149l.EMAIL_SIGN_IN;
                                }
                            } else {
                                enumC1149l = EnumC1149l.RECOVER_EMAIL;
                            }
                        } else {
                            enumC1149l = EnumC1149l.VERIFY_EMAIL;
                        }
                    } else {
                        enumC1149l = EnumC1149l.PASSWORD_RESET;
                    }
                    AbstractC0452a abstractC0452a = u7.f8222b;
                    if ((abstractC0452a != null && i7 == 1) || i7 == 0) {
                        str2 = abstractC0452a.a();
                        str = null;
                    } else if (i7 != 2 && i7 != 5) {
                        str = null;
                    } else {
                        Objects.requireNonNull(abstractC0452a);
                        T t7 = (T) abstractC0452a;
                        str2 = t7.f7007a;
                        str = t7.f8220b;
                    }
                    ?? obj2 = new Object();
                    obj2.f11900a = str2;
                    obj2.f11901b = str;
                    ?? obj3 = new Object();
                    if (enumC1149l != null) {
                        obj3.f11898a = enumC1149l;
                        obj3.f11899b = obj2;
                        hVar7.c(obj3);
                        return;
                    }
                    throw new IllegalStateException("Nonnull field \"operation\" is null.");
                }
                hVar7.a(org.slf4j.helpers.i.J(task.getException()));
                return;
            case 7:
                HashMap hashMap8 = C1140c.f11846Z;
                h hVar8 = (h) obj;
                if (task.isSuccessful()) {
                    hVar8.c(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    hVar8.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 8:
                HashMap hashMap9 = C1140c.f11846Z;
                h hVar9 = (h) obj;
                if (task.isSuccessful()) {
                    hVar9.c(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    hVar9.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 9:
                HashMap hashMap10 = C1140c.f11846Z;
                h hVar10 = (h) obj;
                if (task.isSuccessful()) {
                    hVar10.b();
                    return;
                } else {
                    hVar10.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 10:
                HashMap hashMap11 = C1140c.f11846Z;
                h hVar11 = (h) obj;
                if (task.isSuccessful()) {
                    hVar11.b();
                    return;
                } else {
                    hVar11.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 11:
                HashMap hashMap12 = C1140c.f11846Z;
                h hVar12 = (h) obj;
                if (task.isSuccessful()) {
                    hVar12.c(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    hVar12.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                HashMap hashMap13 = C1140c.f11846Z;
                h hVar13 = (h) obj;
                if (task.isSuccessful()) {
                    hVar13.c(((C0605m) task.getResult()).f8280a);
                    return;
                } else {
                    hVar13.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 13:
                HashMap hashMap14 = C1140c.f11846Z;
                h hVar14 = (h) obj;
                if (task.isSuccessful()) {
                    hVar14.b();
                    return;
                } else {
                    hVar14.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 14:
                HashMap hashMap15 = C1140c.f11846Z;
                h hVar15 = (h) obj;
                if (task.isSuccessful()) {
                    hVar15.c(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    hVar15.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 15:
                h hVar16 = (h) obj;
                if (task.isSuccessful()) {
                    hVar16.c(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    hVar16.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                C1154q c1154q = (C1154q) obj;
                if (task.isSuccessful()) {
                    c1154q.d(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    c1154q.b(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 17:
                h hVar17 = (h) obj;
                if (task.isSuccessful()) {
                    hVar17.c(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    hVar17.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                C1154q c1154q2 = (C1154q) obj;
                if (task.isSuccessful()) {
                    c1154q2.d(AbstractC0055e.s((W) task.getResult()));
                    return;
                }
                Exception exception = task.getException();
                if (exception.getMessage().contains("User was not linked to an account with the given provider.")) {
                    c1154q2.b(new r("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null));
                    return;
                } else {
                    c1154q2.b(org.slf4j.helpers.i.J(exception));
                    return;
                }
            case 19:
                h hVar18 = (h) obj;
                if (task.isSuccessful()) {
                    hVar18.b();
                    return;
                } else {
                    hVar18.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                C1154q c1154q3 = (C1154q) obj;
                if (task.isSuccessful()) {
                    c1154q3.d(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    c1154q3.b(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 21:
                C1154q c1154q4 = (C1154q) obj;
                if (task.isSuccessful()) {
                    c1154q4.d(AbstractC0055e.s((W) task.getResult()));
                    return;
                } else {
                    c1154q4.b(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 22:
                C1154q c1154q5 = (C1154q) obj;
                if (task.isSuccessful()) {
                    String uuid = UUID.randomUUID().toString();
                    C1147j.f11871b.put(uuid, (C0603k) task.getResult());
                    ?? obj4 = new Object();
                    if (uuid != null) {
                        obj4.f11792a = uuid;
                        c1154q5.d(obj4);
                        return;
                    }
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                c1154q5.b(org.slf4j.helpers.i.J(task.getException()));
                return;
            case 23:
                C1154q c1154q6 = (C1154q) obj;
                if (task.isSuccessful()) {
                    c1154q6.c();
                    return;
                } else {
                    c1154q6.b(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 24:
                C1154q c1154q7 = (C1154q) obj;
                if (task.isSuccessful()) {
                    c1154q7.c();
                    return;
                } else {
                    c1154q7.b(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 25:
                C1154q c1154q8 = (C1154q) obj;
                if (task.isSuccessful()) {
                    c1154q8.c();
                    return;
                } else {
                    c1154q8.b(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            case 26:
                C1154q c1154q9 = (C1154q) obj;
                if (task.isSuccessful()) {
                    G g3 = (G) task.getResult();
                    C1148k.f11874a.put(g3.f8189a, g3);
                    Long valueOf = Long.valueOf(g3.f8192d);
                    Long valueOf2 = Long.valueOf(g3.f8191c);
                    Long valueOf3 = Long.valueOf(g3.f8193e);
                    ?? obj5 = new Object();
                    obj5.f11798a = valueOf;
                    obj5.f11799b = valueOf2;
                    obj5.f11800c = valueOf3;
                    obj5.f11801d = g3.f8190b;
                    String str3 = g3.f8189a;
                    if (str3 != null) {
                        obj5.f11802e = str3;
                        c1154q9.d(obj5);
                        return;
                    }
                    throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
                }
                c1154q9.b(org.slf4j.helpers.i.J(task.getException()));
                return;
            case 27:
                HashMap hashMap16 = io.flutter.plugins.firebase.storage.c.f11978c;
                io.flutter.plugins.firebase.storage.g gVar = (io.flutter.plugins.firebase.storage.g) obj;
                if (task.isSuccessful()) {
                    gVar.a(null);
                    return;
                } else {
                    gVar.c(G.i.D(task.getException()));
                    return;
                }
            case 28:
                HashMap hashMap17 = io.flutter.plugins.firebase.storage.c.f11978c;
                C1154q c1154q10 = (C1154q) obj;
                if (task.isSuccessful()) {
                    c1154q10.d((byte[]) task.getResult());
                    return;
                } else {
                    c1154q10.a(G.i.D(task.getException()));
                    return;
                }
            default:
                HashMap hashMap18 = io.flutter.plugins.firebase.storage.c.f11978c;
                io.flutter.plugins.firebase.storage.g gVar2 = (io.flutter.plugins.firebase.storage.g) obj;
                if (task.isSuccessful()) {
                    gVar2.a(((Uri) task.getResult()).toString());
                    return;
                } else {
                    gVar2.c(G.i.D(task.getException()));
                    return;
                }
        }
    }
}
