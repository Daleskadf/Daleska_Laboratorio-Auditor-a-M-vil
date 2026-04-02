package v4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f16065a;

    public h(Context context, String str) {
        this.f16065a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j = this.f16065a.getLong("fire-count", 0L);
            String str = StringUtils.EMPTY;
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f16065a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f16065a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f16065a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f16065a.edit();
            int i7 = 0;
            for (Map.Entry<String, ?> entry : this.f16065a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    String d7 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (((Set) entry.getValue()).contains(d7)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d7);
                        i7++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i7 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i7);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f16065a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C1889a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f16065a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final synchronized boolean f(long j, long j8) {
        return d(j).equals(d(j8));
    }

    public final synchronized void g() {
        String d7 = d(System.currentTimeMillis());
        this.f16065a.edit().putString("last-used-date", d7).commit();
        h(d7);
    }

    public final synchronized void h(String str) {
        try {
            String e7 = e(str);
            if (e7 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f16065a.getStringSet(e7, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f16065a.edit().remove(e7).commit();
            } else {
                this.f16065a.edit().putStringSet(e7, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j) {
        return j(j);
    }

    public final synchronized boolean j(long j) {
        if (this.f16065a.contains("fire-global")) {
            if (!f(this.f16065a.getLong("fire-global", -1L), j)) {
                this.f16065a.edit().putLong("fire-global", j).commit();
                return true;
            }
            return false;
        }
        this.f16065a.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final synchronized void k(String str, long j) {
        String d7 = d(j);
        if (this.f16065a.getString("last-used-date", StringUtils.EMPTY).equals(d7)) {
            String e7 = e(d7);
            if (e7 == null) {
                return;
            }
            if (e7.equals(str)) {
                return;
            }
            m(str, d7);
            return;
        }
        long j8 = this.f16065a.getLong("fire-count", 0L);
        if (j8 + 1 == 30) {
            a();
            j8 = this.f16065a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f16065a.getStringSet(str, new HashSet()));
        hashSet.add(d7);
        this.f16065a.edit().putStringSet(str, hashSet).putLong("fire-count", j8 + 1).putString("last-used-date", d7).commit();
    }

    public final synchronized void l(long j) {
        this.f16065a.edit().putLong("fire-global", j).commit();
    }

    public final synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f16065a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f16065a.edit().putStringSet(str, hashSet).commit();
    }
}
