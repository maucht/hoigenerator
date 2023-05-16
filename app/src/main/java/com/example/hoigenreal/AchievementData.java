package com.example.hoigenreal;

import java.util.ArrayList;
import java.util.List;

public class AchievementData {
    public static List<Achievement> getAllAchievements(){
        List<Achievement> achievementList = new ArrayList<>();
        List<String> reusableList = new ArrayList<>();

        Achievement blankAchievement = new Achievement("Any",0,R.mipmap.ic_hoi_default_icon,"Core");
        blankAchievement.setNationFlag("Any");
        blankAchievement.setDifficulty("Easy");
        reusableList.add("Any");
        blankAchievement.setInstructions(reusableList);
        achievementList.add(blankAchievement);
        reusableList.clear();

        Achievement bearerOfArtillery = new Achievement("Bearer of Artillery", 1, R.mipmap.ic_achievement_bearer,"Core");
        bearerOfArtillery.setNationFlag("Other");
        bearerOfArtillery.setDifficulty("Hard");
        reusableList.add("Non-aligned");
        reusableList.add("Not in faction with Soviet Union");
        reusableList.add("At war with Italy");
        reusableList.add("Controls a central Italian state and Hamadan");
        reusableList.add("Completed Focus Artillery Modernization");
        bearerOfArtillery.setInstructions(reusableList);
        bearerOfArtillery.setSpecificOtherNation(new Nation("Poland", R.mipmap.ic_flag_poland_round,7));
        achievementList.add(bearerOfArtillery);
        reusableList.clear();

        Achievement bigEntente = new Achievement("Big Entente",2,R.mipmap.ic_achievement_entente,"Core");
        bigEntente.setNationFlag("France");
        bigEntente.setDifficulty("Medium");
        reusableList.add("Has completed focus Strengthen the Little Entente");
        reusableList.add("Be faction leader");
        reusableList.add("Every German state controlled by you or your allies");
        bigEntente.setInstructions(reusableList);
        achievementList.add(bigEntente);
        reusableList.clear();

        Achievement canadaFirst = new Achievement("Canada First",3,R.mipmap.ic_achievement_canada,"Core");
        canadaFirst.setNationFlag("Other");
        canadaFirst.setDifficulty("Easy");
        reusableList.add("In faction with Germany");
        canadaFirst.setSpecificOtherNation(new Nation("Canada", R.mipmap.ic_flag_canada_round,8));
        canadaFirst.setInstructions(reusableList);
        achievementList.add(canadaFirst);
        reusableList.clear();

        Achievement destroyerOfWorlds = new Achievement("Destroyer of Worlds",4,R.mipmap.ic_achievement_destroyer,"Core");
        destroyerOfWorlds.setNationFlag("Any");
        destroyerOfWorlds.setDifficulty("Easy");
        reusableList.add("Use a nuke");
        destroyerOfWorlds.setInstructions(reusableList);
        achievementList.add(destroyerOfWorlds);
        reusableList.clear();

        Achievement duceNukedEm = new Achievement("Duce Nuked'em",5,R.mipmap.ic_achievement_duce,"Core");
        duceNukedEm.setNationFlag("Italy");
        duceNukedEm.setDifficulty("Medium");
        reusableList.add("Nuke Los Angeles");
        reusableList.add("Fascist");
        duceNukedEm.setInstructions(reusableList);
        achievementList.add(duceNukedEm);

        Achievement forgeOfVictory = new Achievement("Forge of Victory",6,R.mipmap.ic_achievement_forge,"Core");
        forgeOfVictory.setNationFlag("Other");
        forgeOfVictory.setDifficulty("Easy");
        reusableList.add("Have 50 factories");
        forgeOfVictory.setSpecificOtherNation(new Nation("Belgium", R.mipmap.ic_flag_belgium_round,9));
        forgeOfVictory.setInstructions(reusableList);
        achievementList.add(forgeOfVictory);
        reusableList.clear();

        Achievement friendInNeed = new Achievement("Friend in Need",7,R.mipmap.ic_achievement_friend,"Core");
        friendInNeed.setNationFlag("Any");
        friendInNeed.setDifficulty("Easy");
        reusableList.add("Join a faction");
        friendInNeed.setInstructions(reusableList);
        achievementList.add(friendInNeed);
        reusableList.clear();

        Achievement masterOfWar = new Achievement("Master of War",8,R.mipmap.ic_achievement_master,"Core");
        masterOfWar.setNationFlag("Any");
        masterOfWar.setDifficulty("Medium");
        reusableList.add("Fully research either a land, naval, or air doctrine tree");
        masterOfWar.setInstructions(reusableList);
        achievementList.add(masterOfWar);
        reusableList.clear();

        Achievement medPlutonium = new Achievement("Med plutonium",9,R.mipmap.ic_achievement_med,"Core");
        medPlutonium.setNationFlag("Other");
        medPlutonium.setDifficulty("Medium");
        reusableList.add("Nuke Denmark");
        medPlutonium.setSpecificOtherNation(new Nation("Sweden", R.mipmap.ic_flag_sweden_round,10));
        medPlutonium.setInstructions(reusableList);
        achievementList.add(medPlutonium);
        reusableList.clear();

        Achievement mineIsBigger = new Achievement("Mine is bigger than yours",10,R.mipmap.ic_achievement_bigger,"Core");
        mineIsBigger.setNationFlag("Any");
        mineIsBigger.setDifficulty("Easy");
        reusableList.add("Be faction leader");
        reusableList.add("Have 20 members in your faction");
        mineIsBigger.setInstructions(reusableList);
        achievementList.add(mineIsBigger);
        reusableList.clear();

        Achievement newWorldOrder = new Achievement("New World Order",11,R.mipmap.ic_achievement_nwo,"Core");
        newWorldOrder.setNationFlag("Any");
        newWorldOrder.setDifficulty("Medium");
        reusableList.add("All existing nations are fascist");
        newWorldOrder.setInstructions(reusableList);
        achievementList.add(newWorldOrder);
        reusableList.clear();

        Achievement noCountryForOldMen = new Achievement("No country for old men",12,R.mipmap.ic_achievement_oldmen,"Core");
        noCountryForOldMen.setNationFlag("Any");
        noCountryForOldMen.setDifficulty("Easy");
        reusableList.add("Scraping the Barrel as Conscription law");
        reusableList.add("Reach 0 manpower");
        noCountryForOldMen.setInstructions(reusableList);
        achievementList.add(noCountryForOldMen);
        reusableList.clear();

        Achievement nobodyExpects = new Achievement("Nobody expects...",13,R.mipmap.ic_achievement_nobody,"Core");
        nobodyExpects.setNationFlag("Other");
        nobodyExpects.setDifficulty("Hard");
        reusableList.add("Be in faction with Germany");
        reusableList.add("Germany is faction leader");
        reusableList.add("Control Ile de France");
        reusableList.add("Fascist");
        nobodyExpects.setSpecificOtherNation(new Nation("Spain", R.mipmap.ic_flag_nationalist_spain_round,11));
        nobodyExpects.setInstructions(reusableList);
        achievementList.add(nobodyExpects);
        reusableList.clear();

        Achievement northernLight = new Achievement("Northern Light",14,R.mipmap.ic_achievement_northernlight,"Core");
        northernLight.setNationFlag("Other");
        northernLight.setDifficulty("Medium");
        reusableList.add("Be faction leader");
        reusableList.add("Have Sweden, Norway, Denmark, and Finland as faction members");
        northernLight.setSpecificOtherNation(new Nation("Sweden", R.mipmap.ic_flag_sweden_round,9));
        northernLight.setInstructions(reusableList);
        achievementList.add(northernLight);
        reusableList.clear();

        Achievement onceMoreMate = new Achievement("Once More Mate",15,R.mipmap.ic_achievement_oncemore,"Core");
        onceMoreMate.setNationFlag("Other");
        onceMoreMate.setDifficulty("Medium");
        reusableList.add("Occupy Edirne");
        onceMoreMate.setSpecificOtherNation(new Nation("Australia", R.mipmap.ic_flag_australia_round,12));
        onceMoreMate.setInstructions(reusableList);
        achievementList.add(onceMoreMate);
        reusableList.clear();

        Achievement oneEmpire = new Achievement("One Empire",16,R.mipmap.ic_achievement_oneempire,"Core");
        oneEmpire.setNationFlag("Britain");
        oneEmpire.setDifficulty("Medium");
        reusableList.add("Every state in the world is either annexed, puppeted, or allied with you");
        oneEmpire.setInstructions(reusableList);
        achievementList.add(oneEmpire);
        reusableList.clear();

        Achievement operationSeaLion = new Achievement("Operation Sea Lion",17,R.mipmap.ic_achievement_sealion,"Core");
        operationSeaLion.setNationFlag("Germany");
        operationSeaLion.setDifficulty("Easy");
        reusableList.add("Control British mainland");
        operationSeaLion.setInstructions(reusableList);
        achievementList.add(operationSeaLion);
        reusableList.clear();

        Achievement partyLikeIts = new Achievement("Party like it's 1520",18,R.mipmap.ic_achievement_party,"Core");
        partyLikeIts.setNationFlag("Other");
        partyLikeIts.setDifficulty("Medium");
        reusableList.add("Control Svealand");
        reusableList.add("Communist");
        partyLikeIts.setSpecificOtherNation(new Nation("Denmark", R.mipmap.ic_flag_denmark_round,13));
        partyLikeIts.setInstructions(reusableList);
        achievementList.add(partyLikeIts);
        reusableList.clear();

        Achievement polandCanIntoSpace = new Achievement("Poland Can Into Space",19,R.mipmap.ic_achievement_intospace,"Core");
        polandCanIntoSpace.setNationFlag("Other");
        polandCanIntoSpace.setDifficulty("Easy");
        reusableList.add("Have researched Advanced Rocket Engines");
        polandCanIntoSpace.setSpecificOtherNation(new Nation("Poland", R.mipmap.ic_flag_poland_round,7));
        polandCanIntoSpace.setInstructions(reusableList);
        achievementList.add(polandCanIntoSpace);
        reusableList.clear();

        Achievement sunsetInvasion = new Achievement("Sunset Invasion",20,R.mipmap.ic_achievement_sunset,"Core");
        sunsetInvasion.setNationFlag("Other");
        sunsetInvasion.setDifficulty("Medium");
        sunsetInvasion.setSpecificOtherNation(new Nation("Mexico", R.mipmap.ic_flag_mexico_round,14));
        reusableList.add("Control coastal European province");
        sunsetInvasion.setInstructions(reusableList);
        achievementList.add(sunsetInvasion);
        reusableList.clear();

        // whoops i forgot to add the bells toll?

        Achievement revengeOfMontezuma = new Achievement("The Revenge of Montezuma",21,R.mipmap.ic_achievement_montezuma,"Core");
        revengeOfMontezuma.setNationFlag("Other");
        revengeOfMontezuma.setDifficulty("Medium");
        reusableList.add("Control Texas, New Mexico, Arizona, Utah, California, Nevada");
        revengeOfMontezuma.setSpecificOtherNation(new Nation("Mexico", R.mipmap.ic_flag_mexico_round,14));
        revengeOfMontezuma.setInstructions(reusableList);
        achievementList.add(revengeOfMontezuma);
        reusableList.clear();

        Achievement revolutionTriumphant = new Achievement("The Revolution Triumphant",22,R.mipmap.ic_achievement_revolution,"Core");
        revolutionTriumphant.setNationFlag("Soviet");
        revolutionTriumphant.setDifficulty("Easy");
        reusableList.add("Puppet Germany");
        revolutionTriumphant.setInstructions(reusableList);
        achievementList.add(revolutionTriumphant);
        reusableList.clear();

        Achievement timeOnOurSide = new Achievement("Time is on our side",23,R.mipmap.ic_achievement_timeonourside,"Core");
        timeOnOurSide.setNationFlag("Any");
        timeOnOurSide.setDifficulty("Easy");
        reusableList.add("Reach 1948");
        timeOnOurSide.setInstructions(reusableList);
        achievementList.add(timeOnOurSide);
        reusableList.clear();

        Achievement transportTycoon = new Achievement("Transport Tycoon",24,R.mipmap.ic_achievement_transport,"Core");
        transportTycoon.setNationFlag("Any");
        transportTycoon.setDifficulty("Easy");
        reusableList.add("Have at least 1000 convoys");
        transportTycoon.setInstructions(reusableList);
        achievementList.add(transportTycoon);
        reusableList.clear();

        Achievement trueBlitzkrieg = new Achievement("True Blitzkrieg",25,R.mipmap.ic_achievement_trueblitz,"Core");
        trueBlitzkrieg.setNationFlag("Germany");
        trueBlitzkrieg.setDifficulty("Easy");
        reusableList.add("Capitulate France and Poland before 1940");
        trueBlitzkrieg.setInstructions(reusableList);
        achievementList.add(trueBlitzkrieg);
        reusableList.clear();

        Achievement unitedNetherlands = new Achievement("United Netherlands",26,R.mipmap.ic_achievement_unitednetherlands,"Core");
        unitedNetherlands.setNationFlag("Other");
        unitedNetherlands.setDifficulty("Easy");
        reusableList.add("Conquer Luxembourg and Belgium");
        unitedNetherlands.setSpecificOtherNation(new Nation("Netherlands", R.mipmap.ic_flag_netherlands_round,7));
        unitedNetherlands.setInstructions(reusableList);
        achievementList.add(unitedNetherlands);
        reusableList.clear();

        Achievement viveLaFrance = new Achievement("Vive la France",27,R.mipmap.ic_achievement_vivalafrance,"Core");
        viveLaFrance.setNationFlag("France");
        viveLaFrance.setDifficulty("Easy");
        reusableList.add("Reach 1948 without capitulating or surrendering");
        viveLaFrance.setInstructions(reusableList);
        achievementList.add(viveLaFrance);
        reusableList.clear();

        Achievement builtItInADay = new Achievement("We'll Build it in a Day",28,R.mipmap.ic_achievement_buildit,"Core");
        builtItInADay.setNationFlag("Any");
        builtItInADay.setDifficulty("Easy");
        reusableList.add("Research Construction V");
        builtItInADay.setInstructions(reusableList);
        achievementList.add(builtItInADay);
        reusableList.clear();

        Achievement wunderwaffen = new Achievement("Wunderwaffen",29,R.mipmap.ic_achievement_wunderwaffen,"Core");
        wunderwaffen.setNationFlag("Any");
        wunderwaffen.setDifficulty("Easy");
        reusableList.add("Have researched Advanced Rocket Engines, Jet Engines, and Nuclear Bombs");
        wunderwaffen.setInstructions(reusableList);
        achievementList.add(wunderwaffen);
        reusableList.clear();

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
