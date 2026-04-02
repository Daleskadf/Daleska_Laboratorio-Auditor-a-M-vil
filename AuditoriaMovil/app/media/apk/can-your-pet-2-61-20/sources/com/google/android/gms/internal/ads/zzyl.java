package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzyl extends zzdg {
    public static final zzyl zzF;
    @Deprecated
    public static final zzyl zzG;
    @Deprecated
    public static final zzn zzH;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    private static final String zzam;
    private static final String zzan;
    private static final String zzao;
    private static final String zzap;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    private final SparseArray zzaq;
    private final SparseBooleanArray zzar;

    static {
        zzyl zzylVar = new zzyl(new zzyj());
        zzF = zzylVar;
        zzG = zzylVar;
        zzX = Integer.toString(1000, 36);
        zzY = Integer.toString(PointerIconCompat.TYPE_CONTEXT_MENU, 36);
        zzZ = Integer.toString(PointerIconCompat.TYPE_HAND, 36);
        zzaa = Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        zzab = Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
        zzac = Integer.toString(1005, 36);
        zzad = Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        zzae = Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        zzaf = Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        zzag = Integer.toString(1009, 36);
        zzah = Integer.toString(PointerIconCompat.TYPE_ALIAS, 36);
        zzai = Integer.toString(PointerIconCompat.TYPE_COPY, 36);
        zzaj = Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        zzak = Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        zzal = Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        zzam = Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        zzan = Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        zzao = Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        zzap = Integer.toString(PointerIconCompat.TYPE_ZOOM_IN, 36);
        zzH = new zzn() { // from class: com.google.android.gms.internal.ads.zzyh
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzyl(zzyj zzyjVar) {
        super(zzyjVar);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z = zzyjVar.zza;
        this.zzI = z;
        this.zzJ = false;
        z2 = zzyjVar.zzb;
        this.zzK = z2;
        this.zzL = false;
        z3 = zzyjVar.zzc;
        this.zzM = z3;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = false;
        z4 = zzyjVar.zzd;
        this.zzR = z4;
        z5 = zzyjVar.zze;
        this.zzS = z5;
        z6 = zzyjVar.zzf;
        this.zzT = z6;
        this.zzU = false;
        z7 = zzyjVar.zzg;
        this.zzV = z7;
        this.zzW = false;
        sparseArray = zzyjVar.zzh;
        this.zzaq = sparseArray;
        sparseBooleanArray = zzyjVar.zzi;
        this.zzar = sparseBooleanArray;
    }

    public static zzyl zzd(Context context) {
        return new zzyl(new zzyj(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyl zzylVar = (zzyl) obj;
            if (super.equals(zzylVar) && this.zzI == zzylVar.zzI && this.zzK == zzylVar.zzK && this.zzM == zzylVar.zzM && this.zzR == zzylVar.zzR && this.zzS == zzylVar.zzS && this.zzT == zzylVar.zzT && this.zzV == zzylVar.zzV) {
                SparseBooleanArray sparseBooleanArray = this.zzar;
                SparseBooleanArray sparseBooleanArray2 = zzylVar.zzar;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray sparseArray = this.zzaq;
                            SparseArray sparseArray2 = zzylVar.zzaq;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzxk zzxkVar = (zzxk) entry.getKey();
                                                if (map2.containsKey(zzxkVar)) {
                                                    if (!zzfx.zzG(entry.getValue(), map2.get(zzxkVar))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 28629151) + (this.zzR ? 1 : 0)) * 31) + (this.zzS ? 1 : 0)) * 31) + (this.zzT ? 1 : 0)) * 961) + (this.zzV ? 1 : 0)) * 31;
    }

    public final zzyj zzc() {
        return new zzyj(this, null);
    }

    @Deprecated
    public final zzyn zze(int i, zzxk zzxkVar) {
        Map map = (Map) this.zzaq.get(i);
        if (map != null) {
            return (zzyn) map.get(zzxkVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzar.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzxk zzxkVar) {
        Map map = (Map) this.zzaq.get(i);
        return map != null && map.containsKey(zzxkVar);
    }
}
