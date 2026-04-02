package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hpplay.component.protocol.PlistBuilder;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzap extends zzd {
    public static final String zzb = CastUtils.zzc("com.google.cast.media");
    private int zzA;
    private TaskCompletionSource<SessionState> zzB;
    @VisibleForTesting
    final zzat zzc;
    @VisibleForTesting
    final zzat zzd;
    @VisibleForTesting
    final zzat zze;
    @VisibleForTesting
    final zzat zzf;
    @VisibleForTesting
    final zzat zzg;
    @VisibleForTesting
    final zzat zzh;
    @VisibleForTesting
    final zzat zzi;
    @VisibleForTesting
    final zzat zzj;
    @VisibleForTesting
    final zzat zzk;
    @VisibleForTesting
    final zzat zzl;
    @VisibleForTesting
    final zzat zzm;
    @VisibleForTesting
    final zzat zzn;
    @VisibleForTesting
    final zzat zzo;
    @VisibleForTesting
    final zzat zzp;
    @VisibleForTesting
    final zzat zzq;
    @VisibleForTesting
    final zzat zzr;
    @VisibleForTesting
    final zzat zzs;
    @VisibleForTesting
    final zzat zzt;
    @VisibleForTesting
    final zzat zzu;
    @VisibleForTesting
    final zzat zzv;
    private long zzw;
    private MediaStatus zzx;
    private Long zzy;
    private zzam zzz;

    public zzap(String str) {
        super(zzb, "MediaControlChannel", null);
        this.zzA = -1;
        zzat zzatVar = new zzat(86400000L);
        this.zzc = zzatVar;
        zzat zzatVar2 = new zzat(86400000L);
        this.zzd = zzatVar2;
        zzat zzatVar3 = new zzat(86400000L);
        this.zze = zzatVar3;
        zzat zzatVar4 = new zzat(86400000L);
        this.zzf = zzatVar4;
        zzat zzatVar5 = new zzat(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);
        this.zzg = zzatVar5;
        zzat zzatVar6 = new zzat(86400000L);
        this.zzh = zzatVar6;
        zzat zzatVar7 = new zzat(86400000L);
        this.zzi = zzatVar7;
        zzat zzatVar8 = new zzat(86400000L);
        this.zzj = zzatVar8;
        zzat zzatVar9 = new zzat(86400000L);
        this.zzk = zzatVar9;
        zzat zzatVar10 = new zzat(86400000L);
        this.zzl = zzatVar10;
        zzat zzatVar11 = new zzat(86400000L);
        this.zzm = zzatVar11;
        zzat zzatVar12 = new zzat(86400000L);
        this.zzn = zzatVar12;
        zzat zzatVar13 = new zzat(86400000L);
        this.zzo = zzatVar13;
        zzat zzatVar14 = new zzat(86400000L);
        this.zzp = zzatVar14;
        zzat zzatVar15 = new zzat(86400000L);
        this.zzq = zzatVar15;
        zzat zzatVar16 = new zzat(86400000L);
        this.zzs = zzatVar16;
        this.zzr = new zzat(86400000L);
        zzat zzatVar17 = new zzat(86400000L);
        this.zzt = zzatVar17;
        zzat zzatVar18 = new zzat(86400000L);
        this.zzu = zzatVar18;
        zzat zzatVar19 = new zzat(86400000L);
        this.zzv = zzatVar19;
        zzc(zzatVar);
        zzc(zzatVar2);
        zzc(zzatVar3);
        zzc(zzatVar4);
        zzc(zzatVar5);
        zzc(zzatVar6);
        zzc(zzatVar7);
        zzc(zzatVar8);
        zzc(zzatVar9);
        zzc(zzatVar10);
        zzc(zzatVar11);
        zzc(zzatVar12);
        zzc(zzatVar13);
        zzc(zzatVar14);
        zzc(zzatVar15);
        zzc(zzatVar16);
        zzc(zzatVar16);
        zzc(zzatVar17);
        zzc(zzatVar18);
        zzc(zzatVar19);
        zzV();
    }

    private final long zzT(double d10, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzw;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j10;
        }
        double d11 = elapsedRealtime;
        Double.isNaN(d11);
        long j12 = j10 + ((long) (d11 * d10));
        if (j11 <= 0 || j12 <= j11) {
            if (j12 < 0) {
                return 0L;
            }
            return j12;
        }
        return j11;
    }

    private static zzao zzU(JSONObject jSONObject) {
        MediaError zza = MediaError.zza(jSONObject);
        zzao zzaoVar = new zzao();
        zzaoVar.zza = CastUtils.zzg(jSONObject, "customData");
        zzaoVar.zzb = zza;
        return zzaoVar;
    }

    private final void zzV() {
        this.zzw = 0L;
        this.zzx = null;
        for (zzat zzatVar : zza()) {
            zzatVar.zzc(CastStatusCodes.CANCELED);
        }
    }

    private final void zzW(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.zzA = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.zza.w(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    private final void zzX() {
        zzam zzamVar = this.zzz;
        if (zzamVar != null) {
            zzamVar.zzc();
        }
    }

    private final void zzY() {
        zzam zzamVar = this.zzz;
        if (zzamVar != null) {
            zzamVar.zzd();
        }
    }

    private final void zzZ() {
        zzam zzamVar = this.zzz;
        if (zzamVar != null) {
            zzamVar.zzk();
        }
    }

    private final void zzaa() {
        zzam zzamVar = this.zzz;
        if (zzamVar != null) {
            zzamVar.zzm();
        }
    }

    private final boolean zzab() {
        return this.zzA != -1;
    }

    private static int[] zzac(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    public final long zzA(zzar zzarVar, int i10, long j10, MediaQueueItem[] mediaQueueItemArr, int i11, boolean z10, Integer num, JSONObject jSONObject) {
        if (j10 != -1 && j10 < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("playPosition cannot be negative: ");
            sb.append(j10);
            throw new IllegalArgumentException(sb.toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", zzn());
            if (i10 != 0) {
                jSONObject2.put("currentItemId", i10);
            }
            if (i11 != 0) {
                jSONObject2.put("jump", i11);
            }
            if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i12 = 0; i12 < mediaQueueItemArr.length; i12++) {
                    jSONArray.put(i12, mediaQueueItemArr[i12].toJson());
                }
                jSONObject2.put("items", jSONArray);
            }
            if (z10) {
                jSONObject2.put("shuffle", true);
            }
            String zza = MediaCommon.zza(num);
            if (zza != null) {
                jSONObject2.put("repeatMode", zza);
            }
            if (j10 != -1) {
                jSONObject2.put("currentTime", CastUtils.millisecToSec(j10));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzab()) {
                jSONObject2.put("sequenceNumber", this.zzA);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zzn.zzb(zzd, new zzal(this, zzarVar));
        return zzd;
    }

    public final long zzB(zzar zzarVar) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = this.zzx;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.zzb());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzj.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzC(zzar zzarVar, MediaSeekOptions mediaSeekOptions) {
        long position;
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        if (mediaSeekOptions.isSeekToInfinite()) {
            position = 4294967296000L;
        } else {
            position = mediaSeekOptions.getPosition();
        }
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", zzn());
            jSONObject.put("currentTime", CastUtils.millisecToSec(position));
            if (mediaSeekOptions.getResumeState() == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (mediaSeekOptions.getResumeState() == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (mediaSeekOptions.getCustomData() != null) {
                jSONObject.put("customData", mediaSeekOptions.getCustomData());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzy = Long.valueOf(position);
        this.zzg.zzb(zzd, new zzaj(this, zzarVar));
        return zzd;
    }

    public final long zzD(zzar zzarVar, long[] jArr) {
        if (jArr != null) {
            JSONObject jSONObject = new JSONObject();
            long zzd = zzd();
            try {
                jSONObject.put("requestId", zzd);
                jSONObject.put("type", "EDIT_TRACKS_INFO");
                jSONObject.put("mediaSessionId", zzn());
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < jArr.length; i10++) {
                    jSONArray.put(i10, jArr[i10]);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            } catch (JSONException unused) {
            }
            zzg(jSONObject.toString(), zzd, null);
            this.zzk.zzb(zzd, zzarVar);
            return zzd;
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    public final long zzE(zzar zzarVar, double d10, JSONObject jSONObject) {
        if (this.zzx != null) {
            JSONObject jSONObject2 = new JSONObject();
            long zzd = zzd();
            try {
                jSONObject2.put("requestId", zzd);
                jSONObject2.put("type", "SET_PLAYBACK_RATE");
                jSONObject2.put("playbackRate", d10);
                Preconditions.checkNotNull(this.zzx, "mediaStatus should not be null");
                jSONObject2.put("mediaSessionId", this.zzx.zzb());
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException unused) {
            }
            zzg(jSONObject2.toString(), zzd, null);
            this.zzt.zzb(zzd, zzarVar);
            return zzd;
        }
        throw new zzan();
    }

    public final long zzF(zzar zzarVar, boolean z10, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzn());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("muted", z10);
            jSONObject2.put(PlistBuilder.VALUE_TYPE_VOLUME, jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zzi.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzG(zzar zzarVar, double d10, JSONObject jSONObject) {
        if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
            JSONObject jSONObject2 = new JSONObject();
            long zzd = zzd();
            try {
                jSONObject2.put("requestId", zzd);
                jSONObject2.put("type", "SET_VOLUME");
                jSONObject2.put("mediaSessionId", zzn());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(FirebaseAnalytics.Param.LEVEL, d10);
                jSONObject2.put(PlistBuilder.VALUE_TYPE_VOLUME, jSONObject3);
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException unused) {
            }
            zzg(jSONObject2.toString(), zzd, null);
            this.zzh.zzb(zzd, zzarVar);
            return zzd;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Volume cannot be ");
        sb.append(d10);
        throw new IllegalArgumentException(sb.toString());
    }

    public final long zzH(zzar zzarVar, TextTrackStyle textTrackStyle) {
        if (textTrackStyle != null) {
            JSONObject jSONObject = new JSONObject();
            long zzd = zzd();
            try {
                jSONObject.put("requestId", zzd);
                jSONObject.put("type", "EDIT_TRACKS_INFO");
                jSONObject.put("textTrackStyle", textTrackStyle.zza());
                jSONObject.put("mediaSessionId", zzn());
            } catch (JSONException unused) {
            }
            zzg(jSONObject.toString(), zzd, null);
            this.zzl.zzb(zzd, zzarVar);
            return zzd;
        }
        throw new IllegalArgumentException("trackStyle cannot be null");
    }

    public final long zzI(zzar zzarVar) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put("type", "SKIP_AD");
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException e10) {
            this.zza.w(String.format(Locale.ROOT, "Error creating SkipAd message: %s", e10.getMessage()), new Object[0]);
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzu.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzJ(zzar zzarVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zzf.zzb(zzd, zzarVar);
        return zzd;
    }

    public final MediaInfo zzK() {
        MediaStatus mediaStatus = this.zzx;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getMediaInfo();
    }

    public final MediaStatus zzL() {
        return this.zzx;
    }

    public final Task<SessionState> zzN(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put("type", "STORE_SESSION");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("assistant_supported", true);
            jSONObject3.put("display_supported", true);
            jSONObject3.put("is_group", false);
            jSONObject2.put("targetDeviceCapabilities", jSONObject3);
        } catch (JSONException e10) {
            this.zza.w(e10, "store session failed to create JSON message", new Object[0]);
        }
        try {
            zzg(jSONObject2.toString(), zzd, null);
            this.zzv.zzb(zzd, new zzak(this));
            TaskCompletionSource<SessionState> taskCompletionSource = new TaskCompletionSource<>();
            this.zzB = taskCompletionSource;
            return taskCompletionSource.getTask();
        } catch (IllegalStateException e11) {
            return Tasks.forException(e11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0283 A[Catch: JSONException -> 0x031e, TryCatch #0 {JSONException -> 0x031e, blocks: (B:3:0x0014, B:41:0x00a0, B:43:0x00a9, B:45:0x00b1, B:47:0x00bb, B:49:0x00c7, B:50:0x00d4, B:52:0x00da, B:53:0x00ec, B:55:0x00f2, B:57:0x00fe, B:59:0x0112, B:80:0x014d, B:82:0x0162, B:84:0x017e, B:86:0x0184, B:88:0x018a, B:90:0x0190, B:92:0x0196, B:94:0x01a2, B:96:0x01ac, B:98:0x01b2, B:99:0x01ba, B:101:0x01c0, B:102:0x01d0, B:105:0x01d6, B:107:0x01e0, B:108:0x01f1, B:110:0x01f7, B:111:0x0207, B:113:0x0213, B:115:0x021f, B:116:0x0230, B:118:0x0236, B:119:0x0246, B:121:0x0252, B:123:0x0264, B:134:0x0283, B:137:0x0288, B:139:0x029c, B:141:0x02a0, B:142:0x02ac, B:144:0x02b0, B:145:0x02b9, B:147:0x02bd, B:148:0x02c3, B:150:0x02c7, B:151:0x02ca, B:153:0x02ce, B:154:0x02d1, B:156:0x02d5, B:157:0x02d8, B:159:0x02dc, B:161:0x02e6, B:162:0x02e9, B:164:0x02ed, B:166:0x0305, B:167:0x030d, B:169:0x0313, B:138:0x028d, B:127:0x026f, B:129:0x0277, B:165:0x02f7), top: B:175:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a0 A[Catch: JSONException -> 0x031e, TryCatch #0 {JSONException -> 0x031e, blocks: (B:3:0x0014, B:41:0x00a0, B:43:0x00a9, B:45:0x00b1, B:47:0x00bb, B:49:0x00c7, B:50:0x00d4, B:52:0x00da, B:53:0x00ec, B:55:0x00f2, B:57:0x00fe, B:59:0x0112, B:80:0x014d, B:82:0x0162, B:84:0x017e, B:86:0x0184, B:88:0x018a, B:90:0x0190, B:92:0x0196, B:94:0x01a2, B:96:0x01ac, B:98:0x01b2, B:99:0x01ba, B:101:0x01c0, B:102:0x01d0, B:105:0x01d6, B:107:0x01e0, B:108:0x01f1, B:110:0x01f7, B:111:0x0207, B:113:0x0213, B:115:0x021f, B:116:0x0230, B:118:0x0236, B:119:0x0246, B:121:0x0252, B:123:0x0264, B:134:0x0283, B:137:0x0288, B:139:0x029c, B:141:0x02a0, B:142:0x02ac, B:144:0x02b0, B:145:0x02b9, B:147:0x02bd, B:148:0x02c3, B:150:0x02c7, B:151:0x02ca, B:153:0x02ce, B:154:0x02d1, B:156:0x02d5, B:157:0x02d8, B:159:0x02dc, B:161:0x02e6, B:162:0x02e9, B:164:0x02ed, B:166:0x0305, B:167:0x030d, B:169:0x0313, B:138:0x028d, B:127:0x026f, B:129:0x0277, B:165:0x02f7), top: B:175:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b0 A[Catch: JSONException -> 0x031e, TryCatch #0 {JSONException -> 0x031e, blocks: (B:3:0x0014, B:41:0x00a0, B:43:0x00a9, B:45:0x00b1, B:47:0x00bb, B:49:0x00c7, B:50:0x00d4, B:52:0x00da, B:53:0x00ec, B:55:0x00f2, B:57:0x00fe, B:59:0x0112, B:80:0x014d, B:82:0x0162, B:84:0x017e, B:86:0x0184, B:88:0x018a, B:90:0x0190, B:92:0x0196, B:94:0x01a2, B:96:0x01ac, B:98:0x01b2, B:99:0x01ba, B:101:0x01c0, B:102:0x01d0, B:105:0x01d6, B:107:0x01e0, B:108:0x01f1, B:110:0x01f7, B:111:0x0207, B:113:0x0213, B:115:0x021f, B:116:0x0230, B:118:0x0236, B:119:0x0246, B:121:0x0252, B:123:0x0264, B:134:0x0283, B:137:0x0288, B:139:0x029c, B:141:0x02a0, B:142:0x02ac, B:144:0x02b0, B:145:0x02b9, B:147:0x02bd, B:148:0x02c3, B:150:0x02c7, B:151:0x02ca, B:153:0x02ce, B:154:0x02d1, B:156:0x02d5, B:157:0x02d8, B:159:0x02dc, B:161:0x02e6, B:162:0x02e9, B:164:0x02ed, B:166:0x0305, B:167:0x030d, B:169:0x0313, B:138:0x028d, B:127:0x026f, B:129:0x0277, B:165:0x02f7), top: B:175:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02bd A[Catch: JSONException -> 0x031e, TryCatch #0 {JSONException -> 0x031e, blocks: (B:3:0x0014, B:41:0x00a0, B:43:0x00a9, B:45:0x00b1, B:47:0x00bb, B:49:0x00c7, B:50:0x00d4, B:52:0x00da, B:53:0x00ec, B:55:0x00f2, B:57:0x00fe, B:59:0x0112, B:80:0x014d, B:82:0x0162, B:84:0x017e, B:86:0x0184, B:88:0x018a, B:90:0x0190, B:92:0x0196, B:94:0x01a2, B:96:0x01ac, B:98:0x01b2, B:99:0x01ba, B:101:0x01c0, B:102:0x01d0, B:105:0x01d6, B:107:0x01e0, B:108:0x01f1, B:110:0x01f7, B:111:0x0207, B:113:0x0213, B:115:0x021f, B:116:0x0230, B:118:0x0236, B:119:0x0246, B:121:0x0252, B:123:0x0264, B:134:0x0283, B:137:0x0288, B:139:0x029c, B:141:0x02a0, B:142:0x02ac, B:144:0x02b0, B:145:0x02b9, B:147:0x02bd, B:148:0x02c3, B:150:0x02c7, B:151:0x02ca, B:153:0x02ce, B:154:0x02d1, B:156:0x02d5, B:157:0x02d8, B:159:0x02dc, B:161:0x02e6, B:162:0x02e9, B:164:0x02ed, B:166:0x0305, B:167:0x030d, B:169:0x0313, B:138:0x028d, B:127:0x026f, B:129:0x0277, B:165:0x02f7), top: B:175:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c7 A[Catch: JSONException -> 0x031e, TryCatch #0 {JSONException -> 0x031e, blocks: (B:3:0x0014, B:41:0x00a0, B:43:0x00a9, B:45:0x00b1, B:47:0x00bb, B:49:0x00c7, B:50:0x00d4, B:52:0x00da, B:53:0x00ec, B:55:0x00f2, B:57:0x00fe, B:59:0x0112, B:80:0x014d, B:82:0x0162, B:84:0x017e, B:86:0x0184, B:88:0x018a, B:90:0x0190, B:92:0x0196, B:94:0x01a2, B:96:0x01ac, B:98:0x01b2, B:99:0x01ba, B:101:0x01c0, B:102:0x01d0, B:105:0x01d6, B:107:0x01e0, B:108:0x01f1, B:110:0x01f7, B:111:0x0207, B:113:0x0213, B:115:0x021f, B:116:0x0230, B:118:0x0236, B:119:0x0246, B:121:0x0252, B:123:0x0264, B:134:0x0283, B:137:0x0288, B:139:0x029c, B:141:0x02a0, B:142:0x02ac, B:144:0x02b0, B:145:0x02b9, B:147:0x02bd, B:148:0x02c3, B:150:0x02c7, B:151:0x02ca, B:153:0x02ce, B:154:0x02d1, B:156:0x02d5, B:157:0x02d8, B:159:0x02dc, B:161:0x02e6, B:162:0x02e9, B:164:0x02ed, B:166:0x0305, B:167:0x030d, B:169:0x0313, B:138:0x028d, B:127:0x026f, B:129:0x0277, B:165:0x02f7), top: B:175:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ce A[Catch: JSONException -> 0x031e, TryCatch #0 {JSONException -> 0x031e, blocks: (B:3:0x0014, B:41:0x00a0, B:43:0x00a9, B:45:0x00b1, B:47:0x00bb, B:49:0x00c7, B:50:0x00d4, B:52:0x00da, B:53:0x00ec, B:55:0x00f2, B:57:0x00fe, B:59:0x0112, B:80:0x014d, B:82:0x0162, B:84:0x017e, B:86:0x0184, B:88:0x018a, B:90:0x0190, B:92:0x0196, B:94:0x01a2, B:96:0x01ac, B:98:0x01b2, B:99:0x01ba, B:101:0x01c0, B:102:0x01d0, B:105:0x01d6, B:107:0x01e0, B:108:0x01f1, B:110:0x01f7, B:111:0x0207, B:113:0x0213, B:115:0x021f, B:116:0x0230, B:118:0x0236, B:119:0x0246, B:121:0x0252, B:123:0x0264, B:134:0x0283, B:137:0x0288, B:139:0x029c, B:141:0x02a0, B:142:0x02ac, B:144:0x02b0, B:145:0x02b9, B:147:0x02bd, B:148:0x02c3, B:150:0x02c7, B:151:0x02ca, B:153:0x02ce, B:154:0x02d1, B:156:0x02d5, B:157:0x02d8, B:159:0x02dc, B:161:0x02e6, B:162:0x02e9, B:164:0x02ed, B:166:0x0305, B:167:0x030d, B:169:0x0313, B:138:0x028d, B:127:0x026f, B:129:0x0277, B:165:0x02f7), top: B:175:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d5 A[Catch: JSONException -> 0x031e, TryCatch #0 {JSONException -> 0x031e, blocks: (B:3:0x0014, B:41:0x00a0, B:43:0x00a9, B:45:0x00b1, B:47:0x00bb, B:49:0x00c7, B:50:0x00d4, B:52:0x00da, B:53:0x00ec, B:55:0x00f2, B:57:0x00fe, B:59:0x0112, B:80:0x014d, B:82:0x0162, B:84:0x017e, B:86:0x0184, B:88:0x018a, B:90:0x0190, B:92:0x0196, B:94:0x01a2, B:96:0x01ac, B:98:0x01b2, B:99:0x01ba, B:101:0x01c0, B:102:0x01d0, B:105:0x01d6, B:107:0x01e0, B:108:0x01f1, B:110:0x01f7, B:111:0x0207, B:113:0x0213, B:115:0x021f, B:116:0x0230, B:118:0x0236, B:119:0x0246, B:121:0x0252, B:123:0x0264, B:134:0x0283, B:137:0x0288, B:139:0x029c, B:141:0x02a0, B:142:0x02ac, B:144:0x02b0, B:145:0x02b9, B:147:0x02bd, B:148:0x02c3, B:150:0x02c7, B:151:0x02ca, B:153:0x02ce, B:154:0x02d1, B:156:0x02d5, B:157:0x02d8, B:159:0x02dc, B:161:0x02e6, B:162:0x02e9, B:164:0x02ed, B:166:0x0305, B:167:0x030d, B:169:0x0313, B:138:0x028d, B:127:0x026f, B:129:0x0277, B:165:0x02f7), top: B:175:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02dc A[Catch: JSONException -> 0x031e, TryCatch #0 {JSONException -> 0x031e, blocks: (B:3:0x0014, B:41:0x00a0, B:43:0x00a9, B:45:0x00b1, B:47:0x00bb, B:49:0x00c7, B:50:0x00d4, B:52:0x00da, B:53:0x00ec, B:55:0x00f2, B:57:0x00fe, B:59:0x0112, B:80:0x014d, B:82:0x0162, B:84:0x017e, B:86:0x0184, B:88:0x018a, B:90:0x0190, B:92:0x0196, B:94:0x01a2, B:96:0x01ac, B:98:0x01b2, B:99:0x01ba, B:101:0x01c0, B:102:0x01d0, B:105:0x01d6, B:107:0x01e0, B:108:0x01f1, B:110:0x01f7, B:111:0x0207, B:113:0x0213, B:115:0x021f, B:116:0x0230, B:118:0x0236, B:119:0x0246, B:121:0x0252, B:123:0x0264, B:134:0x0283, B:137:0x0288, B:139:0x029c, B:141:0x02a0, B:142:0x02ac, B:144:0x02b0, B:145:0x02b9, B:147:0x02bd, B:148:0x02c3, B:150:0x02c7, B:151:0x02ca, B:153:0x02ce, B:154:0x02d1, B:156:0x02d5, B:157:0x02d8, B:159:0x02dc, B:161:0x02e6, B:162:0x02e9, B:164:0x02ed, B:166:0x0305, B:167:0x030d, B:169:0x0313, B:138:0x028d, B:127:0x026f, B:129:0x0277, B:165:0x02f7), top: B:175:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ed A[Catch: JSONException -> 0x031e, TryCatch #0 {JSONException -> 0x031e, blocks: (B:3:0x0014, B:41:0x00a0, B:43:0x00a9, B:45:0x00b1, B:47:0x00bb, B:49:0x00c7, B:50:0x00d4, B:52:0x00da, B:53:0x00ec, B:55:0x00f2, B:57:0x00fe, B:59:0x0112, B:80:0x014d, B:82:0x0162, B:84:0x017e, B:86:0x0184, B:88:0x018a, B:90:0x0190, B:92:0x0196, B:94:0x01a2, B:96:0x01ac, B:98:0x01b2, B:99:0x01ba, B:101:0x01c0, B:102:0x01d0, B:105:0x01d6, B:107:0x01e0, B:108:0x01f1, B:110:0x01f7, B:111:0x0207, B:113:0x0213, B:115:0x021f, B:116:0x0230, B:118:0x0236, B:119:0x0246, B:121:0x0252, B:123:0x0264, B:134:0x0283, B:137:0x0288, B:139:0x029c, B:141:0x02a0, B:142:0x02ac, B:144:0x02b0, B:145:0x02b9, B:147:0x02bd, B:148:0x02c3, B:150:0x02c7, B:151:0x02ca, B:153:0x02ce, B:154:0x02d1, B:156:0x02d5, B:157:0x02d8, B:159:0x02dc, B:161:0x02e6, B:162:0x02e9, B:164:0x02ed, B:166:0x0305, B:167:0x030d, B:169:0x0313, B:138:0x028d, B:127:0x026f, B:129:0x0277, B:165:0x02f7), top: B:175:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzQ(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.internal.zzap.zzQ(java.lang.String):void");
    }

    public final void zzR(long j10, int i10) {
        for (zzat zzatVar : zza()) {
            zzatVar.zzd(j10, i10, null);
        }
    }

    public final void zzS(zzam zzamVar) {
        this.zzz = zzamVar;
    }

    @Override // com.google.android.gms.cast.internal.zzp
    public final void zzf() {
        zzb();
        zzV();
    }

    public final long zzj() {
        MediaStatus mediaStatus;
        AdBreakStatus adBreakStatus;
        double d10;
        if (this.zzw == 0 || (mediaStatus = this.zzx) == null || (adBreakStatus = mediaStatus.getAdBreakStatus()) == null) {
            return 0L;
        }
        double playbackRate = this.zzx.getPlaybackRate();
        if (playbackRate == 0.0d) {
            playbackRate = 1.0d;
        }
        if (this.zzx.getPlayerState() != 2) {
            d10 = 0.0d;
        } else {
            d10 = playbackRate;
        }
        return zzT(d10, adBreakStatus.getCurrentBreakClipTimeInMs(), 0L);
    }

    public final long zzk() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzx;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long endTime = liveSeekableRange.getEndTime();
        if (!liveSeekableRange.isLiveDone()) {
            return zzT(1.0d, endTime, -1L);
        }
        return endTime;
    }

    public final long zzl() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzx;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long startTime = liveSeekableRange.getStartTime();
        if (liveSeekableRange.isMovingWindow()) {
            startTime = zzT(1.0d, startTime, -1L);
        }
        if (liveSeekableRange.isLiveDone()) {
            return Math.min(startTime, liveSeekableRange.getEndTime());
        }
        return startTime;
    }

    public final long zzm() {
        MediaStatus mediaStatus;
        MediaInfo zzK = zzK();
        if (zzK == null || (mediaStatus = this.zzx) == null) {
            return 0L;
        }
        Long l10 = this.zzy;
        if (l10 != null) {
            if (l10.equals(4294967296000L)) {
                if (this.zzx.getLiveSeekableRange() != null) {
                    return Math.min(l10.longValue(), zzk());
                }
                if (zzo() >= 0) {
                    return Math.min(l10.longValue(), zzo());
                }
            }
            return l10.longValue();
        } else if (this.zzw == 0) {
            return 0L;
        } else {
            double playbackRate = mediaStatus.getPlaybackRate();
            long streamPosition = this.zzx.getStreamPosition();
            int playerState = this.zzx.getPlayerState();
            if (playbackRate != 0.0d && playerState == 2) {
                return zzT(playbackRate, streamPosition, zzK.getStreamDuration());
            }
            return streamPosition;
        }
    }

    public final long zzn() {
        MediaStatus mediaStatus = this.zzx;
        if (mediaStatus != null) {
            return mediaStatus.zzb();
        }
        throw new zzan();
    }

    public final long zzo() {
        MediaInfo zzK = zzK();
        if (zzK != null) {
            return zzK.getStreamDuration();
        }
        return 0L;
    }

    public final long zzp(zzar zzarVar, MediaLoadRequestData mediaLoadRequestData) {
        if (mediaLoadRequestData.getMediaInfo() == null && mediaLoadRequestData.getQueueData() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject json = mediaLoadRequestData.toJson();
        if (json != null) {
            long zzd = zzd();
            try {
                json.put("requestId", zzd);
                json.put("type", "LOAD");
            } catch (JSONException unused) {
            }
            zzg(json.toString(), zzd, null);
            this.zzc.zzb(zzd, zzarVar);
            return zzd;
        }
        throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
    }

    public final long zzq(zzar zzarVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zzd.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzr(zzar zzarVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zze.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzs(String str, List list) {
        long zzd = zzd();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put("type", "PRECACHE");
            jSONObject.put("precacheData", str);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        return zzd;
    }

    public final long zzt(zzar zzarVar, int i10, int i11, int i12) {
        if (i11 > 0 && i12 == 0) {
            i12 = 0;
        } else if (i11 != 0 || i12 <= 0) {
            throw new IllegalArgumentException("Exactly one of nextCount and prevCount must be positive and the other must be zero");
        }
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put("type", "QUEUE_GET_ITEM_RANGE");
            jSONObject.put("mediaSessionId", zzn());
            jSONObject.put("itemId", i10);
            if (i11 > 0) {
                jSONObject.put("nextCount", i11);
            }
            if (i12 > 0) {
                jSONObject.put("prevCount", i12);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzs.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzu(zzar zzarVar) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzq.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzv(zzar zzarVar, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i10 : iArr) {
                jSONArray.put(i10);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzr.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzw(zzar zzarVar, MediaQueueItem[] mediaQueueItemArr, int i10, int i11, int i12, long j10, JSONObject jSONObject) {
        if (mediaQueueItemArr != null && mediaQueueItemArr.length != 0) {
            if (j10 != -1 && j10 < 0) {
                StringBuilder sb = new StringBuilder(54);
                sb.append("playPosition can not be negative: ");
                sb.append(j10);
                throw new IllegalArgumentException(sb.toString());
            }
            JSONObject jSONObject2 = new JSONObject();
            long zzd = zzd();
            try {
                jSONObject2.put("requestId", zzd);
                jSONObject2.put("type", "QUEUE_INSERT");
                jSONObject2.put("mediaSessionId", zzn());
                JSONArray jSONArray = new JSONArray();
                for (int i13 = 0; i13 < mediaQueueItemArr.length; i13++) {
                    jSONArray.put(i13, mediaQueueItemArr[i13].toJson());
                }
                jSONObject2.put("items", jSONArray);
                if (i10 != 0) {
                    jSONObject2.put("insertBefore", i10);
                }
                if (i12 != -1) {
                    jSONObject2.put("currentItemIndex", 0);
                }
                if (j10 != -1) {
                    jSONObject2.put("currentTime", CastUtils.millisecToSec(j10));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
                if (zzab()) {
                    jSONObject2.put("sequenceNumber", this.zzA);
                }
            } catch (JSONException unused) {
            }
            zzg(jSONObject2.toString(), zzd, null);
            this.zzm.zzb(zzd, new zzal(this, zzarVar));
            return zzd;
        }
        throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
    }

    public final long zzx(zzar zzarVar, MediaQueueItem[] mediaQueueItemArr, int i10, int i11, long j10, JSONObject jSONObject) {
        int length;
        String zza;
        if (mediaQueueItemArr != null && (length = mediaQueueItemArr.length) != 0) {
            if (i10 >= 0 && i10 < length) {
                if (j10 != -1 && j10 < 0) {
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("playPosition can not be negative: ");
                    sb.append(j10);
                    throw new IllegalArgumentException(sb.toString());
                }
                JSONObject jSONObject2 = new JSONObject();
                long zzd = zzd();
                this.zzc.zzb(zzd, zzarVar);
                try {
                    jSONObject2.put("requestId", zzd);
                    jSONObject2.put("type", "QUEUE_LOAD");
                    JSONArray jSONArray = new JSONArray();
                    for (int i12 = 0; i12 < mediaQueueItemArr.length; i12++) {
                        jSONArray.put(i12, mediaQueueItemArr[i12].toJson());
                    }
                    jSONObject2.put("items", jSONArray);
                    zza = MediaCommon.zza(Integer.valueOf(i11));
                } catch (JSONException unused) {
                }
                if (zza != null) {
                    jSONObject2.put("repeatMode", zza);
                    jSONObject2.put("startIndex", i10);
                    if (j10 != -1) {
                        jSONObject2.put("currentTime", CastUtils.millisecToSec(j10));
                    }
                    if (jSONObject != null) {
                        jSONObject2.put("customData", jSONObject);
                    }
                    if (zzab()) {
                        jSONObject2.put("sequenceNumber", this.zzA);
                    }
                    zzg(jSONObject2.toString(), zzd, null);
                    return zzd;
                }
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid repeat mode: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid startIndex: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        throw new IllegalArgumentException("items must not be null or empty.");
    }

    public final long zzy(zzar zzarVar, int[] iArr, JSONObject jSONObject) {
        if (iArr != null && iArr.length != 0) {
            JSONObject jSONObject2 = new JSONObject();
            long zzd = zzd();
            try {
                jSONObject2.put("requestId", zzd);
                jSONObject2.put("type", "QUEUE_REMOVE");
                jSONObject2.put("mediaSessionId", zzn());
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    jSONArray.put(i10, iArr[i10]);
                }
                jSONObject2.put("itemIds", jSONArray);
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
                if (zzab()) {
                    jSONObject2.put("sequenceNumber", this.zzA);
                }
            } catch (JSONException unused) {
            }
            zzg(jSONObject2.toString(), zzd, null);
            this.zzo.zzb(zzd, new zzal(this, zzarVar));
            return zzd;
        }
        throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
    }

    public final long zzz(zzar zzarVar, int[] iArr, int i10, JSONObject jSONObject) {
        if (iArr != null && iArr.length != 0) {
            JSONObject jSONObject2 = new JSONObject();
            long zzd = zzd();
            try {
                jSONObject2.put("requestId", zzd);
                jSONObject2.put("type", "QUEUE_REORDER");
                jSONObject2.put("mediaSessionId", zzn());
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    jSONArray.put(i11, iArr[i11]);
                }
                jSONObject2.put("itemIds", jSONArray);
                if (i10 != 0) {
                    jSONObject2.put("insertBefore", i10);
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
                if (zzab()) {
                    jSONObject2.put("sequenceNumber", this.zzA);
                }
            } catch (JSONException unused) {
            }
            zzg(jSONObject2.toString(), zzd, null);
            this.zzp.zzb(zzd, new zzal(this, zzarVar));
            return zzd;
        }
        throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
    }
}
