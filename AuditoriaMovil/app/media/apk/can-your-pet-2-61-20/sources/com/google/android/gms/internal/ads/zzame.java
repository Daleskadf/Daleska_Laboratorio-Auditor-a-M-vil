package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzame {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzamk zzf;
    public final String zzg;
    public final String zzh;
    public final zzame zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzame zzb(String str, long j, long j2, zzamk zzamkVar, String[] strArr, String str2, String str3, zzame zzameVar) {
        return new zzame(str, null, j, j2, zzamkVar, strArr, str2, str3, zzameVar);
    }

    public static zzame zzc(String str) {
        return new zzame(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzea zzeaVar = new zzea();
            zzeaVar.zzl(new SpannableStringBuilder());
            map.put(str, zzeaVar);
        }
        CharSequence zzq = ((zzea) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzame zzameVar = (zzame) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzameVar.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (!zzg(j) || !"div".equals(this.zza) || (str2 = this.zzh) == null) {
            for (int i = 0; i < zza(); i++) {
                zzd(i).zzk(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, str2));
    }

    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        zzame zzameVar;
        int i;
        int i2;
        zzamk zza;
        int i3;
        if (zzg(j)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            for (Map.Entry entry : this.zzl.entrySet()) {
                String str3 = (String) entry.getKey();
                int intValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzea zzeaVar = (zzea) map3.get(str3);
                    zzeaVar.getClass();
                    zzami zzamiVar = (zzami) map2.get(str2);
                    zzamiVar.getClass();
                    zzamk zza2 = zzamj.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzeaVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzeaVar.zzl(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        zzame zzameVar2 = this.zzi;
                        if (zza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza2.zzh()), intValue, intValue2, 33);
                        }
                        if (zza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzH()) {
                            zzei.zza(spannableStringBuilder, new ForegroundColorSpan(zza2.zzd()), intValue, intValue2, 33);
                        }
                        if (zza2.zzG()) {
                            zzei.zza(spannableStringBuilder, new BackgroundColorSpan(zza2.zzc()), intValue, intValue2, 33);
                        }
                        if (zza2.zzD() != null) {
                            zzei.zza(spannableStringBuilder, new TypefaceSpan(zza2.zzD()), intValue, intValue2, 33);
                        }
                        if (zza2.zzk() != null) {
                            zzamd zzk = zza2.zzk();
                            zzk.getClass();
                            int i4 = zzk.zza;
                            if (i4 == -1) {
                                int i5 = zzamiVar.zzj;
                                i4 = (i5 == 2 || i5 == 1) ? 3 : 1;
                                i3 = 1;
                            } else {
                                i3 = zzk.zzb;
                            }
                            int i6 = zzk.zzc;
                            if (i6 == -2) {
                                i6 = 1;
                            }
                            zzei.zza(spannableStringBuilder, new zzej(i4, i3, i6), intValue, intValue2, 33);
                        }
                        int zzg = zza2.zzg();
                        if (zzg == 2) {
                            while (true) {
                                if (zzameVar2 == null) {
                                    zzameVar2 = null;
                                    break;
                                }
                                zzamk zza3 = zzamj.zza(zzameVar2.zzf, zzameVar2.zzj, map);
                                if (zza3 != null && zza3.zzg() == 1) {
                                    break;
                                }
                                zzameVar2 = zzameVar2.zzi;
                            }
                            if (zzameVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzameVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzameVar = null;
                                        break;
                                    }
                                    zzame zzameVar3 = (zzame) arrayDeque.pop();
                                    zzamk zza4 = zzamj.zza(zzameVar3.zzf, zzameVar3.zzj, map);
                                    if (zza4 != null && zza4.zzg() == 3) {
                                        zzameVar = zzameVar3;
                                        break;
                                    }
                                    for (int zza5 = zzameVar3.zza() - 1; zza5 >= 0; zza5--) {
                                        arrayDeque.push(zzameVar3.zzd(zza5));
                                    }
                                }
                                if (zzameVar != null) {
                                    if (zzameVar.zza() != 1 || zzameVar.zzd(0).zzb == null) {
                                        zzfe.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = zzameVar.zzd(0).zzb;
                                        int i7 = zzfx.zza;
                                        zzamk zza6 = zzamj.zza(zzameVar.zzf, zzameVar.zzj, map);
                                        if (zza6 != null) {
                                            i2 = zza6.zzf();
                                            i = -1;
                                        } else {
                                            i = -1;
                                            i2 = -1;
                                        }
                                        if (i2 == i && (zza = zzamj.zza(zzameVar2.zzf, zzameVar2.zzj, map)) != null) {
                                            i2 = zza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzeh(str4, i2), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (zzg == 3 || zzg == 4) {
                            spannableStringBuilder.setSpan(new zzamc(), intValue, intValue2, 33);
                        }
                        if (zza2.zzF()) {
                            zzei.zza(spannableStringBuilder, new zzeg(), intValue, intValue2, 33);
                        }
                        int zze = zza2.zze();
                        if (zze == 1) {
                            zzei.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zza2.zza(), true), intValue, intValue2, 33);
                        } else if (zze == 2) {
                            zzei.zza(spannableStringBuilder, new RelativeSizeSpan(zza2.zza()), intValue, intValue2, 33);
                        } else if (zze == 3) {
                            zzei.zza(spannableStringBuilder, new RelativeSizeSpan(zza2.zza() / 100.0f), intValue, intValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza2.zzb() != Float.MAX_VALUE) {
                                zzeaVar.zzj((zza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zza2.zzj() != null) {
                                zzeaVar.zzm(zza2.zzj());
                            }
                            if (zza2.zzi() != null) {
                                zzeaVar.zzg(zza2.zzi());
                            }
                        }
                    }
                }
            }
            for (int i8 = 0; i8 < zza(); i8++) {
                zzd(i8).zzl(j, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if ("metadata".equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (!this.zzc || !z) {
            if (!"br".equals(this.zza) || !z) {
                if (zzg(j)) {
                    for (Map.Entry entry : map.entrySet()) {
                        CharSequence zzq = ((zzea) entry.getValue()).zzq();
                        zzq.getClass();
                        this.zzk.put((String) entry.getKey(), Integer.valueOf(zzq.length()));
                    }
                    boolean equals = "p".equals(this.zza);
                    for (int i = 0; i < zza(); i++) {
                        zzd(i).zzm(j, z || equals, str, map);
                    }
                    if (equals) {
                        SpannableStringBuilder zzi = zzi(str, map);
                        int length = zzi.length();
                        do {
                            length--;
                            if (length < 0) {
                                break;
                            }
                        } while (zzi.charAt(length) == ' ');
                        if (length >= 0 && zzi.charAt(length) != '\n') {
                            zzi.append('\n');
                        }
                    }
                    for (Map.Entry entry2 : map.entrySet()) {
                        CharSequence zzq2 = ((zzea) entry2.getValue()).zzq();
                        zzq2.getClass();
                        this.zzl.put((String) entry2.getKey(), Integer.valueOf(zzq2.length()));
                    }
                    return;
                }
                return;
            }
            zzi(str, map).append('\n');
            return;
        }
        SpannableStringBuilder zzi2 = zzi(str, map);
        String str2 = this.zzb;
        str2.getClass();
        zzi2.append((CharSequence) str2);
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzame zzd(int i) {
        List list = this.zzm;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return (zzame) list.get(i);
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        zzamc[] zzamcVarArr;
        List arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzami zzamiVar = (zzami) map2.get(pair.first);
                zzamiVar.getClass();
                zzea zzeaVar = new zzea();
                zzeaVar.zzc(decodeByteArray);
                zzeaVar.zzh(zzamiVar.zzb);
                zzeaVar.zzi(0);
                zzeaVar.zze(zzamiVar.zzc, 0);
                zzeaVar.zzf(zzamiVar.zze);
                zzeaVar.zzk(zzamiVar.zzf);
                zzeaVar.zzd(zzamiVar.zzg);
                zzeaVar.zzo(zzamiVar.zzj);
                arrayList2.add(zzeaVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzami zzamiVar2 = (zzami) map2.get(entry.getKey());
            zzamiVar2.getClass();
            zzea zzeaVar2 = (zzea) entry.getValue();
            CharSequence zzq = zzeaVar2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzamc zzamcVar : (zzamc[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzamc.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzamcVar), spannableStringBuilder.getSpanEnd(zzamcVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzeaVar2.zze(zzamiVar2.zzc, zzamiVar2.zzd);
            zzeaVar2.zzf(zzamiVar2.zze);
            zzeaVar2.zzh(zzamiVar2.zzb);
            zzeaVar2.zzk(zzamiVar2.zzf);
            zzeaVar2.zzn(zzamiVar2.zzi, zzamiVar2.zzh);
            zzeaVar2.zzo(zzamiVar2.zzj);
            arrayList2.add(zzeaVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzame zzameVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzameVar);
    }

    public final boolean zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i > 0 || this.zze != -9223372036854775807L) {
            if (j2 != -9223372036854775807L || j >= this.zze) {
                return i <= 0 && j < this.zze;
            }
            return true;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private zzame(String str, String str2, long j, long j2, zzamk zzamkVar, String[] strArr, String str3, String str4, zzame zzameVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzamkVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzameVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}
