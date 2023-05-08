package com.example.hoigenreal;

import java.util.ArrayList;
import java.util.List;

public class AchievementData {
    public static List<Achievement> getAllAchievements(){
        List<Achievement> achievementList = new ArrayList<>();

        Achievement blankAchievement = new Achievement("Any",0,R.mipmap.ic_hoi_default_icon,"Core");
        blankAchievement.setNationFlag("Any");
        blankAchievement.setDifficulty("Easy");
        achievementList.add(blankAchievement);

        Achievement bearerOfArtillery = new Achievement("Bearer of Artillery", 1, R.mipmap.ic_achievement_bearer,"Core");
        bearerOfArtillery.setNationFlag("Other");
        bearerOfArtillery.setDifficulty("Hard");
        bearerOfArtillery.setSpecificOtherNation(new Nation("Poland", R.mipmap.ic_flag_poland_round,7));
        achievementList.add(bearerOfArtillery);

        Achievement bigEntente = new Achievement("Big Entente",2,R.mipmap.ic_achievement_entente,"Core");
        bigEntente.setNationFlag("France");
        bigEntente.setDifficulty("Medium");
        achievementList.add(bigEntente);

        Achievement canadaFirst = new Achievement("Canada First",3,R.mipmap.ic_achievement_canada,"Core");
        canadaFirst.setNationFlag("Other");
        canadaFirst.setDifficulty("Easy");
        canadaFirst.setSpecificOtherNation(new Nation("Canada", R.mipmap.ic_flag_canada_round,8));
        achievementList.add(canadaFirst);

        Achievement destroyerOfWorlds = new Achievement("Destroyer of Worlds",4,R.mipmap.ic_achievement_destroyer,"Core");
        destroyerOfWorlds.setNationFlag("Any");
        destroyerOfWorlds.setDifficulty("Easy");
        achievementList.add(destroyerOfWorlds);

        Achievement duceNukedEm = new Achievement("Duce Nuked'em",5,R.mipmap.ic_achievement_duce,"Core");
        duceNukedEm.setNationFlag("Italy");
        duceNukedEm.setDifficulty("Medium");
        achievementList.add(duceNukedEm);

        Achievement forgeOfVictory = new Achievement("Forge of Victory",6,R.mipmap.ic_achievement_forge,"Core");
        forgeOfVictory.setNationFlag("Other");
        forgeOfVictory.setDifficulty("Easy");
        forgeOfVictory.setSpecificOtherNation(new Nation("Belgium", R.mipmap.ic_flag_belgium_round,9));
        achievementList.add(forgeOfVictory);

        Achievement friendInNeed = new Achievement("Friend in Need",7,R.mipmap.ic_achievement_friend,"Core");
        friendInNeed.setNationFlag("Any");
        friendInNeed.setDifficulty("Easy");
        achievementList.add(friendInNeed);

        Achievement masterOfWar = new Achievement("Master of War",8,R.mipmap.ic_achievement_master,"Core");
        masterOfWar.setNationFlag("Any");
        masterOfWar.setDifficulty("Medium");
        achievementList.add(masterOfWar);

        Achievement medPlutonium = new Achievement("Med plutonium",9,R.mipmap.ic_achievement_med,"Core");
        medPlutonium.setNationFlag("Other");
        medPlutonium.setDifficulty("Medium");
        medPlutonium.setSpecificOtherNation(new Nation("Sweden", R.mipmap.ic_flag_sweden_round,10));
        achievementList.add(medPlutonium);

        Achievement mineIsBigger = new Achievement("Mine is bigger than yours",10,R.mipmap.ic_achievement_bigger,"Core");
        mineIsBigger.setNationFlag("Any");
        mineIsBigger.setDifficulty("Easy");
        achievementList.add(mineIsBigger);

        Achievement newWorldOrder = new Achievement("New World Order",11,R.mipmap.ic_achievement_nwo,"Core");
        newWorldOrder.setNationFlag("Any");
        newWorldOrder.setDifficulty("Medium");
        achievementList.add(newWorldOrder);

        Achievement noCountryForOldMen = new Achievement("No country for old men",12,R.mipmap.ic_achievement_oldmen,"Core");
        noCountryForOldMen.setNationFlag("Any");
        noCountryForOldMen.setDifficulty("Easy");
        achievementList.add(noCountryForOldMen);

        Achievement nobodyExpects = new Achievement("Nobody expects...",13,R.mipmap.ic_achievement_nobody,"Core");
        nobodyExpects.setNationFlag("Other");
        nobodyExpects.setDifficulty("Hard");
        nobodyExpects.setSpecificOtherNation(new Nation("Spain", R.mipmap.ic_flag_nationalist_spain_round,11));
        achievementList.add(nobodyExpects);

        Achievement northernLight = new Achievement("Northern Light",14,R.mipmap.ic_achievement_northernlight,"Core");
        northernLight.setNationFlag("Other");
        northernLight.setDifficulty("Medium");
        northernLight.setSpecificOtherNation(new Nation("Sweden", R.mipmap.ic_flag_sweden_round,9));
        achievementList.add(northernLight);

        Achievement onceMoreMate = new Achievement("Once More Mate",15,R.mipmap.ic_achievement_oncemore,"Core");
        onceMoreMate.setNationFlag("Other");
        onceMoreMate.setDifficulty("Medium");
        onceMoreMate.setSpecificOtherNation(new Nation("Australia", R.mipmap.ic_flag_australia_round,12));
        achievementList.add(onceMoreMate);

        Achievement oneEmpire = new Achievement("One Empire",16,R.mipmap.ic_achievement_oneempire,"Core");
        oneEmpire.setNationFlag("Britain");
        oneEmpire.setDifficulty("Medium");
        achievementList.add(oneEmpire);

        Achievement operationSeaLion = new Achievement("Operation Sea Lion",17,R.mipmap.ic_achievement_sealion,"Core");
        operationSeaLion.setNationFlag("Germany");
        operationSeaLion.setDifficulty("Easy");
        achievementList.add(operationSeaLion);

        Achievement partyLikeIts = new Achievement("Party like it's 1520",18,R.mipmap.ic_achievement_party,"Core");
        partyLikeIts.setNationFlag("Other");
        partyLikeIts.setDifficulty("Medium");
        partyLikeIts.setSpecificOtherNation(new Nation("Denmark", R.mipmap.ic_flag_denmark_round,13));
        achievementList.add(partyLikeIts);

        Achievement polandCanIntoSpace = new Achievement("Poland Can Into Space",19,R.mipmap.ic_achievement_intospace,"Core");
        polandCanIntoSpace.setNationFlag("Other");
        polandCanIntoSpace.setDifficulty("Easy");
        polandCanIntoSpace.setSpecificOtherNation(new Nation("Poland", R.mipmap.ic_flag_poland_round,7));
        achievementList.add(polandCanIntoSpace);

        Achievement sunsetInvasion = new Achievement("Sunset Invasion",20,R.mipmap.ic_achievement_sunset,"Core");
        sunsetInvasion.setNationFlag("Japan");
        sunsetInvasion.setDifficulty("Medium");
        achievementList.add(sunsetInvasion);

        Achievement revengeOfMontezuma = new Achievement("The Revenge of Montezuma",21,R.mipmap.ic_achievement_montezuma,"Core");
        revengeOfMontezuma.setNationFlag("Other");
        revengeOfMontezuma.setDifficulty("Medium");
        revengeOfMontezuma.setSpecificOtherNation(new Nation("Mexico", R.mipmap.ic_flag_mexico_round,14));
        achievementList.add(revengeOfMontezuma);

        Achievement revolutionTriumphant = new Achievement("The Revolution Triumphant",22,R.mipmap.ic_achievement_revolution,"Core");
        revolutionTriumphant.setNationFlag("Soviet");
        revolutionTriumphant.setDifficulty("Easy");
        achievementList.add(revolutionTriumphant);

        Achievement timeOnOurSide = new Achievement("Time is on our side",23,R.mipmap.ic_achievement_timeonourside,"Core");
        timeOnOurSide.setNationFlag("Any");
        timeOnOurSide.setDifficulty("Easy");
        achievementList.add(timeOnOurSide);

        Achievement transportTycoon = new Achievement("Transport Tycoon",24,R.mipmap.ic_achievement_transport,"Core");
        transportTycoon.setNationFlag("Any");
        transportTycoon.setDifficulty("Easy");
        achievementList.add(transportTycoon);

        Achievement trueBlitzkrieg = new Achievement("True Blitzkrieg",25,R.mipmap.ic_achievement_trueblitz,"Core");
        trueBlitzkrieg.setNationFlag("Germany");
        trueBlitzkrieg.setDifficulty("Easy");
        achievementList.add(trueBlitzkrieg);

        Achievement unitedNetherlands = new Achievement("United Netherlands",26,R.mipmap.ic_achievement_unitednetherlands,"Core");
        unitedNetherlands.setNationFlag("Other");
        unitedNetherlands.setDifficulty("Easy");
        unitedNetherlands.setSpecificOtherNation(new Nation("Netherlands", R.mipmap.ic_flag_netherlands_round,7));
        achievementList.add(unitedNetherlands);

        Achievement viveLaFrance = new Achievement("Vive la France",27,R.mipmap.ic_achievement_vivalafrance,"Core");
        viveLaFrance.setNationFlag("France");
        viveLaFrance.setDifficulty("Easy");
        achievementList.add(viveLaFrance);

        Achievement builtItInADay = new Achievement("We'll Build it in a Day",28,R.mipmap.ic_achievement_buildit,"Core");
        builtItInADay.setNationFlag("Any");
        builtItInADay.setDifficulty("Easy");
        achievementList.add(builtItInADay);

        Achievement wunderwaffen = new Achievement("Wunderwaffen",29,R.mipmap.ic_achievement_wunderwaffen,"Core");
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
