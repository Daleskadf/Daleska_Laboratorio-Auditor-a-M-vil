package org.apache.tika.language.detect;

import K1.d;
import j$.util.List;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.ServiceLoader;
/* loaded from: classes.dex */
public abstract class LanguageDetector {
    private static final int BUFFER_LENGTH = 4096;
    private static final ServiceLoader DEFAULT_SERVICE_LOADER = new ServiceLoader();
    protected boolean mixedLanguages = false;
    protected boolean shortText = false;

    public static LanguageDetector getDefaultLanguageDetector() {
        List<LanguageDetector> languageDetectors = getLanguageDetectors();
        if (!languageDetectors.isEmpty()) {
            return languageDetectors.get(0);
        }
        throw new IllegalStateException("No language detectors available");
    }

    public static List<LanguageDetector> getLanguageDetectors() {
        return getLanguageDetectors(DEFAULT_SERVICE_LOADER);
    }

    public void addText(CharSequence charSequence) {
        int length = charSequence.length();
        if (length < 4096) {
            char[] charArray = charSequence.toString().toCharArray();
            addText(charArray, 0, charArray.length);
            return;
        }
        int i7 = 0;
        while (!hasEnoughText() && i7 < length) {
            int i8 = i7 + 4096;
            char[] charArray2 = charSequence.subSequence(i7, Math.min(i8, length)).toString().toCharArray();
            addText(charArray2, 0, charArray2.length);
            i7 = i8;
        }
    }

    public abstract void addText(char[] cArr, int i7, int i8);

    public LanguageResult detect() {
        return detectAll().get(0);
    }

    public abstract List<LanguageResult> detectAll();

    public List<LanguageResult> detectAll(String str) {
        reset();
        addText(str);
        return detectAll();
    }

    public boolean hasEnoughText() {
        return false;
    }

    public abstract boolean hasModel(String str);

    public boolean isMixedLanguages() {
        return this.mixedLanguages;
    }

    public boolean isShortText() {
        return this.shortText;
    }

    public abstract LanguageDetector loadModels();

    public abstract LanguageDetector loadModels(Set<String> set);

    public abstract void reset();

    public LanguageDetector setMixedLanguages(boolean z7) {
        this.mixedLanguages = z7;
        return this;
    }

    public abstract LanguageDetector setPriors(Map<String, Float> map);

    public LanguageDetector setShortText(boolean z7) {
        this.shortText = z7;
        return this;
    }

    public static List<LanguageDetector> getLanguageDetectors(ServiceLoader serviceLoader) {
        List<LanguageDetector> loadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(LanguageDetector.class);
        List.EL.sort(loadStaticServiceProviders, new d(18));
        return loadStaticServiceProviders;
    }

    public LanguageResult detect(CharSequence charSequence) {
        reset();
        addText(charSequence);
        return detect();
    }
}
