package io.flutter.plugin.editing;

import K5.r;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class g implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    public final A4.c f11651a;

    /* renamed from: b  reason: collision with root package name */
    public final TextServicesManager f11652b;

    /* renamed from: c  reason: collision with root package name */
    public SpellCheckerSession f11653c;

    /* renamed from: d  reason: collision with root package name */
    public r f11654d;

    public g(TextServicesManager textServicesManager, A4.c cVar) {
        this.f11652b = textServicesManager;
        this.f11651a = cVar;
        cVar.f218b = this;
    }

    public final void a(String str, String str2, r rVar) {
        if (this.f11654d != null) {
            rVar.b(null, "error", "Previous spell check request still pending.");
            return;
        }
        this.f11654d = rVar;
        Locale a7 = M5.a.a(str);
        if (this.f11653c == null) {
            this.f11653c = this.f11652b.newSpellCheckerSession(null, a7, this, true);
        }
        this.f11653c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f11654d.a(new ArrayList());
            this.f11654d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f11654d.a(new ArrayList());
            this.f11654d = null;
            return;
        }
        for (int i7 = 0; i7 < sentenceSuggestionsInfo.getSuggestionsCount(); i7++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i7);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i7);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i7) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z7 = false;
                for (int i8 = 0; i8 < suggestionsCount; i8++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i8);
                    if (!suggestionAt.equals(StringUtils.EMPTY)) {
                        arrayList2.add(suggestionAt);
                        z7 = true;
                    }
                }
                if (z7) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f11654d.a(arrayList);
        this.f11654d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
