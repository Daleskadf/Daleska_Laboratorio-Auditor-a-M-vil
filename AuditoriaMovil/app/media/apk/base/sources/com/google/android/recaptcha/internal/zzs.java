package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import F6.InterfaceC0091h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l6.f;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzs extends i implements p {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, dVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        zzsi zzq;
        List list;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.zza;
        org.slf4j.helpers.i.M(obj);
        if (i7 == 0) {
            D d7 = (D) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(H.q(d7, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3));
            }
            InterfaceC0091h0[] interfaceC0091h0Arr = (InterfaceC0091h0[]) arrayList2.toArray(new InterfaceC0091h0[0]);
            this.zza = 1;
            if (H.p((InterfaceC0091h0[]) Arrays.copyOf(interfaceC0091h0Arr, interfaceC0091h0Arr.length), this) == enumC1565a) {
                return enumC1565a;
            }
        }
        zzq = this.zzb.zzq(this.zzc);
        return new f(zzq);
    }
}
