class TrophyRunner{

    public static void main(String[] args) {

        Trophy trophy1 = new Trophy("Champions Cup", "Gold", 30.5, 5.2,
                "Golden", "Cricket Final", 2023, "Team A",
                "Sports", "ABC Corp", "Cup",
                "Classic", "Best Team 2023", "India",
                15000, true, "TrophyWorks", 10,
                "TR001", "SportsSupply");

        Trophy trophy2 = new Trophy("Star Award", "Silver", 25.0, 3.8,
                "Silver", "Music Awards", 2022, "Singer X",
                "Entertainment", "MusicWorld", "Star",
                "Modern", "Best Singer", "USA",
                10000, false, "AwardMakers", 5,
                "TR002", "EventSupply");

        Trophy trophy3 = new Trophy("Excellence Shield", "Bronze", 20.0, 4.1,
                "Brown", "School Competition", 2024, "Rahul",
                "Education", "EduTrust", "Shield",
                "Simple", "Top Student", "India",
                5000, true, "EduCraft", 15,
                "TR003", "SchoolMart");

        Trophy trophy4 = new Trophy("Victory Cup", "Gold", 35.0, 6.0,
                "Golden", "Football League", 2023, "Team B",
                "Sports", "SportsOrg", "Cup",
                "Premium", "League Winner", "UK",
                20000, false, "EliteAwards", 7,
                "TR004", "GlobalSports");

        Trophy trophy5 = new Trophy("Innovation Award", "Crystal", 22.0, 2.5,
                "Transparent", "Tech Summit", 2025, "Startup Y",
                "Technology", "TechCorp", "Rectangle",
                "Elegant", "Best Innovation", "Germany",
                18000, true, "CrystalWorks", 8,
                "TR005", "TechSupply");

        Trophy trophy6 = new Trophy("Best Actor Trophy", "Gold", 28.0, 4.5,
                "Golden", "Film Awards", 2021, "Actor Z",
                "Entertainment", "FilmWorld", "Statue",
                "Artistic", "Best Actor", "India",
                25000, true, "FilmAwardsCo", 3,
                "TR006", "MovieMart");

        Trophy trophy7 = new Trophy("Science Medal", "Silver", 18.0, 1.8,
                "Silver", "Science Fair", 2024, "Anita",
                "Education", "ScienceBoard", "Medal",
                "Minimal", "Top Scientist", "India",
                3000, false, "MedalMakers", 20,
                "TR007", "EduSupply");

        Trophy trophy8 = new Trophy("Leadership Award", "Bronze", 26.0, 3.2,
                "Bronze", "Corporate Meet", 2023, "Manager K",
                "Corporate", "BizGroup", "Oval",
                "Professional", "Best Leader", "USA",
                12000, true, "BizAwards", 6,
                "TR008", "OfficeMart");

        Trophy trophy9 = new Trophy("Marathon Cup", "Steel", 32.0, 5.7,
                "Silver", "City Marathon", 2022, "Runner P",
                "Sports", "HealthOrg", "Cup",
                "Sporty", "Marathon Winner", "Australia",
                9000, false, "SportTrophies", 9,
                "TR009", "RunSupply");

        Trophy trophy10 = new Trophy("Art Excellence", "Wood", 24.0, 2.9,
                "Brown", "Art Festival", 2025, "Painter L",
                "Arts", "ArtCouncil", "Frame",
                "Creative", "Best Artwork", "France",
                7000, true, "ArtCraft", 12,
                "TR010", "ArtSupply");

        trophy1.getTrophy();
        trophy2.getTrophy();
        trophy3.getTrophy();
        trophy4.getTrophy();
        trophy5.getTrophy();
        trophy6.getTrophy();
        trophy7.getTrophy();
        trophy8.getTrophy();
        trophy9.getTrophy();
        trophy10.getTrophy();
    }
}