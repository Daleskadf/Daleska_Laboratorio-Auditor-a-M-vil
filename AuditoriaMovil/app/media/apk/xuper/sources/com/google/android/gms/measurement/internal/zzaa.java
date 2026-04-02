package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaa extends zzkh {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzkt zzktVar) {
        super(zzktVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i10, int i11) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i10));
        if (zzuVar == null) {
            return false;
        }
        return zzu.zzb(zzuVar).get(i11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(6:19|20|21|22|23|(19:(7:25|26|27|28|(1:30)(3:503|(1:505)(1:507)|506)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:469|(6:470|471|472|473|474|(1:477)(1:476))|478)|44|(1:46)(6:280|(11:282|283|284|285|286|(2:(3:288|(1:290)|291)|293)(1:455)|294|295|(3:390|(6:393|(1:452)(2:397|(4:403|404|(7:406|(4:409|(2:411|412)(1:414)|413|407)|415|416|(4:419|(3:421|422|423)(1:425)|424|417)|426|427)(6:431|(4:434|(2:436|437)(1:439)|438|432)|440|441|(4:444|(2:446|447)(1:449)|448|442)|450)|428)(4:399|400|401|402))|429|430|402|391)|454)|297|298)(1:468)|299|(10:302|(3:306|(4:309|(5:311|312|(1:314)(1:318)|315|316)(1:319)|317|307)|320)|321|(3:325|(4:328|(3:333|334|335)|336|326)|339)|340|(3:342|(6:345|(2:347|(3:349|350|351))(1:354)|352|353|351|343)|355)|356|(3:365|(8:368|(1:370)|371|(1:373)|374|(3:376|377|378)(1:380)|379|366)|381)|382|300)|388|389)|47|(3:168|(4:171|(10:173|174|(1:176)(1:277)|177|(13:179|180|181|182|183|184|185|186|187|188|189|(3:191|(11:192|193|194|195|196|197|198|(3:200|201|202)(1:250)|203|204|(1:207)(1:206))|208)(3:256|257|258)|209)(1:276)|210|(4:213|(3:231|232|233)(4:215|216|(2:217|(2:219|(1:221)(2:222|223))(1:230))|(3:225|226|227)(1:229))|228|211)|234|235|236)(1:278)|237|169)|279)|49|50|(3:52|(6:55|(6:57|58|59|60|61|(4:(9:63|64|65|66|67|68|(1:70)|71|72)|74|75|76)(4:127|128|123|76))(1:143)|77|(2:78|(2:80|(3:114|115|116)(8:82|(2:83|(4:85|(3:87|(1:89)(1:91)|90)|92|(1:1)(2:96|(1:98)(2:99|100)))(1:113))|107|(1:109)(1:111)|110|102|103|104))(0))|117|53)|144)|145|(9:148|149|150|151|152|153|(2:155|156)(1:158)|157|146)|166|167)(2:511|512))|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|145|(1:146)|166|167) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|(2:4|(2:6|7))(2:526|527))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(19:(7:25|26|27|28|(1:30)(3:503|(1:505)(1:507)|506)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:469|(6:470|471|472|473|474|(1:477)(1:476))|478)|44|(1:46)(6:280|(11:282|283|284|285|286|(2:(3:288|(1:290)|291)|293)(1:455)|294|295|(3:390|(6:393|(1:452)(2:397|(4:403|404|(7:406|(4:409|(2:411|412)(1:414)|413|407)|415|416|(4:419|(3:421|422|423)(1:425)|424|417)|426|427)(6:431|(4:434|(2:436|437)(1:439)|438|432)|440|441|(4:444|(2:446|447)(1:449)|448|442)|450)|428)(4:399|400|401|402))|429|430|402|391)|454)|297|298)(1:468)|299|(10:302|(3:306|(4:309|(5:311|312|(1:314)(1:318)|315|316)(1:319)|317|307)|320)|321|(3:325|(4:328|(3:333|334|335)|336|326)|339)|340|(3:342|(6:345|(2:347|(3:349|350|351))(1:354)|352|353|351|343)|355)|356|(3:365|(8:368|(1:370)|371|(1:373)|374|(3:376|377|378)(1:380)|379|366)|381)|382|300)|388|389)|47|(3:168|(4:171|(10:173|174|(1:176)(1:277)|177|(13:179|180|181|182|183|184|185|186|187|188|189|(3:191|(11:192|193|194|195|196|197|198|(3:200|201|202)(1:250)|203|204|(1:207)(1:206))|208)(3:256|257|258)|209)(1:276)|210|(4:213|(3:231|232|233)(4:215|216|(2:217|(2:219|(1:221)(2:222|223))(1:230))|(3:225|226|227)(1:229))|228|211)|234|235|236)(1:278)|237|169)|279)|49|50|(3:52|(6:55|(6:57|58|59|60|61|(4:(9:63|64|65|66|67|68|(1:70)|71|72)|74|75|76)(4:127|128|123|76))(1:143)|77|(2:78|(2:80|(3:114|115|116)(8:82|(2:83|(4:85|(3:87|(1:89)(1:91)|90)|92|(1:1)(2:96|(1:98)(2:99|100)))(1:113))|107|(1:109)(1:111)|110|102|103|104))(0))|117|53)|144)|145|(9:148|149|150|151|152|153|(2:155|156)(1:158)|157|146)|166|167)(2:511|512))|525|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|145|(1:146)|166|167|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02de, code lost:
        if (r5 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0939, code lost:
        if (r9 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0a58, code lost:
        if (r8 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0174, code lost:
        if (r5 == null) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x021c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x021d, code lost:
        r20 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0220, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0221, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0224, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0225, code lost:
        r20 = "audience_id";
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b5 A[Catch: SQLiteException -> 0x021c, all -> 0x0b14, TRY_LEAVE, TryCatch #8 {SQLiteException -> 0x021c, blocks: (B:58:0x01af, B:60:0x01b5, B:62:0x01c1, B:63:0x01c6, B:64:0x01d0, B:65:0x01e0, B:67:0x01ed), top: B:433:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c1 A[Catch: SQLiteException -> 0x021c, all -> 0x0b14, TRY_ENTER, TryCatch #8 {SQLiteException -> 0x021c, blocks: (B:58:0x01af, B:60:0x01b5, B:62:0x01c1, B:63:0x01c6, B:64:0x01d0, B:65:0x01e0, B:67:0x01ed), top: B:433:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0251  */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zza(java.lang.String r64, java.util.List r65, java.util.List r66, java.lang.Long r67, java.lang.Long r68) {
        /*
            Method dump skipped, instructions count: 2846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }
}
