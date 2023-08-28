package spaceage;

class SpaceAge {
    private double age;
    final double earthYear = 31557600;
    final double mercuryYear = earthYear * 0.2408467;
    final double venusYear = earthYear * 0.61519726;
    final double marsYear = earthYear * 1.8808158;
    final double jupiterYear = earthYear * 11.862615;
    final double saturnYear = earthYear * 29.447498;
    final double uranusYear = earthYear * 84.016846;
    final double neptuneYear = earthYear * 164.79132;

    SpaceAge(double seconds) {
        age = seconds;
    }

    double getSeconds() {
        return age;
    }

    double onEarth() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return age / earthYear;
    }

    double onMercury() {
        return age / mercuryYear;
    }

    double onVenus() {
        return age / venusYear;
    }

    double onMars() {
        return age / marsYear;
    }

    double onJupiter() {
        return age / jupiterYear;
    }

    double onSaturn() {
        return age / saturnYear;
    }

    double onUranus() {
        return age / uranusYear;
    }

    double onNeptune() {
        return age / neptuneYear;
    }
}
