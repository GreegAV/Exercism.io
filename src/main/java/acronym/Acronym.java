package acronym;

class Acronym {
    String input;

    Acronym(String phrase) {
        input = phrase.replaceAll("[-_]", " ");
    }

    String get() {
        StringBuilder acronym = new StringBuilder();
        for (String word : input.split("\\s+")) {
                acronym.append(word.substring(0, 1).toUpperCase());
        }
        return acronym.toString();
    }

}
