package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.distriqt.extension.inappbilling.controller.SubscriptionPeriod;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzjv;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.time.DurationKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzal extends zznd {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", SubscriptionPeriod.UNIT_DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzj = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzk = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final zzar zzl;
    private final zzmx zzm;

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            return e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting conditional property", zzfz.zza(str), zzi().zzc(str2), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        try {
            return e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min((int) DurationKt.NANOS_IN_MILLIS, zze().zzb(str, zzbf.zzp))))});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzfz.zza(str), e);
            return 0L;
        }
    }

    public final long b_() {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zza(zzfu.zzj zzjVar) throws IOException {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(zzjVar.zzy());
        byte[] zzbx = zzjVar.zzbx();
        long zza2 = g_().zza(zzbx);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzjVar.zzy());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza2));
        contentValues.put("metadata", zzbx);
        try {
            e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzfz.zza(zzjVar.zzy()), e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzb(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        long j = 0;
        try {
            try {
                try {
                    long zza2 = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                    if (zza2 == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (e_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            zzj().zzg().zza("Failed to insert column (got -1). appId", zzfz.zza(str), str2);
                            e_.endTransaction();
                            return -1L;
                        }
                        zza2 = 0;
                    }
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str);
                        contentValues2.put(str2, Long.valueOf(1 + zza2));
                        if (e_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                            zzj().zzg().zza("Failed to update column (got 0). appId", zzfz.zza(str), str2);
                            e_.endTransaction();
                            return -1L;
                        }
                        e_.setTransactionSuccessful();
                        e_.endTransaction();
                        return zza2;
                    } catch (SQLiteException e) {
                        e = e;
                        j = zza2;
                        zzj().zzg().zza("Error inserting column. appId", zzfz.zza(str), str2, e);
                        e_.endTransaction();
                        return j;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
                e_.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        return zza("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e) {
            zzj().zzu().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0088: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:33:0x0088 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzd(java.lang.String r6) {
        /*
            r5 = this;
            r5.zzt()
            r5.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.e_()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            if (r2 != 0) goto L2e
            com.google.android.gms.measurement.internal.zzfz r6 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.measurement.internal.zzgb r6 = r6.zzp()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            java.lang.String r2 = "Default event parameters not found"
            r6.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            if (r1 == 0) goto L2d
            r1.close()
        L2d:
            return r0
        L2e:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzfu$zze$zza r3 = com.google.android.gms.internal.measurement.zzfu.zze.zze()     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzlh r2 = com.google.android.gms.measurement.internal.zznr.zza(r3, r2)     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzfu$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfu.zze.zza) r2     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzli r2 = r2.zzah()     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzjv r2 = (com.google.android.gms.internal.measurement.zzjv) r2     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzfu$zze r2 = (com.google.android.gms.internal.measurement.zzfu.zze) r2     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            r5.g_()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            java.util.List r6 = r2.zzh()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.zznr.zza(r6)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            if (r1 == 0) goto L55
            r1.close()
        L55:
            return r6
        L56:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfz r3 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.measurement.internal.zzgb r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfz.zza(r6)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            r3.zza(r4, r6, r2)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            if (r1 == 0) goto L6d
            r1.close()
        L6d:
            return r0
        L6e:
            r6 = move-exception
            goto L74
        L70:
            r6 = move-exception
            goto L89
        L72:
            r6 = move-exception
            r1 = r0
        L74:
            com.google.android.gms.measurement.internal.zzfz r2 = r5.zzj()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.measurement.internal.zzgb r2 = r2.zzg()     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zza(r3, r6)     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L86
            r1.close()
        L86:
            return r0
        L87:
            r6 = move-exception
            r0 = r1
        L89:
            if (r0 == 0) goto L8e
            r0.close()
        L8e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzd(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0091: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfu.zze, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzt()
            r7.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.e_()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.zzfz r8 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzgb r8 = r8.zzp()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.String r9 = "Main event not found"
            r8.zza(r9)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfu$zze$zza r4 = com.google.android.gms.internal.measurement.zzfu.zze.zze()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzlh r2 = com.google.android.gms.measurement.internal.zznr.zza(r4, r2)     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfu$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfu.zze.zza) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzli r2 = r2.zzah()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzjv r2 = (com.google.android.gms.internal.measurement.zzjv) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfu$zze r2 = (com.google.android.gms.internal.measurement.zzfu.zze) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L5e
            r1.close()
        L5e:
            return r8
        L5f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfz r3 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzgb r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfz.zza(r8)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            r3.zza(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L76
            r1.close()
        L76:
            return r0
        L77:
            r8 = move-exception
            goto L7d
        L79:
            r8 = move-exception
            goto L92
        L7b:
            r8 = move-exception
            r1 = r0
        L7d:
            com.google.android.gms.measurement.internal.zzfz r9 = r7.zzj()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzgb r9 = r9.zzg()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "Error selecting main event"
            r9.zza(r2, r8)     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8f
            r1.close()
        L8f:
            return r0
        L90:
            r8 = move-exception
            r0 = r1
        L92:
            if (r0 == 0) goto L97
            r0.close()
        L97:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x044d: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:132:0x044c */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c0 A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e5 A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0414 A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TRY_LEAVE, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022a A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027f A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x028e A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a6 A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ed A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0302 A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x034c A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0370 A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x039a A[Catch: SQLiteException -> 0x042b, all -> 0x044b, TryCatch #0 {all -> 0x044b, blocks: (B:4:0x012e, B:9:0x013a, B:11:0x014b, B:13:0x0157, B:16:0x016c, B:18:0x0179, B:20:0x0185, B:23:0x019a, B:25:0x01db, B:30:0x01e5, B:34:0x022f, B:36:0x025e, B:41:0x0268, B:45:0x0283, B:47:0x028e, B:48:0x02a0, B:50:0x02a6, B:52:0x02b2, B:54:0x02be, B:56:0x02c4, B:58:0x02d0, B:60:0x02de, B:61:0x02e7, B:63:0x02ed, B:65:0x02f9, B:67:0x0302, B:69:0x030a, B:73:0x0313, B:75:0x032b, B:76:0x0334, B:78:0x034c, B:80:0x0358, B:81:0x036a, B:83:0x0370, B:85:0x037c, B:87:0x0384, B:91:0x038d, B:92:0x0390, B:99:0x03a5, B:101:0x03c0, B:103:0x03cc, B:106:0x03d6, B:107:0x03d9, B:109:0x03e5, B:111:0x03ed, B:112:0x03f8, B:114:0x0400, B:115:0x040b, B:117:0x0414, B:95:0x039a, B:98:0x03a1, B:44:0x027f, B:33:0x022a, B:22:0x0193, B:15:0x0165, B:127:0x0434), top: B:136:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzg zze(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzae zzc(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzan zzf(java.lang.String r13) {
        /*
            r12 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r12.zzt()
            r12.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.e_()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "apps"
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = "remote_config"
            r9 = 0
            r3[r9] = r4     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = "config_last_modified_time"
            r10 = 1
            r3[r10] = r4     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = "e_tag"
            r11 = 2
            r3[r11] = r4     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            if (r2 != 0) goto L3b
            if (r1 == 0) goto L3a
            r1.close()
        L3a:
            return r0
        L3b:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            java.lang.String r3 = r1.getString(r10)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            java.lang.String r4 = r1.getString(r11)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            boolean r5 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            if (r5 == 0) goto L5e
            com.google.android.gms.measurement.internal.zzfz r5 = r12.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            com.google.android.gms.measurement.internal.zzgb r5 = r5.zzg()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfz.zza(r13)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            r5.zza(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
        L5e:
            if (r2 != 0) goto L66
            if (r1 == 0) goto L65
            r1.close()
        L65:
            return r0
        L66:
            com.google.android.gms.measurement.internal.zzan r5 = new com.google.android.gms.measurement.internal.zzan     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            r5.<init>(r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            if (r1 == 0) goto L70
            r1.close()
        L70:
            return r5
        L71:
            r2 = move-exception
            goto L77
        L73:
            r13 = move-exception
            goto L90
        L75:
            r2 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.zzfz r3 = r12.zzj()     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.measurement.internal.zzgb r3 = r3.zzg()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzfz.zza(r13)     // Catch: java.lang.Throwable -> L8e
            r3.zza(r4, r13, r2)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8d
            r1.close()
        L8d:
            return r0
        L8e:
            r13 = move-exception
            r0 = r1
        L90:
            if (r0 == 0) goto L95
            r0.close()
        L95:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzf(java.lang.String):com.google.android.gms.measurement.internal.zzan");
    }

    public final zzaq zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return zza(j, str, 1L, false, false, z3, false, z5, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzaq zza(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzaq");
    }

    public final zzav zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzak();
        return zzav.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzaz zzd(String str, String str2) {
        return zzc("events", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.zzaz zzc(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaz");
    }

    public final zziq zzh(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzak();
        return zziq.zzb(zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zziq zzi(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzak();
        zziq zziqVar = (zziq) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzas() { // from class: com.google.android.gms.measurement.internal.zzao
            @Override // com.google.android.gms.measurement.internal.zzas
            public final Object zza(Cursor cursor) {
                zziq zza2;
                zza2 = zziq.zza(cursor.getString(0), cursor.getInt(1));
                return zza2;
            }
        });
        return zziqVar == null ? zziq.zza : zziqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zznv zze(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            r13.zzt()
            r13.zzak()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.e_()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r3 = "user_attributes"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            boolean r0 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            if (r0 != 0) goto L3e
            if (r2 == 0) goto L3d
            r2.close()
        L3d:
            return r1
        L3e:
            long r7 = r2.getLong(r10)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            java.lang.Object r9 = r13.zza(r2, r11)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            if (r9 != 0) goto L4e
            if (r2 == 0) goto L4d
            r2.close()
        L4d:
            return r1
        L4e:
            java.lang.String r5 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zznv r0 = new com.google.android.gms.measurement.internal.zznv     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            if (r3 == 0) goto L71
            com.google.android.gms.measurement.internal.zzfz r3 = r13.zzj()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zzgb r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfz.zza(r14)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
        L71:
            if (r2 == 0) goto L76
            r2.close()
        L76:
            return r0
        L77:
            r0 = move-exception
            goto L7d
        L79:
            r0 = move-exception
            goto L9e
        L7b:
            r0 = move-exception
            r2 = r1
        L7d:
            com.google.android.gms.measurement.internal.zzfz r3 = r13.zzj()     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zzgb r3 = r3.zzg()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfz.zza(r14)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zzfy r6 = r13.zzi()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = r6.zzc(r15)     // Catch: java.lang.Throwable -> L9c
            r3.zza(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L9c
            if (r2 == 0) goto L9b
            r2.close()
        L9b:
            return r1
        L9c:
            r0 = move-exception
            r1 = r2
        L9e:
            if (r1 == 0) goto La3
            r1.close()
        La3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zznv");
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type == 4) {
                        zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <T> T zza(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.zzas<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.e_()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L30
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L30
            boolean r4 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            if (r4 != 0) goto L22
            com.google.android.gms.measurement.internal.zzfz r4 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            com.google.android.gms.measurement.internal.zzgb r4 = r4.zzp()     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            java.lang.String r5 = "No data found"
            r4.zza(r5)     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            if (r3 == 0) goto L21
            r3.close()
        L21:
            return r0
        L22:
            java.lang.Object r4 = r5.zza(r3)     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            if (r3 == 0) goto L2b
            r3.close()
        L2b:
            return r4
        L2c:
            r4 = move-exception
            goto L32
        L2e:
            r4 = move-exception
            goto L47
        L30:
            r4 = move-exception
            r3 = r0
        L32:
            com.google.android.gms.measurement.internal.zzfz r5 = r2.zzj()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.measurement.internal.zzgb r5 = r5.zzg()     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Error querying database."
            r5.zza(r1, r4)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L44
            r3.close()
        L44:
            return r0
        L45:
            r4 = move-exception
            r0 = r3
        L47:
            if (r0 == 0) goto L4c
            r0.close()
        L4c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.zzas):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zza(long r5) {
        /*
            r4 = this;
            r4.zzt()
            r4.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.e_()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.zzfz r6 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzgb r6 = r6.zzp()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zza(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L59
        L42:
            r6 = move-exception
            r5 = r0
        L44:
            com.google.android.gms.measurement.internal.zzfz r1 = r4.zzj()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzgb r1 = r1.zzg()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L56
            r5.close()
        L56:
            return r0
        L57:
            r6 = move-exception
            r0 = r5
        L59:
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f_() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.e_()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.zzfz r3 = r6.zzj()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.zzgb r3 = r3.zzg()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.f_():java.lang.String");
    }

    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getString(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return str2;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0176 A[EDGE_INSN: B:87:0x0176->B:69:0x0176 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzfu.zzj, java.lang.Long>> zza(java.lang.String r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, int, int):java.util.List");
    }

    public final List<zzae> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzae> zza(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List<zzna> zzj(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzak();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", FirebaseAnalytics.Param.SOURCE}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzna(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzfz.zza(str), e);
                List<zzna> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zznv> zzk(java.lang.String r16) {
        /*
            r15 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r16)
            r15.zzt()
            r15.zzak()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r15.e_()     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            if (r2 != 0) goto L48
            if (r1 == 0) goto L47
            r1.close()
        L47:
            return r0
        L48:
            java.lang.String r6 = r1.getString(r11)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            if (r2 != 0) goto L54
            java.lang.String r2 = ""
        L54:
            r5 = r2
            long r7 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            r2 = r15
            java.lang.Object r9 = r15.zza(r1, r14)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            if (r9 != 0) goto L72
            com.google.android.gms.measurement.internal.zzfz r3 = r15.zzj()     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            com.google.android.gms.measurement.internal.zzgb r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfz.zza(r16)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            goto L7d
        L72:
            com.google.android.gms.measurement.internal.zznv r10 = new com.google.android.gms.measurement.internal.zznv     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            r3 = r10
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            r0.add(r10)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
        L7d:
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            if (r3 != 0) goto L48
            if (r1 == 0) goto L88
            r1.close()
        L88:
            return r0
        L89:
            r0 = move-exception
            goto L90
        L8b:
            r0 = move-exception
            r2 = r15
            goto Lac
        L8e:
            r0 = move-exception
            r2 = r15
        L90:
            com.google.android.gms.measurement.internal.zzfz r3 = r15.zzj()     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.measurement.internal.zzgb r3 = r3.zzg()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfz.zza(r16)     // Catch: java.lang.Throwable -> Lab
            r3.zza(r4, r5, r0)     // Catch: java.lang.Throwable -> Lab
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto Laa
            r1.close()
        Laa:
            return r0
        Lab:
            r0 = move-exception
        Lac:
            if (r1 == 0) goto Lb1
            r1.close()
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzk(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zznv> zzb(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, zzfu.zzl> zzl(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzfu.zzl> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                ArrayMap arrayMap = new ArrayMap();
                do {
                    int i = query.getInt(0);
                    try {
                        arrayMap.put(Integer.valueOf(i), (zzfu.zzl) ((com.google.android.gms.internal.measurement.zzjv) ((zzfu.zzl.zza) zznr.zza(zzfu.zzl.zze(), query.getBlob(1))).zzah()));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzfz.zza(str), Integer.valueOf(i), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filter results. appId", zzfz.zza(str), e2);
                Map<Integer, zzfu.zzl> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<zzfi.zzb>> zzm(String str) {
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfi.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzfi.zzb zzbVar = (zzfi.zzb) ((com.google.android.gms.internal.measurement.zzjv) ((zzfi.zzb.zza) zznr.zza(zzfi.zzb.zzc(), query.getBlob(1))).zzah());
                        if (zzbVar.zzk()) {
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzfz.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Database error querying filters. appId", zzfz.zza(str), e2);
            Map<Integer, List<zzfi.zzb>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<zzfi.zzb>> zzf(String str, String str2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfi.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzfi.zzb zzbVar = (zzfi.zzb) ((com.google.android.gms.internal.measurement.zzjv) ((zzfi.zzb.zza) zznr.zza(zzfi.zzb.zzc(), query.getBlob(1))).zzah());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzfz.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzfz.zza(str), e2);
                Map<Integer, List<zzfi.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<zzfi.zze>> zzg(String str, String str2) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfi.zze>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzfi.zze zzeVar = (zzfi.zze) ((com.google.android.gms.internal.measurement.zzjv) ((zzfi.zze.zza) zznr.zza(zzfi.zze.zzc(), query.getBlob(1))).zzah());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter", zzfz.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzfz.zza(str), e2);
                Map<Integer, List<zzfi.zze>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<Integer>> zzn(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return emptyMap;
                }
                do {
                    int i = rawQuery.getInt(0);
                    List list = (List) arrayMap.get(Integer.valueOf(i));
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(Integer.valueOf(i), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return arrayMap;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error querying scoped filters. appId", zzfz.zza(str), e);
                Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(zzni zzniVar) {
        super(zzniVar);
        this.zzm = new zzmx(zzb());
        this.zzl = new zzar(this, zza(), "google_app_measurement.db");
    }

    public final void zzp() {
        zzak();
        e_().beginTransaction();
    }

    private final void zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            e_().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting snapshot. appId", zzfz.zza(str2), e);
        }
    }

    public final void zzo(String str) {
        zzaz zzd2;
        zzi("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("events", (String[]) Collections.singletonList(AppMeasurementSdk.ConditionalUserProperty.NAME).toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (zzd2 = zzd(str, string)) != null) {
                        zza("events_snapshot", zzd2);
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error creating snapshot. appId", zzfz.zza(str), e);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzu() {
        zzak();
        e_().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(List<Long> list) {
        zzt();
        zzak();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzan()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzv() {
        int delete;
        zzt();
        zzak();
        if (zzan()) {
            long zza2 = zzn().zza.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzbf.zzy.zza(null).longValue()) {
                zzn().zza.zza(elapsedRealtime);
                zzt();
                zzak();
                if (!zzan() || (delete = e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzag.zzm())})) <= 0) {
                    return;
                }
                zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzak();
        try {
            e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting user property. appId", zzfz.zza(str), zzi().zzc(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzp(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzp(java.lang.String):void");
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, List<zzfi.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzfi.zza.C0019zza zzca = list.get(i).zzca();
            if (zzca.zza() != 0) {
                for (int i2 = 0; i2 < zzca.zza(); i2++) {
                    zzfi.zzb.zza zzca2 = zzca.zza(i2).zzca();
                    zzfi.zzb.zza zzaVar = (zzfi.zzb.zza) ((zzjv.zza) zzca2.clone());
                    String zzb2 = zziu.zzb(zzca2.zzb());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzca2.zza(); i3++) {
                        zzfi.zzc zza2 = zzca2.zza(i3);
                        String zza3 = zziw.zza(zza2.zze());
                        if (zza3 != null) {
                            zzaVar.zza(i3, (zzfi.zzc) ((com.google.android.gms.internal.measurement.zzjv) zza2.zzca().zza(zza3).zzah()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzca = zzca.zza(i2, zzaVar);
                        list.set(i, (zzfi.zza) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah()));
                    }
                }
            }
            if (zzca.zzb() != 0) {
                for (int i4 = 0; i4 < zzca.zzb(); i4++) {
                    zzfi.zze zzb3 = zzca.zzb(i4);
                    String zza4 = zziv.zza(zzb3.zze());
                    if (zza4 != null) {
                        zzca = zzca.zza(i4, zzb3.zzca().zza(zza4));
                        list.set(i, (zzfi.zza) ((com.google.android.gms.internal.measurement.zzjv) zzca.zzah()));
                    }
                }
            }
        }
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        try {
            zzak();
            zzt();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase e_2 = e_();
            e_2.delete("property_filters", "app_id=?", new String[]{str});
            e_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzfi.zza zzaVar2 : list) {
                zzak();
                zzt();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zzg()) {
                    zzj().zzu().zza("Audience with no ID. appId", zzfz.zza(str));
                } else {
                    int zza5 = zzaVar2.zza();
                    Iterator<zzfi.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfz.zza(str), Integer.valueOf(zza5));
                                break;
                            }
                        } else {
                            Iterator<zzfi.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfz.zza(str), Integer.valueOf(zza5));
                                        break;
                                    }
                                } else {
                                    Iterator<zzfi.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zza5, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzfi.zze> it4 = zzaVar2.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, zza5, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzak();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase e_3 = e_();
                                        e_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                        e_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzfi.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zzg() ? Integer.valueOf(zzaVar3.zza()) : null);
            }
            zzb(str, arrayList);
            e_.setTransactionSuccessful();
        } finally {
            e_.endTransaction();
        }
    }

    public final void zzw() {
        zzak();
        e_().setTransactionSuccessful();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r7.zzf.zzb(r0).zza(com.google.android.gms.measurement.internal.zziq.zza.ANALYTICS_STORAGE) != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.measurement.internal.zzg r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(com.google.android.gms.measurement.internal.zzg, boolean, boolean):void");
    }

    public final void zza(String str, zzav zzavVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzavVar);
        zzt();
        zzak();
        if (zze().zza(zzbf.zzco) && zzi(str) == zziq.zza) {
            zzb(str, zziq.zza);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzavVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zza(zzaz zzazVar) {
        zza("events", zzazVar);
    }

    private final void zza(String str, zzaz zzazVar) {
        Preconditions.checkNotNull(zzazVar);
        zzt();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzazVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzazVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzazVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzazVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzazVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzazVar.zzg));
        contentValues.put("last_bundled_day", zzazVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzazVar.zzi);
        contentValues.put("last_sampling_rate", zzazVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzazVar.zze));
        contentValues.put("last_exempt_from_sampling", (zzazVar.zzk == null || !zzazVar.zzk.booleanValue()) ? null : 1L);
        try {
            if (e_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzfz.zza(zzazVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzfz.zza(zzazVar.zza), e);
        }
    }

    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase e_ = e_();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                zzj().zzh().zza("Value of the primary key is not set.", zzfz.zza(str2));
                return;
            }
            if (e_.update(str, contentValues, str2 + " = ?", new String[]{asString}) == 0 && e_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzfz.zza(str), zzfz.zza(str2));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing into table. key", zzfz.zza(str), zzfz.zza(str2), e);
        }
    }

    public final void zza(String str, zziq zziqVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zziqVar);
        zzt();
        zzak();
        zzb(str, zzi(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zziqVar.zzh());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zzb(String str, zziq zziqVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zziqVar);
        zzt();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zziqVar.zzh());
        contentValues.put("consent_source", Integer.valueOf(zziqVar.zza()));
        zza("consent_settings", "app_id", contentValues);
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzak();
        zzt();
        SQLiteDatabase e_ = e_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zze().zzb(str, zzbf.zzaf)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append("(" + TextUtils.join(",", arrayList) + ")");
            sb.append(" order by rowid desc limit -1 offset ?)");
            return e_.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Database error querying filters. appId", zzfz.zza(str), e);
            return false;
        }
    }

    public final boolean zzx() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final boolean zza(zzfu.zzj zzjVar, boolean z) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(zzjVar.zzy());
        Preconditions.checkState(zzjVar.zzbg());
        zzv();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzjVar.zzm() < currentTimeMillis - zzag.zzm() || zzjVar.zzm() > zzag.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfz.zza(zzjVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzjVar.zzm()));
        }
        try {
            byte[] zzb2 = g_().zzb(zzjVar.zzbx());
            zzj().zzp().zza("Saving bundle, size", Integer.valueOf(zzb2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzjVar.zzy());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzjVar.zzm()));
            contentValues.put("data", zzb2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzjVar.zzbn()) {
                contentValues.put("retry_count", Integer.valueOf(zzjVar.zzg()));
            }
            try {
                if (e_().insert("queue", null, contentValues) == -1) {
                    zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzfz.zza(zzjVar.zzy()));
                    return false;
                }
                return true;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error storing bundle. appId", zzfz.zza(zzjVar.zzy()), e);
                return false;
            }
        } catch (IOException e2) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzfz.zza(zzjVar.zzy()), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzfi.zzb zzbVar) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzfz.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzbx = zzbVar.zzbx();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", zzbx);
        try {
            if (e_().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzfz.zza(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event filter. appId", zzfz.zza(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzfi.zze zzeVar) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzfz.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzbx = zzeVar.zzbx();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", zzbx);
        try {
            if (e_().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzfz.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing property filter. appId", zzfz.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzba zzbaVar, long j, boolean z) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzbaVar);
        Preconditions.checkNotEmpty(zzbaVar.zza);
        byte[] zzbx = g_().zza(zzbaVar).zzbx();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbaVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzbaVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbaVar.zzc));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", zzbx);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (e_().insert("raw_events", null, contentValues) == -1) {
                zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzfz.zza(zzbaVar.zza));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event. appId", zzfz.zza(zzbaVar.zza), e);
            return false;
        }
    }

    public final boolean zza(String str, zzna zznaVar) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zznaVar);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zznaVar.zzb < currentTimeMillis - zzag.zzm() || zznaVar.zzb > zzag.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzfz.zza(str), Long.valueOf(currentTimeMillis), Long.valueOf(zznaVar.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zznaVar.zza);
        contentValues.put(FirebaseAnalytics.Param.SOURCE, Integer.valueOf(zznaVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zznaVar.zzb));
        try {
            if (e_().insert("trigger_uris", null, contentValues) == -1) {
                zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzfz.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzfz.zza(str), e);
            return false;
        }
    }

    private final boolean zzan() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zza(String str, Long l, long j, zzfu.zze zzeVar) {
        zzt();
        zzak();
        Preconditions.checkNotNull(zzeVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbx = zzeVar.zzbx();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbx);
        try {
            if (e_().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzfz.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing complex main event. appId", zzfz.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzak();
        String str = zzaeVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzaeVar.zzc.zza) != null || zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) < 1000) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("origin", zzaeVar.zzb);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzaeVar.zzc.zza);
            zza(contentValues, "value", Preconditions.checkNotNull(zzaeVar.zzc.zza()));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzaeVar.zze));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzaeVar.zzf);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzaeVar.zzh));
            zzq();
            contentValues.put("timed_out_event", zzny.zza((Parcelable) zzaeVar.zzg));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzaeVar.zzd));
            zzq();
            contentValues.put("triggered_event", zzny.zza((Parcelable) zzaeVar.zzi));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzaeVar.zzc.zzb));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzaeVar.zzj));
            zzq();
            contentValues.put("expired_event", zzny.zza((Parcelable) zzaeVar.zzk));
            try {
                if (e_().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                    zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzfz.zza(str));
                    return true;
                }
                return true;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error storing conditional user property", zzfz.zza(str), e);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(String str, Bundle bundle) {
        zzt();
        zzak();
        byte[] zzbx = g_().zza(new zzba(this.zzu, "", str, "dep", 0L, 0L, bundle)).zzbx();
        zzj().zzp().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbx);
        try {
            if (e_().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzfz.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzfz.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zznv zznvVar) {
        Preconditions.checkNotNull(zznvVar);
        zzt();
        zzak();
        if (zze(zznvVar.zza, zznvVar.zzc) == null) {
            if (zzny.zzh(zznvVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zznvVar.zza}) >= zze().zza(zznvVar.zza, zzbf.zzag, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zznvVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zznvVar.zza, zznvVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zznvVar.zza);
        contentValues.put("origin", zznvVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zznvVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zznvVar.zzd));
        zza(contentValues, "value", zznvVar.zze);
        try {
            if (e_().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzfz.zza(zznvVar.zza));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing user property. appId", zzfz.zza(zznvVar.zza), e);
            return true;
        }
    }
}
