package org.elasticsearch.index.analysis;

import org.apache.lucene.analysis.Tokenizer;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;
import org.gruter.analysis.hanguel.morph.HanguelJamoMorphTokenizer;

public class HanguelJamoMorphTokenizerFactory extends AbstractTokenizerFactory {

    @Inject
    public HanguelJamoMorphTokenizerFactory(Index index, @IndexSettings Settings indexSettings, @Assisted String name, @Assisted Settings settings) {
        super(index, indexSettings, name, settings);
    }

    @Override
    public Tokenizer create() {
        return new HanguelJamoMorphTokenizer();
    }
}