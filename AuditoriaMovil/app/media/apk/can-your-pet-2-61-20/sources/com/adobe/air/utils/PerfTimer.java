package com.adobe.air.utils;

import android.util.TimingLogger;
/* loaded from: classes.dex */
public class PerfTimer {
    private static final String LOG_TAG = "AIRPerfTimer";
    private TimingLogger m_timer;

    public PerfTimer(String str) {
        this.m_timer = null;
        this.m_timer = new TimingLogger(LOG_TAG, str);
    }

    public final void newBlock(String str) {
        if (AIRLogger.isEnabled()) {
            this.m_timer.addSplit(str);
        }
    }

    public final void stop() {
        if (AIRLogger.isEnabled()) {
            this.m_timer.dumpToLog();
        }
    }
}
