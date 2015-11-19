package org.elasticsearch.index.analysis;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;
import org.gruter.analysis.hanguel.morph.HanguelJamoMorphAnalyzer;

import java.io.IOException;

public class HanguelJamoMorphAnalyzerProvider extends AbstractIndexAnalyzerProvider<HanguelJamoMorphAnalyzer> {

    private final HanguelJamoMorphAnalyzer analyzer;

    @Inject
    public HanguelJamoMorphAnalyzerProvider(Index index, @IndexSettings Settings indexSettings, Environment env, @Assisted String name, @Assisted Settings settings) throws IOException {
        super(index, indexSettings, name, settings);

        analyzer = new HanguelJamoMorphAnalyzer();
    }

    @Override
    public HanguelJamoMorphAnalyzer get() {
        return this.analyzer;
    }
}