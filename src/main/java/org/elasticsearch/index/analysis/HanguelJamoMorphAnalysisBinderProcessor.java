package org.elasticsearch.index.analysis;


public class HanguelJamoMorphAnalysisBinderProcessor extends AnalysisModule.AnalysisBinderProcessor {

    @Override
    public void processAnalyzers(AnalyzersBindings analyzersBindings) {
        analyzersBindings.processAnalyzer("hangueljamo_analyzer", HanguelJamoMorphAnalyzerProvider.class);
    }

    @Override
    public void processTokenizers(TokenizersBindings tokenizersBindings) {
        tokenizersBindings.processTokenizer("hangueljamo_tokenizer", HanguelJamoMorphTokenizerFactory.class);
    }
}