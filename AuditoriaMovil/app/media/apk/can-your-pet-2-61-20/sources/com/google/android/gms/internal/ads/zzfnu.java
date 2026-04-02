package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfnu {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, zzfnf zzfnfVar, String str) {
        zzfnt zzfntVar;
        if (zza.matcher("Ad overlay").matches()) {
            Iterator it = this.zzb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfntVar = null;
                    break;
                }
                zzfntVar = (zzfnt) it.next();
                if (zzfntVar.zzb().get() == view) {
                    break;
                }
            }
            if (zzfntVar == null) {
                this.zzb.add(new zzfnt(view, zzfnfVar, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
