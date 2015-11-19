package org.elasticsearch.plugin.analysis.hangueljamo;

import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.index.analysis.HanguelJamoMorphAnalysisBinderProcessor;
import org.elasticsearch.plugins.Plugin;


public class AnalysisHanguelJamoPlugin extends Plugin {

    @Override
    public String name() {
        return "analysis-hangueljamo";
    }

    @Override
    public String description() {
        return "Hanguel Jamo Analyzer";
    }

    public void onModule(AnalysisModule module) {
        module.addProcessor(new HanguelJamoMorphAnalysisBinderProcessor());
    }
}