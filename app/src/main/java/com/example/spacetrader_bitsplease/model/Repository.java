package com.example.spacetrader_bitsplease.model;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.PlanetName;
import com.example.spacetrader_bitsplease.entity.Resource;
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

    public static Resource resource(PlanetName planet) {
        if (planet == PlanetName.ANDEVIAN) {
            return Resource.ARTISTIC;
        }
        if (planet == PlanetName.CASTOR) {
            return Resource.DESERT;
        }
        if (planet == PlanetName.ESMEE) {
            return Resource.LIFELESS;
        }
        if (planet == PlanetName.FERRIS) {
            return Resource.MINERALPOOR;
        }
        if (planet == PlanetName.HELENA) {
            return Resource.POORSOIL;
        }
        if (planet == PlanetName.MYRTHE) {
            return Resource.LOTSOFHERBS;
        }
        if (planet == PlanetName.OTHELLO) {
            return Resource.RICHFAUNA;
        }
        if (planet == PlanetName.RHYMUS) {
            return Resource.WEIRDMUSHROOMS;
        }
        if (planet == PlanetName.SOL) {
            return Resource.WARLIKE;
        }
        if (planet == PlanetName.ZUUL) {
            return Resource.LOTSOFWATER;
        }
        return Resource.ARTISTIC;
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
        if (planet.getResource() == Resource.WEIRDMUSHROOMS || planet.getResource() == Resource.RICHSOIL
                || planet.getResource() == Resource.LOTSOFHERBS || planet.getResource() == Resource.LOTSOFWATER
                || planet.getResource() == Resource.RICHFAUNA || planet.getTechLevel() == TechLevel.AGRICULTURE) {
            int water = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setWaterResource(water);
        }

        if (planet.getResource() == Resource.RICHFAUNA || planet.getTechLevel() == TechLevel.MEDIEVAL
                || planet.getTechLevel() == TechLevel.RENAISSANCE || planet.getTechLevel() == TechLevel.EARLY) {
            int fur = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setFurResource(fur);
        }

        if (planet.getResource() == Resource.WEIRDMUSHROOMS || planet.getResource() == Resource.RICHSOIL
                || planet.getResource() == Resource.LOTSOFHERBS || planet.getResource() == Resource.LOTSOFWATER
                || planet.getResource() == Resource.RICHFAUNA || planet.getTechLevel() == TechLevel.AGRICULTURE) {
            int food = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setFoodResource(food);
        }

        if (planet.getResource() == Resource.DESERT || planet.getResource() == Resource.LIFELESS
                || planet.getResource() == Resource.MINERALRICH || planet.getResource() == Resource.LOTSOFHERBS) {
            int ore = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setOreResource(ore);
        }

        if (planet.getTechLevel() == TechLevel.HITECH || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL
                || planet.getTechLevel() == TechLevel.INDUSTRIAL) {
            int game = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setGameResource(game);
        }

        if (planet.getResource() == Resource.WARLIKE || planet.getTechLevel() == TechLevel.HITECH
                || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL || planet.getTechLevel() == TechLevel.INDUSTRIAL
                || planet.getResource() == Resource.MINERALRICH) {
            int firearm = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setFirearmResource(firearm);
        }

        if (planet.getTechLevel() == TechLevel.HITECH || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL
                || planet.getTechLevel() == TechLevel.INDUSTRIAL || planet.getResource() == Resource.WEIRDMUSHROOMS
                || planet.getResource() == Resource.LOTSOFHERBS) {
            int medicine = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setMedicineResource(medicine);
        }

        if (planet.getTechLevel() == TechLevel.HITECH || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL
                || planet.getTechLevel() == TechLevel.INDUSTRIAL || planet.getResource() == Resource.MINERALRICH
                || planet.getResource() == Resource.WARLIKE) {
            int machine = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setMachineResource(machine);
        }

        if (planet.getResource() == Resource.WEIRDMUSHROOMS || planet.getResource() == Resource.LOTSOFHERBS
                || planet.getResource() == Resource.ARTISTIC) {
            int narcotic = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setNarcoticResource(narcotic);
        }

        if (planet.getTechLevel() == TechLevel.HITECH || planet.getTechLevel() == TechLevel.POSTINDUSTRIAL
                || planet.getTechLevel() == TechLevel.INDUSTRIAL || planet.getResource() == Resource.MINERALRICH
                || planet.getResource() == Resource.WARLIKE) {
            int robot = (planet.getSize().ordinal() * (planet.getResource().ordinal() + planet.getTechLevel().ordinal()));
            planet.setRobotResource(robot);
        }
    }

    public static int buyingPrice(Planet planet) {
        return 0;
    }

    public static int sellingPrice(Planet planet) {
        return buyingPrice(planet) / 2;
    }
}
