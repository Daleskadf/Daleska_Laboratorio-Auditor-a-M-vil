package com.google.android.gms.internal.p002firebaseauthapi;

import U3.h;
import a4.AbstractC0456e;
import a4.AbstractC0467p;
import a4.C0448A;
import a4.C0450C;
import a4.C0454c;
import a4.C0457f;
import a4.C0468q;
import a4.G;
import a4.v;
import a4.y;
import a4.z;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import b4.C0599g;
import b4.C0600h;
import b4.C0603k;
import b4.C0605m;
import b4.InterfaceC0592F;
import b4.InterfaceC0607o;
import b4.InterfaceC0608p;
import b4.M;
import b4.U;
import b4.W;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j3.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabq  reason: invalid package */
/* loaded from: classes.dex */
public final class zzabq extends zzaep {
    public zzabq(h hVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzado(hVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(h hVar, String str, String str2) {
        return zza((zzabt) new zzabt(str, str2).zza(hVar));
    }

    public final Task<U> zzb(h hVar, String str, String str2) {
        return zza((zzabs) new zzabs(str, str2).zza(hVar));
    }

    public final Task<C0605m> zzc(h hVar, String str, String str2) {
        return zza((zzabw) new zzabw(str, str2).zza(hVar));
    }

    public final Task<Void> zzd(h hVar, AbstractC0467p abstractC0467p, String str, InterfaceC0592F interfaceC0592F) {
        return zza((zzadg) new zzadg(str).zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(h hVar, String str, String str2, String str3) {
        return zza((zzabv) new zzabv(str, str2, str3).zza(hVar));
    }

    public final Task<Void> zzb(h hVar, String str, C0454c c0454c, String str2, String str3) {
        c0454c.f7017Z = 6;
        return zza((zzact) new zzact(str, c0454c, str2, str3, "sendSignInLinkToEmail").zza(hVar));
    }

    public final Task<W> zzc(h hVar, AbstractC0467p abstractC0467p, AbstractC0456e abstractC0456e, String str, InterfaceC0592F interfaceC0592F) {
        return zza((zzacj) new zzacj(abstractC0456e, str).zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<W> zza(h hVar, String str, String str2, String str3, String str4, M m7) {
        return zza((zzabu) new zzabu(str, str2, str3, str4).zza(hVar).zza((zzaeg<W, M>) m7));
    }

    public final Task<String> zzd(h hVar, String str, String str2) {
        return zza((zzadk) new zzadk(str, str2).zza(hVar));
    }

    public final Task<Void> zzb(h hVar, AbstractC0467p abstractC0467p, AbstractC0456e abstractC0456e, String str, InterfaceC0592F interfaceC0592F) {
        return zza((zzacg) new zzacg(abstractC0456e, str).zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zzc(h hVar, AbstractC0467p abstractC0467p, String str, InterfaceC0592F interfaceC0592F) {
        return zza((zzadh) new zzadh(str).zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(AbstractC0467p abstractC0467p, InterfaceC0608p interfaceC0608p) {
        return zza((zzabx) new zzabx().zza(abstractC0467p).zza((zzaeg<Void, InterfaceC0608p>) interfaceC0608p).zza((InterfaceC0607o) interfaceC0608p));
    }

    public final Task<W> zzb(h hVar, AbstractC0467p abstractC0467p, C0457f c0457f, String str, InterfaceC0592F interfaceC0592F) {
        return zza((zzacl) new zzacl(c0457f, str).zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(h hVar, z zVar, AbstractC0467p abstractC0467p, String str, M m7) {
        zzafc.zza();
        zzabz zzabzVar = new zzabz(zVar, ((C0599g) abstractC0467p).f8253a.zzf(), str, null);
        zzabzVar.zza(hVar).zza((zzaeg<Void, M>) m7);
        return zza(zzabzVar);
    }

    public final Task<W> zzb(h hVar, AbstractC0467p abstractC0467p, String str, String str2, String str3, String str4, InterfaceC0592F interfaceC0592F) {
        return zza((zzacn) new zzacn(str, str2, str3, str4).zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(h hVar, C0450C c0450c, AbstractC0467p abstractC0467p, String str, String str2, M m7) {
        zzabz zzabzVar = new zzabz(c0450c, ((C0599g) abstractC0467p).f8253a.zzf(), str, str2);
        zzabzVar.zza(hVar).zza((zzaeg<Void, M>) m7);
        return zza(zzabzVar);
    }

    public final Task<W> zzb(h hVar, AbstractC0467p abstractC0467p, v vVar, String str, InterfaceC0592F interfaceC0592F) {
        zzafc.zza();
        return zza((zzacp) new zzacp(vVar, str).zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<W> zza(h hVar, AbstractC0467p abstractC0467p, z zVar, String str, M m7) {
        zzafc.zza();
        zzaby zzabyVar = new zzaby(zVar, str, null);
        zzabyVar.zza(hVar).zza((zzaeg<W, M>) m7);
        if (abstractC0467p != null) {
            zzabyVar.zza(abstractC0467p);
        }
        return zza(zzabyVar);
    }

    public final Task<W> zzb(h hVar, String str, String str2, String str3, String str4, M m7) {
        return zza((zzacw) new zzacw(str, str2, str3, str4).zza(hVar).zza((zzaeg<W, M>) m7));
    }

    public final Task<W> zza(h hVar, AbstractC0467p abstractC0467p, C0450C c0450c, String str, String str2, M m7) {
        zzaby zzabyVar = new zzaby(c0450c, str, str2);
        zzabyVar.zza(hVar).zza((zzaeg<W, M>) m7);
        if (abstractC0467p != null) {
            zzabyVar.zza(abstractC0467p);
        }
        return zza(zzabyVar);
    }

    public final Task<W> zzb(h hVar, AbstractC0467p abstractC0467p, String str, InterfaceC0592F interfaceC0592F) {
        I.i(hVar);
        I.e(str);
        I.i(abstractC0467p);
        I.i(interfaceC0592F);
        ArrayList arrayList = ((C0599g) abstractC0467p).f;
        if ((arrayList != null && !arrayList.contains(str)) || abstractC0467p.l()) {
            return Tasks.forException(zzadr.zza(new Status(17016, str, null, null)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzade) new zzade(str).zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
        }
        return zza((zzadf) new zzadf().zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(h hVar, String str, C0454c c0454c, String str2, String str3) {
        c0454c.f7017Z = 1;
        return zza((zzact) new zzact(str, c0454c, str2, str3, "sendPasswordResetEmail").zza(hVar));
    }

    public final Task<Void> zza(String str, String str2, C0454c c0454c) {
        c0454c.f7017Z = 7;
        return zza(new zzadl(str, str2, c0454c));
    }

    public final Task<C0468q> zza(h hVar, AbstractC0467p abstractC0467p, String str, InterfaceC0592F interfaceC0592F) {
        return zza((zzacb) new zzacb(str).zza(hVar).zza(abstractC0467p).zza((zzaeg<C0468q, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<zzags> zza() {
        return zza(new zzaca());
    }

    public final Task<zzagt> zza(String str, String str2) {
        return zza(new zzacd(str, str2));
    }

    public final Task<W> zza(h hVar, AbstractC0467p abstractC0467p, AbstractC0456e abstractC0456e, String str, InterfaceC0592F interfaceC0592F) {
        I.i(hVar);
        I.i(abstractC0456e);
        I.i(abstractC0467p);
        I.i(interfaceC0592F);
        ArrayList arrayList = ((C0599g) abstractC0467p).f;
        if (arrayList != null && arrayList.contains(abstractC0456e.k())) {
            return Tasks.forException(zzadr.zza(new Status(17015, null, null, null)));
        }
        if (abstractC0456e instanceof C0457f) {
            C0457f c0457f = (C0457f) abstractC0456e;
            if (TextUtils.isEmpty(c0457f.f7031c)) {
                return zza((zzacc) new zzacc(c0457f, str).zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
            }
            return zza((zzach) new zzach(c0457f).zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
        } else if (abstractC0456e instanceof v) {
            zzafc.zza();
            return zza((zzace) new zzace((v) abstractC0456e).zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
        } else {
            return zza((zzacf) new zzacf(abstractC0456e).zza(hVar).zza(abstractC0467p).zza((zzaeg<W, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
        }
    }

    public final Task<Void> zza(h hVar, AbstractC0467p abstractC0467p, C0457f c0457f, String str, InterfaceC0592F interfaceC0592F) {
        return zza((zzaci) new zzaci(c0457f, str).zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(h hVar, AbstractC0467p abstractC0467p, String str, String str2, String str3, String str4, InterfaceC0592F interfaceC0592F) {
        return zza((zzack) new zzack(str, str2, str3, str4).zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(h hVar, AbstractC0467p abstractC0467p, v vVar, String str, InterfaceC0592F interfaceC0592F) {
        zzafc.zza();
        return zza((zzacm) new zzacm(vVar, str).zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(h hVar, AbstractC0467p abstractC0467p, InterfaceC0592F interfaceC0592F) {
        return zza((zzaco) new zzaco().zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzacr(str, str2, str3, str4));
    }

    public final Task<Void> zza(h hVar, C0454c c0454c, String str) {
        return zza((zzacq) new zzacq(str, c0454c).zza(hVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzacs(str));
    }

    public final Task<W> zza(h hVar, M m7, String str) {
        return zza((zzacv) new zzacv(str).zza(hVar).zza((zzaeg<W, M>) m7));
    }

    public final Task<W> zza(h hVar, AbstractC0456e abstractC0456e, String str, M m7) {
        return zza((zzacu) new zzacu(abstractC0456e, str).zza(hVar).zza((zzaeg<W, M>) m7));
    }

    public final Task<W> zza(h hVar, String str, String str2, M m7) {
        return zza((zzacx) new zzacx(str, str2).zza(hVar).zza((zzaeg<W, M>) m7));
    }

    public final Task<W> zza(h hVar, C0457f c0457f, String str, M m7) {
        return zza((zzacz) new zzacz(c0457f, str).zza(hVar).zza((zzaeg<W, M>) m7));
    }

    public final Task<W> zza(h hVar, v vVar, String str, M m7) {
        zzafc.zza();
        return zza((zzacy) new zzacy(vVar, str).zza(hVar).zza((zzaeg<W, M>) m7));
    }

    public final Task<Void> zza(C0603k c0603k, String str, String str2, long j, boolean z7, boolean z8, String str3, String str4, String str5, boolean z9, y yVar, Executor executor, Activity activity) {
        zzadb zzadbVar = new zzadb(c0603k, str, str2, j, z7, z8, str3, str4, str5, z9);
        zzadbVar.zza(yVar, activity, executor, str);
        return zza(zzadbVar);
    }

    public final Task<zzahs> zza(C0603k c0603k, String str) {
        return zza(new zzada(c0603k, str));
    }

    public final Task<Void> zza(C0603k c0603k, C0448A c0448a, String str, long j, boolean z7, boolean z8, String str2, String str3, String str4, boolean z9, y yVar, Executor executor, Activity activity) {
        String str5 = c0603k.f8271b;
        I.e(str5);
        zzadd zzaddVar = new zzadd(c0448a, str5, str, j, z7, z8, str2, str3, str4, z9);
        zzaddVar.zza(yVar, activity, executor, c0448a.f6948a);
        return zza(zzaddVar);
    }

    public final Task<Void> zza(h hVar, AbstractC0467p abstractC0467p, String str, String str2, InterfaceC0592F interfaceC0592F) {
        return zza((zzadc) new zzadc(((C0599g) abstractC0467p).f8253a.zzf(), str, str2).zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(h hVar, AbstractC0467p abstractC0467p, v vVar, InterfaceC0592F interfaceC0592F) {
        zzafc.zza();
        return zza((zzadj) new zzadj(vVar).zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    public final Task<Void> zza(h hVar, AbstractC0467p abstractC0467p, G g3, InterfaceC0592F interfaceC0592F) {
        return zza((zzadi) new zzadi(g3).zza(hVar).zza(abstractC0467p).zza((zzaeg<Void, M>) interfaceC0592F).zza((InterfaceC0607o) interfaceC0592F));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b4.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [b4.d, java.lang.Object] */
    public static C0599g zza(h hVar, zzagl zzaglVar) {
        I.i(hVar);
        I.i(zzaglVar);
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        I.e("firebase");
        String zzi = zzaglVar.zzi();
        I.e(zzi);
        obj.f8241a = zzi;
        obj.f8242b = "firebase";
        obj.f = zzaglVar.zzh();
        obj.f8243c = zzaglVar.zzg();
        Uri zzc = zzaglVar.zzc();
        if (zzc != null) {
            obj.f8244d = zzc.toString();
            obj.f8245e = zzc;
        }
        obj.f8239Y = zzaglVar.zzm();
        obj.f8240Z = null;
        obj.f8238X = zzaglVar.zzj();
        arrayList.add(obj);
        List<zzahc> zzl = zzaglVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i7 = 0; i7 < zzl.size(); i7++) {
                zzahc zzahcVar = zzl.get(i7);
                ?? obj2 = new Object();
                I.i(zzahcVar);
                obj2.f8241a = zzahcVar.zzd();
                String zzf = zzahcVar.zzf();
                I.e(zzf);
                obj2.f8242b = zzf;
                obj2.f8243c = zzahcVar.zzb();
                Uri zza = zzahcVar.zza();
                if (zza != null) {
                    obj2.f8244d = zza.toString();
                    obj2.f8245e = zza;
                }
                obj2.f = zzahcVar.zzc();
                obj2.f8238X = zzahcVar.zze();
                obj2.f8239Y = false;
                obj2.f8240Z = zzahcVar.zzg();
                arrayList.add(obj2);
            }
        }
        C0599g c0599g = new C0599g(hVar, arrayList);
        c0599g.f8252Z = new C0600h(zzaglVar.zzb(), zzaglVar.zza());
        c0599g.f8258e0 = zzaglVar.zzn();
        c0599g.f8259f0 = zzaglVar.zze();
        c0599g.o(f.f0(zzaglVar.zzk()));
        List zzd = zzaglVar.zzd();
        if (zzd == null) {
            zzd = new ArrayList();
        }
        c0599g.f8261h0 = zzd;
        return c0599g;
    }

    public final void zza(h hVar, zzahk zzahkVar, y yVar, Activity activity, Executor executor) {
        zza((zzadn) new zzadn(zzahkVar).zza(hVar).zza(yVar, activity, executor, zzahkVar.zzd()));
    }
}
