package org.apache.tika.pipes;

import g7.b;
import g7.d;
/* loaded from: classes.dex */
public class LoggingPipesReporter extends PipesReporter {
    b LOGGER = d.b(LoggingPipesReporter.class);

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        this.LOGGER.j("pipes error", th);
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j) {
        this.LOGGER.b("{} {} {}", fetchEmitTuple, pipesResult, Long.valueOf(j));
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        this.LOGGER.a("error {}", str);
    }
}
