package protein;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {
    private Map<String, String> proteins = new HashMap<>();

    List<String> translate(String rnaSequence) {
        rnaSequence = rnaSequence.toUpperCase();
        List<String> translation = new ArrayList<>();
        proteins.put("AUG", "Methionine");
        proteins.put("UUU", "Phenylalanine");
        proteins.put("UUC", "Phenylalanine");
        proteins.put("UUA", "Leucine");
        proteins.put("UUG", "Leucine");
        proteins.put("UCU", "Serine");
        proteins.put("UCC", "Serine");
        proteins.put("UCA", "Serine");
        proteins.put("UCG", "Serine");
        proteins.put("UAU", "Tyrosine");
        proteins.put("UAC", "Tyrosine");
        proteins.put("UGU", "Cysteine");
        proteins.put("UGC", "Cysteine");
        proteins.put("UGG", "Tryptophan");
        proteins.put("UAA", "STOP");
        proteins.put("UAG", "STOP");
        proteins.put("UGA", "STOP");
        while (rnaSequence.length() >= 3) {
            String rna = proteins.get(rnaSequence.substring(0, 3));
            if (rna.equals("STOP")) {
                return translation;
            } else {
                translation.add(rna);
            }
            rnaSequence = rnaSequence.substring(3);
        }
        return translation;
    }
}
