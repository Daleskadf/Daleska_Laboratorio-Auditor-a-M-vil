package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzefo extends zzbuh {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzduh zzc;
    private final com.google.android.gms.ads.internal.util.client.zzr zzd;
    private final zzefd zze;
    private String zzf;
    private String zzg;

    public zzefo(Context context, zzefd zzefdVar, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzduh zzduhVar) {
        this.zzb = context;
        this.zzc = zzduhVar;
        this.zzd = zzrVar;
        this.zze = zzefdVar;
    }

    public static void zzc(Context context, zzduh zzduhVar, zzefd zzefdVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != com.google.android.gms.ads.internal.zzu.zzo().zzz(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzduhVar != null) {
            zzdug zza = zzduhVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", str4);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zze();
        } else {
            str3 = "";
        }
        zzefdVar.zzd(new zzeff(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), str, str3, 2));
    }

    public static final PendingIntent zzq(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzftw.zzb(context, 0, intent, zzftw.zza | 1073741824, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzftw.zza(context, 0, intent, 201326592);
    }

    private final String zzr() {
        zzeev zzeevVar = (zzeev) this.zza.get(this.zzf);
        return zzeevVar == null ? "" : zzeevVar.zzb();
    }

    private static String zzs(int i, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        return zze == null ? str : zze.getString(i);
    }

    private final void zzt(String str, String str2, Map map) {
        zzc(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzu() {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L40
            android.content.Context r0 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.util.zzbt r0 = com.google.android.gms.ads.internal.util.zzt.zzz(r0)     // Catch: android.os.RemoteException -> L40
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.offline.buffering.zza r2 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L40
            java.util.Map r5 = r6.zza     // Catch: android.os.RemoteException -> L40
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzeev r5 = (com.google.android.gms.internal.ads.zzeev) r5     // Catch: android.os.RemoteException -> L40
            if (r5 != 0) goto L22
            java.lang.String r5 = ""
            goto L26
        L22:
            java.lang.String r5 = r5.zzc()     // Catch: android.os.RemoteException -> L40
        L26:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L40
            if (r1 != 0) goto L47
            android.content.Context r2 = r6.zzb     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L3e
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L3e
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L3e
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L3e
            goto L47
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            r1 = 0
        L42:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
        L47:
            if (r1 != 0) goto L5b
            com.google.android.gms.internal.ads.zzefd r0 = r6.zze
            java.lang.String r1 = r6.zzf
            r0.zzc(r1)
            java.lang.String r0 = r6.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzfzq r2 = com.google.android.gms.internal.ads.zzfzq.zzd()
            r6.zzt(r0, r1, r2)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefo.zzu():void");
    }

    private final void zzv(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzu.zzp();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzu();
            zzw(activity, zzmVar);
        } else if (Build.VERSION.SDK_INT < 33) {
            com.google.android.gms.ads.internal.zzu.zzp();
            AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(activity);
            zzK.setTitle(zzs(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzs(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefh
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzefo.this.zzd(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzs(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefi
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzefo.this.zzk(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzefj
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzefo.this.zzl(zzmVar, dialogInterface);
                }
            });
            zzK.create().show();
            zzt(this.zzf, "rtsdi", zzfzq.zzd());
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzt(this.zzf, "asnpdi", zzfzq.zzd());
        }
    }

    private final void zzw(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog create;
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzt.zzK(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzefg
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        int i = R.layout.offline_ads_dialog;
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        XmlResourceParser layout = zze == null ? null : zze.getLayout(i);
        if (layout == null) {
            onCancelListener.setMessage(zzs(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            create = onCancelListener.create();
        } else {
            View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzr = zzr();
            if (!zzr.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzr);
            }
            zzeev zzeevVar = (zzeev) this.zza.get(this.zzf);
            Drawable zza = zzeevVar != null ? zzeevVar.zza() : null;
            if (zza != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(zza);
            }
            create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzefn(this, create, timer, zzmVar), 3000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzt(this.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzu.zzq().zzf(activity));
        zzu();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zzz = com.google.android.gms.ads.internal.zzu.zzo().zzz(this.zzb);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzz ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzt(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (r8 == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzefd.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzefq zzefqVar = (zzefq) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzefqVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzefqVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzu();
                    zzw(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzt(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzefq zzefqVar = (zzefq) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzefqVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzefqVar.zzb();
        this.zzf = zzefqVar.zzc();
        this.zzg = zzefqVar.zzd();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziu)).booleanValue()) {
            zzt(this.zzf, "dialog_impression", zzfzq.zzd());
            com.google.android.gms.ads.internal.zzu.zzp();
            AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(zza);
            zzK.setTitle(zzs(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzs(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzs(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefk
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzefo.this.zzm(zza, zzb, dialogInterface, i);
                }
            }).setNegativeButton(zzs(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzefo.this.zzn(zzb, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzefm
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzefo.this.zzo(zzb, dialogInterface);
                }
            });
            zzK.create().show();
            return;
        }
        zzv(zza, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = this.zzd;
        this.zze.zze(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzeew
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) {
                zzefd.zzb(com.google.android.gms.ads.internal.util.client.zzr.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00da, code lost:
        r11.put("notification_not_shown_reason", r10.getMessage());
        r10 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r10, com.google.android.gms.ads.internal.offline.buffering.zza r11) {
        /*
            r9 = this;
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r0 = r11.zza
            java.lang.String r1 = r11.zzb
            java.lang.String r11 = r11.zzc
            java.lang.String r2 = r9.zzr()
            com.google.android.gms.ads.internal.util.zzab r3 = com.google.android.gms.ads.internal.zzu.zzq()
            java.lang.String r4 = "offline_notification_channel"
            java.lang.String r5 = "AdMob Offline Notifications"
            r3.zzh(r10, r4, r5)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = zzq(r10, r3, r1, r0)
            java.lang.String r5 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzq(r10, r5, r1, r0)
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder
            r5.<init>(r10, r4)
            boolean r4 = r2.isEmpty()
            r6 = 1
            if (r4 != 0) goto L48
            int r4 = com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser
            java.lang.String r7 = "You are back online! Continue learning about %s"
            java.lang.String r4 = zzs(r4, r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r2
            java.lang.String r2 = java.lang.String.format(r4, r7)
            r5.setContentTitle(r2)
            goto L53
        L48:
            int r2 = com.google.android.gms.ads.impl.R.string.offline_notification_title
            java.lang.String r4 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzs(r2, r4)
            r5.setContentTitle(r2)
        L53:
            androidx.core.app.NotificationCompat$Builder r2 = r5.setAutoCancel(r6)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setDeleteIntent(r0)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setContentIntent(r3)
            android.content.pm.ApplicationInfo r2 = r10.getApplicationInfo()
            int r2 = r2.icon
            androidx.core.app.NotificationCompat$Builder r0 = r0.setSmallIcon(r2)
            com.google.android.gms.internal.ads.zzbdq r2 = com.google.android.gms.internal.ads.zzbdz.zziv
            com.google.android.gms.internal.ads.zzbdx r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setPriority(r2)
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzix
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto La8
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto La8
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> La7
            r0.<init>(r11)     // Catch: java.io.IOException -> La7
            java.net.URLConnection r11 = r0.openConnection()     // Catch: java.io.IOException -> La7
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.io.IOException -> La7
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r11)     // Catch: java.io.IOException -> La7
            goto La9
        La7:
        La8:
            r11 = r2
        La9:
            if (r11 == 0) goto Lbf
            androidx.core.app.NotificationCompat$Builder r0 = r5.setLargeIcon(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbf
            androidx.core.app.NotificationCompat$BigPictureStyle r3 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch: android.content.res.Resources.NotFoundException -> Lbf
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lbf
            androidx.core.app.NotificationCompat$BigPictureStyle r11 = r3.bigPicture(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbf
            androidx.core.app.NotificationCompat$BigPictureStyle r11 = r11.bigLargeIcon(r2)     // Catch: android.content.res.Resources.NotFoundException -> Lbf
            r0.setStyle(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbf
        Lbf:
            java.lang.String r11 = "notification"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            android.app.Notification r0 = r5.build()     // Catch: java.lang.IllegalArgumentException -> Ld9
            r2 = 54321(0xd431, float:7.612E-41)
            r10.notify(r1, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Ld9
            java.lang.String r10 = "offline_notification_impression"
            goto Le5
        Ld9:
            r10 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r10 = r10.getMessage()
            r11.put(r0, r10)
            java.lang.String r10 = "offline_notification_failed"
        Le5:
            r9.zzt(r1, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefo.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzt(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzt(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzt(this.zzf, "dialog_click", hashMap);
        zzv(activity, zzmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzt(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzt(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzp(String str, zzdky zzdkyVar) {
        String zzB;
        String str2 = "";
        if (!TextUtils.isEmpty(zzdkyVar.zzx())) {
            zzB = zzdkyVar.zzx();
        } else {
            zzB = zzdkyVar.zzB() != null ? zzdkyVar.zzB() : "";
        }
        zzbhe zzm = zzdkyVar.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbhe zzn = zzdkyVar.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                IObjectWrapper zzf = zzn.zzf();
                if (zzf != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzeer(zzB, str2, drawable));
    }
}
