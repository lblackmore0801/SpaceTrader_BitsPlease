package com.example.spacetrader_bitsplease.entity;

public class Game extends Planet{

    public Game() {
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
        if (planet.resource == Resource.WEIRDMUSHROOMS || planet.resource == Resource.RICHSOIL
                || planet.resource == Resource.LOTSOFHERBS || planet.resource == Resource.LOTSOFWATER
                || planet.resource == Resource.RICHFAUNA || planet.techLevel == TechLevel.AGRICULTURE) {
            int water = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
            planet.setWaterResource(water);
        }

        if (planet.resource == Resource.RICHFAUNA || planet.techLevel == TechLevel.MEDIEVAL
            || planet.techLevel == TechLevel.RENAISSANCE || planet.techLevel == TechLevel.EARLY) {
            int fur = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
            planet.setFurResource(fur);
        }

        if (planet.resource == Resource.WEIRDMUSHROOMS || planet.resource == Resource.RICHSOIL
                || planet.resource == Resource.LOTSOFHERBS || planet.resource == Resource.LOTSOFWATER
                || planet.resource == Resource.RICHFAUNA || planet.techLevel == TechLevel.AGRICULTURE) {
            int food = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
            planet.setFoodResource(food);
        }

        if (planet.resource == Resource.DESERT || planet.resource == Resource.LIFELESS
                || planet.resource == Resource.MINERALRICH || planet.resource == Resource.LOTSOFHERBS) {
            int ore = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
            planet.setOreResource(ore);
        }

        if (planet.techLevel == TechLevel.HITECH || planet.techLevel == TechLevel.POSTINDUSTRIAL
                || planet.techLevel == TechLevel.INDUSTRIAL) {
            int game = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
            planet.setGameResource(game);
        }

        if (planet.resource == Resource.WARLIKE || planet.techLevel == TechLevel.HITECH
                || planet.techLevel == TechLevel.POSTINDUSTRIAL || planet.techLevel == TechLevel.INDUSTRIAL
                || planet.resource == Resource.MINERALRICH) {
            int firearm = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
            planet.setFirearmResource(firearm);
        }

        if (planet.techLevel == TechLevel.HITECH || planet.techLevel == TechLevel.POSTINDUSTRIAL
                || planet.techLevel == TechLevel.INDUSTRIAL || planet.resource == Resource.WEIRDMUSHROOMS
                || planet.resource == Resource.LOTSOFHERBS) {
            int medicine = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
            planet.setMedicineResource(medicine);
        }

        if (planet.techLevel == TechLevel.HITECH || planet.techLevel == TechLevel.POSTINDUSTRIAL
                || planet.techLevel == TechLevel.INDUSTRIAL || planet.resource == Resource.MINERALRICH
                || planet.resource == Resource.WARLIKE) {
            int machine = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
            planet.setMachineResource(machine);
        }

        if (planet.resource == Resource.WEIRDMUSHROOMS || planet.resource == Resource.LOTSOFHERBS
                || planet.resource == Resource.ARTISTIC) {
            int narcotic = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
            planet.setNarcoticResource(narcotic);
        }

        if (planet.techLevel == TechLevel.HITECH || planet.techLevel == TechLevel.POSTINDUSTRIAL
                || planet.techLevel == TechLevel.INDUSTRIAL || planet.resource == Resource.MINERALRICH
                || planet.resource == Resource.WARLIKE) {
            int robot = (planet.size.ordinal() * (planet.resource.ordinal() + planet.techLevel.ordinal()));
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
