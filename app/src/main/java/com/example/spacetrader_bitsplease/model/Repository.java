package com.example.spacetrader_bitsplease.model;
import com.example.spacetrader_bitsplease.entity.Condition;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.PlanetName;
import com.example.spacetrader_bitsplease.entity.Condition;
import com.example.spacetrader_bitsplease.entity.Size;
import com.example.spacetrader_bitsplease.entity.TechLevel;
import com.example.spacetrader_bitsplease.entity.TradeGoods;

import java.util.List;
import java.util.Random;

public class Repository {

// --Commented out by Inspection START (4/15/2019 3:38 PM):
//    public Repository() {
//    }
// --Commented out by Inspection STOP (4/15/2019 3:38 PM)

    /**
     * Method to assign xCoordinate to a planet
     * @param planet The PlanetName of the planet to be assigned an x value
     * @return int of x Coordinate
     */
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

    /**
     * Method to assign yCoordinate to a planet
     * @param planet The PlanetName of the planet to be assigned an y value
     * @return int of y Coordinate
     */
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

    /**
     * Method to assign size to a planet
     * @param planet The PlanetName of the planet to be assigned a size
     * @return Size of planet
     */
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

    /**
     * Method to assign condition to a planet
     * @param planet The PlanetName of the planet to be assigned a condition
     * @return Condition of planet
     */
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

    /**
     * Method to assign techLevel to a planet
     * @param planet The PlanetName of the planet to be assigned a tech level
     * @return TechLevel of the planet
     */
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

    /**
     * Method to assign productQuantity to a planet
     * @param planet The PlanetName of the planet to be assigned a product Quantity
     */
    public static void assignProductQuantity(Planet planet) {
        List<TradeGoods> goods = TradeGoods.getGoods();

        for (int i = 0; i < goods.size(); i++) {
            TradeGoods good = goods.get(i);
            //Random rand = new Random();
            //int chance = rand.nextInt(good.getVar()) + 1;
            //chance *= 5;

            int quant = good.getTtp();
            quant += (good.getTtp()) + 20;
            //quant += (good.getTtp() * chance) + 20;

            if (good == TradeGoods.WATER) {
                planet.setWaterQuant(quant);
                planet.setWaterQuantSell(0);
            } else if (good == TradeGoods.FURS) {
                planet.setFurQuant(quant);
                planet.setFurQuantSell(0);
            } else if (good == TradeGoods.FOOD) {
                planet.setFoodQuant(quant);
                planet.setFoodQuantSell(0);
            } else if (good == TradeGoods.ORE) {
                planet.setOreQuant(quant);
                planet.setOreQuantSell(0);
            } else if (good == TradeGoods.GAMES) {
                planet.setGameQuant(quant);
                planet.setGameQuantSell(0);
            } else if (good == TradeGoods.FIREARMS) {
                planet.setFirearmQuant(quant);
                planet.setFirearmQuantSell(0);
            } else if (good == TradeGoods.MEDICINE) {
                planet.setMedicineQuant(quant);
                planet.setMedicineQuantSell(0);
            } else if (good == TradeGoods.MACHINES) {
                planet.setMachineQuant(quant);
                planet.setMachineQuantSell(0);
            } else if (good == TradeGoods.NARCOTICS) {
                planet.setNarcoticQuant(quant);
                planet.setNarcoticQuantSell(0);
            } else if (good == TradeGoods.ROBOTS) {
                planet.setRobotQuant(quant);
                planet.setRobotQuantSell(0);
            }
        }
    }

    /**
     * Method to assign prices to a planet
     * @param planet The PlanetName of the planet to be assigned a product prices
     */
    public static void assignPrices(Planet planet) {
        List<TradeGoods> goods = TradeGoods.getGoods();

        for (int i = 0; i < goods.size(); i++) {
            TradeGoods good = goods.get(i);
            //Random r = new Random();
            //int luck = r.nextInt(good.getVar()) + 1;
            //luck /= 100;

            int price = good.getBasePrice();
            price += (good.getIpl() * (planet.getTechLevel().ordinal() - good.getMtlp()));
            //price += (good.getBasePrice()*luck);

            if (good == TradeGoods.WATER) {
                planet.setWaterPrice(price);
                planet.setWaterSell(price/2);
            } else if (good == TradeGoods.FURS) {
                planet.setFurPrice(price);
                planet.setFurSell(price/2);
            } else if (good == TradeGoods.FOOD) {
                planet.setFoodPrice(price);
                planet.setFoodSell(price/2);
            } else if (good == TradeGoods.ORE) {
                planet.setOrePrice(price);
                planet.setOreSell(price/2);
            } else if (good == TradeGoods.GAMES) {
                planet.setGamePrice(price);
                planet.setGameSell(price/2);
            } else if (good == TradeGoods.FIREARMS) {
                planet.setFirearmPrice(price);
                planet.setFirearmSell(price/2);
            } else if (good == TradeGoods.MEDICINE) {
                planet.setMedicinePrice(price);
                planet.setMedicineSell(price/2);
            } else if (good == TradeGoods.MACHINES) {
                planet.setMachinePrice(price);
                planet.setMachineSell(price/2);
            } else if (good == TradeGoods.NARCOTICS) {
                planet.setNarcoticPrice(price);
                planet.setNarcoticSell(price/2);
            } else if (good == TradeGoods.ROBOTS) {
                planet.setRobotPrice(price);
                planet.setRobotSell(price/2);
            }
        }
    }
}

