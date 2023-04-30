package com.example.hoigenreal;

import java.util.ArrayList;
import java.util.List;

public class AchievementData {
    public static List<Achievement> getAllAchievements(){
        List<Achievement> achievementList = new ArrayList<>();

        Achievement blankAchievement = new Achievement("Any",0,0,"Core");
        blankAchievement.setNationFlag("Any");
        achievementList.add(blankAchievement);

        Achievement bearerOfArtillery = new Achievement("Bearer of Artillery", 1, 0,"Core");
        bearerOfArtillery.setNationFlag("Other");
        achievementList.add(bearerOfArtillery);

        Achievement bigEntente = new Achievement("Big Entente",2,0,"Core");
        bigEntente.setNationFlag("France");
        achievementList.add(bigEntente);

        Achievement canadaFirst = new Achievement("Canada First",3,0,"Core");
        canadaFirst.setNationFlag("Other");
        achievementList.add(canadaFirst);

        Achievement destroyerOfWorlds = new Achievement("Destroyer of Worlds",4,0,"Core");
        destroyerOfWorlds.setNationFlag("Any");
        achievementList.add(destroyerOfWorlds);

        Achievement duceNukedEm = new Achievement("Duce Nuked'em",5,0,"Core");
        duceNukedEm.setNationFlag("Italy");
        achievementList.add(duceNukedEm);

        Achievement forgeOfVictory = new Achievement("Forge of Victory",6,0,"Core");
        forgeOfVictory.setNationFlag("Other");
        achievementList.add(forgeOfVictory);

        Achievement friendInNeed = new Achievement("Friend in Need",7,0,"Core");
        friendInNeed.setNationFlag("Any");
        achievementList.add(friendInNeed);

        Achievement masterOfWar = new Achievement("Master of War",8,0,"Core");
        masterOfWar.setNationFlag("Any");
        achievementList.add(masterOfWar);

        Achievement medPlutonium = new Achievement("Med plutonium",9,0,"Core");
        medPlutonium.setNationFlag("Other");
        achievementList.add(medPlutonium);

        Achievement mineIsBigger = new Achievement("Mine is bigger than yours",10,0,"Core");
        mineIsBigger.setNationFlag("Any");
        achievementList.add(mineIsBigger);

        Achievement newWorldOrder = new Achievement("New World Order",11,0,"Core");
        newWorldOrder.setNationFlag("Any");
        achievementList.add(newWorldOrder);

        Achievement noCountryForOldMen = new Achievement("No country for old men",12,0,"Core");
        noCountryForOldMen.setNationFlag("Any");
        achievementList.add(noCountryForOldMen);

        Achievement nobodyExpects = new Achievement("Nobody expects...",13,0,"Core");
        nobodyExpects.setNationFlag("Other");
        achievementList.add(nobodyExpects);

        Achievement northernLight = new Achievement("Northern Light",14,0,"Core");
        northernLight.setNationFlag("Other");
        achievementList.add(northernLight);

        Achievement onceMoreMate = new Achievement("Once More Mate",15,0,"Core");
        onceMoreMate.setNationFlag("Other");
        achievementList.add(onceMoreMate);

        Achievement oneEmpire = new Achievement("One Empire",16,0,"Core");
        oneEmpire.setNationFlag("Britain");
        achievementList.add(oneEmpire);

        Achievement operationSeaLion = new Achievement("Operation Sea Lion",17,0,"Core");
        operationSeaLion.setNationFlag("Germany");
        achievementList.add(operationSeaLion);

        Achievement partyLikeIts = new Achievement("Party like it's 1520",18,0,"Core");
        partyLikeIts.setNationFlag("Other");
        achievementList.add(partyLikeIts);

        Achievement polandCanIntoSpace = new Achievement("Poland Can Into Space",19,0,"Core");
        polandCanIntoSpace.setNationFlag("Other");
        achievementList.add(polandCanIntoSpace);

        Achievement sunsetInvasion = new Achievement("Sunset Invasion",20,0,"Core");
        sunsetInvasion.setNationFlag("Other");
        achievementList.add(sunsetInvasion);

        Achievement revengeOfMontezuma = new Achievement("The Revenge of Montezuma",21,0,"Core");
        revengeOfMontezuma.setNationFlag("Other");
        achievementList.add(revengeOfMontezuma);

        Achievement revolutionTriumphant = new Achievement("The Revolution Triumphant",22,0,"Core");
        revolutionTriumphant.setNationFlag("Soviet");
        achievementList.add(revolutionTriumphant);

        Achievement timeOnOurSide = new Achievement("Time is on our side",23,0,"Core");
        timeOnOurSide.setNationFlag("Any");
        achievementList.add(timeOnOurSide);

        Achievement transportTycoon = new Achievement("Transport Tycoon",24,0,"Core");
        transportTycoon.setNationFlag("Any");
        achievementList.add(transportTycoon);

        Achievement trueBlitzkrieg = new Achievement("True Blitzkrieg",25,0,"Core");
        trueBlitzkrieg.setNationFlag("Germany");
        achievementList.add(trueBlitzkrieg);

        Achievement unitedNetherlands = new Achievement("United Blitzkrieg",26,0,"Core");
        unitedNetherlands.setNationFlag("Other");
        achievementList.add(unitedNetherlands);

        Achievement viveLaFrance = new Achievement("Vive la France",27,0,"Core");
        viveLaFrance.setNationFlag("France");
        achievementList.add(viveLaFrance);

        Achievement builtItInADay = new Achievement("We'll Build it in a Day",28,0,"Core");
        builtItInADay.setNationFlag("Any");
        achievementList.add(builtItInADay);

        Achievement wunderwaffen = new Achievement("Wunderwaffen",29,0,"Core");
        wunderwaffen.setNationFlag("Any");
        achievementList.add(wunderwaffen);

        //Together For Victory -- everything past core achievements are not getting in. way too many -- to any reader, you will need to venmo me $500 to change this
        /*
        Achievement brains = new Achievement("Braaaaains!",29,0,"Together for Victory");
        brains.setNationFlag("Other");
        achievementList.add(brains);

        Achievement crusaderKings = new Achievement("Crusader Kings",30,0,"Together for Victory");
        crusaderKings.setNationFlag("Other");
        achievementList.add(crusaderKings);

        Achievement crusaderKingsTwo = new Achievement("Crusader Kings 2",31,0,"Together for Victory");
        crusaderKingsTwo.setNationFlag("Other");
        achievementList.add(crusaderKingsTwo);

        Achievement cutTheStrings = new Achievement("Cut The Strings",32,0,"Together for Victory");
        cutTheStrings.setNationFlag("Other");
        */


        return achievementList;
    }
}
