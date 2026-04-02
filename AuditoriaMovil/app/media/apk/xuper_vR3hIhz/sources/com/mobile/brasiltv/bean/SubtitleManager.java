package com.mobile.brasiltv.bean;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.msandroid.mobile.R;
import com.umeng.analytics.pro.f;
import i9.j;
import java.util.ArrayList;
import java.util.HashMap;
import t9.i;
/* loaded from: classes3.dex */
public final class SubtitleManager {
    public static final String GLOBAL_AUDIO_LANGUAGE = "global_audio_language";
    public static final String GLOBAL_SUBTITLE_COLOR = "global_subtitle_color";
    public static final String GLOBAL_SUBTITLE_LANGUAGE = "global_subtitle_language";
    public static final String GLOBAL_SUBTITLE_SIZE = "global_subtitle_size";
    public static final String GLOBAL_SUBTITLE_SWITCH = "global_subtitle_switch";
    public static final int SUBTITLE_COLOR_WHITE = 0;
    public static final int SUBTITLE_COLOR_WHITE_BLACK = 2;
    public static final int SUBTITLE_COLOR_YELLOW = 1;
    public static final int SUBTITLE_LANGUAGE_EN = 1;
    public static final int SUBTITLE_LANGUAGE_ES = 2;
    public static final int SUBTITLE_LANGUAGE_PT = 0;
    public static final int SUBTITLE_SIZE_BIG = 2;
    public static final int SUBTITLE_SIZE_NORMAL = 0;
    public static final int SUBTITLE_SIZE_SMALL = 1;
    private static final Integer[] colorValues;
    private static int mGlobalAudioLanguage;
    private static int mGlobalColor;
    private static int mGlobalLanguage;
    private static int mGlobalSize;
    private static LruCache<String, String> mLruCacheAudioLanguages;
    private static LruCache<String, Integer> mLruCacheColor;
    private static HashMap<String, RecordSubtitleInfoBean> mLruCacheLanguages;
    private static LruCache<String, Integer> mLruCacheSize;
    private static LruCache<String, Boolean> mLruCacheSwitch;
    public static final SubtitleManager INSTANCE = new SubtitleManager();
    private static boolean mGlobalSwitch = true;
    private static final Integer[] portraitSizeValues = {11, 8, 14};
    private static final Integer[] landscapeSizeValues = {14, 11, 17};

    static {
        Integer valueOf = Integer.valueOf((int) R.color.color_important_white);
        colorValues = new Integer[]{valueOf, Integer.valueOf((int) R.color.color_ffff00), valueOf};
        mLruCacheAudioLanguages = new LruCache<>(100);
        mLruCacheLanguages = new HashMap<>();
        mLruCacheSize = new LruCache<>(100);
        mLruCacheColor = new LruCache<>(100);
        mLruCacheSwitch = new LruCache<>(100);
    }

    private SubtitleManager() {
    }

    public final void clearLruCacheSwitch() {
        mLruCacheSwitch.evictAll();
    }

    public final void clearSelectSubtitle() {
        mLruCacheLanguages.clear();
    }

    public final ArrayList<String> getColorList(Context context) {
        i.g(context, f.X);
        String string = context.getResources().getString(R.string.subtitle_color_white);
        i.f(string, "context.resources.getStr…ing.subtitle_color_white)");
        String string2 = context.getResources().getString(R.string.subtitle_color_yellow);
        i.f(string2, "context.resources.getStr…ng.subtitle_color_yellow)");
        return j.c(string, string2);
    }

    public final Integer[] getColorValues() {
        return colorValues;
    }

    public final Integer[] getLandscapeSizeValues() {
        return landscapeSizeValues;
    }

    public final int getMGlobalAudioLanguage() {
        return mGlobalAudioLanguage;
    }

    public final int getMGlobalColor() {
        return mGlobalColor;
    }

    public final int getMGlobalLanguage() {
        return mGlobalLanguage;
    }

    public final int getMGlobalSize() {
        return mGlobalSize;
    }

    public final boolean getMGlobalSwitch() {
        return mGlobalSwitch;
    }

    public final LruCache<String, String> getMLruCacheAudioLanguages() {
        return mLruCacheAudioLanguages;
    }

    public final LruCache<String, Integer> getMLruCacheColor() {
        return mLruCacheColor;
    }

    public final HashMap<String, RecordSubtitleInfoBean> getMLruCacheLanguages() {
        return mLruCacheLanguages;
    }

    public final LruCache<String, Integer> getMLruCacheSize() {
        return mLruCacheSize;
    }

    public final LruCache<String, Boolean> getMLruCacheSwitch() {
        return mLruCacheSwitch;
    }

    public final Integer[] getPortraitSizeValues() {
        return portraitSizeValues;
    }

    public final ArrayList<String> getSizeList(Context context) {
        i.g(context, f.X);
        String string = context.getResources().getString(R.string.subtitle_size_normal);
        i.f(string, "context.resources.getStr…ing.subtitle_size_normal)");
        String string2 = context.getResources().getString(R.string.subtitle_size_small);
        i.f(string2, "context.resources.getStr…ring.subtitle_size_small)");
        String string3 = context.getResources().getString(R.string.subtitle_size_big);
        i.f(string3, "context.resources.getStr…string.subtitle_size_big)");
        return j.c(string, string2, string3);
    }

    public final ArrayList<SubtitleStyleBean> getStyleList(Context context) {
        i.g(context, f.X);
        ArrayList<SubtitleStyleBean> arrayList = new ArrayList<>();
        arrayList.add(0, new SubtitleStyleBean(context.getResources().getColor(R.color.color_important_white), context.getResources().getColor(R.color.color_pop_translucence)));
        arrayList.add(1, new SubtitleStyleBean(context.getResources().getColor(R.color.color_ffaa00), context.getResources().getColor(R.color.color_pop_translucence)));
        arrayList.add(2, new SubtitleStyleBean(context.getResources().getColor(R.color.color_important_white), context.getResources().getColor(R.color.color_191919)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1075:0x0ea7, code lost:
        if (r21.equals("jpn") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1085:0x0ec9, code lost:
        if (r21.equals("ita") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a1, code lost:
        if (r21.equals("mri (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ab, code lost:
        if (r21.equals("cze (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1149:0x0fa3, code lost:
        if (r21.equals("hin") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1159:0x0fc5, code lost:
        if (r21.equals("heb") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b5, code lost:
        if (r21.equals("cym (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cd, code lost:
        if (r21.equals("wel (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1238:0x10d5, code lost:
        if (r21.equals("ger") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1279:0x1163, code lost:
        if (r21.equals("fre") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e5, code lost:
        if (r21.equals("hrv (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1314:0x11db, code lost:
        if (r21.equals("eus") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1327:0x1207, code lost:
        if (r21.equals("eng") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0219, code lost:
        if (r21.equals("mkd (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1458:0x13d7, code lost:
        if (r21.equals("chi") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1515:0x149b, code lost:
        if (r21.equals("bod") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0231, code lost:
        if (r21.equals("scr (b)(d)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1568:0x1551, code lost:
        if (r21.equals("baq") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1645:0x1657, code lost:
        if (r21.equals("ara") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1675:0x16bf, code lost:
        if (r21.equals("alb") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1726:0x176f, code lost:
        if (r21.equals("zh") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1728:0x1773, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.audio_zh);
        t9.i.f(r3, "mContext.getString(R.string.audio_zh)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0299, code lost:
        if (r21.equals("mao (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02a3, code lost:
        if (r21.equals("mac (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1858:0x1947, code lost:
        if (r21.equals("sr") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1861:0x1951, code lost:
        if (r21.equals("sq") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02ad, code lost:
        if (r21.equals("ces (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1880:0x1993, code lost:
        if (r21.equals("sk") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1915:0x1a0d, code lost:
        if (r21.equals("ro") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1931:0x1a44, code lost:
        if (r21.equals("pt") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1933:0x1a48, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.language_pt);
        t9.i.f(r3, "mContext.getString(R.string.language_pt)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02c5, code lost:
        if (r21.equals("scc (b)(d)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1991:0x1b20, code lost:
        if (r21.equals("nl") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2015:0x1b73, code lost:
        if (r21.equals("my") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2043:0x1bde, code lost:
        if (r21.equals("mk") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2047:0x1beb, code lost:
        if (r21.equals("mi") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02eb, code lost:
        if (r21.equals("gre (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02f5, code lost:
        if (r21.equals("bur (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2158:0x1d6e, code lost:
        if (r21.equals("ja") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2160:0x1d72, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.audio_jpn);
        t9.i.f(r3, "mContext.getString(R.string.audio_jpn)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2166:0x1d94, code lost:
        if (r21.equals("it") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2168:0x1d98, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.audio_ita);
        t9.i.f(r3, "mContext.getString(R.string.audio_ita)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2217:0x1e50, code lost:
        if (r21.equals("hr") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2225:0x1e6b, code lost:
        if (r21.equals("hi") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2227:0x1e6f, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.language_hi);
        t9.i.f(r3, "mContext.getString(R.string.language_hi)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2229:0x1e83, code lost:
        if (r21.equals("he") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2231:0x1e87, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.audio_heb);
        t9.i.f(r3, "mContext.getString(R.string.audio_heb)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0333, code lost:
        if (r21.equals("bod (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2265:0x1f0b, code lost:
        if (r21.equals("fr") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2284:0x1f4d, code lost:
        if (r21.equals("fa") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2287:0x1f57, code lost:
        if (r21.equals("eu") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2294:0x1f6f, code lost:
        if (r21.equals("es") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2296:0x1f73, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.language_es);
        t9.i.f(r3, "mContext.getString(R.string.language_es)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2302:0x1f95, code lost:
        if (r21.equals(com.hpplay.cybergarage.xml.XML.DEFAULT_CONTENT_LANGUAGE) == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2304:0x1f99, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.language_en);
        t9.i.f(r3, "mContext.getString(R.string.language_en)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2306:0x1fad, code lost:
        if (r21.equals("el") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2329:0x1ffd, code lost:
        if (r21.equals("cy") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2341:0x2026, code lost:
        if (r21.equals("cs") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2373:0x2095, code lost:
        if (r21.equals("bo") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2419:0x2135, code lost:
        if (r21.equals("ar") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2421:0x2139, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.audio_ara);
        t9.i.f(r3, "mContext.getString(R.string.audio_ara)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2451:0x21af, code lost:
        if (r21.equals("ger (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2453:0x21b3, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.audio_ger);
        t9.i.f(r3, "mContext.getString(R.string.audio_ger)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2482:0x2225, code lost:
        if (r21.equals("baq (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2501:0x2267, code lost:
        if (r21.equals("fre (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2504:0x2271, code lost:
        if (r21.equals("fra (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2506:0x2275, code lost:
        r3 = r20.getString(com.msandroid.mobile.R.string.language_fr);
        t9.i.f(r3, "mContext.getString(R.string.language_fr)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:2512:0x2297, code lost:
        if (r21.equals("per (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2559:0x233b, code lost:
        if (r21.equals("fas (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2567:0x2356, code lost:
        if (r21.equals("tib (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2571:0x2363, code lost:
        if (r21.equals("eus (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2579:0x237e, code lost:
        if (r21.equals("ell (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2587:0x2399, code lost:
        if (r21.equals("srp (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2591:0x23a5, code lost:
        if (r21.equals("sqi (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2607:0x23d5, code lost:
        if (r21.equals("slo (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2610:0x23de, code lost:
        if (r21.equals("slk (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2898:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2943:?, code lost:
        return "Romanian";
     */
    /* JADX WARN: Code restructure failed: missing block: B:2947:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2962:?, code lost:
        return "Dutch";
     */
    /* JADX WARN: Code restructure failed: missing block: B:2968:?, code lost:
        return "Burmese";
     */
    /* JADX WARN: Code restructure failed: missing block: B:2975:?, code lost:
        return "Macedonian";
     */
    /* JADX WARN: Code restructure failed: missing block: B:2976:?, code lost:
        return "Maori";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r21.equals("nld (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3003:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3005:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3017:?, code lost:
        return "Croatian";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3019:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3020:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3034:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3036:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3042:?, code lost:
        return "Welsh";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3045:?, code lost:
        return "Czech";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3063:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3071:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3082:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3095:?, code lost:
        return "Persian";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3097:?, code lost:
        return "Tibetan";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3098:?, code lost:
        return "Basque";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3100:?, code lost:
        return "Modern Greek";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3102:?, code lost:
        return "Serbian";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3103:?, code lost:
        return "Albanian";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3107:?, code lost:
        return "Slovak";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (r21.equals("dut (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x06b3, code lost:
        if (r21.equals("spa") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0895, code lost:
        if (r21.equals("por") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0141, code lost:
        if (r21.equals("rum (b)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0159, code lost:
        if (r21.equals("mya (t)") == false) goto L1939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017f, code lost:
        if (r21.equals("ron (t)") == false) goto L1939;
     */
    /* JADX WARN: Removed duplicated region for block: B:1520:0x14a9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1724:0x1765 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1732:0x178b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1736:0x1799 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1740:0x17a7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1744:0x17b5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1748:0x17c3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1752:0x17d1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1756:0x17df A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1760:0x17ed A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1764:0x17fb A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1768:0x1809 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1772:0x1817 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1776:0x1825 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1780:0x1833 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1784:0x1841 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1788:0x184f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1792:0x185d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1796:0x186b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1800:0x1879 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1804:0x1887 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1808:0x1895 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1812:0x18a3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1816:0x18b1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1820:0x18bf A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1824:0x18cd A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1828:0x18db A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1832:0x18e9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1836:0x18f7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1840:0x1905 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1844:0x1913 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1848:0x1921 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1852:0x192f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1856:0x193d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1866:0x195f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1870:0x196d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1874:0x197b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1878:0x1989 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1885:0x19a1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1889:0x19af A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1893:0x19bd A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1897:0x19cb A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1901:0x19d9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1905:0x19e7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1909:0x19f5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1913:0x1a03 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1921:0x1a1e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1925:0x1a2c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1929:0x1a3a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1937:0x1a60 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1941:0x1a6e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1945:0x1a7c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1949:0x1a8a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1953:0x1a98 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1957:0x1aa6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1961:0x1ab4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1965:0x1ac2 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1969:0x1ad0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1973:0x1ade A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1977:0x1aec A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1981:0x1afa A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1985:0x1b08 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1989:0x1b16 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1997:0x1b31 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2001:0x1b3f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2005:0x1b4d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2009:0x1b5b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2013:0x1b69 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2021:0x1b84 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2029:0x1baa A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2033:0x1bb8 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2037:0x1bc6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2041:0x1bd4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2053:0x1bfc A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2057:0x1c0a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2061:0x1c18 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2065:0x1c26 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2069:0x1c34 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2073:0x1c42 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2077:0x1c50 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2081:0x1c5e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2085:0x1c6c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2089:0x1c7a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2093:0x1c88 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2097:0x1c96 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2101:0x1ca4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2105:0x1cb2 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2109:0x1cc0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2113:0x1cce A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2117:0x1cdc A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2121:0x1cea A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2125:0x1cf8 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2129:0x1d06 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2133:0x1d14 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2137:0x1d22 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2141:0x1d30 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2145:0x1d3e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2149:0x1d4c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2156:0x1d64 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2164:0x1d8a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2172:0x1db0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2176:0x1dbe A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2180:0x1dcc A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2184:0x1dda A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2188:0x1de8 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2192:0x1df6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2196:0x1e04 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2200:0x1e12 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2204:0x1e20 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2211:0x1e38 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2215:0x1e46 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2223:0x1e61 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2235:0x1e9f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2239:0x1ead A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2243:0x1ebb A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2247:0x1ec9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2251:0x1ed7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2255:0x1ee5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2259:0x1ef3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2263:0x1f01 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2270:0x1f19 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2274:0x1f27 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2278:0x1f35 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2282:0x1f43 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2292:0x1f65 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2300:0x1f8b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2311:0x1fbb A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2315:0x1fc9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2319:0x1fd7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2323:0x1fe5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2327:0x1ff3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2335:0x200e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2339:0x201c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2347:0x2037 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2351:0x2045 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2355:0x2053 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2359:0x2061 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2363:0x206f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2367:0x207d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2371:0x208b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2378:0x20a3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2382:0x20b1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2386:0x20bf A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2393:0x20d7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2397:0x20e5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2401:0x20f3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2405:0x2101 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2409:0x210f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2413:0x211d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2417:0x212b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2425:0x2151 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2429:0x215f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2433:0x216d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2437:0x217b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2441:0x2189 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2445:0x2197 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2449:0x21a5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2464:0x21e3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2472:0x21ff A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2480:0x221b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2487:0x2233 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2491:0x2241 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2510:0x228d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2517:0x22a5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2521:0x22b3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2525:0x22c1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2541:0x22f9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:2618:0x23f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getTranslateString(android.content.Context r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 12036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.brasiltv.bean.SubtitleManager.getTranslateString(android.content.Context, java.lang.String):java.lang.String");
    }

    public final void putSelectSubtitle(String str, int i10, String str2) {
        i.g(str, "key");
        i.g(str2, "subTitleLanguage");
        if (!TextUtils.isEmpty(str) && i10 >= -1) {
            RecordSubtitleInfoBean recordSubtitleInfoBean = mLruCacheLanguages.get(str);
            if (recordSubtitleInfoBean == null) {
                mLruCacheLanguages.put(str, new RecordSubtitleInfoBean(i10, str2));
                return;
            }
            recordSubtitleInfoBean.setSubtitleIndex(i10);
            recordSubtitleInfoBean.setSubTitleLanguage(str2);
        }
    }

    public final void setMGlobalAudioLanguage(int i10) {
        mGlobalAudioLanguage = i10;
    }

    public final void setMGlobalColor(int i10) {
        mGlobalColor = i10;
    }

    public final void setMGlobalLanguage(int i10) {
        mGlobalLanguage = i10;
    }

    public final void setMGlobalSize(int i10) {
        mGlobalSize = i10;
    }

    public final void setMGlobalSwitch(boolean z10) {
        mGlobalSwitch = z10;
    }

    public final void setMLruCacheAudioLanguages(LruCache<String, String> lruCache) {
        i.g(lruCache, "<set-?>");
        mLruCacheAudioLanguages = lruCache;
    }

    public final void setMLruCacheColor(LruCache<String, Integer> lruCache) {
        i.g(lruCache, "<set-?>");
        mLruCacheColor = lruCache;
    }

    public final void setMLruCacheLanguages(HashMap<String, RecordSubtitleInfoBean> hashMap) {
        i.g(hashMap, "<set-?>");
        mLruCacheLanguages = hashMap;
    }

    public final void setMLruCacheSize(LruCache<String, Integer> lruCache) {
        i.g(lruCache, "<set-?>");
        mLruCacheSize = lruCache;
    }

    public final void setMLruCacheSwitch(LruCache<String, Boolean> lruCache) {
        i.g(lruCache, "<set-?>");
        mLruCacheSwitch = lruCache;
    }
}
