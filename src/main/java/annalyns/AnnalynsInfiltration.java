package annalyns;

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (prisonerIsAwake) return !archerIsAwake;
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (!archerIsAwake && !knightIsAwake && !prisonerIsAwake) return petDogIsPresent;
        if (petDogIsPresent) {
            if (knightIsAwake && prisonerIsAwake) return !archerIsAwake;
            if (!archerIsAwake) {
                if (!prisonerIsAwake) return knightIsAwake;
                if (!knightIsAwake) return prisonerIsAwake;
            }
        }
        if (!petDogIsPresent && !archerIsAwake && !knightIsAwake) return prisonerIsAwake;
        return false;
    }
}
