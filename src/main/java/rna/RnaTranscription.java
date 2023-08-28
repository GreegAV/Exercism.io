package rna;

class RnaTranscription {

    String transcribe(String dnaStrand) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuilder rna = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'G') rna.append("C");
            if (dnaStrand.charAt(i) == 'C') rna.append("G");
            if (dnaStrand.charAt(i) == 'T') rna.append("A");
            if (dnaStrand.charAt(i) == 'A') rna.append("U");
        }
        return rna.toString();
    }
}
