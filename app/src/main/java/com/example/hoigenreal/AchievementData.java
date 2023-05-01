package com.example.hoigenreal;

import java.util.ArrayList;
import java.util.List;

public class AchievementData {
    public static List<Achievement> getAllAchievements(){
        List<Achievement> achievementList = new ArrayList<>();

        Achievement blankAchievement = new Achievement("Any",0,0,"Core");
        blankAchievement.setNationFlag("Any");
        blankAchievement.setDifficulty("Easy");
        achievementList.add(blankAchievement);

        Achievement bearerOfArtillery = new Achievement("Bearer of Artillery", 1, 0,"Core");
        bearerOfArtillery.setNationFlag("Other");
        bearerOfArtillery.setDifficulty("Hard");
        achievementList.add(bearerOfArtillery);

        Achievement bigEntente = new Achievement("Big Entente",2,0,"Core");
        bigEntente.setNationFlag("France");
        bigEntente.setDifficulty("Medium");
        achievementList.add(bigEntente);

        Achievement canadaFirst = new Achievement("Canada First",3,0,"Core");
        canadaFirst.setNationFlag("Other");
        canadaFirst.setDifficulty("Easy");
        achievementList.add(canadaFirst);

        Achievement destroyerOfWorlds = new Achievement("Destroyer of Worlds",4,0,"Core");
        destroyerOfWorlds.setNationFlag("Any");
        destroyerOfWorlds.setDifficulty("Easy");
        achievementList.add(destroyerOfWorlds);

        Achievement duceNukedEm = new Achievement("Duce Nuked'em",5,0,"Core");
        duceNukedEm.setNationFlag("Italy");
        duceNukedEm.setDifficulty("Medium");
        achievementList.add(duceNukedEm);

        Achievement forgeOfVictory = new Achievement("Forge of Victory",6,0,"Core");
        forgeOfVictory.setNationFlag("Other");
        forgeOfVictory.setDifficulty("Easy");
        achievementList.add(forgeOfVictory);

        Achievement friendInNeed = new Achievement("Friend in Need",7,0,"Core");
        friendInNeed.setNationFlag("Any");
        friendInNeed.setDifficulty("Easy");
        achievementList.add(friendInNeed);

        Achievement masterOfWar = new Achievement("Master of War",8,0,"Core");
        masterOfWar.setNationFlag("Any");
        masterOfWar.setDifficulty("Medium");
        achievementList.add(masterOfWar);

        Achievement medPlutonium = new Achievement("Med plutonium",9,0,"Core");
        medPlutonium.setNationFlag("Other");
        medPlutonium.setDifficulty("Medium");
        achievementList.add(medPlutonium);

        Achievement mineIsBigger = new Achievement("Mine is bigger than yours",10,0,"Core");
        mineIsBigger.setNationFlag("Any");
        mineIsBigger.setDifficulty("Easy");
        achievementList.add(mineIsBigger);

        Achievement newWorldOrder = new Achievement("New World Order",11,0,"Core");
        newWorldOrder.setNationFlag("Any");
        newWorldOrder.setDifficulty("Medium");
        achievementList.add(newWorldOrder);

        Achievement noCountryForOldMen = new Achievement("No country for old men",12,0,"Core");
        noCountryForOldMen.setNationFlag("Any");
        noCountryForOldMen.setDifficulty("Easy");
        achievementList.add(noCountryForOldMen);

        Achievement nobodyExpects = new Achievement("Nobody expects...",13,0,"Core");
        nobodyExpects.setNationFlag("Other");
        nobodyExpects.setDifficulty("Hard");
        achievementList.add(nobodyExpects);

        Achievement northernLight = new Achievement("Northern Light",14,0,"Core");
        northernLight.setNationFlag("Other");
        northernLight.setDifficulty("Medium");
        achievementList.add(northernLight);

        Achievement onceMoreMate = new Achievement("Once More Mate",15,0,"Core");
        onceMoreMate.setNationFlag("Other");
        onceMoreMate.setDifficulty("Medium");
        achievementList.add(onceMoreMate);

        Achievement oneEmpire = new Achievement("One Empire",16,0,"Core");
        oneEmpire.setNationFlag("Britain");
        oneEmpire.setDifficulty("Medium");
        achievementList.add(oneEmpire);

        Achievement operationSeaLion = new Achievement("Operation Sea Lion",17,0,"Core");
        operationSeaLion.setNationFlag("Germany");
        operationSeaLion.setDifficulty("Easy");
        achievementList.add(operationSeaLion);

        Achievement partyLikeIts = new Achievement("Party like it's 1520",18,0,"Core");
        partyLikeIts.setNationFlag("Other");
        partyLikeIts.setDifficulty("Medium");
        achievementList.add(partyLikeIts);

        Achievement polandCanIntoSpace = new Achievement("Poland Can Into Space",19,0,"Core");
        polandCanIntoSpace.setNationFlag("Other");
        polandCanIntoSpace.setDifficulty("Easy");
        achievementList.add(polandCanIntoSpace);

        Achievement sunsetInvasion = new Achievement("Sunset Invasion",20,0,"Core");
        sunsetInvasion.setNationFlag("Other");
        sunsetInvasion.setDifficulty("Medium");
        achievementList.add(sunsetInvasion);

        Achievement revengeOfMontezuma = new Achievement("The Revenge of Montezuma",21,0,"Core");
        revengeOfMontezuma.setNationFlag("Other");
        revengeOfMontezuma.setDifficulty("Medium");
        achievementList.add(revengeOfMontezuma);

        Achievement revolutionTriumphant = new Achievement("The Revolution Triumphant",22,0,"Core");
        revolutionTriumphant.setNationFlag("Soviet");
        revolutionTriumphant.setDifficulty("Easy");
        achievementList.add(revolutionTriumphant);

        Achievement timeOnOurSide = new Achievement("Time is on our side",23,0,"Core");
        timeOnOurSide.setNationFlag("Any");
        timeOnOurSide.setDifficulty("Easy");
        achievementList.add(timeOnOurSide);

        Achievement transportTycoon = new Achievement("Transport Tycoon",24,0,"Core");
        transportTycoon.setNationFlag("Any");
        transportTycoon.setDifficulty("Easy");
        achievementList.add(transportTycoon);

        Achievement trueBlitzkrieg = new Achievement("True Blitzkrieg",25,0,"Core");
        trueBlitzkrieg.setNationFlag("Germany");
        trueBlitzkrieg.setDifficulty("Easy");
        achievementList.add(trueBlitzkrieg);

        Achievement unitedNetherlands = new Achievement("United Netherlands",26,0,"Core");
        unitedNetherlands.setNationFlag("Other");
        unitedNetherlands.setDifficulty("Easy");
        achievementList.add(unitedNetherlands);

        Achievement viveLaFrance = new Achievement("Vive la France",27,0,"Core");
        viveLaFrance.setNationFlag("France");
        viveLaFrance.setDifficulty("Easy");
        achievementList.add(viveLaFrance);

        Achievement builtItInADay = new Achievement("We'll Build it in a Day",28,0,"Core");
        builtItInADay.setNationFlag("Any");
        builtItInADay.setDifficulty("Easy");
        achievementList.add(builtItInADay);

        Achievement wunderwaffen = new Achievement("Wunderwaffen",29,0,"Core");
        wunderwaffen.setNationFlag("Any");
        wunderwaffen.setDifficulty("Easy");
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
