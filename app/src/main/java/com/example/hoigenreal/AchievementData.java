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
        blankAchievement.addListOfInstructions(reusableList);
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
        bearerOfArtillery.addListOfInstructions(reusableList);
        bearerOfArtillery.setSpecificOtherNation(new Nation("Poland", R.mipmap.ic_flag_poland_round,7));
        achievementList.add(bearerOfArtillery);
        reusableList.clear();

        Achievement bigEntente = new Achievement("Big Entente",2,R.mipmap.ic_achievement_entente,"Core");
        bigEntente.setNationFlag("France");
        bigEntente.setDifficulty("Medium");
        reusableList.add("Has completed focus Strengthen the Little Entente");
        reusableList.add("Be faction leader");
        reusableList.add("Every German state controlled by you or your allies");
        bigEntente.addListOfInstructions(reusableList);
        achievementList.add(bigEntente);
        reusableList.clear();

        Achievement canadaFirst = new Achievement("Canada First",3,R.mipmap.ic_achievement_canada,"Core");
        canadaFirst.setNationFlag("Other");
        canadaFirst.setDifficulty("Easy");
        reusableList.add("In faction with Germany");
        canadaFirst.setSpecificOtherNation(new Nation("Canada", R.mipmap.ic_flag_canada_round,8));
        canadaFirst.addListOfInstructions(reusableList);
        achievementList.add(canadaFirst);
        reusableList.clear();

        Achievement destroyerOfWorlds = new Achievement("Destroyer of Worlds",4,R.mipmap.ic_achievement_destroyer,"Core");
        destroyerOfWorlds.setNationFlag("Any");
        destroyerOfWorlds.setDifficulty("Easy");
        reusableList.add("Use a nuke");
        destroyerOfWorlds.addListOfInstructions(reusableList);
        achievementList.add(destroyerOfWorlds);
        reusableList.clear();

        Achievement duceNukedEm = new Achievement("Duce Nuked'em",5,R.mipmap.ic_achievement_duce,"Core");
        duceNukedEm.setNationFlag("Italy");
        duceNukedEm.setDifficulty("Medium");
        reusableList.add("Nuke Los Angeles");
        reusableList.add("Fascist");
        duceNukedEm.addListOfInstructions(reusableList);
        achievementList.add(duceNukedEm);

        Achievement forgeOfVictory = new Achievement("Forge of Victory",6,R.mipmap.ic_achievement_forge,"Core");
        forgeOfVictory.setNationFlag("Other");
        forgeOfVictory.setDifficulty("Easy");
        reusableList.add("Have 50 factories");
        forgeOfVictory.setSpecificOtherNation(new Nation("Belgium", R.mipmap.ic_flag_belgium_round,9));
        forgeOfVictory.addListOfInstructions(reusableList);
        achievementList.add(forgeOfVictory);
        reusableList.clear();

        Achievement friendInNeed = new Achievement("Friend in Need",7,R.mipmap.ic_achievement_friend,"Core");
        friendInNeed.setNationFlag("Any");
        friendInNeed.setDifficulty("Easy");
        reusableList.add("Join a faction");
        friendInNeed.addListOfInstructions(reusableList);
        achievementList.add(friendInNeed);
        reusableList.clear();

        Achievement masterOfWar = new Achievement("Master of War",8,R.mipmap.ic_achievement_master,"Core");
        masterOfWar.setNationFlag("Any");
        masterOfWar.setDifficulty("Medium");
        reusableList.add("Fully research either a land, naval, or air doctrine tree");
        masterOfWar.addListOfInstructions(reusableList);
        achievementList.add(masterOfWar);
        reusableList.clear();

        Achievement medPlutonium = new Achievement("Med plutonium",9,R.mipmap.ic_achievement_med,"Core");
        medPlutonium.setNationFlag("Other");
        medPlutonium.setDifficulty("Medium");
        reusableList.add("Nuke Denmark");
        medPlutonium.setSpecificOtherNation(new Nation("Sweden", R.mipmap.ic_flag_sweden_round,10));
        medPlutonium.addListOfInstructions(reusableList);
        achievementList.add(medPlutonium);
        reusableList.clear();

        Achievement mineIsBigger = new Achievement("Mine is bigger than yours",10,R.mipmap.ic_achievement_bigger,"Core");
        mineIsBigger.setNationFlag("Any");
        mineIsBigger.setDifficulty("Easy");
        reusableList.add("Be faction leader");
        reusableList.add("Have 20 members in your faction");
        mineIsBigger.addListOfInstructions(reusableList);
        achievementList.add(mineIsBigger);
        reusableList.clear();

        Achievement newWorldOrder = new Achievement("New World Order",11,R.mipmap.ic_achievement_nwo,"Core");
        newWorldOrder.setNationFlag("Any");
        newWorldOrder.setDifficulty("Medium");
        reusableList.add("All existing nations are fascist");
        newWorldOrder.addListOfInstructions(reusableList);
        achievementList.add(newWorldOrder);
        reusableList.clear();

        Achievement noCountryForOldMen = new Achievement("No country for old men",12,R.mipmap.ic_achievement_oldmen,"Core");
        noCountryForOldMen.setNationFlag("Any");
        noCountryForOldMen.setDifficulty("Easy");
        reusableList.add("Scraping the Barrel as Conscription law");
        reusableList.add("Reach 0 manpower");
        noCountryForOldMen.addListOfInstructions(reusableList);
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
        nobodyExpects.addListOfInstructions(reusableList);
        achievementList.add(nobodyExpects);
        reusableList.clear();

        Achievement northernLight = new Achievement("Northern Light",14,R.mipmap.ic_achievement_northernlight,"Core");
        northernLight.setNationFlag("Other");
        northernLight.setDifficulty("Medium");
        reusableList.add("Be faction leader");
        reusableList.add("Have Sweden, Norway, Denmark, and Finland as faction members");
        northernLight.setSpecificOtherNation(new Nation("Sweden", R.mipmap.ic_flag_sweden_round,9));
        northernLight.addListOfInstructions(reusableList);
        achievementList.add(northernLight);
        reusableList.clear();

        Achievement onceMoreMate = new Achievement("Once More Mate",15,R.mipmap.ic_achievement_oncemore,"Core");
        onceMoreMate.setNationFlag("Other");
        onceMoreMate.setDifficulty("Medium");
        reusableList.add("Occupy Edirne");
        onceMoreMate.setSpecificOtherNation(new Nation("Australia", R.mipmap.ic_flag_australia_round,12));
        onceMoreMate.addListOfInstructions(reusableList);
        achievementList.add(onceMoreMate);
        reusableList.clear();

        Achievement oneEmpire = new Achievement("One Empire",16,R.mipmap.ic_achievement_oneempire,"Core");
        oneEmpire.setNationFlag("Britain");
        oneEmpire.setDifficulty("Medium");
        reusableList.add("Every state in the world is either annexed, puppeted, or allied with you");
        oneEmpire.addListOfInstructions(reusableList);
        achievementList.add(oneEmpire);
        reusableList.clear();

        Achievement operationSeaLion = new Achievement("Operation Sea Lion",17,R.mipmap.ic_achievement_sealion,"Core");
        operationSeaLion.setNationFlag("Germany");
        operationSeaLion.setDifficulty("Easy");
        reusableList.add("Control British mainland");
        operationSeaLion.addListOfInstructions(reusableList);
        achievementList.add(operationSeaLion);
        reusableList.clear();

        Achievement partyLikeIts = new Achievement("Party like it's 1520",18,R.mipmap.ic_achievement_party,"Core");
        partyLikeIts.setNationFlag("Other");
        partyLikeIts.setDifficulty("Medium");
        reusableList.add("Control Svealand");
        reusableList.add("Communist");
        partyLikeIts.setSpecificOtherNation(new Nation("Denmark", R.mipmap.ic_flag_denmark_round,13));
        partyLikeIts.addListOfInstructions(reusableList);
        achievementList.add(partyLikeIts);
        reusableList.clear();

        Achievement polandCanIntoSpace = new Achievement("Poland Can Into Space",19,R.mipmap.ic_achievement_intospace,"Core");
        polandCanIntoSpace.setNationFlag("Other");
        polandCanIntoSpace.setDifficulty("Easy");
        reusableList.add("Have researched Advanced Rocket Engines");
        polandCanIntoSpace.setSpecificOtherNation(new Nation("Poland", R.mipmap.ic_flag_poland_round,7));
        polandCanIntoSpace.addListOfInstructions(reusableList);
        achievementList.add(polandCanIntoSpace);
        reusableList.clear();

        Achievement sunsetInvasion = new Achievement("Sunset Invasion",20,R.mipmap.ic_achievement_sunset,"Core");
        sunsetInvasion.setNationFlag("Other");
        sunsetInvasion.setDifficulty("Medium");
        sunsetInvasion.setSpecificOtherNation(new Nation("Mexico", R.mipmap.ic_flag_mexico_round,14));
        reusableList.add("Control coastal European province");
        sunsetInvasion.addListOfInstructions(reusableList);
        achievementList.add(sunsetInvasion);
        reusableList.clear();

        // whoops i forgot to add the bells toll?

        Achievement revengeOfMontezuma = new Achievement("The Revenge of Montezuma",21,R.mipmap.ic_achievement_montezuma,"Core");
        revengeOfMontezuma.setNationFlag("Other");
        revengeOfMontezuma.setDifficulty("Medium");
        reusableList.add("Control Texas, New Mexico, Arizona, Utah, California, Nevada");
        revengeOfMontezuma.setSpecificOtherNation(new Nation("Mexico", R.mipmap.ic_flag_mexico_round,14));
        revengeOfMontezuma.addListOfInstructions(reusableList);
        achievementList.add(revengeOfMontezuma);
        reusableList.clear();

        Achievement revolutionTriumphant = new Achievement("The Revolution Triumphant",22,R.mipmap.ic_achievement_revolution,"Core");
        revolutionTriumphant.setNationFlag("Soviet");
        revolutionTriumphant.setDifficulty("Easy");
        reusableList.add("Puppet Germany");
        revolutionTriumphant.addListOfInstructions(reusableList);
        achievementList.add(revolutionTriumphant);
        reusableList.clear();

        Achievement timeOnOurSide = new Achievement("Time is on our side",23,R.mipmap.ic_achievement_timeonourside,"Core");
        timeOnOurSide.setNationFlag("Any");
        timeOnOurSide.setDifficulty("Easy");
        reusableList.add("Reach 1948");
        timeOnOurSide.addListOfInstructions(reusableList);
        achievementList.add(timeOnOurSide);
        reusableList.clear();

        Achievement transportTycoon = new Achievement("Transport Tycoon",24,R.mipmap.ic_achievement_transport,"Core");
        transportTycoon.setNationFlag("Any");
        transportTycoon.setDifficulty("Easy");
        reusableList.add("Have at least 1000 convoys");
        transportTycoon.addListOfInstructions(reusableList);
        achievementList.add(transportTycoon);
        reusableList.clear();

        Achievement trueBlitzkrieg = new Achievement("True Blitzkrieg",25,R.mipmap.ic_achievement_trueblitz,"Core");
        trueBlitzkrieg.setNationFlag("Germany");
        trueBlitzkrieg.setDifficulty("Easy");
        reusableList.add("Capitulate France and Poland before 1940");
        trueBlitzkrieg.addListOfInstructions(reusableList);
        achievementList.add(trueBlitzkrieg);
        reusableList.clear();

        Achievement unitedNetherlands = new Achievement("United Netherlands",26,R.mipmap.ic_achievement_unitednetherlands,"Core");
        unitedNetherlands.setNationFlag("Other");
        unitedNetherlands.setDifficulty("Easy");
        reusableList.add("Conquer Luxembourg and Belgium");
        unitedNetherlands.setSpecificOtherNation(new Nation("Netherlands", R.mipmap.ic_flag_netherlands_round,7));
        unitedNetherlands.addListOfInstructions(reusableList);
        achievementList.add(unitedNetherlands);
        reusableList.clear();

        Achievement viveLaFrance = new Achievement("Vive la France",27,R.mipmap.ic_achievement_vivalafrance,"Core");
        viveLaFrance.setNationFlag("France");
        viveLaFrance.setDifficulty("Easy");
        reusableList.add("Reach 1948 without capitulating or surrendering");
        viveLaFrance.addListOfInstructions(reusableList);
        achievementList.add(viveLaFrance);
        reusableList.clear();

        Achievement builtItInADay = new Achievement("We'll Build it in a Day",28,R.mipmap.ic_achievement_buildit,"Core");
        builtItInADay.setNationFlag("Any");
        builtItInADay.setDifficulty("Easy");
        reusableList.add("Research Construction V");
        builtItInADay.addListOfInstructions(reusableList);
        achievementList.add(builtItInADay);
        reusableList.clear();

        Achievement wunderwaffen = new Achievement("Wunderwaffen",29,R.mipmap.ic_achievement_wunderwaffen,"Core");
        wunderwaffen.setNationFlag("Any");
        wunderwaffen.setDifficulty("Easy");
        reusableList.add("Have researched Advanced Rocket Engines, Jet Engines, and Nuclear Bombs");
        wunderwaffen.addListOfInstructions(reusableList);
        achievementList.add(wunderwaffen);
        reusableList.clear();

        //Together For Victory -- everything past core achievements are not getting in. way too many -- to any reader, you will need to venmo me $500 to change this
        Achievement brainsCanada = new Achievement("Braaaaains!",30,R.mipmap.ic_achievement_bigger,"TFV");
        brainsCanada.setNationFlag("Other");
        brainsCanada.setSpecificOtherNation(new Nation("Canada", R.mipmap.ic_flag_netherlands_round,10000));
        brainsCanada.setDifficulty("Easy");
        reusableList.add("Complete focus 'Send in the Zombies'");
        brainsCanada.addListOfInstructions(reusableList);
        achievementList.add(brainsCanada);
        reusableList.clear();

        Achievement CrusaderSouth = new Achievement("Crusader Kings",31,R.mipmap.ic_achievement_bigger,"TFV");
        CrusaderSouth.setNationFlag("Other");
        CrusaderSouth.setSpecificOtherNation(new Nation("South Africa", R.mipmap.ic_flag_netherlands_round,10000));
        CrusaderSouth.setDifficulty("Medium");
        reusableList.add("Have Edward VIII national spirit");
        reusableList.add("Control the state Jerusalem");
        CrusaderSouth.addListOfInstructions(reusableList);
        achievementList.add(CrusaderSouth);
        reusableList.clear();

        Achievement CrusaderKingsTwoSouth = new Achievement("Crusader Kings 2",32,R.mipmap.ic_achievement_bigger,"TFV");
        CrusaderKingsTwoSouth.setNationFlag("Other");
        CrusaderKingsTwoSouth.setSpecificOtherNation(new Nation("South Africa", R.mipmap.ic_flag_netherlands_round,10000));
        CrusaderKingsTwoSouth.setDifficulty("Medium");
        reusableList.add("Complete focus 'Anti-Colonialist Crusade'");
        reusableList.add("Be faction leader");
        reusableList.add("Faction member controls the state Greater London Area");
        CrusaderKingsTwoSouth.addListOfInstructions(reusableList);
        achievementList.add(CrusaderKingsTwoSouth);
        reusableList.clear();

        Achievement CutSouth = new Achievement("Cut The Strings",33,R.mipmap.ic_achievement_bigger,"TFV");
        CutSouth.setNationFlag("Other");
        CutSouth.setSpecificOtherNation(new Nation("South Africa", R.mipmap.ic_flag_netherlands_round,10000));
        CutSouth.setDifficulty("Easy");
        reusableList.add("Not a puppet");
        CutSouth.addListOfInstructions(reusableList);
        achievementList.add(CutSouth);
        reusableList.clear();

        Achievement DistrictSouth = new Achievement("District 9",34,R.mipmap.ic_achievement_bigger,"TFV");
        DistrictSouth.setNationFlag("Other");
        DistrictSouth.setSpecificOtherNation(new Nation("South Africa", R.mipmap.ic_flag_netherlands_round,10000));
        DistrictSouth.setDifficulty("Easy");
        reusableList.add("Have more than 8 civilian factories in the state of Transvaal");
        DistrictSouth.addListOfInstructions(reusableList);
        achievementList.add(DistrictSouth);
        reusableList.clear();

        Achievement FreegyptEgypt = new Achievement("Freegypt",35,R.mipmap.ic_achievement_bigger,"TFV");
        FreegyptEgypt.setNationFlag("Other");
        FreegyptEgypt.setSpecificOtherNation(new Nation("Egypt", R.mipmap.ic_flag_netherlands_round,10000));
        FreegyptEgypt.setDifficulty("Easy");
        reusableList.add("Become a free nation using the autonomy system");
        FreegyptEgypt.addListOfInstructions(reusableList);
        achievementList.add(FreegyptEgypt);
        reusableList.clear();

        Achievement ISouth = new Achievement("I Am the Tong Master",36,R.mipmap.ic_achievement_bigger,"TFV");
        ISouth.setNationFlag("Other");
        ISouth.setSpecificOtherNation(new Nation("South Africa", R.mipmap.ic_flag_netherlands_round,10000));
        ISouth.setDifficulty("Medium");
        reusableList.add("Break free");
        reusableList.add("Have at least 1 subject");
        ISouth.addListOfInstructions(reusableList);
        achievementList.add(ISouth);
        reusableList.clear();

        Achievement ItsCanada = new Achievement("It's 1812 All Over Again",37,R.mipmap.ic_achievement_bigger,"TFV");
        ItsCanada.setNationFlag("Other");
        ItsCanada.setSpecificOtherNation(new Nation("Canada", R.mipmap.ic_flag_netherlands_round,10000));
        ItsCanada.setDifficulty("Easy");
        reusableList.add("Control the state of Maryland");
        ItsCanada.addListOfInstructions(reusableList);
        achievementList.add(ItsCanada);
        reusableList.clear();

        Achievement OurBritish = new Achievement("Our Words are Backed with Nuclear Weapons",38,R.mipmap.ic_achievement_bigger,"TFV");
        OurBritish.setNationFlag("Other");
        OurBritish.setSpecificOtherNation(new Nation("British Raj", R.mipmap.ic_flag_netherlands_round,10000));
        OurBritish.setDifficulty("Easy");
        reusableList.add("Have Quit India Movement national spirit");
        reusableList.add("Use a nuke");
        OurBritish.addListOfInstructions(reusableList);
        achievementList.add(OurBritish);
        reusableList.clear();

        Achievement TheBRI = new Achievement("The Empire Strikes Back",39,R.mipmap.ic_achievement_bigger,"TFV");
        TheBRI.setNationFlag("Britain");
        TheBRI.setDifficulty("Easy");
        reusableList.add("Be at with with one of your former puppets");
        TheBRI.addListOfInstructions(reusableList);
        achievementList.add(TheBRI);
        reusableList.clear();

        Achievement TheAny = new Achievement("The Puppetmaster",40,R.mipmap.ic_achievement_bigger,"TFV");
        TheAny.setNationFlag("Any");
        TheAny.setDifficulty("Medium");
        reusableList.add("Have more than 50 subjects");
        TheAny.addListOfInstructions(reusableList);
        achievementList.add(TheAny);
        reusableList.clear();

        Achievement TheAustralia = new Achievement("The weapons of the Third Emu War",41,R.mipmap.ic_achievement_bigger,"TFV");
        TheAustralia.setNationFlag("Other");
        TheAustralia.setSpecificOtherNation(new Nation("Australia", R.mipmap.ic_flag_netherlands_round,10000));
        TheAustralia.setDifficulty("Medium");
        reusableList.add("Nuke core Australian territory");
        TheAustralia.addListOfInstructions(reusableList);
        achievementList.add(TheAustralia);
        reusableList.clear();


        Achievement BetterHungary = new Achievement("Better than the Szent Istvan",43,R.mipmap.ic_achievement_bigger,"DOD");
        BetterHungary.setNationFlag("Other");
        BetterHungary.setSpecificOtherNation(new Nation("Hungary", R.mipmap.ic_flag_netherlands_round,10000));
        BetterHungary.setDifficulty("Medium");
        reusableList.add("Have Miklos Horthy as naval commander");
        reusableList.add("Have at least 1 battleship");
        BetterHungary.addListOfInstructions(reusableList);
        achievementList.add(BetterHungary);
        reusableList.clear();

        Achievement CzechmateCzechoslovakia = new Achievement("Czechmate",43,R.mipmap.ic_achievement_bigger,"DOD");
        CzechmateCzechoslovakia.setNationFlag("Other");
        CzechmateCzechoslovakia.setSpecificOtherNation(new Nation("Czechoslovakia", R.mipmap.ic_flag_netherlands_round,10000));
        CzechmateCzechoslovakia.setDifficulty("Medium");
        reusableList.add("At war with United Kingdom");
        reusableList.add("United Kingdom is democratic");
        reusableList.add("Control the state New South Wales");
        CzechmateCzechoslovakia.addListOfInstructions(reusableList);
        achievementList.add(CzechmateCzechoslovakia);
        reusableList.clear();

        Achievement DeathRomania = new Achievement("Death or Dishonor or Cake",44,R.mipmap.ic_achievement_bigger,"DOD");
        DeathRomania.setNationFlag("Other");
        DeathRomania.setSpecificOtherNation(new Nation("Romania", R.mipmap.ic_flag_netherlands_round,10000));
        DeathRomania.setDifficulty("Medium");
        reusableList.add("Have Carol II as nation leader");
        reusableList.add("Do not complete focuses: 'All Parties Must End', 'Force Abdication', 'Handle the King'");
        reusableList.add("Own at least one core province from each starting neighbor");
        DeathRomania.addListOfInstructions(reusableList);
        achievementList.add(DeathRomania);
        reusableList.clear();

        Achievement EnSweden = new Achievement("En Svensk Tiger",45,R.mipmap.ic_achievement_bigger,"DOD");
        EnSweden.setNationFlag("Other");
        EnSweden.setSpecificOtherNation(new Nation("Sweden", R.mipmap.ic_flag_netherlands_round,10000));
        EnSweden.setDifficulty("Easy");
        reusableList.add("License from Germany either: Heavy Tank II, Heavy Tank III, Improved Heavy Tank Chassis, Advanced Heavy Tank Chassis");
        EnSweden.addListOfInstructions(reusableList);
        achievementList.add(EnSweden);
        reusableList.clear();

        Achievement HugeoslaviaYugoslavia = new Achievement("Huge-oslavia",46,R.mipmap.ic_achievement_bigger,"DOD");
        HugeoslaviaYugoslavia.setNationFlag("Other");
        HugeoslaviaYugoslavia.setSpecificOtherNation(new Nation("Yugoslavia", R.mipmap.ic_flag_netherlands_round,10000));
        HugeoslaviaYugoslavia.setDifficulty("Medium");
        reusableList.add("Own all cores of: Albania, Austria, Bulgaria, Hungary, Italy, Romania, Greece");
        HugeoslaviaYugoslavia.addListOfInstructions(reusableList);
        achievementList.add(HugeoslaviaYugoslavia);
        reusableList.clear();

        Achievement LethalAny = new Achievement("Lethal Straight",47,R.mipmap.ic_achievement_bigger,"DOD");
        LethalAny.setNationFlag("Any");
        LethalAny.setDifficulty("Easy");
        reusableList.add("Have a production license from 5 of the 7 major powers");
        LethalAny.addListOfInstructions(reusableList);
        achievementList.add(LethalAny);
        reusableList.clear();

        Achievement MiklosHungary = new Achievement("Miklos Horthy and the Habsburg Prince",48,R.mipmap.ic_achievement_bigger,"DOD");
        MiklosHungary.setNationFlag("Other");
        MiklosHungary.setSpecificOtherNation(new Nation("Hungary", R.mipmap.ic_flag_netherlands_round,10000));
        MiklosHungary.setDifficulty("Medium");
        reusableList.add("Restore Austria Hungary as Hungary");
        MiklosHungary.addListOfInstructions(reusableList);
        achievementList.add(MiklosHungary);
        reusableList.clear();

        Achievement NeitherRomania = new Achievement("Neither Death nor Dishonor",49,R.mipmap.ic_achievement_bigger,"DOD");
        NeitherRomania.setNationFlag("Other");
        NeitherRomania.setSpecificOtherNation(new Nation("Romania", R.mipmap.ic_flag_netherlands_round,10000));
        NeitherRomania.setDifficulty("Medium");
        reusableList.add("Date is at least February 1942");
        reusableList.add("Never lose a starting state");
        reusableList.add("Control either Brandenburg or Moscow");
        NeitherRomania.addListOfInstructions(reusableList);
        achievementList.add(NeitherRomania);
        reusableList.clear();

        Achievement TheYugoslavia = new Achievement("The Balkan Powder Keg",50,R.mipmap.ic_achievement_bigger,"DOD");
        TheYugoslavia.setNationFlag("Other");
        TheYugoslavia.setSpecificOtherNation(new Nation("Yugoslavia", R.mipmap.ic_flag_netherlands_round,10000));
        TheYugoslavia.setDifficulty("Easy");
        reusableList.add("Declare war on Axis or Allies while part of either Axis or Allies");
        TheYugoslavia.addListOfInstructions(reusableList);
        achievementList.add(TheYugoslavia);
        reusableList.clear();

        Achievement TheCzechoslovakia = new Achievement("The Munich Disagreement",51,R.mipmap.ic_achievement_bigger,"DOD");
        TheCzechoslovakia.setNationFlag("Other");
        TheCzechoslovakia.setSpecificOtherNation(new Nation("Czechoslovakia", R.mipmap.ic_flag_netherlands_round,10000));
        TheCzechoslovakia.setDifficulty("Medium");
        reusableList.add("At war with Germany");
        reusableList.add("Control the state Oberbayern");
        TheCzechoslovakia.addListOfInstructions(reusableList);
        achievementList.add(TheCzechoslovakia);
        reusableList.clear();

        // Move forward to waking the tiger
        // theres a fuckton more to go, so maybe ill just update the app later once its on gp





        return achievementList;
    }
}
