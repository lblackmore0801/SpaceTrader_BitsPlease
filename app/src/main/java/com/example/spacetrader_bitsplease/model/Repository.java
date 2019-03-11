package com.example.spacetrader_bitsplease.model;
import com.example.spacetrader_bitsplease.entity.Condition;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.PlanetName;
import com.example.spacetrader_bitsplease.entity.Condition;
import com.example.spacetrader_bitsplease.entity.Size;
import com.example.spacetrader_bitsplease.entity.TechLevel;

public class Repository {

    public Repository() {
    }

    public static int xCoordinate(PlanetName planet) {
        if (planet == PlanetName.ANDEVIAN) {
            return 100;
        }
        if (planet == PlanetName.CASTOR) {
            return 90;
        }
        if (planet == PlanetName.ESMEE) {
            return 80;
        }
        if (planet == PlanetName.FERRIS) {
            return 70;
        }
        if (planet == PlanetName.HELENA) {
            return 60;
        }
        if (planet == PlanetName.MYRTHE) {
            return 50;
        }
        if (planet == PlanetName.OTHELLO) {
            return 110;
        }
        if (planet == PlanetName.RHYMUS) {
            return 120;
        }
        if (planet == PlanetName.SOL) {
            return 130;
        }
        if (planet == PlanetName.ZUUL) {
            return 140;
        }
        return 100;
    }

    public static int yCoordinate(PlanetName planet) {
        if (planet == PlanetName.ANDEVIAN) {
            return 100;
        }
        if (planet == PlanetName.CASTOR) {
            return 110;
        }
        if (planet == PlanetName.ESMEE) {
            return 120;
        }
        if (planet == PlanetName.FERRIS) {
            return 130;
        }
        if (planet == PlanetName.HELENA) {
            return 140;
        }
        if (planet == PlanetName.MYRTHE) {
            return 50;
        }
        if (planet == PlanetName.OTHELLO) {
            return 60;
        }
        if (planet == PlanetName.RHYMUS) {
            return 70;
        }
        if (planet == PlanetName.SOL) {
            return 80;
        }
        if (planet == PlanetName.ZUUL) {
            return 90;
        }
        return 100;
    }

    public static Size size(PlanetName planet) {
        if (planet == PlanetName.ANDEVIAN) {
            return Size.MEDIUM;
        }
        if (planet == PlanetName.CASTOR) {
            return Size.MEDIUM;
        }
        if (planet == PlanetName.ESMEE) {
            return Size.MEDIUM;
        }
        if (planet == PlanetName.FERRIS) {
            return Size.LARGE;
        }
        if (planet == PlanetName.HELENA) {
            return Size.SMALL;
        }
        if (planet == PlanetName.MYRTHE) {
            return Size.MEDIUM;
        }
        if (planet == PlanetName.OTHELLO) {
            return Size.LARGE;
        }
        if (planet == PlanetName.RHYMUS) {
            return Size.SMALL;
        }
        if (planet == PlanetName.SOL) {
            return Size.SMALL;
        }
        if (planet == PlanetName.ZUUL) {
            return Size.LARGE;
        }
        return Size.MEDIUM;
    }

    public static Condition condition(PlanetName planet) {
        if (planet == PlanetName.ANDEVIAN) {
            return Condition.ARTISTIC;
        }
        if (planet == PlanetName.CASTOR) {
            return Condition.DESERT;
        }
        if (planet == PlanetName.ESMEE) {
            return Condition.LIFELESS;
        }
        if (planet == PlanetName.FERRIS) {
            return Condition.MINERALPOOR;
        }
        if (planet == PlanetName.HELENA) {
            return Condition.POORSOIL;
        }
        if (planet == PlanetName.MYRTHE) {
            return Condition.LOTSOFHERBS;
        }
        if (planet == PlanetName.OTHELLO) {
            return Condition.RICHFAUNA;
        }
        if (planet == PlanetName.RHYMUS) {
            return Condition.WEIRDMUSHROOMS;
        }
        if (planet == PlanetName.SOL) {
            return Condition.WARLIKE;
        }
        if (planet == PlanetName.ZUUL) {
            return Condition.LOTSOFWATER;
        }
        return Condition.ARTISTIC;
    }

    public static TechLevel techLevel(PlanetName planet) {
        if (planet == PlanetName.ANDEVIAN) {
            return TechLevel.AGRICULTURE;
        }
        if (planet == PlanetName.CASTOR) {
            return TechLevel.HITECH;
        }
        if (planet == PlanetName.ESMEE) {
            return TechLevel.RENAISSANCE;
        }
        if (planet == PlanetName.FERRIS) {
            return TechLevel.PREAGRICULTURE;
        }
        if (planet == PlanetName.HELENA) {
            return TechLevel.MEDIEVAL;
        }
        if (planet == PlanetName.MYRTHE) {
            return TechLevel.POSTINDUSTRIAL;
        }
        if (planet == PlanetName.OTHELLO) {
            return TechLevel.EARLY;
        }
        if (planet == PlanetName.RHYMUS) {
            return TechLevel.RENAISSANCE;
        }
        if (planet == PlanetName.SOL) {
            return TechLevel.INDUSTRIAL;
        }
        if (planet == PlanetName.ZUUL) {
            return TechLevel.HITECH;
        }
        return TechLevel.AGRICULTURE;
    }

    public static void assignProductQuantity(Planet planet) {
        if (planet.getCondition() == Condition.WEIRDMUSHROOMS || planet.getCondition() == Condition.RICHSOIL
                || planet.getCondition() == Condition.LOTSOFHERBS || planet.getCondition() == Condition.LOTSOFWATER
                || planet.getCondition() == Condition.RICHFAUNA || planet.getTechLevel() == TechLevel.AGRICULTURE) {
            int water = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setWaterQuant(water);
        }

        if (planet.getCondition() == Condition.RICHFAUNA || planet.getTechLevel() == TechLevel.MEDIEVAL
                || planet.getTechLevel() == TechLevel.RENAISSANCE || planet.getTechLevel() == TechLevel.EARLY) {
            int fur = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setFurQuant(fur);
        }

        if (planet.getCondition() == Condition.WEIRDMUSHROOMS || planet.getCondition() == Condition.RICHSOIL
                || planet.getCondition() == Condition.LOTSOFHERBS || planet.getCondition() == Condition.LOTSOFWATER
                || planet.getCondition() == Condition.RICHFAUNA || planet.getTechLevel() == TechLevel.AGRICULTURE) {
            int food = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setFoodQuant(food);
        }

        if (planet.getCondition() == Condition.DESERT || planet.getCondition() == Condition.LIFELESS
                || planet.getCondition() == Condition.MINERALRICH || planet.getCondition() == Condition.LOTSOFHERBS) {
            int ore = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setOreQuant(ore);
        }

        if (planet.getTechLevel() == TechLevel.HITECH || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL
                || planet.getTechLevel() == TechLevel.INDUSTRIAL) {
            int game = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setGameQuant(game);
        }

        if (planet.getCondition() == Condition.WARLIKE || planet.getTechLevel() == TechLevel.HITECH
                || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL || planet.getTechLevel() == TechLevel.INDUSTRIAL
                || planet.getCondition() == Condition.MINERALRICH) {
            int firearm = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setFirearmQuant(firearm);
        }

        if (planet.getTechLevel() == TechLevel.HITECH || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL
                || planet.getTechLevel() == TechLevel.INDUSTRIAL || planet.getCondition() == Condition.WEIRDMUSHROOMS
                || planet.getCondition() == Condition.LOTSOFHERBS) {
            int medicine = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setMedicineQuant(medicine);
        }

        if (planet.getTechLevel() == TechLevel.HITECH || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL
                || planet.getTechLevel() == TechLevel.INDUSTRIAL || planet.getCondition() == Condition.MINERALRICH
                || planet.getCondition() == Condition.WARLIKE) {
            int machine = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setMachineQuant(machine);
        }

        if (planet.getCondition() == Condition.WEIRDMUSHROOMS || planet.getCondition() == Condition.LOTSOFHERBS
                || planet.getCondition() == Condition.ARTISTIC) {
            int narcotic = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setNarcoticQuant(narcotic);
        }

        if (planet.getTechLevel() == TechLevel.HITECH || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL
                || planet.getTechLevel() == TechLevel.INDUSTRIAL || planet.getCondition() == Condition.MINERALRICH
                || planet.getCondition() == Condition.WARLIKE) {
            int robot = (planet.getSize().ordinal() * (planet.getCondition().ordinal() + planet.getTechLevel().ordinal()));
            planet.setRobotQuant(robot);
        }
    }

    public static int buyingPrice(Planet planet) {
        return 0;
    }

    public static int sellingPrice(Planet planet) {
        return buyingPrice(planet) / 2;
    }
}
