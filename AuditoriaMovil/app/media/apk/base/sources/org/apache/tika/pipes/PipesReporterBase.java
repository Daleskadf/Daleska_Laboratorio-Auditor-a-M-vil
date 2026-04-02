package org.apache.tika.pipes;

import io.flutter.plugins.pathprovider.b;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.pipes.PipesResult;
/* loaded from: classes.dex */
public abstract class PipesReporterBase extends PipesReporter implements Initializable {
    private StatusFilter statusFilter;
    private final Set<PipesResult.STATUS> includes = new HashSet();
    private final Set<PipesResult.STATUS> excludes = new HashSet();

    /* loaded from: classes.dex */
    public static class AcceptAllFilter extends StatusFilter {
        public /* synthetic */ AcceptAllFilter(int i7) {
            this();
        }

        @Override // org.apache.tika.pipes.PipesReporterBase.StatusFilter
        public boolean accept(PipesResult.STATUS status) {
            return true;
        }

        private AcceptAllFilter() {
            super(0);
        }
    }

    /* loaded from: classes.dex */
    public static class ExcludesFilter extends StatusFilter {
        private final Set<PipesResult.STATUS> excludes;

        public ExcludesFilter(Set<PipesResult.STATUS> set) {
            super(0);
            this.excludes = set;
        }

        @Override // org.apache.tika.pipes.PipesReporterBase.StatusFilter
        public boolean accept(PipesResult.STATUS status) {
            return !this.excludes.contains(status);
        }
    }

    /* loaded from: classes.dex */
    public static class IncludesFilter extends StatusFilter {
        private final Set<PipesResult.STATUS> includes;

        public /* synthetic */ IncludesFilter(int i7, Set set) {
            this(set);
        }

        @Override // org.apache.tika.pipes.PipesReporterBase.StatusFilter
        public boolean accept(PipesResult.STATUS status) {
            return this.includes.contains(status);
        }

        private IncludesFilter(Set<PipesResult.STATUS> set) {
            super(0);
            this.includes = set;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class StatusFilter {
        public /* synthetic */ StatusFilter(int i7) {
            this();
        }

        public abstract boolean accept(PipesResult.STATUS status);

        private StatusFilter() {
        }
    }

    private StatusFilter buildStatusFilter(Set<PipesResult.STATUS> set, Set<PipesResult.STATUS> set2) {
        if (set.size() > 0 && set2.size() > 0) {
            throw new TikaConfigException("Only one of includes and excludes may have any contents");
        }
        if (set.size() > 0) {
            return new IncludesFilter(0, set);
        }
        if (set2.size() > 0) {
            return new ExcludesFilter(set2);
        }
        return new AcceptAllFilter(0);
    }

    private String getOptionString() {
        PipesResult.STATUS[] values;
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (PipesResult.STATUS status : PipesResult.STATUS.values()) {
            i7++;
            if (i7 > 1) {
                sb.append(", ");
            }
            sb.append(status.name());
        }
        return sb.toString();
    }

    public boolean accept(PipesResult.STATUS status) {
        return this.statusFilter.accept(status);
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) {
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) {
        this.statusFilter = buildStatusFilter(this.includes, this.excludes);
    }

    @Field
    public void setExcludes(List<String> list) {
        for (String str : list) {
            try {
                this.excludes.add(PipesResult.STATUS.valueOf(str));
            } catch (IllegalArgumentException e7) {
                throw new TikaConfigException(b.i("I regret I don't recognize ", str, ". I only understand: ", getOptionString()), e7);
            }
        }
    }

    @Field
    public void setIncludes(List<String> list) {
        for (String str : list) {
            try {
                this.includes.add(PipesResult.STATUS.valueOf(str));
            } catch (IllegalArgumentException e7) {
                throw new TikaConfigException(b.i("I regret I don't recognize ", str, ". I only understand: ", getOptionString()), e7);
            }
        }
    }
}
